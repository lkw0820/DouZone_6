const SupplierChart = () =>{
    return (
        <div class="mx-lg-n4 mt-3">
        <div class="row g-3">
        
            
            <div class="col-12 col-xl-6 col-xxl-6 min-vh-75">
                <div class="card supplierCard h-100">
                
                    
                    <div class="card-header border-bottom-0 pb-0">
                        <div class="row justify-content-between align-items-center mb-4">
                        
                            
                            <div class="col-auto" id="head">
                                <h3 class="text-1100" id="supplierCardTitle">부품을 검색해주세요</h3>
                                <p class="mb-0 text-700"></p>
                            </div>

                            
                            
                            <div class="col-auto w-100 w-md-auto">
                                <div class="row align-items-center g-0 justify-content-between">
                                    <div class="col-12 col-sm-auto"></div>
                                    <div class="col-auto d-flex">
                                        <p class="mb-0 ms-sm-3 fs--1 text-700 fw-bold">
                                            <span class="fas fa-filter me-1 fw-extra-bold fs--2"></span>
                                            <span id="supplierTasks">tasks</span>
                                        </p>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div> 

                    
                    <div class="card-body py-0 scrollbar to-do-list-body min-vh-xxl-50 h-xl-auto">

                        <div id="supplierTableContainer" dat-list='{"valueNames":["suppl_no","suppl_name","ceo_name","category"],"page":10,"pagination":true}'>
                            <div class="table-responsive mx-n1 px-1">
                                <table class=" table tabl-sm border-top border-200 fs--1 mb-0" id="supplierTable">
                                    <thead>
                                        <tr>
                                            <th class="white-space-nowrap fs--1 align-middle ps-0"
                                                style="max-width: 20px; width: 18px;">
                                                <div class="form-check mb-0 fs-0">
                                                    <input class="form-check-input" id="bulk-select-example"
                                                        type="checkbox"
                                                        data-bulk-select='{"body":"bulk-select-body","actions":"bulk-select-actions","replacedElement":"bulk-select-replace-element"}' />
                                                </div>
                                            </th>
                                            <th class="sort align-middle ps-3" data-sort="no">공급사 번호</th>
                                            <th class="sort align-middle" data-sort="name">공급사 이름</th>
                                            <th class="sort align-middle" data-sort="ceo">대표자</th>
                                            <th class="sort align-middle" data-sort="cate">구분</th>
                                            <th class="sort text-end align-middle pe-0" scope="col">ACTION</th>
                                        </tr>
                                    </thead>
                                    
                                    <tbody class="list" id="bulk-select-body">
                                    </tbody>
                                </table>
                            </div>

                            <div class="d-flex flex-between-center pt-3 mb-3">
                                <div class="pagination d-none"></div>
                                <p class="mb-0 fs--1">
                                    <span class="d-none d-sm-inline-block"
                                        data-list-info="data-list-info"></span> <span
                                        class="d-none d-sm-inline-block"> &mdash; </span> <a
                                        class="fw-semi-bold" href="#!" data-list-view="*"> View
                                        all <span class="fas fa-angle-right ms-1"
                                        data-fa-transform="down-1"></span>
                                    </a><a class="fw-semi-bold d-none" href="#!"
                                        data-list-view="less"> View Less <span
                                        class="fas fa-angle-right ms-1" data-fa-transform="down-1"></span>
                                    </a>
                                </p>
                                <div class="d-flex">

                                    <button class="btn btn-sm btn-primary" type="button"
                                        data-list-pagination="prev">
                                        <span>Previous</span>
                                    </button>

                                    <button class="btn btn-sm btn-primary px-4 ms-2"
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
        </div>
        </div> 
    )
}

export default SupplierChart;