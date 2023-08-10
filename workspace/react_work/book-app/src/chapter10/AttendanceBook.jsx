import React from "react";

const student =[
    {
        id:1,
        name:"stu1",
    },
    {
        id:2,
        name:"stu2",
    },
    {
        id:3,
        name:"stu3",
    },
    {
        id:4,
        name:"stu4",
    },
    {
        id:5,
        name:"stu5",
    },
    {
        id:6,
        name:"stu6",
    },
    
];

function AttendanceBook(props){
    return(
        <ul>
            {student.map((student)=>{
                return <li key={student.id}>{student.name}</li>
            })}
        </ul>
    );
}

export default AttendanceBook;