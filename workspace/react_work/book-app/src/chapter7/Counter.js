import { useEffect, useState } from "react";

function Counter(props){

    const [counter,setCounter]=useState(0);
    const click = () =>{
        const add = counter+1;
        setCounter(add);
    }

    useEffect(()=>{
        document.title=`총 ${counter}번 클릭`;
    },[counter]);
    return(
        <div>
            <p>총 {counter}번 클릭 했어요</p>
            <button onClick={click}>클릭</button>
        </div>
    )
}

export default Counter;