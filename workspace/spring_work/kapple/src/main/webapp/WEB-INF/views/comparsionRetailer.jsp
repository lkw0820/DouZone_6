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
				<h2 class="mb-0" id="pageTitle">판매 예측 비교</h2>
			</div>
		</div>

		<!-- 상단 ; 부품/상품 검색 및 부품/공급사추가 버튼  -->
		<div id="products" data-list='{"valueNames":["product","price","category","tags","vendor","time"],"page":10,"pagination":true}'>
			<div class="mb-4">
				<div class="d-flex flex-wrap gap-3">
				
					<!-- 부품/상품 검색창 -->
					<div class="search-box" id="productSearchBox">
						<form class="position-relative" data-bs-toggle="search" data-bs-display="static" action="/comparsionRetailer" method="get">
							<input class="form-control search-input search" type="search" placeholder="상품 검색창" aria-label="Search" name="prod_name" id="searchItemInput"/> 
							<span class="fas fa-search search-box-icon"></span>
						</form>
					</div>
					<button class="btn btn-primary" id="searchItem">
						<span class="fas fa-plus me-2"></span>검색
					</button> 

					<!-- 공급사/부품 추가 버튼 -->
					<div class="ms-xxl-auto">
						<button class="btn btn-primary" id="addSupplierBtn">
							<span class="fas fa-plus me-2"></span>고객사 추가
						</button>
						<button class="btn btn-primary" id="addProdutBtn">
							<span class="fas fa-plus me-2"></span>제품 추가
						</button>
					</div>
				</div>
			</div>

			<!-- 콘텐츠 : 고객사 리스트 및 비교 표, 그래프 -->
			<div class="mx-lg-n4 mt-3">
				<div class="row g-3">
				
					<!-- 왼쪽 표 감싸는 컨테이너(카드) -->
					<div class="col-12 col-xl-6 col-xxl-6 min-vh-75">
						<div class="card retailerCard h-100">
						
							<!-- 카드 헤더 -->
							<div class="card-header border-bottom-0 pb-0">
								<div class="row justify-content-between align-items-center mb-4">
								
									<!-- 카드 타이틀 및 설명, 카드 헤더 내용 -->
									<div class="col-auto" id="head">


										<h3 class="text-1100" id="retailerCardTitle">상품을 검색해주세요</h3>
										<p class="mb-0 text-700"></p>

