import { useState } from "react";

function NameForm(props){
    const [value,setValue] = useState('');
    const [gender,setGender] =useState('남자');

    const handleChange = (event)=>{
        setValue(event.target.value);
    }
    const handleChangeGenger = (event)=>{
        setGender(event.target.value);
    }

    const handleSubmit = (event)=>{
        event.preventDefault();
        alert(`이름: ${value}, 성별: ${gender}`);

    }

    return(
        <form onSubmit={handleSubmit}>
            <label>
                이름: 
                <input type="text" value={value} onChange={handleChange}/>
            </label>
            <br/>
            <label>
                성별: 
                <select value={gender} onChange={handleChangeGenger}>
                    <option value="남자">남자</option>
                    <option value="여자">여자</option>
                </select>
            </label>
            <br/>
            <button type="submit">제출</button>
        </form>
    )
}
export default NameForm;