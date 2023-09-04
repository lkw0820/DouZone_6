import SearchBar from "../components/SearchBar"
import SupplierChart from "../components/CompanyChart";
import ComparsionChart from "../components/ComparsionChart";
import { useMemo,useState,useEffect } from "react";
import axios from "axios";


const CompareSupplier = () => {
    const headers =[
        {accessor:"no",Header:"no",},{accessor:"companyName",Header:"name",},{accessor:"component",Header:"Component",},{accessor:"price",Header:"price",},
        {accessor:"quantity",Header:"quantity",},{accessor:"defective",Header:"defective",},{accessor:"quality",Header:"quality",},{accessor:"prod_period",Header:"period",},
    ]
    const columns = useMemo(() => headers, []);

    const [datas,setDatas] = useState([]);

    const getContract = () =>{
      axios.get('http://localhost:3001/contracts').then((res)=>{
        setDatas(res.data);
        console.log(res.data);
      })
    }
    const data = useMemo(()=>datas,[datas])
    useEffect(()=>{
        getContract();
      },[])

    return (
        <div className="container mt-100" >
            <SearchBar title={"공급 제안"}/>
            <div className="row">
                <div className="col-lg">
                    <SupplierChart heads={["no","name","ceo","cate"]} classification={"부품"} retailer={false}/>
                </div>
                <div className="col-lg">
                    <ComparsionChart heads={["no","name","Component","price","quantity","defective","quality","period"]} retailer={false}/>
                    {/* <Table columns={columns} data={data}/> */}
                </div>
                
            </div>
            
        </div>
    );
}

export default CompareSupplier;