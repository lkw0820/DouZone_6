import Book from "./book";

function Library(){
    return(
        <div>
            <Book name="Java" numOfPage={300}/>
            <Book name="JSP" numOfPage={200}/>
            <Book name="Spring" numOfPage={500}/>
            <Book name="Oracle" numOfPage={400}/>
            <Book name="HTML" numOfPage={100}/>
        </div>
    );
}

export default Library;