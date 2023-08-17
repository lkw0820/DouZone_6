import { useState,useEffect,useRef } from 'react';
import axios from 'axios';
import { useHistory } from 'react-router-dom';
import { bool } from 'prop-types';
import { useParams } from "react-router-dom";
import { v4 as uuidv4 } from 'uuid';
import Toast from './Toast';



const BlogForm = ({editing}) =>{
  const {id} = useParams();
  const [title,setTitle] = useState('');
  const [body,setBody] = useState('');
  const history = useHistory();
  const [originalTitle, setOriginalTitle] = useState('');
  const [originalBody, setOriginalBody] = useState('');
  const [publish,setPublish] = useState(false);
  const [originalPublish,setOriginalPublish] = useState(false);
  const [titleError,setTitleError] = useState(false);
  const [bodyError,setBodyError] = useState(false);
  //const [toasts,setToasts] = useState([]);
  const toasts = useRef([]);
  const [toastRerender,setToastRerender] = useState(false);

  
  useEffect(()=>{
    if(editing){
      axios.get(`http://localhost:3001/posts/${id}`).then((res)=>{
        setTitle(res.data.title);
        setBody(res.data.body);
        setPublish(res.data.publish);
        setOriginalTitle(res.data.title);
        setOriginalBody(res.data.body);
        setOriginalPublish(res.data.publish);
      });
    }
  },[id,editing]);

  const isEdited= ()=>{
    return title !== originalTitle || body !== originalBody || publish !== originalPublish;
  }
  

  const validateForm = () =>{
    let validated = true;
    if(title===''){
      setTitleError(true);
      validated=false;
    }
    if(body===''){
      setBodyError(true);
      validated=false;
    }    
    return validated;
  }

  const deleteToast = (id)=>{
    const filteredToasts = toasts.current.filter(toast=>{
        return toast.id !==id;
    });
    //setToasts(filteredToasts);
    toasts.current = filteredToasts;
    setToastRerender(prev => !prev);
}

  const addToast = (toast) =>{
    const id = uuidv4();
    const toastWithId = {
        ...toast,
        id,
    }
    //setToasts(prev => [...prev,toastWithId]);
    toasts.current = [...toasts.current,toastWithId];
    setToastRerender(prev => !prev);
    setTimeout(()=>{
        deleteToast(id);
    },3000);
  }

  const onSubmit = ()=>{
    setTitleError(false);
    setBodyError(false);
    if(validateForm()){
      if(editing){//수정할때
        axios.patch(`http://localhost:3001/posts/${id}`,{
        title:title,
        body:body,
        publish:publish,
      }).then(()=>{
        history.push('/admin');
      });
      }else{//새로만들때
        axios.post('http://localhost:3001/posts',{
          title:title,
          body:body,
          publish:publish,
          createdAt:Date.now()
        }).then(()=>{
          addToast({
            text:'Successfully created',
            type: 'success'
          })
          //history.push('/admin');
        });
      }
    }
  }

  const goBack = () =>{
    if(editing){
      history.push(`/blogs/${id}`);
    }else{
      history.push('/blogs');
    }
  }

  const onChangePublish=(e)=>{
    setPublish(e.target.checked);
  }

  return(
    <div>
      <Toast
        toasts={toasts.current}
        deleteToast={deleteToast}
      />
      <h1>{editing ? 'Edit':'Create'} a blog post</h1>
      <div className='mb-3'>
        <label className='form-label'>Title</label>
        <input 
          value= {title}
          className={`form-control ${titleError ? 'border-danger':''}`}
          onChange={(e)=>{
            setTitle(e.target.value);//input state binding
          }}/>
          {titleError &&<div className='text-danger'>
            Title is required
          </div>}
      </div>
      <div className='mb-3'>
        <label className='form-label'>Body</label>
        <textarea 
          value={body} 
          className={`form-control ${bodyError ? 'border-danger':''}`}
          onChange={(e)=>{
            setBody(e.target.value);//input state binding
          }}
          rows="10"/>
          {bodyError&&<div className='text-danger'>
            Body is required
          </div>}
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
        {editing ? 'Edit':'Post'}</button>
      <button 
        className='btn btn-danger ms-3'
        onClick={goBack}
      >
        Cancel
      </button>
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