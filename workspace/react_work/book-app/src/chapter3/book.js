function Book(props){
    return(
        //root태그는 하나만 가능
        <div>
            <h1>{`이 책의 이름은 ${props.name} 입니다.`}</h1>
            <h2>{`이 책은 ${props.numOfPage} 페이지로 되어 있다.`}</h2>
        </div>
    );
}

export default Book;