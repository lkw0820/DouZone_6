import { Link } from "react-router-dom";
import PostList from "../components/PostList";

const ListPage =()=>{
    return(
        <div>
            <div className="d-flex justify-content-between">
                <h1>Blogs</h1>
            </div>
            <PostList/>
        </div>
    );
}

export default ListPage;