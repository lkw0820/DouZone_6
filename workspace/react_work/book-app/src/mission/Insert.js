import { useState } from "react";


function Insert(props){
    return(
        <div style={{textAlign:"center"}}>
            <h2>새로운 Todo 작성하기</h2><br/><br/>
            <label>새로운 Todo<br/>
            <input type="text" value={props.value} onChange={props.onChange}></input></label>
            <button type="submit" onClick={props.onSubmit}>추가</button>
        </div>
        
    )
}

export default Insert;