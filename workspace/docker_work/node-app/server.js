const express = require("express");

const PORT = 8082;

const app = express();

app.get("/",(req,res)=>{
    res.send("나는 이기원");
});

app.listen(PORT);
console.log("Server Is Running.....");