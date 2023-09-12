import { Link } from "react-router-dom";
import PostList from "../components/PostList";
import { isEditState } from "../store";

const ListPage =()=>{
    const [isEdited,setIsEdited] = useRecoilState(isEditState);
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