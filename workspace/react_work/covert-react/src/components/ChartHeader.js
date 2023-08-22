const ChartHeader = ({heads}) =>{
    {
        heads.map(head=>{
            return (
                <th className="sort align-middle">
                    {head}
                </th>
            )
        })
    }

    

}

export default ChartHeader;