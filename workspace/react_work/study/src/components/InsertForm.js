import { useState, useEffect } from 'react';
import { useHistory,useParams } from 'react-router-dom';
import axios from 'axios';
import { bool } from 'prop-types';


const InsertForm =({editing})=>{
  const {id} = useParams();
  const [title,setTitle] = useState('');
  const [content,setContent] = useState('');
  const history =useHistory();
  const [originalTitle,setOriginalTitle] = useState('');
  const [originalContent,setOriginalContent] = useState('');
  const [publish,setPublish] = useState(false);
  const [originalPublish,setOriginalPublish] = useState(false);

  useEffect(()=>{
    if(editing){
      axios.get(`http://localhost:3001/posts/${id}`).then((res)=>{
        setTitle(res.data.title);
        setContent(res.data.content);
        setOriginalTitle(res.data.title);
        setOriginalContent(res.data.content);
        setPublish(res.data.publish);
        setOriginalPublish(res.data.publish);
      })
    }
  },[id,editing])

  const goBack = ()=>{
    if(editing){
      history.push(`/blog/${id}`);
    }else{
      history.push('/blog');
    }
  }
  const onChangePublish = (e)=>{
    setPublish(e.target.checked);
  }
  const isEdited = () =>{
    return title!== originalTitle || content !==originalContent || publish !== originalPublish;
  }
  const onSubmit = ()=>{
    if(editing){//수정할때
      axios.patch(`http://localhost:3001/posts/${id}`,{
        title:title,
        content:content,
        publish:publish
      }).then(()=>{
        history.push('/admin');
      })
    }else{//새로만들때
      axios.post("http://localhost:3001/posts",{
        title:title,
        content:content,
        publish:publish,
        createAt:Date.now()
      })
      history.push('/admin');
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
      
      <div className='form-check mb-3'>
        <input
          className='form-check-input'
          type='checkbox'
          checked={publish}
          onChange={onChangePublish}
        />
        <label className='form-check-label'>
          Publish
        </label>
      </div>

      <button 
        className='btn btn-primary'
        onClick={onSubmit}
        disabled={editing && !isEdited()}
      >
        {editing ? 'Edit':'Post'}
      </button>
      <button 
        className='btn btn-danger ms-3'
        onClick={goBack}
      >
        Cancel
      </button>
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