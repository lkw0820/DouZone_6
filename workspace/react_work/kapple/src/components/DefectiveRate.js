const DefectiveRate=({defective})=>{
    let defective_rate= defective*1000;
    let color;
    if(defective>=0.07&&defective<=0.1){
        color="warning";
    }else if(defective>=0.04&&defective<0.07){
        color="primary";
    }else if(defective>=0.00&&defective<0.04){
        color="success";
    }
    return (
        <td className="align-middle">
            <div className="align-middle fw-semi-bold text-1000 mb-0">{defective +'%'}</div>
            <div class={`progress bg-${color}-100`}>
                
                <div class={`progress-bar rounded bg-${color}`} role="progressbar" aria-label="Success example" style={{width: defective_rate+'%'}}  aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
            </div>
        </td>
    )
}

export default DefectiveRate;