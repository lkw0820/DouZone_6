import axios from "axios";
import { useState, useEffect } from "react";
import Graph from "./Graph";
const ComparsionChart = ({heads,retailer}) =>{

  const [datas,setDatas] = useState([]);

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

                  <div id="tableComparsionS" data-list='{"valueNames":["proposal_no","suppl_name","compo_name","price","quantity","defective_rate","quality_grade","prod_period"],"page":5,"pagination":true}'>
                    <div className="table-responsive">
                      <table className="table table-sm fs--1 mb-0">
                        <thead>
                          <tr>
                            {/* <th className="sort border-top ps-3 asc" data-sort="proposal_no">제안 번호</th>
                            <th className="sort border-top" data-sort="suppl_name">공급사 이름</th>
                            <th className="sort border-top" data-sort="compo_name">부품 이름</th>
                            <th className="sort border-top" data-sort="price">단가</th>
                            <th className="sort border-top" data-sort="quantity">수량</th>
                            <th className="sort border-top" data-sort="defective_rate">불량률</th>
                            <th className="sort border-top" data-sort="quality_grade">품질등급</th>
                            <th className="sort border-top" data-sort="prod_period">생산기간</th> */}
                            {
                              heads.map((head,index)=>{
                                return <th className="sort border-top" key={index}>{head}</th>
                              })
                            }
                          </tr>
                        </thead>
                        <tbody className="list" id="proposalList">
                          {/* Contents of the table body go here */}
                          {/* <tr>
                            <td className="align-middle ps-3 proposal_no">제안번호</td>
                            <td className="align-middle suppl_name">공급사 이름</td>
                            <td className="align-middle compo_name">부품 이름</td>
                            <td className="align-middle price">단가</td>
                            <td className="align-middle quantity">수량</td>
                            <td className="align-middle defective_rate">불량률</td>
                            <td className="align-middle quality_grade">품질 등급</td>
                            <td className="align-middle prod_period">생산기간</td>
                          </tr> */}
                          {
                            !retailer?datas.map(data=>{
                              console.log(data);
                              return(
                                <tr key={data.no}>
                                  <td className="align-middle ps-3">{data.no}</td>
                                  <td className="align-middle">{data.companyName}</td>
                                  <td className="align-middle">{data.component}</td>
                                  <td className="align-middle">{data.price}</td>
                                  <td className="align-middle">{data.quantity}</td>
                                  <td className="align-middle">{data.defective}</td>
                                  <td className="align-middle">{data.quality}</td>
                                  <td className="align-middle">{data.prod_period}</td>
                                </tr>
                              )
                            }):
                            datas.map(data=>{
                              console.log(data);
                              return(
                                <tr key={data.no}>
                                  <td className="align-middle ps-3">{data.no}</td>
                                  <td className="align-middle">{data.name}</td>
                                  <td className="align-middle">{data.productName}</td>
                                  <td className="align-middle">{data.predictAmount}</td>
                                  <td className="align-middle">{data.purchasingGrade}</td>
                                  <td className="align-middle">{data.price}</td>
                                  <td className="align-middle">{data.transportGrade}</td>
                                </tr>
                              )
                            })
                          }
                        </tbody>
                      </table>
                    </div>
                  </div>

                  {/* <div className="col-sm-12 col-md-12 col-lg-12 col-xl-12 col-xxl-12 mt-5 ">
                    <div id="echart-social-marketing-radar1" style={{ minHeight: '320px', width: '100%' }}></div>
                  </div> */}
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