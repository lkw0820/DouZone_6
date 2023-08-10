


function List(props){
    
    return(
        <div style={{textAlign:"center"}}>
            <br/>
            <h2>Todo List</h2>
            <ul>
             {props.todoList.map((oo)=>{
                return <li id={oo.id}><p>{oo.work}</p><p>{oo.date}</p><button className="btn btn-light" onClick={props.delete}>삭제</button></li>
            })}
            </ul>
        </div>
        
        
    )

}

export default List;