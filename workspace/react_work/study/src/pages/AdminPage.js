import PostList from "../components/PostList";
import { Link } from "react-router-dom";

const AdminPage = () =>{
    return(
        <div>
            <div className="d-flex justify-content-between">
                <h1>Admin</h1>
                <Link to="/blog/create" className="btn btn-success h-25">
                    Create new
                </Link>
            </div>
            <PostList isAdmin={true}/>
        </div>
    );
}

export default AdminPage;