import './App.css';
import axios from 'axios';
import { useState,useEffect } from 'react';

function App() {
  const [members,setMembers]= useState([]);

  const memberHandler = () =>{
    axios.get("http://localhost:8081/members").then((res)=>{
      console.log(res.data);
      setMembers(res.data);
    })
  }

  useEffect(()=>{
    memberHandler();
  },[])

  return (
    <div>
      <h1>Members</h1>
      {
        members.map((member)=>{
          return(
            <table>
              <tr>
                <td>{member.id}</td>
                <td>{member.name}</td>
                <td>{member.job}</td>
                <td>{member.home}</td>
              </tr>
            </table>
          )
        })
      }
    </div>
  )

}

export default App;
