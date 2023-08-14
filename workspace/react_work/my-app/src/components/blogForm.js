import { useState,useEffect } from 'react';
import axios from 'axios';
import { useHistory } from 'react-router-dom';
import { bool } from 'prop-types';
import { useParams } from "react-router-dom";


const BlogForm = ({editing}) =>{
  const {id} = useParams();
  const [title,setTitle] = useState('');
  const [body,setBody] = useState('');
  const history = useHistory();
  useEffect(()=>{
    if(editing){
      axios.get(`http://localhost:3001/posts/${id}`).then((res)=>{
        setTitle(res.data.title);
        setBody(res.data.body);
      });
    }
  },[])
  
  // const getPost = () =>{ //서버에서 데이타를 가져오는 것은 useEffect에서 사용하는 것이 좋다
  //   axios.get(`http://localhost:3001/posts/${id}`).then((res)=>{
  //     setTitle(res.data.title);
  //     setBody(res.data.body);
  //   });

  // }
  

  const onSubmit = ()=>{
    if(editing){//수정할때
      axios.patch(`http://localhost:3001/posts/${id}`,{
      title:title,
      body:body,
    }).then(()=>{
      history.push('/blogs');
    });
    }else{//새로만들때
      axios.post('http://localhost:3001/posts',{
        title:title,
        body:body,
        createdAt:Date.now()
      }).then(()=>{
        history.push('/blogs');
      });
    }
    
  }

  return(
    <div>
      <h1>{editing ? 'Edit':'Create'} a blog post</h1>
      <div className='mb-3'>
        <label className='form-label'>Title</label>
        <input 
          value= {title}
          className='form-control' 
          onChange={(e)=>{
            setTitle(e.target.value);//input state binding
          }}/>
      </div>
      <div className='mb-3'>
        <label className='form-label'>Body</label>
        <textarea 
          value={body} 
          className='form-control' 
          onChange={(e)=>{
            setBody(e.target.value);//input state binding
          }}
          rows="10"/>
      </div>
      <button 
        className='btn btn-primary'
        onClick={onSubmit}
        >
          {editing ? 'Edit':'Post'}</button>
    </div>
  );
}

BlogForm.proTypes={
  editing: bool
}
BlogForm.defaultProps={
  editing:false //생성: false 수정:true
}

export default BlogForm;