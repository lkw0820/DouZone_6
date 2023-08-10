
import React, {useState} from "react";
import Toolbar from "./Toolbar";

function LandingPage(props){
    const [isLoggedIn,setIsLoggedIn] = useState(false);

    const onClickLogIn=()=>{
        setIsLoggedIn(true);
    }
    const onClickLogOut=()=>{
        setIsLoggedIn(false);
    }
    return(
        <div>
            <Toolbar
                isLoggedIn={isLoggedIn}
                onClickLogIn={onClickLogIn}
                onClickLogOut={onClickLogOut}
            />
            <div style={{padding:16}}>소플과 함께하느 리액트 공부</div>
        </div>
    )
}

export default LandingPage;