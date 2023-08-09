<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@include file="includes/header.jsp"%>
<sec:authentication property="principal" var="pinfo"/>
<sec:authorize access="isAuthenticated()">
	<c:if test="${not empty pinfo }">
		<section class="pt-5 pb-9">
		
       		<div class="container-large mx-12 my-10">
		          
	          <div class="row align-items-center justify-content-between g-3 mb-4">
	            <div class="col-auto">
	              <h2 class="mb-0"> <c:out value="Welcome, ${pinfo.emp.emp_name }"/></h2>
	            </div>
	            <div class="col-auto">
	              <div class="row g-2 g-sm-3">
	                
	              </div>
	            </div>
	          </div>
		          
	          <div class="row g-3 mb-6">
	            <div class="col-12 col-lg-4">
	              <div class="card h-100">
	                <div class="card-body">
	                  <div class="border-bottom border-dashed border-300 pb-4">
	                    <div class="row align-items-center g-3 g-sm-5 text-center text-sm-start">
	                      <div class="col-12 col-sm-auto">
	                        <input class="d-none" id="avatarFile" type="file" />
	                        <label class="cursor-pointer avatar avatar-5xl" for="avatarFile"><img class="rounded-circle" src="/resources/assets/img/team/30.webp" alt="" /></label>
	                      </div>
	                      <div class="col-12 col-sm-auto flex-1">
	                        <div class="col-12 col-sm-auto flex-1">
	                          <h3 class="fw-bolder mb-2"><c:out value="${pinfo.emp.emp_name }"/></h3>
	                          <p class="mb-0">
	                          <c:if test="${pinfo.emp.authList.size() eq 2}">
	                          	관리자<br>
	                          </c:if>
	                          <c:if test="${pinfo.emp.authList.size() eq 1}">
	                          	사원<br>
	                          </c:if></p>
	                          <a class="fw-bold dept" href="#!">
	                          	<c:out value="${pinfo.emp.department.dept_name }"/>
	                          </a>
	                        </div>
	                      </div>
	                    </div>
	                  </div>
	                  <div class="d-flex flex-between-center pt-4">
	                    <div>
	                      <h6 class="mb-2 text-800">hiredate</h6>
	                      <h4 class="fs-1 text-1000 mb-0"><fmt:formatDate value="${pinfo.emp.hiredate}" pattern="yyyy/MM/dd"/></h4>
	                      <input type="hidden" id="year" value="<fmt:formatDate value="${pinfo.emp.hiredate}" pattern="yyyy"/>">
	                    </div>
	                    <div class="text-end">
	                      <h6 class="mb-2 text-800">years</h6>
	                      <h4 class="fs-1 text-1000 mb-0 years" ></h4>
	                    </div>
	                    <div class="text-end">
	                      <h6 class="mb-2 text-800">etc</h6>
	                      <h4 class="fs-1 text-1000 mb-0">etc</h4>
	                    </div>
	                  </div>
	                </div>
	              </div>
	            </div>
	            <div class="col-12 col-lg-8">
	              <div class="card h-100">
	                <div class="card-body">
	                <form action="/modify" method="post">
	                  <div class="border-bottom border-dashed border-300">
	                    <h4 class="mb-3 lh-sm lh-xl-1"> user info
	                      <!-- <button class="btn btn-link p-0 modify" type="button"> <span class="fas fa-edit fs--1 ms-3 text-500"></span></button> -->
	                    </h4>
	                  </div>
	                  <div class="pt-4 mb-2">
	                    <div class="row justify-content-between">
	                      <div class="col-4">
	                        <h5 class="text-1000">Address</h5>
	                      </div>
	                      <div class="col-auto">
	                      	<input type="hidden" name="id" value="${pinfo.emp.id }">
	                        <p class="text-800"><input type="text" name="address" value="<c:out value="${pinfo.emp.address }"/>"></p>
	                      </div>
	                    </div>
	                  </div>
	                  <div class="border-top border-dashed border-300 pt-4">
	                    <div class="row flex-between-center mb-2">
	                      <div class="col-auto">
	                        <h5 class="text-1000 mb-0">Email</h5>
	                      </div>
	                      <div class="col-auto"><input type="text" name="email" value="<c:out value="${pinfo.emp.email }"/>"></div>
	                    </div>
	                    <div class="row flex-between-center">
	                      <div class="col-auto">
	                        <h5 class="text-1000 mb-0">Phone</h5>
	                      </div>
	                      <div class="col-auto"><input type="text" name="phone" value="<c:out value="${pinfo.emp.phone }"/>"></div>
	                    </div>
	                  </div>
	                  <input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }"/>
	                  <button id='modalModifyBtn' type="submit" class="btn btn-primary " style="float: right; margin-top:5px">Modify</button>
	                  </form>
	                </div>
	              </div>
	            </div>
	          </div>
		          
   		</div>
	</section>
