import React from "react";
 const style ={
    wrapper:{
        padding:16,
        display:"flex",
        flexDirection :"row",
        boraderBottom:"1px solid grey",
    },
    greeting:{
        marginRight:8,
    },
 };

 function Toolbar(props){
    const{isLoggedIn,onClickLogIn, onClickLogOut}=props;
    return(
        <div style={style.wrapper}>
            {isLoggedIn && <span style={style.greeting}>환영합니다.</span>}
            {isLoggedIn?(
                <button onClick={onClickLogOut}>로그아웃</button>
            ) :(
                <button onClick={onClickLogIn}>로그인</button>
            )}

        </div>
    );
 }

 export default Toolbar;