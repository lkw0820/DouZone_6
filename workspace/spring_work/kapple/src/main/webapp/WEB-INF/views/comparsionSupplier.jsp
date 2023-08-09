<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp"%>

<!-- ------------------------------------- -->
<!-- START OF CONTENTS  -->
<!-- ------------------------------------- -->
<div class="content">

	<div class="mb-9">

		<!-- 페이지 타이틀 -->
		<div class="row g-3 mb-4">
			<div class="col-auto">
				<h2 class="mb-0" id="pageTitle">공급 제안 비교</h2>
			</div>
		</div>

		<!-- 상단 ; 부품/상품 검색 및 부품/공급사추가 버튼  -->
		<div id="products" data-list='{"valueNames":["suppl_no","suppl_name","ceo_name","category"],"page":10,"pagination":true}'>
			<div class="mb-4">
				<div class="d-flex flex-wrap gap-3">
				
					<!-- 부품/상품 검색창 -->
					<div class="search-box" id="componentSearchBox">
						<form class="position-relative" data-bs-toggle="search" data-bs-display="static" action="/comparsionSupplier" method="get">
							<input class="form-control search-input search" type="search" placeholder="부품 검색창" aria-label="Search" name="compo_name" id="searchItemInput"/>
							<span class="fas fa-search search-box-icon"></span>
						</form>
					</div>
					<button class="btn btn-primary" id="searchItem">
						<span class="fas fa-plus me-2"></span>검색
					</button> 
					<!-- 공급사/부품 추가 버튼 -->
					<div class="ms-xxl-auto">
						<button class="btn btn-primary" id="addSupplierBtn">
							<span class="fas fa-plus me-2"></span>공급사 추가
						</button>
						<button class="btn btn-primary" id="addProdutBtn">
							<span class="fas fa-plus me-2"></span>부품 추가
						</button>
					</div>
				</div>
			</div>

			<!-- 콘텐츠 : 고객사 리스트 및 비교 표, 그래프 -->
			<div class="mx-lg-n4 mt-3">
				<div class="row g-3">
				
					<!-- 왼쪽 표 감싸는 컨테이너(카드) -->
					<div class="col-12 col-xl-6 col-xxl-6 min-vh-75">
						<div class="card supplierCard h-100">
						
							<!-- 카드 헤더 -->
							<div class="card-header border-bottom-0 pb-0">
								<div class="row justify-content-between align-items-center mb-4">
								
									<!-- 카드 타이틀 및 설명, 카드 헤더 내용 -->
									<div class="col-auto" id="head">
										<h3 class="text-1100" id="supplierCardTitle">부품을 검색해주세요</h3>
										<p class="mb-0 text-700"></p>
									</div>

									
									<!-- 검색 결과 개수 표시 -->
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
							</div> <!-- 카드 헤더 끝  -->

							<!-- 카드 바디 :  공급사 리스트 테이블 -->
							<div class="card-body py-0 scrollbar to-do-list-body min-vh-xxl-50 h-xl-auto">

								<div id="supplierTableContainer" dat-list='{"valueNames":["suppl_no","suppl_name","ceo_name","category"],"page":10,"pagination":true}'>
									<div class="table-responsive mx-n1 px-1">
									
										<!-- 고객사 테이블 : retailerTable  -->
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
									
									<!-- 결과값 페이징 12개씩 뽑으면 화면 맞음 -->
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
					</div> <!-- 왼쪽 카드 끝 -->

					<!-- 오른쪽 카드 감싸는 컨테이너 -->
					<div class="col-12 col-xl-6 col-xxl-6 min-vh-75">
						<div class="card h-100">
						
							<!-- 오른쪽 카드 타이틀 -->
							<div class="card-body">
								<div class="card-title mb-1">
									<h3 class="text-1100">공급 제안 비교</h3>
								</div>
								<p class="text-700 mb-4">공급 제안 비교 설명</p>

								<!-- 오른쪽 비교 리스트 테이블 -->
								<div id="tableComparsionS" data-list='{"valueNames":["proposal_no","suppl_name","compo_name","price","quantity","defective_rate","quality_grade","prod_period"],"page":5,"pagination":true}'>
									<div class="table-responsive">
										<table class="table table-sm fs--1 mb-0">
											<thead>
												<tr>
													<th class="sort border-top ps-3 asc" data-sort="proposal_no">제안 번호</th>
													<th class="sort border-top" data-sort="suppl_name">공급사 이름</th>
													<th class="sort border-top" data-sort="compo_name">부품 이름</th>
													<th class="sort border-top" data-sort="price">단가</th>
													<th class="sort border-top" data-sort="quantity">수량</th>
													<th class="sort border-top" data-sort="defective_rate">불량률</th>
													<th class="sort border-top" data-sort="quality_grade">품질등급</th>
													<th class="sort border-top" data-sort="prod_period">생산기간</th>
												</tr>
											</thead>
											<tbody class="list" id="proposalList">
												
											</tbody>
										</table>
									</div>
									
								</div>

								<!--  그래프  -->
								<div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 col-xxl-12 mt-5 ">
									<div id="echart-social-marketing-radar1" style="min-height: 320px; width: 100%"></div>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</div>
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
<!-- 				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button> -->
				<h4 class="modal-title" id="myModalLabel">공급사 상세 정보</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label>공급사 이름</label> <input class="form-control" name='suppl_name' value='' readonly>
				</div>
				<div class="form-group">
					<label>대표자</label> <input class="form-control" name='ceo_name' value='' readonly>
				</div>
				<div class="form-group">
					<label>구분</label> <input class="form-control" name='category' value='' readonly>
				</div>
				<div class="form-group">
					<label>사업자 번호</label> <input class="form-control" name='biz_no' value='' readonly>
				</div>
				<div class="form-group">
					<label>운송 분류</label> <input class="form-control" name='transport_category' value='' readonly>
				</div>
				
				<div class="form-group">
					<label>phone</label> <input class="form-control" name='phone' value='' readonly>
				</div>

			</div>
			<div class="modal-footer">
				<button id='modalModBtn' type="button" class="btn btn-warning">Modify</button>
				<button type="button" class="btn btn-default modalCloseBtn">Close</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->