<!-- Modal -->
<div class="modal fade" id="deptModal" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
<!-- 				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button> -->
				<h4 class="modal-title" id="myModalLabel">부서 정보</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label>부서명</label> <input class="form-control" name='dept_name' value='${pinfo.emp.department.dept_name }' readonly>
				</div>
				<div class="form-group">
					<label>TO</label> <input class="form-control" name='TOO' value='${pinfo.emp.department.TOO }' readonly>
				</div>
				<div class="form-group">
					<label>내선번호</label> <input class="form-control" name='ext_phone' value='${pinfo.emp.department.ext_phone }' readonly>
				</div>
			</div>
			<div class="modal-footer">
				
				<button type="button" class="btn btn-default modalCloseBtn">Close</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->
<!-- Modal -->
<div class="modal fade" id="changePwModal" tabindex="-1" role="dialog"
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
					<label>현재 비밀번호 입력</label> 
					<!-- <form action="/checkPw"method="post"> -->
						<input class="form-control" id="checkPw" >
						<input type="hidden" id="id" value="${pinfo.emp.id }">
						<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }"/>
						<button id='pwsearchBtn' type="button" class="btn btn-warning" style="float: right;">Check</button>
					<!-- </form> -->
				</div>
				
				<div class="form-group"style="clear:both;">
					<label>비밀번호 입력</label> <input class="form-control" name='changePw'  >
				</div>
				<div class="form-group">
					<label>비밀번호 확인</label> <input class="form-control" name='ext_phone' value='${pinfo.emp.department.ext_phone }' >
				</div>
			</div>
			<div class="modal-footer">
				<button id='modalModifyBtn' type="button" class="btn btn-primary" disabled>Modify</button>
				<button type="button" class="btn btn-default modalCloseBtn">Close</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->
</c:if>
<form action="/modify" method="get" id="modify">
	<input type="hidden" name="pinfo" id="pinfo" value="${pinfo }">
</form>
</sec:authorize>

</main>
<script type="text/javascript" src="/resources/test.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	let today = new Date();   
	let year = today.getFullYear();
	let hiredate = $('#year').val();
	let years= hiredate-year;
	$('.years').html(years+'years');
	
/* 	$('.dept').on('click',function(e){
		$('#deptModal').modal("show");
	}) */
	$('.pw').on('click',function(){
		console.log("asdasd");
		$('#changePwModal').modal("show");
	})
	$(".modalCloseBtn").on("click",function(e){
		$("#deptModal").modal("hide");
		$("#changePwModal").modal("hide");
	});
	/* $('#pwsearchBtn').on("click",function(){
		let checkPw=$('#checkPw').val();
		let id=$('#id').val();
		Service.checkPw({id:id,checkPw:checkPw},function(data){
			console.log(data);
			alert(data);
			$('#modalModifyBtn').attr("disabled",false);
		}) 
	})*/
})

</script>
<%@include file="includes/footer.jsp"%>