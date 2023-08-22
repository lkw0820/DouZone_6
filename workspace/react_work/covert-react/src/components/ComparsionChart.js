const ComparsionChart = ({heads}) =>{
    return(
        <div className="content">
        <div className="mb-9">
          <div className="mx-lg-n4 mt-3">
            <div className="row g-3">
              {/* ... */}
              <div className="col-12 col-6 col-6 min-vh-75">
                <div className="card h-100">
                  <div className="card-body">
                    <div className="card-title mb-1">
                      <h3 className="text-1100">공급 제안 비교</h3>
                    </div>
                    <p className="text-700 mb-4">공급 제안 비교 설명</p>

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
                          </tbody>
                        </table>
                      </div>
                    </div>

                    <div className="col-sm-12 col-md-12 col-lg-12 col-xl-12 col-xxl-12 mt-5 ">
                      <div id="echart-social-marketing-radar1" style={{ minHeight: '320px', width: '100%' }}></div>
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