<%-- 										<input type="hidden" name="prod_name" id="prod_name" value="${prodDetail.prod_name }">
										<input type="hidden" name="prod_no" id="prod_no" value="${prodDetail.prod_no }">
										<input type="hidden" name="prod_detail" id="prod_detail" value="${prodDetail.prod_detail }">
										<input type="hidden" name="unit" id="unit" value="${prodDetail.unit }">
										<input type="hidden" name="model" id="model" value="${prodDetail.model }"> --%>
									</div>
									
									<!-- 검색 결과 개수 표시 -->
									<div class="col-auto w-100 w-md-auto">
										<div class="row align-items-center g-0 justify-content-between">
											<div class="col-12 col-sm-auto"></div>
											<div class="col-auto d-flex">
												<p class="mb-0 ms-sm-3 fs--1 text-700 fw-bold">
													<span class="fas fa-filter me-1 fw-extra-bold fs--2"></span>
													<span id="retailerTasks">${count} tasks</span>
												</p>
											</div>
										</div>
									</div>

								</div>
							</div> <!-- 카드 헤더 끝  -->

							<!-- 카드 바디 :  고객사 리스트 테이블 -->
							<div class="card-body py-0 scrollbar to-do-list-body min-vh-xxl-50 h-xl-auto">

								<div id="retailerTableContainer" dat-list='{"valueNames":["name","email","age"],"page":10,"pagination":true}'>
									<div class="table-responsive mx-n1 px-1">
									
										<!-- 고객사 테이블 : retailerTable  -->
										<table class=" table tabl-sm border-top border-200 fs--1 mb-0" id="retailerTable">
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
													<th class="sort align-middle ps-3" data-sort="no">판매사 번호</th>
													<th class="sort align-middle" data-sort="name">판매사 이름</th>
													<th class="sort align-middle" data-sort="ceo">대표자</th>
													<th class="sort align-middle" data-sort="cate">구분</th>
													<th class="sort align-middle" data-sort="scale">규모 등급</th>
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
									<h3 class="text-1100">판매 예측 비교</h3>
								</div>
								<p class="text-700 mb-4">판매 예측 비교 설명</p>

								<!-- 오른쪽 비교 리스트 테이블 -->
								<div id="tableComparsionR" data-list='{"valueNames":["name","email","age"],"page":5,"pagination":true}'>
									<div class="table-responsive">
										<table class="table table-sm fs--1 mb-0">
											<thead>
												<tr>
													<th class="sort border-top ps-3 asc" data-sort="predict_no">예측 번호</th>
													<th class="sort border-top" data-sort="retail_name">판매사 이름</th>
													<th class="sort border-top" data-sort="product_name">상품 이름</th>
													<th class="sort border-top" data-sort="sales_amount">예측 판매량</th>
													<th class="sort border-top" data-sort="purchasing_grade">구매자 등급</th>
													<th class="sort border-top" data-sort="price">단가</th>
													<th class="sort border-top" data-sort="transport_grade">운임등급</th>
												</tr>
											</thead>
											<tbody class="lisr" id="predictList">
											</tbody>
										</table>
									</div>
									
								</div>

								<!--  그래프  -->
								<div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 col-xxl-12 mt-5 ">
									<div id="chart" style="min-height: 320px; width: 100%"></div>
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
				<h4 class="modal-title" id="myModalLabel">판매사 상세 정보</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label>판매사 이름</label> <input class="form-control" name='retail_name' value='' readonly>
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
<div class="modal fade" id="productModal" tabindex="-1" role="dialog"
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
					<label>상품 이름</label> <input class="form-control" name='product_name' value='' readonly>
				</div>
				<div class="form-group">
					<label>상품 번호</label> <input class="form-control" name='product_no' value='' readonly>
				</div>
				<div class="form-group">
					<label>상품 설명</label> <input class="form-control" name='product_detail' value='' readonly>
				</div>
				<div class="form-group">
					<label>상품 단위</label> <input class="form-control" name='product_unit' value='' readonly>
				</div>
				<div class="form-group">
					<label>모델 이름</label> <input class="form-control" name='model_name' value='' readonly>
				</div>
				<div class="form-group">
					<label>모델 용량</label> <input class="form-control" name='capacity' value='' readonly>
				</div>
				<div class="form-group">
					<label>모델 색상</label> <input class="form-control" name=color value='' readonly>
				</div>
				<div class="form-group">
					<label>출시일</label> <input class="form-control" name='release_date' value='' readonly>
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
<input type="hidden" id="product_name" value="${productDetail.prod_name }">
<input type="hidden" id="product_no" value="${productDetail.prod_no }">
<input type="hidden" id="product_detail" value="${productDetail.prod_detail }">
<input type="hidden" id="product_unit" value="${productDetail.unit }">
<input type="hidden" id="model_name" value="${productDetail.model.model_name }">
<input type="hidden" id="capacity" value="${productDetail.model.capacity }">
<input type="hidden" id="color" value="${productDetail.model.color }">
<input type="hidden" id="release_date" value="${productDetail.model.release_date }">



