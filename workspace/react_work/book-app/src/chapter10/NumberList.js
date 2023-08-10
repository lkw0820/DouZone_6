function NumberList({numbers}){

    const listItem = numbers.map((number)=>
        <li key={number.toString()}>{number}</li>
    )

    return(
        <ul>
            {listItem}
        </ul>
    )
}

export default NumberList;