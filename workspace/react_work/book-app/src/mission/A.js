import { useState } from "react";
import Header from "./Header";
import Insert from "./Insert";
import List from "./List";
function A(){
    const date = Date();
    const [value,setValue] =useState('');
    const [todo,setTodo]=useState([
        {
            id:1,
            work:"react공부하기",
            date: date,
        },
        {
            id:2,
            work:"빨래널기",
            date: date,
        },
        {
            id:3,
            work:"노래연습하기",
            date: date,
        },
    ])
    
    const handleChange=(e)=>{
        setValue(e.target.value);
    }
    const handleSubmit=(e)=>{
        e.preventDefault();
        console.log("oo");
        let max=todo.length+1;
        const oo={
            id:max,
            work:value,
            date:date,
        }
        setValue('');
        setTodo([...todo,oo]);
        console.log(oo);
    }
    const delValue = (event) =>{
        //console.log(event.target.parentNode.id);
        const t = event.target.parentNode.id;
        setTodo(todo.filter(todo => todo.id != t));
    }
    return(
        <div>
            <Header date={date}/>
            <Insert value={value} onChange={handleChange} onSubmit={handleSubmit}/>
            <List todoList={todo} delete={delValue}/>
        </div>
        
    )
}

export default A;