import axios from "axios";
import { useEffect, useState } from "react";
import { useHistory } from "react-router-dom";
import Spinner from "../components/Spinner";
import Card from "../components/Card";
import {bool} from 'prop-types';
import Pageination from "./Pagination";



const PostList = ({isAdmin}) =>{
    const [posts,setPost] = useState([]);
    const [loading,setLoading] = useState(true);
    const history = useHistory();
    const [currentPage,setCurrentPage] = useState(1);
    const [numberOfPosts,setNumberOfPosts] = useState(0);
    const [numberOfPages,setNumberOfPages] = useState(0);
    
    const limit=5;

    useEffect(()=>{
        setNumberOfPages(Math.ceil(numberOfPosts/limit));
    },[numberOfPosts]);

    const getPosts=(page = 1)=>{

        setCurrentPage(page);

        let params={
            _page:page,
            _limit:limit,
            _order:'desc',
            _sort:'id',
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
    }

    useEffect(()=>{
        getPosts();
    },[])

    const deletPost=(e,id)=>{
        e.stopPropagation();
        axios.delete(`http://localhost:3001/${id}`).then(()=>{
        setPost(prevPosts=>prevPosts.filter(post=>post.id!==id))
        })
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