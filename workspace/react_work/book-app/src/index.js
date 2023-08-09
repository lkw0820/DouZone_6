import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Library from './chapter3/Library';
import CommentList from './chapter5/CommentList';
import Counter from './chapter7/Counter';
import Accommodate from './chapter7/Accommodate';
import SimpleCounter from './chapter7/SimpleCounter';


// const name = "홍길동";

// function formatName(user){
//   if(user){
//     return user.firstName + ' '+ user.lastName;
//   }else{
//     return "빵빵이";
//   }
// }
// const user = {
//   firstName:"이",
//   lastName:"기원"
// }
// //const element = <h1>안녕, {name}</h1>
// const element =(
//   <h1>
//     Hello, {formatName()}
//   </h1>
// );

const root = ReactDOM.createRoot(document.getElementById('root'));
//root.render(element);
root.render(
  <React.StrictMode>
    <SimpleCounter/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
