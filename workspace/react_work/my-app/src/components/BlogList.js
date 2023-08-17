import axios from "axios";
import { useState,useEffect,useCallback,useRef } from "react";
import Card from "../components/Card";
import { Link } from "react-router-dom";
import { useHistory } from "react-router-dom";
import LoadingSpinner from "../components/LoadingSpinner";
import { bool } from 'prop-types';
import Pagination from "./Pagination";
import {useLocation} from 'react-router-dom';
import Toast from "./Toast";
import { v4 as uuidv4 } from 'uuid';

const BlogList = ({isAdmin}) =>{
    const history = useHistory();
    const location = useLocation();
    const params = new URLSearchParams(location.search)
    const pageParam = params.get('page'); //String type
    const [posts,setPosts] = useState([]);
    const [loading, setLoading] = useState(true);
    const [currentPage,setCurrentPage] = useState(1);
    const [numberOfPosts,setNumberOfPosts] = useState(0);//총 포스트 수
    const [numberOfPages,setNumberOfPages] = useState(0); //총 페이지 수
    const [searchText, setSearchText] = useState('');
    //const [toasts,setToasts] = useState([]);
    const toasts = useRef([]);
    const [toastRerender,setToastRerender] = useState(false);


    const limit =5; //페이지당 글개수

    useEffect(()=>{
        setNumberOfPages(Math.ceil(numberOfPosts/limit));
    },[numberOfPosts])

    const onClickPageButton = (page) =>{
        history.push(`${location.pathname}?page=${page}`);
        setCurrentPage(page);
        getPosts(page);
    }

    const onSearch =(page)=>{
        getPosts(page);
    }
    const getPosts = useCallback((page = 1)=>{

        let params={
            _page:page,
            _limit:limit,
            _order:'desc',
            _sort:'id',
            title_like : searchText,
        }

        if(!isAdmin){
            params={...params,publish:true}
        }
        axios.get(`http://localhost:3001/posts`,{
            params,
        }).then((res)=>{
            setNumberOfPosts(res.headers.get('X-Total-Count'));
            setPosts(res.data);
            setLoading(false);
        })
    },[isAdmin,searchText]);

    useEffect(()=>{
        setCurrentPage(parseInt(pageParam) || 1);
        getPosts(parseInt(pageParam) || 1);
    },[pageParam,getPosts]) //[]빈배열은 한번만실행

    const deleteToast = (id)=>{
        const filteredToasts = toasts.current.filter(toast=>{
            return toast.id !==id;
        });
        //setToasts(filteredToasts);
        toasts.current = filteredToasts;
        setToastRerender(prev => !prev);
    }
    
      const addToast = (toast) =>{
        const id = uuidv4();
        const toastWithId = {
            ...toast,
            id,
        }
        //setToasts(prev => [...prev,toastWithId]);
        toasts.current = [...toasts.current,toastWithId];
        setToastRerender(prev => !prev);
        setTimeout(()=>{
            deleteToast(id);
        },3000);
      }
    

    const deletBlog=(e,id)=>{
        e.stopPropagation();
        axios.delete(`http://localhost:3001/posts/${id}`).then(()=>{
            setPosts(prevPosts=>{
                return prevPosts.filter(post =>{
                    return post.id!==id;
                })
            })
            //화살표 함수는 한줄이면 {}와 return 생략 가능 -> 아래 같이 변경 가능
            //setPosts(prevPosts=>prevPosts.filter(post =>post.id!=id))
            addToast({
                text: "Successfully delete",
                type:"success"
            });
        })
        
    }

    const renderBlogList = ()=>{
        if(loading){
            return(
                <LoadingSpinner/>
            );
        }
        if(posts.length===0){
            return <div>post가 없습니다.</div>
        }
        return (
            posts.map((post)=>{    
                return (
                    <Card //컴포넌트는 이벤트를 걸 수 없다
                        key={post.id} 
                        title={post.title} 
                        onClick={()=>history.push(`/blogs/${post.id}`)}//이것은 함수를 전달한것 onClick이라는 이름으로 함수 전달, 이벤트 건것이 아니다
                    >
                        { 
                            isAdmin ?
                            <div>
                                <button 
                                    className="btn btn-danger btn-sm"
                                    onClick={(e)=>deletBlog(e, post.id)}
                                >
                                    Delete
                            </button>
                            </div>: null
                        }
                    </Card>      
                )
            })
        )
    }

    return( 
        <div>
            <Toast 
                toasts={toasts.current}
                deleteToast={deleteToast}
            />
            {/* <div className="d-flex justify-content-between">
                <h1>Blogs</h1>
                <Link to="/blogs/create" className="btn btn-success h-25">
                    Create New
                </Link>
            </div>  */}
            <input
                type="text"
                placeholder="Search..."
                className="form-control"
                value={searchText}
                onChange={(e) => setSearchText(e.target.value)}
                onKeyUp={onSearch}
            />
            <hr/>
            {renderBlogList()}
            {numberOfPages>1&&            
                <Pagination 
                    currentPage={currentPage} 
                    numberOfPages={numberOfPages} 
                    onClick={onClickPageButton}
                />
            }
        </div>
    )
}

BlogList.propTypes = {
    isAdmin:bool
}

BlogList.defaultProps = {
    isAdmin:false
}

export default BlogList;