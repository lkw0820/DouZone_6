import useCounter from "./useCounter";
import React,{useState,useEffect} from "react";
function SimpleCounter(props){
    //const [isFull, setIsFull] = useState(false);
    const [count,increaseCount,decreaseCount,add10,add100,minus10,minus100] = useCounter(0);

    // useEffect(()=>{
    //     console.log("====================");
    //     console.log("useEffect() is called");
    //     console.log(`isFull: ${isFull}`);
    // });
    // useEffect(()=>{
    //     setIsFull(count >= MAX_CAPACITY);
    //     console.log(`Current count value: ${count}`);
    // },[count]);

    return(
        <div style={{textAlign:"center"}}>
            <h1>SimpleCounter</h1>
            <h2>현재 카운트</h2>
            <p>{`${count}`}</p>
            <button onClick={decreaseCount}>-1</button>
            <button onClick={minus10}>-10</button>
            <button onClick={minus100}>-100</button>
            <button onClick={add100}>+100</button>
            <button onClick={add10}>+10</button>
            <button onClick={increaseCount}>+1</button>
        </div>
    )
}

export default SimpleCounter;