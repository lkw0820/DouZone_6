import BlogForm from "../components/blogForm";

const CreatePage = ({ addToast }) =>{
    return(
        <div>
            <BlogForm addToast={addToast}/>
        </div>
    )
}
export default CreatePage;