import axios from "axios";
import { useEffect, useState,useCallback,useRef } from "react";
import { useHistory } from "react-router-dom";
import Spinner from "../components/Spinner";
import Card from "../components/Card";
import {bool} from 'prop-types';
import Pageination from "./Pagination";
import {useLocation} from 'react-router-dom';
import Toast from "./Toast";
import { v4 as uuidv4 } from 'uuid';


const PostList = ({isAdmin}) =>{
    const [posts,setPost] = useState([]);
    const [loading,setLoading] = useState(true);
    const history = useHistory();
    const [currentPage,setCurrentPage] = useState(1);
    const [numberOfPosts,setNumberOfPosts] = useState(0);
    const [numberOfPages,setNumberOfPages] = useState(0);
    const [searchText, setSearchText] = useState('');
    //const [toasts,setToasts] = useState([]);
    const toasts = useRef([]);
    const [toastRerender,setToastRerender] = useState(false);

    const limit=5;

    useEffect(()=>{
        setNumberOfPages(Math.ceil(numberOfPosts/limit));
    },[numberOfPosts]);
    const onClickPageButton = (page) =>{
        history.push(`${location.pathname}?page=${page}`);
        setCurrentPage(page);
        getPosts(page);
    }

    const onSearch =(page)=>{
        getPosts(page);
    }
    const getPosts=useCallback((page = 1)=>{

        setCurrentPage(page);

        let params={
            _page:page,
            _limit:limit,
            _order:'desc',
            _sort:'id',
            title_like : searchText,
        }

        if(isAdmin){
            params={...params,publish:true}
        }
        axios.get('http://localhost:3001/posts',{
            params,
        }).then((res)=>{
            setNumberOfPosts(res.headers.get('X-Total-Count'));
            setPost(res.data);
            setLoading(false);
        })
    },[isAdmin,searchText])

    useEffect(()=>{
        setCurrentPage(parseInt(pageParam) || 1);
        getPosts(parseInt(pageParam) || 1);
    },[pageParam,getPosts]) //[]빈배열은 한번만실행

    const deletPost=(e,id)=>{
        e.stopPropagation();
        axios.delete(`http://localhost:3001/${id}`).then(()=>{
        setPost(prevPosts=>prevPosts.filter(post=>post.id!==id))
        })
    }
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
    

    const renderBlogList =()=>{
        if(loading){
            return <Spinner/>
        }
        if(posts.length===0){
            return <div>Post가 없습니다.</div>
        }
        return(
            posts.map((post)=>{
                return (
                    <Card 
                        key={post.id} 
                        title={post.title}
                        onClick={()=>{
                            history.push(`/blog/${post.id}`);
                        }}
                    >
                        {
                            isAdmin?
                            <div>
                                <button
                                    className="btn btn-danger sm"
                                    onClick={(e)=>deletPost(e,post.id)}
                                >
                                    Delete
                                </button>
                            </div>:null
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
            {renderBlogList()}
            {numberOfPages>1&&
                <Pageination 
                    currentPage={currentPage}
                    numberOfPages={numberOfPages}
                    onClick={getPosts}
                />
            }
        </div>
    );
}

PostList.propTypes={
    isAdmin:bool,
}

PostList.defaultProps={
    isAdmin:false,
}

export default PostList;