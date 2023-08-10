function Header(props){
    const {date}=props;
    return(
        <div style={{textAlign:"center"}}>
            <h1>오늘은</h1><br/>
            <h1>{date}</h1>
        </div>
    )
}
export default Header;