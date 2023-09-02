import axios from "axios";
import { useState, useEffect,useMemo } from "react";
import Graph from "./Graph";
import Star from "./Star";
import DefectiveRate from "./DefectiveRate";
import Table from "../components/Table";

const ComparsionChart = ({heads,retailer}) =>{
  const suplHeaders =[
    {accessor:"no",Header:"no",},{accessor:"companyName",Header:"name",},{accessor:"component",Header:"Component",},{accessor:"price",Header:"price",},
    {accessor:"quantity",Header:"quantity",},
    {accessor:"defective",Header:"defective",Cell:({cell:{value}})=><DefectiveRate defective={value}/> },
    {accessor:"quality",Header:"quality", Cell:({cell:{value}})=><Star quality={value}/>},
    {accessor:"prod_period",Header:"period",},
  ]
  const reHeaders=[
    {accessor:"no", Header:"no"},{accessor:"name", Header:"name"},{accessor:"productName", Header:"productName"},{accessor:"predictAmount", Header:"predictAmount"},
    {accessor:"purchasingGrade", Header:"purchasingGrade"},{accessor:"price", Header:"price"},{accessor:"transportGrade", Header:"transportGrade"},
  ]
  const columns = useMemo(() => (retailer?reHeaders:suplHeaders),[]);
  const [datas,setDatas] = useState([]);
  const data = useMemo(()=>datas,[datas])

  const getContract = () =>{
    axios.get('http://localhost:3001/contracts').then((res)=>{
      setDatas(res.data);
    })
  }
  const getPredict = () =>{
    axios.get('http://localhost:3001/predicts').then((res)=>{
      setDatas(res.data);
    })
  }
  
  useEffect(()=>{
    if(retailer){
      getPredict();
    }else{
      getContract();
    }
  },[])

  return(
      <div className="ms-1">
      <div className="mb-9">
        <div className="mx-lg-n3 mt-3">
          <div className="row g-3">
            {/* ... */}
            <div className="col-12 col-6 col-6 min-vh-75">
              <div className="card h-100">
                <div className="card-body">
                  <div className="card-title mb-1">
                    <h3 className="text-1100">{retailer?"판매 예측 ":"공급 제안 "}비교</h3>
                  </div>
                  <p className="text-700 mb-4">{retailer?"판매 예측 ":"공급 제안 "}설명</p>

                  <div id="tableComparsionS">
                    <div className="table-responsive">
                      <Table columns={columns} data={data} flag={true}/>
                    </div>
                  </div>
                  <div>
                    <Graph retailer={retailer}/>
                  </div>
                  
                </div>
              </div>
            </div>
            {/* ... */}
          </div>
        </div>
      </div>
    </div>
  )
}

export default ComparsionChart;