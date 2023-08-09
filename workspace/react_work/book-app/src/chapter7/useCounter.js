import React, {useState} from "react";

function useCounter(initialValue){
    const [count, setCount] = useState(initialValue);

    const increaseCount = ()=> setCount((count)=>count+1);
    const decreaseCount = () => setCount((count)=>count-1);
    const add10 =()=>setCount((count)=>count+10);
    const add100=()=>setCount((count)=>count+100);
    const minus10=()=>setCount((count)=>count-10);
    const minus100=()=>setCount((count)=>count-100);

    return [count, increaseCount, decreaseCount,add10,add100,minus10,minus100];
}

export default useCounter;