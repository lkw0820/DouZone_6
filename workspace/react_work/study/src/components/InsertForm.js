import { useState, useEffect } from 'react';
import { useHistory,useParams } from 'react-router-dom';
import axios from 'axios';
import { bool } from 'prop-types';


const InsertForm =({editing})=>{
  const {id} = useParams();
    const [title,setTitle] = useState('');
    const [content,setContent] = useState('');
    const history =useHistory();

    useEffect(()=>{
      if(editing){
        axios.get(`http://localhost:3001/posts/${id}`).then((res)=>{
          setTitle(res.data.title);
          setContent(res.data.content);
        })
      }
    },[])

    const onSubmit = ()=>{
      if(editing){//수정할때
        axios.patch(`http://localhost:3001/posts/${id}`,{
          title:title,
          content:content
        }).then(()=>{
          history.push('/blog');
        })
      }else{//새로만들때
        axios.post("http://localhost:3001/posts",{
          title:title,
          content:content,
          createAt:Date.now()
        })
        history.push('/blog');
      }
      
    }
    return(
    <div>
        <div>
          <h1>{editing ? 'Edit':'Create'} a blog post</h1>
          <label>title</label>
          <input 
            className='form-control'
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
            className='form-control' 
            rows='10'
            value={content}
            onChange={(e)=>{
              setContent(e.target.value);
            }}
          ></textarea>
        </div>
        <button 
          className='btn btn-primary'
          onClick={onSubmit}
        >{editing ? 'Edit':'Post'}</button>
      </div>
    );
}

InsertForm.prototype={
  editing:bool
}
InsertForm.defaultProps={
  editing:false
}

export default InsertForm;