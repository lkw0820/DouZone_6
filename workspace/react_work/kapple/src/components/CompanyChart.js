import axios from "axios";
import { useState,useEffect } from "react";

const SupplierChart = ({heads,classification}) =>{
    const [suppliers,setSuppliers] = useState([]);

    const getSupplier = ()=>{
      axios.get('http://localhost:3001/suppliers').then((res)=>{
        console.log(res.data);
        setSuppliers(res.data);
      })
    }

    useEffect(()=>{
      getSupplier();
    },[])
 console.log(heads);
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
                          {classification}을 검색해주세요
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
                            <tr>
                              <td className="fs--1 align-middle"><div className="form-check mb-0 fs-0"><input className="form-check-input" type="checkbox"data-bulk-select-row="{&quot;name&quot;:&quot;Anna&quot;,&quot;email&quot;:&quot;anna@example.com&quot;,&quot;age&quot;:18}" /></div></td>
                              <td className="align-middle ps-3 no">예시1</td>
                              <td className="align-middle name">예시1</td>
                              <td className='align-middle ceo'>예시1</td>
                              <td className='align-middle cate'>예시1</td>
                              <td className='align-middle white-space-nowrap text-end pe-0'>
                                <div className='font-sans-serif btn-reveal-trigger position-static'> 
                                  <button className='btn btn-sm dropdown-toggle dropdown-caret-none transition-none btn-reveal fs--2' type='button' data-bs-toggle='dropdown' data-boundary='window' aria-haspopup='true' aria-expanded='false' data-bs-reference='parent'>
                                    <span className='fas fa-ellipsis-h fs--2'></span>
                                  </button>
                                  <div className='dropdown-menu dropdown-menu-end py-2'>
                                    <a className='dropdown-item supplierDetail' href='#!' >View</a>
                                    <a className='dropdown-item' href='#!'>Export</a>
                                    <div className='dropdown-divider'></div>
                                    <a className='dropdown-item text-danger' href='#!'>Remove</a>
                                  </div>
                                </div>
                              </td>
                            </tr>
                            {
                              suppliers.map(supplier=>{
                                return (
                                  <tr key={supplier.no}>
                                    <td className="fs--1 align-middle"><div className="form-check mb-0 fs-0"><input className="form-check-input" type="checkbox"data-bulk-select-row="{&quot;name&quot;:&quot;Anna&quot;,&quot;email&quot;:&quot;anna@example.com&quot;,&quot;age&quot;:18}" /></div></td>
                                    <td className="align-middle ps-3 no">{supplier.no}</td>
                                    <td className="align-middle name">{supplier.name}</td>
                                    <td className='align-middle ceo'>{supplier.ceo}</td>
                                    <td className='align-middle cate'>{supplier.cate}</td>
                                    <td className='align-middle white-space-nowrap text-end pe-0'>
                                      <div className='font-sans-serif btn-reveal-trigger position-static'> 
                                        <button className='btn btn-sm dropdown-toggle dropdown-caret-none transition-none btn-reveal fs--2' type='button' data-bs-toggle='dropdown' data-boundary='window' aria-haspopup='true' aria-expanded='false' data-bs-reference='parent'>
                                          <span className='fas fa-ellipsis-h fs--2'></span>
                                        </button>
                                        <div className='dropdown-menu dropdown-menu-end py-2'>
                                          <a className='dropdown-item supplierDetail' href='#!' >View</a>
                                          <a className='dropdown-item' href='#!'>Export</a>
                                          <div className='dropdown-divider'></div>
                                          <a className='dropdown-item text-danger' href='#!'>Remove</a>
                                        </div>
                                      </div>
                                    </td>
                                  </tr>
                                )
                              })
                            }
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