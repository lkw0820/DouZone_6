import { useState } from 'react';
import axios from 'axios';

const InsertForm =()=>{
    const [title,setTitle] = useState('');
    const [content,setContent] = useState('');
  
    const onsubmit = ()=>{
      axios.post("http://localhost:3001/posts",{
        title:title,
        content:content
      });
    }
    return(
    <div>
        <div>
          <label>title</label>
          <input 
            type='text' 
            value={title} 
            onChange={(e)=>{
              setTitle(e.target.value);
            }}
          />
        </div>
        <div>
          <label>content</label>
          <textarea 
            rows='10'
            value={content}
            onChange={(e)=>{
              setContent(e.target.value);
            }}
          ></textarea>
        </div>
        <button 
          className='btn btn-primary'
          onClick={onsubmit}
        >post</button>
      </div>
    );
}

export default InsertForm;