<!-- Modal -->
<div class="modal fade" id="componentModal" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
<!-- 				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button> -->
				<h4 class="modal-title" id="myModalLabel">부품 상세 정보</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label>부품 이름</label> <input class="form-control" name='compo_name' value='' readonly>
				</div>
				<div class="form-group">
					<label>부품 번호</label> <input class="form-control" name='compo_no' value='' readonly>
				</div>
				<div class="form-group">
					<label>부품 설명</label> <input class="form-control" name='detail' value='' readonly>
				</div>
				<div class="form-group">
					<label>부품 단위</label> <input class="form-control" name='unit' value='' readonly>
				</div>
			</div>
			<div class="modal-footer">
				<button id='modalModBtn' type="button" class="btn btn-warning">Modify</button>
				<button type="button" class="btn btn-default modalCloseBtn">Close</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->

</main>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/resources/test.js"></script>
<script src="https://cdn.jsdelivr.net/npm/echarts@5.4.3/dist/echarts.min.js" ></script>
<script type="text/javascript">
	$(document).ready(function(){
		var compo_name;
		$('#searchItem').on('click',function(){
			//$('form.position-relative').submit();
			compo_name=$('#componentSearchBox').find('input').val()
			$('#supplierCardTitle').html(compo_name);
			var str="";
			var str2="";
			Service.supplierDTO(compo_name,function(data){
				//console.log(data);
				for(let i=0;i<data.slist.length;i++){
					str+='<tr><td class="fs--1 align-middle"><div class="form-check mb-0 fs-0"><input class="form-check-input" type="checkbox"data-bulk-select-row="{&quot;name&quot;:&quot;Anna&quot;,&quot;email&quot;:&quot;anna@example.com&quot;,&quot;age&quot;:18}" />'
					str+='</div></td><td class="align-middle ps-3 no">'+data.slist[i].suppl_no+'</td><td class="align-middle name">'+data.slist[i].suppl_name+'</td>'
					str+="<td class='align-middle ceo'>"+data.slist[i].ceo_name+"</td><td class='align-middle cate'>"+data.slist[i].category+"</td><td class='align-middle white-space-nowrap text-end pe-0'>"
					str+="<div class='font-sans-serif btn-reveal-trigger position-static'>"
					str+="<button class='btn btn-sm dropdown-toggle dropdown-caret-none transition-none btn-reveal fs--2' type='button' data-bs-toggle='dropdown' data-boundary='window' aria-haspopup='true' aria-expanded='false' data-bs-reference='parent'>"
					str+="<span class='fas fa-ellipsis-h fs--2'></span></button><div class='dropdown-menu dropdown-menu-end py-2'><a class='dropdown-item supplierDetail' href='#!' >View</a><a class='dropdown-item' href='#!'>Export</a>"
					str+="<div class='dropdown-divider'></div><a class='dropdown-item text-danger' href='#!'>Remove</a></div></div></td></tr>"

				}
				$('#bulk-select-body').empty();
				$('#bulk-select-body').append(str);
				str2='<h3 class="text-1100" id="supplierCardTitle">'+compo_name+'</h3><button class="btn btn-primary" id="componentDetail">부품상세보기</button><p class="mb-0 text-700">'+compo_name+' 공급사</p>'
				$('#head').empty();
				$('#head').append(str2);
				$('#supplierTasks').html('');
				$('#supplierTasks').html(data.count+' task');
			})
			
		});
		

		$('#head').on("click",'#componentDetail',function(e){
			Service.supplierDTO(compo_name,function(data){
				console.log(data)
				$('#componentModal').find("input[name='compo_name']").val(data.compoDetail.compo_name);
				$('#componentModal').find("input[name='compo_no']").val(data.compoDetail.compo_no);
				$('#componentModal').find("input[name='detail']").val(data.compoDetail.detail);
				$('#componentModal').find("input[name='unit']").val(data.compoDetail.unit);
				$("#componentModal").modal("show");
			})

		});
		//모달 창

		$('#bulk-select-body').on("click", ".supplierDetail",function(e){
			var suppl_no=$(this).closest('tr').children('.ps-3').html();
			//var supplierDetail;
			Service.getSupplier(suppl_no,function(supplierDetail){
				 //supplierDetail=result;
				 $('#myModal').find("input[name='suppl_name']").val(supplierDetail.suppl_name);
				 $('#myModal').find("input[name='ceo_name']").val(supplierDetail.ceo_name);
				 $('#myModal').find("input[name='category']").val(supplierDetail.category);
				 $('#myModal').find("input[name='biz_no']").val(supplierDetail.biz_no);
				 $('#myModal').find("input[name='transport_category']").val(supplierDetail.transport_category);
				 $('#myModal').find("input[name='phone']").val(supplierDetail.phone);
			}); 
			$("#myModal").modal("show");
		});
		
		//모달창 닫기
		$(".modalCloseBtn").on("click",function(e){
			$("#myModal").modal("hide");
			$("#componentModal").modal("hide");
		});
		var proposal=[];
		var names=[];
		var price=[];
		var quantity=[];
		
		var makeChart = function(proposal,names,maxPrice,maxQuantity){
			var chartDom = document.getElementById('echart-social-marketing-radar1');
			var myChart = echarts.init(chartDom);
			var option;

			option = {
			  title: {
			    text: 'comparison'
			  },
			  legend: {
			    data: names
			  },
			  radar: {
			    // shape: 'circle',
			    indicator: [
			      { name: '단가', max: maxPrice },
			      { name: '수량', max: maxQuantity },
			      { name: '불량률', max: 10 },
			      { name: '품질 등급', max: 10 },
			      { name: '생산 기간', max: 10 }
			    ]
			  },
			  series: [
			    {
			      name: 'comparison',
			      type: 'radar',
			      data: proposal
			    }
			  ]
			};
			option && myChart.setOption(option);
		}
		//체크박스 클릭시 제안 표시
		$('#bulk-select-body').on("change",'input.form-check-input',function(){
			var suppl_no=$(this).closest('tr').children('.ps-3').html();
			var compo_name=$('#supplierCardTitle').html();
			if($(this).is(':checked')){
				var str="";
				Service.getProposal({suppl_no:suppl_no,compo_name},function(result){
					str+="<tr>";
					str+='<td class="align-middle ps-3 proposal_no">'+result.proposal_no+'</td>';
					str+='<td class="align-middle suppl_name">'+result.supplier.suppl_name+'</td>';
					str+='<td class="align-middle compo_name">'+result.component.compo_name+'</td>';
					str+='<td class="align-middle price">'+result.price+'</td>';
					str+='<td class="align-middle quantity">'+result.quantity+'</td>';
					str+='<td class="align-middle defective_rate">'+result.defective_rate+'</td>';
					str+='<td class="align-middle quality_grade">'+result.quality_grade+'</td>';
					str+='<td class="align-middle prod_period">'+result.prod_period+'</td></tr>';
					var proposalDetail={};
					var regex = /[^0-9]/g;
					//차트 라벨
					names.push(result.supplier.suppl_name);
					
					//max값 계산을 위해서
					price.push(result.price);
					let maxPrice=Math.max(...price);
					quantity.push(result.quantity);
					let maxQuantity=Math.max(...quantity);
					//차트 각 데이터 이름
					proposalDetail.name=result.supplier.suppl_name;
					//정수 변환
					let quality_grade=result.quality_grade.replace(regex,"");
					let prod_period=result.prod_period.replace(regex,"");
					//차트 각 데이터들
					proposalDetail.value=[result.price,result.quantity,result.defective_rate,quality_grade,prod_period];
					//proposal.push(result);
					proposal.push(proposalDetail);
					$('#proposalList').append(str);
					makeChart(proposal,names,maxPrice,maxQuantity);
				});
			}else if(!($(this).is(':checked'))){
				var td = $('#proposalList').find('.proposal_no');
				Service.getProposal({suppl_no:suppl_no,compo_name},function(result){
					var proposal_no=result.proposal_no;
					for(let i=0; i<td.length;i++){
	 					if(td.eq(i).html()==proposal_no){
							td.eq(i).parent().remove();
							proposal.splice(i,1);
							makeChart(proposal);
						}
					} 
				})
			}
		});
	    function handleEnterKeyPress(event) {
	        if (event.key === 'Enter') {
	            event.preventDefault(); // 기본 Enter 동작 막기
	            document.getElementById('searchItem').click(); // 검색 버튼 클릭
	        }
	    }
	    const searchInput = document.getElementById('searchItemInput');
	    searchInput.addEventListener('keypress', handleEnterKeyPress);
	});
</script>

<%@include file="includes/footer.jsp"%>