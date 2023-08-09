import Comment from "./comment";

const comments = [
    {
        name:"hong",
        comment:"우삽겹"
    },
    {
        name:"이기원",
        comment:"포보"
    },
    {
        name:"기원1",
        comment:"육회"
    },
]

function CommentList(){
    return(
        <div>
            {comments.map((comment) => {
                return(
                    <Comment name={comment.name} comment={comment.comment}/>
                )
            })}
        </div>
    );
}
export default CommentList;