</main>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/resources/test.js"></script>
<script src="https://cdn.jsdelivr.net/npm/echarts@5.4.3/dist/echarts.min.js" ></script>
<script type="text/javascript">
	$(document).ready(function(){
	    function handleEnterKeyPress(event) {
	        if (event.key === 'Enter') {
	            event.preventDefault(); // 기본 Enter 동작 막기
	            document.getElementById('searchItem').click(); // 검색 버튼 클릭
	        }
	    }
	    const searchInput = document.getElementById('searchItemInput');
	    searchInput.addEventListener('keypress', handleEnterKeyPress);
		var prod_name;
		$('#searchItem').on('click',function(){
			//$('form.position-relative').submit();
			prod_name=$('#productSearchBox').find('input').val();
			
			$('#retailerCardTitle').html(prod_name);
			var str="";
			var str2="";
			Service.retailerDTO(prod_name,function(data){
				
				for(let i=0;i<data.rlist.length;i++){
					str+='<tr><td class="fs--1 align-middle"><div class="form-check mb-0 fs-0"><input class="form-check-input" type="checkbox"data-bulk-select-row="{&quot;name&quot;:&quot;Anna&quot;,&quot;email&quot;:&quot;anna@example.com&quot;,&quot;age&quot;:18}" />'
					str+='</div></td><td class="align-middle ps-3 no">'+data.rlist[i].retail_no+'</td><td class="align-middle name">'+data.rlist[i].retail_name+'</td>'
					str+="<td class='align-middle ceo'>"+data.rlist[i].ceo_name+"</td><td class='align-middle cate'>"+data.rlist[i].category+"</td>"
					str+="<td class='align-middle scale'>"+data.rlist[i].scale_grade+"</td><td class='align-middle white-space-nowrap text-end pe-0'>"
					str+="<div class='font-sans-serif btn-reveal-trigger position-static'>"
					str+="<button class='btn btn-sm dropdown-toggle dropdown-caret-none transition-none btn-reveal fs--2' type='button' data-bs-toggle='dropdown' data-boundary='window' aria-haspopup='true' aria-expanded='false' data-bs-reference='parent'>"
					str+="<span class='fas fa-ellipsis-h fs--2'></span></button><div class='dropdown-menu dropdown-menu-end py-2'><a class='dropdown-item retailerDetail' href='#!' >View</a><a class='dropdown-item' href='#!'>Export</a>"
					str+="<div class='dropdown-divider'></div><a class='dropdown-item text-danger' href='#!'>Remove</a></div></div></td></tr>"
				}
			
				$('#bulk-select-body').empty();
				$('#bulk-select-body').append(str);
				str2='<h3 class="text-1100" id="retailerCardTitle">'+prod_name+'</h3><button class="btn btn-primary" id="productDetail">상품상세보기</button><p class="mb-0 text-700">'+prod_name+' 공급사</p>'
				$('#head').empty();
				$('#head').append(str2);
				$('#retailerTasks').html('');
				$('#retailerTasks').html(data.count+' task');
			})
		});
		
		$('#head').on("click",'#productDetail',function(e){
			
			Service.retailerDTO(prod_name,function(data){
				console.log(data)
				$('#productModal').find("input[name='product_name']").val(data.prodDetail.prod_name);
				$('#productModal').find("input[name='product_no']").val(data.prodDetail.prod_no);
				$('#productModal').find("input[name='product_detail']").val(data.prodDetail.prod_detail);
				$('#productModal').find("input[name='product_unit']").val(data.prodDetail.unit);
				$('#productModal').find("input[name='model_name']").val(data.prodDetail.model.model_name);
				$('#productModal').find("input[name='capacity']").val(data.prodDetail.model.capacity);
				$('#productModal').find("input[name='color']").val(data.prodDetail.model.color);
				$('#productModal').find("input[name='release_date']").val(new Date(data.prodDetail.model.release_date));
		
				$("#productModal").modal("show"); 
			})
		});
		
		$('#bulk-select-body').on("click",".retailerDetail",function(e){
			console.log('asdasd');
			var retail_no=$(this).closest('tr').children('.ps-3').html();
			Service.getRetailer(retail_no,function(retailerDetail){
				console.log(retailerDetail.retail_name);
				 $('#myModal').find("input[name='retail_name']").val(retailerDetail.retail_name);
				 $('#myModal').find("input[name='ceo_name']").val(retailerDetail.ceo_name);
				 $('#myModal').find("input[name='category']").val(retailerDetail.category);
				 $('#myModal').find("input[name='biz_no']").val(retailerDetail.biz_no);
				 $('#myModal').find("input[name='transport_category']").val(retailerDetail.transport_category);
				 $('#myModal').find("input[name='phone']").val(retailerDetail.phone);
				 $('#myModal').find("input[name='scale_grade']").val(retailerDetail.scale_grade);
			}); 
			$("#myModal").modal("show");
			
		});
		$(".modalCloseBtn").on("click",function(e){
			$("#myModal").modal("hide");
			$("#productModal").modal("hide");
		});
		
		
		//chart
		var names=[];
		var predictAmount=[];
		var predictPrice=[];
		var maxAmount;
		var maxPrice;
		var makeChart = function(predictAmount,predictPrice,names,maxAmount,maxPrice){
			var chartDom = document.getElementById('chart');
			var myChart = echarts.init(chartDom);
			var option;

			option = {
			  tooltip: {
			    trigger: 'axis',
			    axisPointer: {
			      type: 'cross',
			      crossStyle: {
			        color: '#999'
			      }
			    }
			  },
			  toolbox: {
			    feature: {
			      dataView: { show: true, readOnly: false },
			      magicType: { show: true, type: ['line', 'bar'] },
			      restore: { show: true },
			      saveAsImage: { show: true }
			    }
			  },
			  legend: {
			    data: ['예상 판매량', '단가']
			  },
			  xAxis: [
			    {
			      type: 'category',
			      data: names,
			      axisPointer: {
			        type: 'shadow'
			      }
			    }
			  ],
			  yAxis: [
			    {
			      type: 'value',
			      name: '예측 판매량',
			      min: 0,
			      max: 	maxAmount,
			      interval: maxAmount/10,
			      axisLabel: {
			        formatter: '{value} 개'
			      }
			    },
			    {
			      type: 'value',
			      name: '단가',
			      min: 0,
			      max: maxPrice,
			      interval: maxPrice/10,
			      axisLabel: {
			        formatter: '{value} 만원'
			      }
			    }
			  ],
			  series: [
			    {
			      name: '예측판매량',
			      type: 'bar',
			      tooltip: {
			        valueFormatter: function (value) {
			          return value + ' 개';
			        }
			      },
			      data: predictAmount
			    },

			    {
			      name: '단가',
			      type: 'line',
			      yAxisIndex: 1,
			      tooltip: {
			        valueFormatter: function (value) {
			          return value + ' 만원';
			        }
			      },
			      data: predictPrice
			    }
			  ]
			};

			option && myChart.setOption(option);
		}
		//체크박스 클릭시 제안 표시
		$('#bulk-select-body').on("change",'input.form-check-input',function(){
			var retail_no=$(this).closest('tr').children('.ps-3').html();
			var prod_name=$('#retailerCardTitle').html();
			if($(this).is(':checked')){
				var str="";
				Service.getPredict({retail_no:retail_no,prod_name},function(result){
					str+="<tr>";
					str+='<td class="align-middle ps-3 sale_predict_no">'+result.sale_predict_no+'</td>';
					str+='<td class="align-middle retail_name">'+result.retailer.retail_name+'</td>';
					str+='<td class="align-middle prod_name">'+result.product.prod_name+'</td>';
					str+='<td class="align-middle sales_amount">'+result.sales_amount+'</td>';
					str+='<td class="align-middle purchasing_grade">'+result.purchasing_grade+'</td>';
					str+='<td class="align-middle price">'+result.price+'</td>';
					str+='<td class="align-middle transport_grade">'+result.transport_grade+'</td>';
					names.push(result.retailer.retail_name);
					predictAmount.push(result.sales_amount);
					predictPrice.push(result.price);
					
					maxAmount=Math.max(...predictAmount);
					maxPrice=Math.max(...predictPrice)
					$('#predictList').append(str);
					makeChart(predictAmount,predictPrice,names,maxAmount,maxPrice);
				});
			}else if(!($(this).is(':checked'))){
				var td = $('#predictList').find('.sale_predict_no');
				Service.getPredict({retail_no:retail_no,prod_name},function(result){
					var sale_predict_no=result.sale_predict_no;
					for(let i=0; i<td.length;i++){

	 					if(td.eq(i).html()==sale_predict_no){
							td.eq(i).parent().remove();
							names.splice(i,1);
							predictAmount.splice(i,1);
							predictPrice.splice(i,1);
							makeChart(predictAmount,predictPrice,names,maxAmount,maxPrice);
						}
					} 
				})
			}
		});
		

		
	})
		
		
</script>
<%@include file="includes/footer.jsp"%>