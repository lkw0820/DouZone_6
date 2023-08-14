import axios from "axios";
import { useEffect, useState } from "react";
import { useHistory } from "react-router-dom";
import { Link } from "react-router-dom";
import Spinner from "../components/Spinner";
import Card from "../components/Card";

const ListPage =()=>{
    const [posts,setPost] = useState([]);
    const [loading,setLoading] = useState(true);
    const history = useHistory();
    

    const getPosts=()=>{
        axios.get('http://localhost:3001/posts').then((res)=>{
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
                        <div>
                            <button
                                className="btn btn-danger sm"
                                onClick={(e)=>deletPost(e,post.id)}
                            >
                                Delete
                            </button>
                        </div>
                    </Card>
                )
            })
        )   
    }

    return(
        <div>
            <div className="d-flex justify-content-between">
                <h1>Blogs</h1>
                <Link to="/blog/create" className="btn btn-success h-25">
                    Create new
                </Link>
            </div>
            {renderBlogList()}
        </div>
    );
}

export default ListPage;