import axios from "axios";
import { useState,useEffect } from "react";
import { useParams } from "react-router-dom";
import Spinner from "../components/Spinner";
import { Link } from "react-router-dom/cjs/react-router-dom.min";

const ShowPage =()=>{
    const {id} = useParams();
    const [post,setPost] = useState({});
    const [loading,setLoading] = useState(true);

    const getPosts = () =>{
        axios.get(`http://localhost:3001/posts/${id}`).then((res)=>{
            setPost(res.data);
            setLoading(false);
        })
    }

    const printDate = (timestamp)=>{
        return new Date(timestamp).toLocaleDateString();
    }
    useEffect(()=>{
        getPosts();
    },[id])

    if(loading){
        return <Spinner/>
    }
    return (
        <div>
            <div className="d-flex">
                <h1 className="flex-grow-1">{post.title}</h1><hr/>
                <div>
                    <Link
                        className="btn btn-primary"
                        to={`/blog/${id}/edit`}
                    >Edit</Link>
                </div>
            </div>
            <small className="text-muted">{printDate(post.createAt)}</small>
            <p>{post.content}</p>
        </div>
    )
}
export default ShowPage;