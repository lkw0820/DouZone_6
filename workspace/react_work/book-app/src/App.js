import logo from './logo.svg';
import './App.css';
import React from 'react';
import { useState } from 'react';

function App() {
  //let number =1;
  const [number,setNumber] = useState(1);
  
  const double = () =>{
    const doubleNumber = number*2;
    setNumber(doubleNumber);
   
    console.log(doubleNumber);
  }

  const printHello=()=>{
    console.log("hello");
  }
  return (
    // <div className="App">
    //   <header className="App-header">
    //     <img src={logo} className="App-logo" alt="logo" />
    //     <p>
    //       Edit <code>src/App.js</code> and save to reload.
    //     </p>
    //     <a
    //       className="App-link"
    //       href="https://reactjs.org"
    //       target="_blank"
    //       rel="noopener noreferrer"
    //     >
    //       Learn React
    //     </a>
    //   </header>
    // </div>
    <React.Fragment>
    <div>
      {number}
    </div>
    <button onClick={double}>submit</button>
    </React.Fragment>
  );
}

export default App;
