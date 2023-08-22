import ChartHeader from "./ChartHeader";
import { useState } from "react";

const SupplierChart = ({heads}) =>{
    const [supplier,setSupplier] = useState([]);

    const getSupplier = ()=>{

    }
 console.log(heads);
    return (
        <div className="content">
        <div className="mb-9">
          <div className="mx-n4 mt-3">
            <div className="row g-3">
              <div className="col-12 col-6 col-6 min-vh-75">
                <div className="card supplierCard h-100">
                  <div className="card-header border-bottom-0 pb-0">
                    <div className="row justify-content-between align-items-center mb-4">
                      <div className="col-auto" id="head">
                        <h3 className="text-1100" id="supplierCardTitle">
                          부품을 검색해주세요
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
                        <table className="table tabl-sm border-top border-200 fs--1 mb-0" id="supplierTable">
                          <thead>
                            <tr>
                              <th className="white-space-nowrap fs--1 align-middle ps-0"
                                  style={{ maxWidth: '20px', width: '18px' }}>
                                <div className="form-check mb-0 fs-0">
                                  <input className="form-check-input" id="bulk-select-example"
                                         type="checkbox"
                                         data-bulk-select='{"body":"bulk-select-body","actions":"bulk-select-actions","replacedElement":"bulk-select-replace-element"}' />
                                </div>
                              </th>
                              {/* <th className="sort align-middle ps-3" data-sort="no">공급사 번호</th>
                              <th className="sort align-middle" data-sort="name">공급사 이름</th>
                              <th className="sort align-middle" data-sort="ceo">대표자</th>
                              <th className="sort align-middle" data-sort="cate">구분</th> */}
                              {
                                heads.map((head,index)=>{
                                    // <ChartHeader key={index}/>
                                    return(
                                        <th className="sort align-middle" key={index}>
                                            {head}
                                        </th>
                                    )
                                    
                                })
                              }
                              
                              <th className="sort text-end align-middle pe-0" scope="col">ACTION</th>
                            </tr>
                          </thead>
                          <tbody className="list" id="bulk-select-body">
                            {/* Contents of the table body go here */}
                          </tbody>
                        </table>
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