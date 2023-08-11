import { useState } from 'react';
import axios from 'axios';

const BlogForm = () =>{

    const [title,setTitle] = useState('');
    const [body,setBody] = useState('');
  
    const onSubmit = ()=>{
      axios.post('http://localhost:3001/posts',{
        title:title,
        body:body
      });
    }
    return(
        <div>
            <h1>Create a blog post</h1>
            <div className='mb-3'>
              <label className='form-label'>Title</label>
              <input 
                value={title} 
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
                Post</button>
        </div>
    );
}

export default BlogForm;