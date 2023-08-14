import { useParams } from "react-router-dom";
import axios from "axios";
import { useState,useEffect } from "react";
import LoadingSpinner from "../components/LoadingSpinner";
import { useHistory } from "react-router-dom";
import { Link } from "react-router-dom";

const ShowPage = () =>{
    const {id} = useParams();
    const [post,setPost] = useState({});
    const [loading,setLoading] = useState(true);
    //const history = useHistory();

    const getPost = () =>{ //서버에서 데이타를 가져오는 것은 useEffect에서 사용하는 것이 좋다
        axios.get(`http://localhost:3001/posts/${id}`).then((res)=>{
            setPost(res.data);
            setLoading(false);
        });

    }

    const printData = (timestamp)=>{
        return new Date(timestamp).toLocaleString();
    }

    console.log(post);
    
    useEffect(()=>{
        getPost();
    },[id])

    if(loading){
        return <LoadingSpinner/>
    }
    return (
        <div>
            <div className="d-flex">
                <h1 className="flex-grow-1">{post.title}</h1>
                <div>
                    <Link 
                        className="btn btn-primary"
                        to={`/blogs/${id}/edit`}
                    >
                        Edit
                    </Link>
                </div>
            </div>
            <small className="text-muted">{printData(post.createdAt)}</small>
            <p>{post.body}</p>
        </div>
    )
}
export default ShowPage;