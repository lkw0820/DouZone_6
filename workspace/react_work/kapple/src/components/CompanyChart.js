import axios from "axios";
import { useState,useEffect, useMemo } from "react";
import Table from "./Table";
import CompanyDropdown from './CompanyDropdown';

const SupplierChart = ({heads,classification,retailer}) =>{
    const [companys,setCompany] = useState([]);
    const headers=[
      {accessor:"no",Header:"no"},{accessor:"name",Header:"name"},
      {accessor:"ceo",Header:"ceo"},{accessor:"cate",Header:"cate"}
    ]
    if(retailer){
      headers.push({accessor:"scale",Header:"scale"});
      headers.push({Header:"ACTION",Cell:()=><CompanyDropdown/>});
    }else{
      headers.push({Header:"ACTION",Cell:()=><CompanyDropdown/>});
    }
    const columns = useMemo(()=>headers,[]);
    const data = useMemo(()=>companys,[companys]);

    const getSupplier = ()=>{
      axios.get('http://localhost:3001/suppliers').then((res)=>{
        console.log(res.data);
        setCompany(res.data);
      })
    }

    const getRetailer = ()=>{
      axios.get('http://localhost:3001/retailers').then((res)=>{
        //console.log(res.data);
        setCompany(res.data);
      })
    }

    useEffect(()=>{
      if(retailer){
        getRetailer();
      }else{
        getSupplier();
      }
    },[])
 //console.log(heads);
    return (
        <div className="m-1">
        <div className="mb-9">
          <div className="mx-n3 mt-3">
            <div className="row g-3">
              <div className="col-12 col-6 col-6 min-vh-75">
                <div className="card supplierCard h-100">
                  <div className="card-header border-bottom-0 pb-0">
                    <div className="row justify-content-between align-items-center mb-4">
                      <div className="col-auto" id="head">
                        <h3 className="text-1100" id="supplierCardTitle">
                          {retailer?"상품":"부품"}을 검색해주세요
                        </h3>
                        <p className="mb-0 text-700"></p>
                      </div>
                      <div className="col-auto w-100 w-md-auto">
                        <div className="row align-items-center g-0 justify-content-between">
                          <div className="col-12 col-sm-auto"></div>
                          <div className="col-auto d-flex">
                            <p className="mb-0 ms-sm-3 fs--1 text-700 fw-bold">
                              <span className="fas fa-filter me-1 fw-extra-bold fs--2"></span>
                              <span id="supplierTasks">tasks</span>
                            </p>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div className="card-body py-0 scrollbar to-do-list-body min-vh-xxl-50 h-xl-auto">
                    <div id="supplierTableContainer" dat-list='{"valueNames":["suppl_no","suppl_name","ceo_name","category"],"page":10,"pagination":true}'>
                      <div className="table-responsive mx-n1 px-1">
                        <Table columns={columns} data={data} flag={false}/>
                      </div>
                      <div className="d-flex flex-between-center pt-3 mb-3">
                        <div className="pagination d-none"></div>
                        <p className="mb-0 fs--1">
                          <span className="d-none d-sm-inline-block"
                                data-list-info="data-list-info"></span> <span
                          className="d-none d-sm-inline-block"> &mdash; </span> <a
                          className="fw-semi-bold" href="#!" data-list-view="*"> View
                          all <span className="fas fa-angle-right ms-1"
                                  data-fa-transform="down-1"></span>
                        </a><a className="fw-semi-bold d-none" href="#!"
                                data-list-view="less"> View Less <span
                          className="fas fa-angle-right ms-1" data-fa-transform="down-1"></span>
                        </a>
                        </p>
                        <div className="d-flex">
                          <button className="btn btn-sm btn-primary" type="button"
                                  data-list-pagination="prev">
                            <span>Previous</span>
                          </button>
                          <button className="btn btn-sm btn-primary px-4 ms-2"
                                  type="button" data-list-pagination="next">
                            <span>Next</span>
                          </button>
                        </div>
                      </div>
                      <pre id="selectedRows"></pre>
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

export default SupplierChart;