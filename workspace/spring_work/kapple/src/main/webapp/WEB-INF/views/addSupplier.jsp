<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp"%>

<div class="content max-vh-100">

	<div class="mx-lg-n4 mt-1">
		<div class="row g-3">
      
            <!-- 왼쪽 카드 -->
			<div class="col-12 col-xl-8 col-xxl-8 min-vh-75 ">
				<div class="row g-3 flex-between-end mb-4 mx-3">
					<div class="col-auto">
						<h2 class="mb-2">부품별 공급사 등록</h2>
						<h5 class="text-700 fw-semi-bold">Registering as a supplier for each items</h5>
					</div>
					<div class="col-auto">
						<button class="btn btn-outline-secondary  me-1 mb-1" type="button" 
						data-bs-toggle="offcanvas" data-bs-target="#offcanvasWithBothOptions" aria-controls="offcanvasWithBothOptions">임시 저장 목록</button>
					</div>
				</div>
				<div class="addSupplierCard card theme-wizard mb-5 min-vh-75"data-theme-wizard="data-theme-wizard">
                    <!-- CARD HEADER -->
                    <div class="card-header bg-100 pt-3 pb-2 border-bottom-0">
						<ul class="nav justify-content-between nav-wizard" role="tablist">
							<li class="nav-item" role="presentation">
                <a class="addSupplierCardHead fw-semi-bold nav-link active" href="#bootstrap-wizard-validation-tab1" data-bs-toggle="tab" data-wizard-step="1" aria-selected="true" role="tab">
									<div class="text-center d-inline-block">
										<span class="nav-item-circle-parent">
                      <span class="nav-item-circle">
                        <svg class="svg-inline--fa fa-search" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="search" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" data-fa-i2svg="">
													<path fill="currentColor" d="M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z"></path>
                        </svg><!-- <span class="fas fa-lock"></span> Font Awesome fontawesome.com -->
                      </span>
                    </span>
                    <span class="d-none d-md-block mt-1 fs--1">부품검색</span>
									</div>
                </a>
              </li>
              
							<li class="nav-item" role="presentation">
                <a class="addSupplierCardHead fw-semi-bold nav-link" href="#bootstrap-wizard-validation-tab2" data-bs-toggle="tab" data-wizard-step="2" aria-selected="false" tabindex="-1" role="tab">
									<div class="text-center d-inline-block">
										<span class="nav-item-circle-parent">
                      <span class="nav-item-circle">
                        <svg class="svg-inline--fa fa-building" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="building" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" data-fa-i2svg="">
													<path fill="currentColor"
														d="M436 480h-20V24c0-13.255-10.745-24-24-24H56C42.745 0 32 10.745 32 24v456H12c-6.627 0-12 5.373-12 12v20h448v-20c0-6.627-5.373-12-12-12zM128 76c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v40c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12V76zm0 96c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v40c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12v-40zm52 148h-40c-6.627 0-12-5.373-12-12v-40c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v40c0 6.627-5.373 12-12 12zm76 160h-64v-84c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v84zm64-172c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12v-40c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v40zm0-96c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12v-40c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v40zm0-96c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12V76c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v40z">
                          </path>
                        </svg><!-- <span class="fas fa-user"></span> Font Awesome fontawesome.com -->
                      </span>
                    </span>
                    <span class="d-none d-md-block mt-1 fs--1">공급사등록</span>
									</div>
								</a>
							</li>

							<li class="nav-item" role="presentation">
                <a class="addSupplierCardHead fw-semi-bold nav-link" href="#bootstrap-wizard-validation-tab3" data-bs-toggle="tab" data-wizard-step="3" aria-selected="false" tabindex="-1" role="tab">
									<div class="text-center d-inline-block">
										<span class="nav-item-circle-parent">
											<span class="nav-item-circle">
												<svg class="svg-inline--fa fa-cog" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="cog" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 460 512" data-fa-i2svg="">
													<path fill="currentColor" d="M487.4 315.7l-42.6-24.6c4.3-23.2 4.3-47 0-70.2l42.6-24.6c4.9-2.8 7.1-8.6 5.5-14-11.1-35.6-30-67.8-54.7-94.6-3.8-4.1-10-5.1-14.8-2.3L380.8 110c-17.9-15.4-38.5-27.3-60.8-35.1V25.8c0-5.6-3.9-10.5-9.4-11.7-36.7-8.2-74.3-7.8-109.2 0-5.5 1.2-9.4 6.1-9.4 11.7V75c-22.2 7.9-42.8 19.8-60.8 35.1L88.7 85.5c-4.9-2.8-11-1.9-14.8 2.3-24.7 26.7-43.6 58.9-54.7 94.6-1.7 5.4.6 11.2 5.5 14L67.3 221c-4.3 23.2-4.3 47 0 70.2l-42.6 24.6c-4.9 2.8-7.1 8.6-5.5 14 11.1 35.6 30 67.8 54.7 94.6 3.8 4.1 10 5.1 14.8 2.3l42.6-24.6c17.9 15.4 38.5 27.3 60.8 35.1v49.2c0 5.6 3.9 10.5 9.4 11.7 36.7 8.2 74.3 7.8 109.2 0 5.5-1.2 9.4-6.1 9.4-11.7v-49.2c22.2-7.9 42.8-19.8 60.8-35.1l42.6 24.6c4.9 2.8 11 1.9 14.8-2.3 24.7-26.7 43.6-58.9 54.7-94.6 1.5-5.5-.7-11.3-5.6-14.1zM256 336c-44.1 0-80-35.9-80-80s35.9-80 80-80 80 35.9 80 80-35.9 80-80 80z"></path>
												</svg> <!-- <span class="fas fa-file-alt"></span> Font Awesome fontawesome.com -->
											</span>
										</span>
										<span class="d-none d-md-block mt-1 fs--1">부품상세</span>
									</div>
								</a>
							</li>

							<li class="nav-item" role="presentation">
                <a class="addSupplierCardHead fw-semi-bold nav-link" href="#bootstrap-wizard-validation-tab4" data-bs-toggle="tab" data-wizard-step="4" aria-selected="false" tabindex="-1" role="tab">
									<div class="text-center d-inline-block">
										<span class="nav-item-circle-parent">
                      <span class="nav-item-circle">
                        <svg class="svg-inline--fa fa-check" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="check" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 400 512" data-fa-i2svg="">
													<path fill="currentColor" d="M438.6 105.4C451.1 117.9 451.1 138.1 438.6 150.6L182.6 406.6C170.1 419.1 149.9 419.1 137.4 406.6L9.372 278.6C-3.124 266.1-3.124 245.9 9.372 233.4C21.87 220.9 42.13 220.9 54.63 233.4L159.1 338.7L393.4 105.4C405.9 92.88 426.1 92.88 438.6 105.4H438.6z">
                          </path>
                        </svg><!-- <span class="fas fa-check"></span> Font Awesome fontawesome.com -->
                      </span>
                    </span>
                    <span class="d-none d-md-block mt-1 fs--1">완료</span>
									</div>
							  </a>
              </li>
						</ul>
					</div>

					<div class="card-body pt-4 pb-0" style="height:560px">						
						<div class="tab-content">
                            <!-- 첫번째 패널 -->
							<div class="tab-pane active" role="tabpanel" aria-labelledby="bootstrap-wizard-validation-tab1" id="bootstrap-wizard-validation-tab1">
								<form class="needs-validation" id="wizardValidationForm1" novalidate="novalidate" data-wizard-form="1">
									<h5 class="mb-2 mx-2" for="componentName-addSupplier">부품명</h5>
									<div class="mb-2">
										<input class="form-control" type="text" name="componentName" placeholder="Component Name" required="required" id="componentName-addSupplier" value="">
										<div class="invalid-feedback">부품명을 정확히 입력하세요.</div>
									</div>
								</form>
                
                <!-- Paging -->
								<div id="paginationButtons" class="text-end mt-3 mb-3 mx-2">
									<button class="btn btn-phoenix-primary rounded-pill mx-1 p-1" onclick="changePage(-1)">이전</button>
									<span id="currentPage">1</span>
									<button class="btn btn-phoenix-primary rounded-pill mx-1 p-1" onclick="changePage(1)">다음</button>
								</div>

                <!-- 부품 버튼 동적 생성 -->
								<div id="componentBtnDiv" class="row my-1">
									<c:forEach items="${componentList}" var="component">
										<div class="col-md-3 mb-3">
											<button class="btn btn-phoenix-info p-2 w-100 border-100" onclick="componentBtnClick('${component.compo_name}','${component.compo_no}' )">
												<p class="fs-sm--1 mb-1 text-secondary">${component.compo_no}</p>
												<h5 class="mb-1 mt-2 text-primary">${component.compo_name}</h5>
												<p class="fs-sm--2 mb-0 text-secondary">(${component.unit})</p>
												<p class="mb-0 text-secondary">${component.detail}</p>
											</button>
										</div>
									</c:forEach>
								</div>

								<div id="addComponentDIv" class=" text-center w-100 mt-10"style="display: none">
									<h4>해당하는 부품을 찾을 수 없습니다</h4>
									<p>아래 부품 추가 버튼을 이용하여 부품을 추가하십시오</p>

									<button class="btn btn-soft-primary w-50 p-3 mt-3" id="addProdutBtn">
										<span class="fas fa-plus me-2"></span>부품 추가
									</button>
								</div>
							</div>

                            <!-- 두번째 패널 -->
							<div class="tab-pane" role="tabpanel" aria-labelledby="bootstrap-wizard-validation-tab2" id="bootstrap-wizard-validation-tab2">
								<form class="needs-validation" id="wizardValidationForm2" novalidate="novalidate" data-wizard-form="2">
									<div id="logoDropzone" class="row g-4 mb-4 dz-clickable" data-dropzone="data-dropzone" data-options='{"maxFiles": 1, "data": [{"name": "avatar.webp", "size": "54kb", "url": "resources/assets/img/team/avatar.webp"}]}'>

										<div class="col-md-auto">
											<div class="dz-preview dz-preview-single">
												<div class="dz-preview-cover d-flex align-items-center justify-content-center mb-2 mb-md-0 dz-image-preview">
													<div class="avatar avatar-4xl">
														<img class="rounded-circle avatar-placeholder" id="avatar-thumb-img" src="" alt="" data-dz-thumbnail="data-dz-thumbnail">
													</div>
													<div class="dz-progress">
														<span class="dz-upload" data-dz-uploadprogress=""></span>
													</div>
												</div>
											</div>
										</div>
										
										<!-- 파일 업로드 설명 -->
										<div class="col-md">
											<div class="dz-message dropzone-area px-2 py-3" data-dz-message="data-dz-message">
												<div class="text-center text-1100">
													<h5 class="mb-2">
														<svg class="svg-inline--fa fa-upload me-2" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="upload" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg="">
															<path fill="currentColor" d="M105.4 182.6c12.5 12.49 32.76 12.5 45.25 .001L224 109.3V352c0 17.67 14.33 32 32 32c17.67 0 32-14.33 32-32V109.3l73.38 73.38c12.49 12.49 32.75 12.49 45.25-.001c12.49-12.49 12.49-32.75 0-45.25l-128-128C272.4 3.125 264.2 0 256 0S239.6 3.125 233.4 9.375L105.4 137.4C92.88 149.9 92.88 170.1 105.4 182.6zM480 352h-160c0 35.35-28.65 64-64 64s-64-28.65-64-64H32c-17.67 0-32 14.33-32 32v96c0 17.67 14.33 32 32 32h448c17.67 0 32-14.33 32-32v-96C512 366.3 497.7 352 480 352zM432 456c-13.2 0-24-10.8-24-24c0-13.2 10.8-24 24-24s24 10.8 24 24C456 445.2 445.2 456 432 456z"></path>
														</svg><!-- <span class="fa-solid fa-upload me-2"></span> Font Awesome fontawesome.com -->
														회사 로고 및 사진 업로드
													</h5>
													<p class="mb-0 fs--1 text-600 lh-sm">Upload a 300x300 jpg image with <br>a maximum size of 400KB </p>
												</div>
											</div>
										</div>

									</div>
								</form>
								
								<form>
									<div class="mb-2">
										<label class="form-label" for="suplierName-addSupplier">공급사명</label>
										<input class="form-control" type="text" name="supplierName"
											placeholder="Supplier Name" id="suplierName-addSupplier"
											required="required" onkeyup="searchSupplier()">
											<select id="supplierSelect" class="form-control" style="display: none;">
												<option value="" disabled selected>Select Supplier</option>
											</select>
										<div class="invalid-feedback">공급사명은 필수로 입력하셔야 합니다.</div>
									</div>

									<div class="mb-2">
										<label class="form-label" for="ceoName-addSupplier">대표자명</label>
										<input class="form-control" type="text" name="ceoName"
											placeholder="CEO Name" id="ceoName-addSupplier"
											required="required">
										<div class="invalid-feedback">This field is required.</div>
									</div>

									<div class="mb-2">
										<label class="form-label" for="category-addSupplier">구분</label>
										<input class="form-control" type="text" name="suppliername"
											placeholder="Business Category"
											id="category-addSupplier" required="required">
										<div class="invalid-feedback">This field is required.</div>
									</div>

									<div class="mb-2">
										<label class="form-label" for="phNumber-addSupplier">대표번호</label>
										<input class="form-control" type="text" name="phone"
											placeholder="Phone Number" id="phNumber-addSupplier"
											required="required">
										<div class="invalid-feedback">This field is required.</div>
									</div>

									<div class="mb-4">
										<label class="form-label" for="address-addSupplier">주소</label>
										<textarea class="form-control" rows="4"
											id="address-addSupplier" required="required"></textarea>
										<div class="invalid-feedback">This field is required.</div>
									</div>
              
								</form>
							</div>

                            <!-- 세번째 패널 -->
							<div class="tab-pane" role="tabpanel" aria-labelledby="bootstrap-wizard-validation-tab3" id="bootstrap-wizard-validation-tab3">
								<form class="mb-2 needs-validation" id="wizardValidationForm3" novalidate="novalidate" data-wizard-form="3">
									<div class="row gx-3 gy-2">

										<div class="col-6">
											<label class="form-label" for="componentName-addSuppliers">부품명</label>
											<input class="form-control bg-light-secondary" name="componentName" type="text" id="componentName-addSuppliers" readonly>
											<div class="invalid-feedback">This field is required.</div>
										</div>
										<div class="col-6">
											<label class="form-label" for="price-addSupplier">단가</label>
											<input class="form-control" placeholder="Price of component" type="number" required="required" id="price-addSupplier">
											<div class="invalid-feedback">This field is required.</div>
										</div>
										<div class="col-6">
											<label class="form-label" for="quantity-addSupplier">수량</label>
											<input class="form-control" placeholder="Quantity of component" name="cardName" type="number" id="quantity-addSupplier" required="required">
											<div class="invalid-feedback">This field is required.</div>
										</div>
										<div class="col-6">
											<label class="form-label" for="defectiveRate-addSupplier">불량률</label>
											<input class="form-control" placeholder="Defective rate of component" name="zipCode" type="number" id="defectiveRate-addSupplier" step="0.001" required="required">
											<div class="invalid-feedback">This field is required.</div>
										</div>
										<div class="col-6">
											<label class="form-label" for="qualityGrade-addSupplier">품질등급</label>
											<input class="form-control" placeholder="Quality grade of component(A, B, C...)" name="zipCode" type="text" id="qualityGrade-addSupplier" required="required">
											<div class="invalid-feedback">This field is required.</div>
										</div>
										<div class="col-6">
											<label class="form-label" for="prodPeriod-addSupplier">생산기간(일)</label>
											<input class="form-control" placeholder="Period of producting component" name="expDate" type="text" id="prodPeriod-addSupplier" required="required">
											<div class="invalid-feedback">This field is required.</div>
										</div>
									</div>
								</form>


								<label class="form-label" for="bootstrap-wizard-validation-card-cvv">제안서 파일</label>
								<form class="dropzone dropzone-multiple p-0 bg-white mb-3" id="proposal-dropzone" data-dropzone="data-dropzone" action="/upload-proposal">
									<div class="fallback">
										<input name="file" type="file" multiple="multiple" />
									</div>
									<div class="dz-message text-center" data-dz-message="data-dz-message">
										<img class="me-2" src="resources/assets/img/icons/cloud-upload.svg" width="25" alt="" />
										Drop your files here
									</div>
									<div class="dz-preview dz-preview-multiple mb-5 d-flex flex-column">
										<div class="d-flex pb-3 border-bottom media">
											
											<div class="flex-1 d-flex flex-between-center mx-3">
												<div>
													<h6 data-dz-name="data-dz-name"></h6>
													<div class="d-flex align-items-center">
														<p class="mb-0 fs--1 text-400 lh-1" data-dz-size="data-dz-size"></p>
														<div class="dz-progress mx-4">
															<span class="dz-upload" data-dz-uploadprogress=""></span>
														</div>
													</div>
													<span class="fs--2 text-danger" data-dz-errormessage="data-dz-errormessage"></span>
												</div>
												<div class="dropdown font-sans-serif">
													<button class="btn btn-link text-600 btn-sm dropdown-toggle btn-reveal dropdown-caret-none" type="button" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
														<span class="fas fa-ellipsis-h"></span>
													</button>
													<div class="dropdown-menu dropdown-menu-end border py-2">
														<a class="dropdown-item" href="#!" data-dz-remove="data-dz-remove">Remove File</a>
													</div>
												</div>
											</div>
										</div>
									</div>
								</form>
							</div>

                            <!-- 네번째 패널 -->
							<div class="tab-pane" role="tabpanel" aria-labelledby="bootstrap-wizard-validation-tab4" id="bootstrap-wizard-validation-tab4">
								<div class="row flex-center pb-8 pt-4 gx-3 gy-4 mt-10 min-vh-50">
									<div class="col-12 col-sm-auto">
										<div class="text-center text-sm-start">
											<img class="d-dark-none" src="resources/assets/img/spot-illustrations/38.webp" alt="" width="250"><img class="d-light-none" src="../../assets/img/spot-illustrations/dark_38.webp" alt="" width="250">
										</div>
									</div>
									<div class="col-12 col-sm-auto">
										<div class="text-center text-sm-start">
											<h3 class="mb-3">공급사 임시 저장 완료</h3>
											<p class="text-1100 fs--1"> 공급사 임시 저장이 완료되었습니다.<br>해당 공급사를 등록하시려면 오른쪽 하단의 등록 버튼을 입력하세요. </p>
											<a class="btn btn-outline-primary px-6" href="/">메인 화면으로 돌아가기</a>
										</div>
									</div>
								</div>
							</div>

						</div>
					</div> 

                    <!--CARD FOOTER -->
					<div class="card-footer border-top-0" data-wizard-footer="data-wizard-footer">
						<div class="d-flex pager wizard list-inline">
							<button class="d-none btn btn-link ps-0" type="button" data-wizard-prev-btn="data-wizard-prev-btn">
								<svg class="svg-inline--fa fa-chevron-left me-1" data-fa-transform="shrink-3" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="chevron-left" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512" data-fa-i2svg="" style="transform-origin: 0.3125em 0.5em;">
									<g transform="translate(160 256)">
										<g transform="translate(0, 0)  scale(0.8125, 0.8125)  rotate(0 0 0)">
											<path fill="currentColor" d="M224 480c-8.188 0-16.38-3.125-22.62-9.375l-192-192c-12.5-12.5-12.5-32.75 0-45.25l192-192c12.5-12.5 32.75-12.5 45.25 0s12.5 32.75 0 45.25L77.25 256l169.4 169.4c12.5 12.5 12.5 32.75 0 45.25C240.4 476.9 232.2 480 224 480z" transform="translate(-160 -256)"></path>
										</g>
									</g>
								</svg><!-- <span class="fas fa-chevron-left me-1" data-fa-transform="shrink-3"></span> Font Awesome fontawesome.com -->
								Previous
							</button>
							
							<div class="flex-1 text-end">
								<button id="btnNextAdd" class="btn btn-primary px-6 px-sm-6" type="button" data-wizard-next-btn="data-wizard-next-btn">
									Next
									<svg class="svg-inline--fa fa-chevron-right ms-1" data-fa-transform="shrink-3" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="chevron-right" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512" data-fa-i2svg="" style="transform-origin: 0.3125em 0.5em;">
										<g transform="translate(160 256)">
											<g transform="translate(0, 0)  scale(0.8125, 0.8125)  rotate(0 0 0)">
												<path fill="currentColor" d="M96 480c-8.188 0-16.38-3.125-22.62-9.375c-12.5-12.5-12.5-32.75 0-45.25L242.8 256L73.38 86.63c-12.5-12.5-12.5-32.75 0-45.25s32.75-12.5 45.25 0l192 192c12.5 12.5 12.5 32.75 0 45.25l-192 192C112.4 476.9 104.2 480 96 480z" transform="translate(-160 -256)"></path>
											</g>
										</g>
									</svg><!-- <span class="fas fa-chevron-right ms-1" data-fa-transform="shrink-3"> </span> Font Awesome fontawesome.com -->
								</button>
							</div>
						</div>
					</div>

				</div>
			</div>

            <!-- 오른쪽 카드 -->
			<div class="col-12 col-xl-4 col-xxl-4 min-vh-100">
				<div class="card">

                    <!-- CARD HEADER -->
					<div class="card-header">
						<div class="row justify-content-between align-items-center ">
							<div class="col-auto mt-2">
								<h3 class="text-1100">등록 미리 보기</h3>
							</div>
						</div>
					</div>

                    <!-- CARD BODY-->
					<div class="card-body">
						<div class="mb-3 row">
							<div class="form">
							
								<div class="dz-preview-cover d-flex align-items-center justify-content-center mb-2 mx-6 dz-image-preview mb-6 mt-2">
									<div class="avatar avatar-4xl">
										<img class="rounded-circle avatar-placeholder" id="pre-avatar-thumb-img" src="" alt="" data-dz-thumbnail="data-dz-thumbnail">
									</div>
								</div>
								
								
								<div class="w-100 row">
									<label class="col-sm-3 col-form-label fs-sm--1" for="preSupplierName">공급사명</label>
									<div class="col-sm-9">
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="preSupplierName" type="text" readonly value="" />
									</div>
			
									<label class="col-sm-3 col-form-label fs-sm--1" for="preCeoName">대표자명</label>
									<div class="col-sm-9">
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="preCeoName" type="text" readonly value="" />
									</div>
		
									<label class="col-sm-3 col-form-label fs-sm--1" for="preCategory">구분</label>
									<div class="col-sm-9">
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="preCategory" type="text" readonly value="" />
									</div>
		
									<label class="col-sm-3 col-form-label fs-sm--1" for="prePHNumber">대표번호</label>
									<div class="col-sm-9">
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="prePHNumber" type="text" readonly value="" />
									</div>
		
									<label class="col-sm-3 col-form-label fs-sm--1" for="preAddress">주소</label>
									<div class="col-sm-9">
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="preAddress" type="text" readonly value="" />
										<div class="mb-3 row"></div>
									</div>
								</div>
								<hr>

								<div class="w-100 row">
									<label class="col-sm-3 col-form-label fs-sm--1" for="preComponentName">부품명</label>
									<div class="col-sm-9">
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="preCompoNoHide" type="hidden" value="" readonly />
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="preComponentName" type="text" readonly value="" />
									</div>
									
									<label class="col-sm-3 col-form-label fs-sm--1" for="prePrice">단가</label>
									<div class="col-sm-9">
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="prePrice" type="text" readonly value="" />
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="prePriceHide" type="number" value="" readonly hidden />
									</div>
		
									<label class="col-sm-3 col-form-label fs-sm--1" for="preQuantity">단위</label>
									<div class="col-sm-9">
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="preQuantity" type="number" readonly value="" />
									</div>
		
									<label class="col-sm-3 col-form-label fs-sm--1" for="preDefectiveRate">불량률</label>
									<div class="col-sm-9">
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="preDefectiveRate" type=number" step="0.001" readonly value="" />
										
									</div>
		
									<label class="col-sm-3 col-form-label fs-sm--1" for="preQualityGrade">품질등급</label>
									<div class="col-sm-9">
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="preQualityGrade" type="text" readonly value="" />
									</div>
		
									<label class="col-sm-3 col-form-label fs-sm--1" for="preProdPeriod">생산기간(일)</label>
									<div class="col-sm-9">
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="preProdPeriod" type="text" readonly value="" />
									</div>
									
									<label class="col-sm-3 col-form-label fs-sm--1" for="preAttachFile">첨부파일</label>
									<div class="col-sm-9">
										<input class="form-control-plaintext outline-none text-center fs-sm--1" id="preAttachFile" type="text" readonly value="" />
										
									</div>	
								</div>
							</div>
                        </div>
                    </div>
							
					<div class="card-footer border-top-1" data-wizard-footer="data-wizard-footer">
						<div class="d-flex pager wizard list-inline">
							<button id="submitSupplierBtn" class="btn btn-primary w-100" type="button" data-bs-toggle="modal" data-bs-target="#RegisterCheck" disabled="true">
								공급사 등록
							</button>
						</div>
					</div>
							
					<!--  모달창 : 공급사 등록 확인 모달창  -->
					<div class="modal fade" id="RegisterCheck" tabindex="-1" aria-labelledby="RegisterCheckModalLabel" aria-hidden="true" style="display: none;">
					    <div class="modal-dialog modal-dialog-centered">
					       	<div class="modal-content">
					           	<div class="modal-header">
					               	<h5 class="modal-title" id="RegisterCheckModalLabel">부품별 공급사 등록</h5>
					                <button class="btn p-1" type="button" data-bs-dismiss="modal" aria-label="Close"><svg class="svg-inline--fa fa-xmark fs--1" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="xmark" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512" data-fa-i2svg=""><path fill="currentColor" d="M310.6 361.4c12.5 12.5 12.5 32.75 0 45.25C304.4 412.9 296.2 416 288 416s-16.38-3.125-22.62-9.375L160 301.3L54.63 406.6C48.38 412.9 40.19 416 32 416S15.63 412.9 9.375 406.6c-12.5-12.5-12.5-32.75 0-45.25l105.4-105.4L9.375 150.6c-12.5-12.5-12.5-32.75 0-45.25s32.75-12.5 45.25 0L160 210.8l105.4-105.4c12.5-12.5 32.75-12.5 45.25 0s12.5 32.75 0 45.25l-105.4 105.4L310.6 361.4z"></path></svg><!-- <span class="fas fa-times fs--1"></span> Font Awesome fontawesome.com --></button>
					            </div>
					            <div class="modal-body">
					             	<p class="text-700 lh-lg mb-0">입력하신 사항대로 공급사를 등록하시겠습니까?</p>
					             	
					            </div>
					            <div class="modal-footer">
					             	<button class="btn btn-primary" type="button" id="regiSupplierBtn">등록</button>
					                <button class="btn btn-outline-primary" type="button" data-bs-dismiss="modal">취소</button>
					            </div>
							</div>
						</div>
					</div>
							
				</div>
			</div>
		</div>
		
        <!-- 토스트-->
		<div class="position-fixed " style="z-index: 5 ">
		    <div class="toast show align-items-center text-white bg-info border-0" style="position: fixed; top: -10px; right: 20px; width: auto; max-width: 500px;" role="alert" data-bs-autohide="false" aria-live="assertive" aria-atomic="true" id="checkRegiToast">
		        <div class="d-flex">
		            <div class="toast-body">
		                부품별 공급사가 정상적으로 등록되었습니다.
		            </div>
		
		            <button class="btn ms-2 p-0 btn-close-white" type="button" data-bs-dismiss="toast" aria-label="Close"><span class="uil uil-times fs-1"></span></button>
		        </div>
		    </div>
		</div>

    </div>
</div>


<!-- 임시저장 오프캔버스 -->
<div class="offcanvas offcanvas-end" data-bs-scroll="true" tabindex="-1" id="offcanvasWithBothOptions" aria-labelledby="offcanvasWithBothOptionsLabel">
  <div class="offcanvas-header">
    <h4 class="offcanvas-title" id="offcanvasWithBothOptionsLabel">임시 저장 목록</h4>
    <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
  </div>

  <div class="offcanvas-body">
     <div class="mb-8">
       <div class="border-top border-bottom border-200" id="leadDetailsTable">
         <div class="table-responsive scrollbar mx-n1 px-1">
           <table class="table fs--1 mb-0" id="suppl-draft-table">
             <thead>
               <tr>
                 <th class="sort white-space-nowrap align-middle pe-3 ps-0 text-uppercase" scope="col" data-sort="dealName" style="width:15%; min-width:100px">공급사명</th>
                 <th class="sort align-middle ps-0 text-center text-uppercase" scope="col" data-sort="date" style="width:15%; min-width:60px">저장 날짜</th>
                 <th class="sort align-middle text-end text-uppercase" scope="col" data-sort="type" style="width:15%; min-width:70px">구분</th>
               </tr>
             </thead>
             <tbody class="list" id="draft-details-table-body">               
               <c:forEach items="${draftList}" var="draftList">
                 <tr class="hover-actions-trigger btn-reveal-trigger position-static">
                   <td class="offSuppleName align-middle white-space-nowrap py-2 ps-0"><a class="offEventA fw-semi-bold text-primary" href="#!">${draftList.suppl_name}</a></td>
                   <td class="offDate align-middle text-700 text-center py-2"><fmt:formatDate value="${draftList.proposal_date}" pattern="MMM dd일 hh:mm:ss" /></td>
                   <td class="offCompoName align-middle fw-semi-bold py-2 text-end"><span class="badge badge-phoenix fs--2 badge-phoenix-info">${draftList.compo_name}</span></td>
                   <td hidden class="offCeoName">${draftList.ceo_name}</td>
                   <td hidden class="offCategories">${draftList.categories}</td>
                   <td hidden class="offPhone">${draftList.phone}</td>
                   <td hidden class="offAddress">${draftList.address}</td>
                   <td hidden class="offCompoNo">${draftList.compo_no}</td>
                   <td hidden class="offPrice">${draftList.price}</td>
                   <td hidden class="offQuantitiy">${draftList.quantity}</td>
                   <td hidden class="offDefectiveRate">${draftList.defective_rate}</td>
                   <td hidden class="offQualityGrede">${draftList.quality_grade}</td>
                   <td hidden class="offProdPeriod">${draftList.prod_period}</td>
                   <td hidden class="offAttachFile">${draftList.attachfile}</td>
                   <td hidden class="offLogoPath">${draftList.logopath}</td>
                 </tr>
               </c:forEach>
             </tbody>
           </table>
         </div>
       </div>
     </div>
  </div>
</div>

</main>
<!-- ---------------------------- -->
<!--        END OF CONTENTS       -->
<!-- ---------------------------- -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>

	var logoDropzone;
	var proposalDropzone;
	var logo_uuid; 
	var file_uuid;

    
    $(document).ready(function() {
    	console.log(suppliers);
    	
    	// 등록 성공 토스트 플래그 
    	let checkRegi = ${checkRegi};
    	console.log(checkRegi);
    	  
    	if(checkRegi == 1) {
    	    showToast("부품별 공급사가 정상적으로 등록되었습니다.");
            setTimeout(function() {hideToast();}, 3000);
            
            checkRegi=0;
    	} else if (checkRegi == 2) {
    		showToast("임시 저장이 완료되었습니다. ");
            setTimeout(function() {hideToast();}, 3000);
            
            $("#bootstrap-wizard-validation-tab4").addClass("active show");
    	}
    

    	// 임시 저장 확인 플래그
    	let isDraftData = false;
    	
        // 아바타 이미지 변경 
        var avatar = $(".avatar-placeholder"); 
        avatar.attr('src', "resources/assets/img/team/avatar.webp");
        
        const componentNameInput = document.getElementById('componentName-addSupplier');
        
        
    	// dropzone
    	if (Dropzone.instances.length > 0) {
	        for (var i = 0; i < Dropzone.instances.length; i++) {
	            var instance = Dropzone.instances[i];
	            if (i==0) {
	                logoDropzone = instance;
	                logoDropzone.options.url = "addSupplier/logo";
	            } else if (i==1) {
	                proposalDropzone = instance;
	                proposalDropzone.options.url = "addSupplier/file";
	            }
	        }
	        console.log("Existing Dropzone instances found:", logoDropzone, proposalDropzone);
	    }
		
    	logoDropzone.on("thumbnail", function (file) {
    		console.log(file);
    		logo_uuid = file.upload.uuid;
    		
    		let receivedFile = "";
    		receivedFile = file.dataURL;
    		console.log("received : " + receivedFile);
    		
    		var supplLogo = {
    		        uuid: file.upload.uuid, 
    		        file_name: file.upload.filename, 
    		        file_size: file.upload.total, 
    		        file_type: "image/png", 
    		        file_url:receivedFile,
    		    };
            
    		console.log(supplLogo);
    		
    		$.ajax({
    	        url: "addSupplier/logo", // 서버 URL 수정
    	        type: "POST",
    	        data: JSON.stringify(supplLogo),
    	        contentType: "application/json; charset=utf-8",
    	        dataType: "json",
    	        success: function(response) {
    	            console.log("File uploaded successfully:", response);
    	            // 원하는 동작 수행
    	        },
    	        error: function(xhr, status, error) {
    	            console.error("Error uploading file:", error);
    	            // 에러 처리
    	        }
    	    });

    	});

        
        //////////////////////////////////////////////////////
        // DROPZONE 파일 추가 이벤트 => 미리보기 파일명 설정 //
      	//////////////////////////////////////////////////////
      	
        let proposalFileString = "";
		let proposalFileList = [];
	
		proposalDropzone.on("addedfile", function (file) {
			
		    const fileName = file.name;
		    proposalFileList.push(fileName);
		    
		    if (proposalFileList.length < 3) {
		    	
		    	if(proposalFileList.length == 2) {		    		
				    proposalFileString += ', ';
		    	}
		    	
		    	proposalFileString += fileName;
			    
			    if(proposalFileString.length > 23) {
			    	proposalFileString = proposalFileString.substring(0, 20);
			    	proposalFileString += "...";
			    }

		    } else if(proposalFileList.length == 3 && proposalFileString.length < 20) {
		    	proposalFileString += " ...";
		    }
		    
		});
		
		logoDropzone.on("thumbnail", function (file) {
			
			 	file_uuid = file.upload.uuid;
			 
			 	let receivedFile = "";
	    		receivedFile = file.dataURL;
	    		console.log("received : " + receivedFile);
			    
			    var supplFile = {
	    		        uuid: file.upload.uuid, 
	    		        file_name: file.upload.filename, 
	    		        file_size: file.upload.total, 
	    		        file_type: "txt", 
	    		        data_url: receivedFile,
	    		    };
	            
	    		console.log(supplFile);
	    		
	    		$.ajax({
	    	        url: "addSupplier/file", // 서버 URL 수정
	    	        type: "POST",
	    	        data: JSON.stringify(supplFile),
	    	        contentType: "application/json; charset=utf-8",
	    	        dataType: "json",
	    	        success: function(response) {
	    	            console.log("File uploaded successfully:", response);
	    	            // 원하는 동작 수행
	    	        },
	    	        error: function(xhr, status, error) {
	    	            console.error("Error uploading file:", error);
	    	            // 에러 처리
	    	        }
	    	    });
		});
        

        //////////////////////////
        // NextBtn 클릭 이벤트  //
      	/////////////////////////
      	 $(document).on('click', '#btnNextAdd', function(e){

            // 현재 활성화된 탭 표시 
            console.log($('.nav-link.active').attr('href'));
            var nextPageHref = $('.nav-link.active').attr('href');
            
            // 미리 보기 자동 입력 
            $("#preComponentName").val($("#componentName-addSupplier").val());
            $("#componentName-addSuppliers").val($("#preComponentName").val());

            $("#preSupplierName").val($("#suplierName-addSupplier").val());
            $("#preCeoName").val($("#ceoName-addSupplier").val());
            $("#preCategory").val($("#category-addSupplier").val());
            $("#prePHNumber").val($("#phNumber-addSupplier").val());
            $("#preAddress").val($("#address-addSupplier").val());
            
            console.log($("#avatar-thumb-img").attr('src'));
            $("#pre-avatar-thumb-img").attr('src', $("#avatar-thumb-img").attr('src'));
            console.log($("#pre-avatar-thumb-img").attr('src'));
          
            // 단가 -> 세자리마다 쉼표 처리
            const priceInput = document.getElementById('price-addSupplier');
            console.log("priceInput: " +  priceInput.value);
            
            let replaceValue = priceInput.value.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ',');
            console.log("priceInput2: " +  priceInput.value);
            
            $("#prePrice").val(replaceValue);
            $("#prePriceHide").val($("#price-addSupplier").val());
            $("#preQuantity").val($("#quantity-addSupplier").val());
            $("#preDefectiveRate").val($("#defectiveRate-addSupplier").val());
            $("#preQualityGrade").val($("#qualityGrade-addSupplier").val());
            $("#preProdPeriod").val($("#prodPeriod-addSupplier").val());
            $("#preAttachFile").val(proposalFileString);
            

            // 버튼 활성화 및 ajax 통신 
            if (nextPageHref === "#bootstrap-wizard-validation-tab4") {            
            	const submitSupplierBtn = document.getElementById('submitSupplierBtn');
            	submitSupplierBtn.disabled = false;
                
                var supplDraft = {
                	suppl_name : $("#preSupplierName").val(),
                	ceo_name : $("#preCeoName").val(),
                	categories : $("#preCategory").val(),
                	phone : $("#prePHNumber").val(),
                	compo_no : $("#preCompoNoHide").val(),
                	compo_name : $("#preComponentName").val(),
                	price : $("#prePriceHide").val(),
                	quantity : $("#preQuantity").val(),
                	defective_rate : $("#preDefectiveRate").val(),
                	quality_grade : $("#preQualityGrade").val(),
                	prod_period : $("#preProdPeriod").val(),
                	attachfile : $("#preAttachFile").val(),
                	address : $("#preAddress").val(),
                	logopath : "resources/assets/img/brand2/dell.png",
                };
                  
                $.ajax({
                    url: "addSupplier/draft",
                    type: "POST",
                    data: JSON.stringify(supplDraft),
                    processData: false,
                    contentType: "application/json",
                    success: function(response) {
                    	
                        /* var sucessRegi = "2";
                        window.location.href = "/addSupplier?param=" + sucessRegi; */
                        
                        $.ajax({
                            url: "addSupplier/getDraft", // 다시 불러오는 URL
                            type: "GET",
                            dataType: "json",
                            success: function(updatedData) {
                            	updateTableWithNewData(updatedData); // 업데이트 로직 실행
                                
                                showToast("임시 저장이 완료되었습니다.");
                                setTimeout(function() { hideToast(); }, 3000);
                            },
                            error: function(jqXHR, textStatus, errorThrown) {
                                console.error("데이터 업데이트 실패:", textStatus, errorThrown);
                            }
                        });
                        
                    },
                    error: function(jqXHR, textStatus, errorThrown) {
                        // 실패 처리
                    	console.error("요청 실패:", textStatus, errorThrown);
                    }
                });
              
            }

        });
        
        function updateTableWithNewData(data) {
            var $table = $("#suppl-draft-table");

            // 기존 데이터 삭제
            $table.find("tbody").empty();

            data.forEach(function(item) {
            	var formattedDate = new Intl.DateTimeFormat('ko-KR', { year: 'numeric', month: 'short', day: 'numeric', hour: 'numeric', minute: 'numeric', second: 'numeric' }).format(new Date(item.proposal_date));
            	
                var newRow = "<tr class='hover-actions-trigger btn-reveal-trigger position-static'>" +
                    "<td class='offSuppleName align-middle white-space-nowrap py-2 ps-0'><a class='offEventA fw-semi-bold text-primary' href='#!'>" + item.suppl_name + "</a></td>" +
                    "<td class='offDate align-middle text-700 text-center py-2'>" +formattedDate  + "</td>" +
                    "<td class='offCompoName align-middle fw-semi-bold py-2 text-end'><span class='badge badge-phoenix fs--2 badge-phoenix-info'>" + item.compo_name + "</span></td>" +
                    "<td hidden class='offCeoName'>" + item.ceo_name + "</td>" +
                    "<td hidden class='offCategories'>" + item.categories + "</td>" +
                    "<td hidden class='offPhone'>" + item.phone + "</td>" +
                    "<td hidden class='offAddress'>" + item.address + "</td>" +
                    "<td hidden class='offCompoNo'>" + item.compo_no + "</td>" +
                    "<td hidden class='offPrice'>" + item.price + "</td>" +
                    "<td hidden class='offQuantitiy'>" + item.quantity + "</td>" +
                    "<td hidden class='offDefectiveRate'>" + item.defective_rate + "</td>" +
                    "<td hidden class='offQualityGrede'>" + item.quality_grade + "</td>" +
                    "<td hidden class='offProdPeriod'>" + item.prod_period + "</td>" +
                    "<td hidden class='offAttachFile'>" + item.attachfile + "</td>" +
                    "<td hidden class='offLogoPath'>" + item.logopath + "</td>" +
                    "</tr>";
                    
                $table.find("tbody").append(newRow);
            });
        }

        ///////////////////////////////////////////////////
        //// 임시 저장 클릭시 미리 보기 폼 채워지는 이벤트 ///
        //////////////////////////////////////////////////
         $(document).on('click', '.offEventA', function(e) {
        	console.log("here");
            e.preventDefault();
            
            isDraftData = true;
            
            // 클릭한 데이터 가져오기
            var supplierName = $(this).text();
            var proposalDate = $(this).closest("tr").find(".offDate").text();
            var componentName = $(this).closest("tr").find(".offCompoName").text();
            var ceoName = $(this).closest("tr").find(".offCeoName").text();
            var categories = $(this).closest("tr").find(".offCategories").text();
            var phone = $(this).closest("tr").find(".offPhone").text();
            var address = $(this).closest("tr").find(".offAddress").text();
            var compoNo = $(this).closest("tr").find(".offCompoNo").text();
            var price = $(this).closest("tr").find(".offPrice").text();
            var quantity = $(this).closest("tr").find(".offQuantitiy").text();
            var defectiveRate = $(this).closest("tr").find(".offDefectiveRate").text();
            var qualitygrade = $(this).closest("tr").find(".offQualityGrede").text();
            var prodPeriod = $(this).closest("tr").find(".offProdPeriod").text();
            var attachFile = $(this).closest("tr").find(".offAttachFile").text();
            var logoPath = $(this).closest("tr").find(".offLogoPath").text();
 
            $("#preComponentName").val(componentName);
            $("#componentName-addSuppliers").val(componentName);

            $("#preSupplierName").val(supplierName);
            $("#preCeoName").val(ceoName);
            $("#preCategory").val(categories);
            $("#prePHNumber").val(phone);
            $("#preAddress").val(address);
            $("#pre-avatar-thumb-img").attr('src', logoPath);
          
          
            // 단가 -> 세자리마다 쉼표 처리  
            let replaceValue = price.replace(/\B(?=(\d{3})+(?!\d))/g, ',');
            console.log("priceInput2: " +  price);
            
            $("#prePrice").val(replaceValue);
            $("#prePriceHide").val(price);
            $("#preQuantity").val(quantity);
            $("#preDefectiveRate").val(defectiveRate);
            $("#preQualityGrade").val(qualitygrade);
            $("#preProdPeriod").val(prodPeriod);
            $("#preAttachFile").val(attachFile);
            
            const submitSupplierBtn = document.getElementById('submitSupplierBtn');
            submitSupplierBtn.disabled = false;

            // offcanvas 닫기 
            $("#offcanvasWithBothOptions").offcanvas("hide");
        });


        /////////////////////////////
        //// 공급사 등록 AJAX 처리 ///
        ////////////////////////////
        $("#regiSupplierBtn").on('click', function() {
            var supplier = {
                suppl_name: $("#preSupplierName").val(),
                ceo_name: $("#preCeoName").val(),
                category: $("#preCategory").val(),
                phone: $("#prePHNumber").val(),
            };
            
            var proposal = {
            		
                supplier: {
                    suppl_name: $("#preSupplierName").val(),
                    ceo_name:  $("#preCeoName").val(),
                    category: $("#preCategory").val(),
                    phone: $("#prePHNumber").val(),
                },
                component: {
                    compo_no:$("#preCompoNoHide").val(),
                },
                price:  $("#prePriceHide").val(),
                quantity:  $("#preQuantity").val(),
                defective_rate:  $("#preDefectiveRate").val(),
                quality_grade:  $("#preQualityGrade").val(),
                prod_period:  $("#preProdPeriod").val(), 
            };
			
            
            
            $.ajax({
                url: "addSupplier/register", // 백엔드 URL
                type: "POST",
                data: JSON.stringify({ supplier: supplier, proposal: proposal, logo_uuid: logo_uuid, file_uuid: file_uuid }),
                processData: false,
                contentType: "application/json",
                success: function(response) {
                    // 성공 처리
                    $("#RegisterCheck").modal("hide");
        
                    var sucessRegi = "1";
                    window.location.href = "/addSupplier?param=" + sucessRegi;
                },
                error: function(jqXHR, textStatus, errorThrown) {
                    // 실패 처리
                    console.error("요청 실패:", textStatus, errorThrown);
                }
            });
            
        });
        
         
        
        
        ///////////////////////////////////////////////////
        //// 부품 입력마다 필터링된 버튼 & 부품 추가 출력 ////
        //////////////////////////////////////////////////
        function updateButtonsDisplay() {
            const filterValue = componentNameInput.value.toLowerCase();
            const buttons = document.querySelectorAll('#componentBtnDiv div');
            let anyButtonDisplayed = false;
            btnCount  = 0; 
            displayedBtn = [];
        
            buttons.forEach((button) => {
                const buttonCompoName = button.querySelector('h5').innerText.toLowerCase();
        
                if (buttonCompoName.includes(filterValue)) {
                    console.log("here!");
                    button.style.display = 'block';
                    
                    anyButtonDisplayed = true;
                    isSearchPage = true;
                    
                    btnCount++;
                    displayedBtn.push(button);
                } else {
                    button.style.display = 'none';
                    isSearchPage = false;
                }
            });
        
            // 해당하는 데이터가 없는 경우
            const addComponentDIv = document.getElementById('addComponentDIv');
            addComponentDIv.style.display = anyButtonDisplayed ? 'none' : 'block';
        
            const paginationButtons = document.getElementById('paginationButtons');
            paginationButtons.style.display= anyButtonDisplayed ? 'block' : 'none';
            
            // 페이지 번호 초기화하고 버튼 출력
            currentPageNumber = 1;
            showButtonsBySearch();
        }
        
        componentNameInput.addEventListener('input', updateButtonsDisplay);

        
        //////////////////////
        //// 토스트 메소드 ////
        /////////////////////
    
        function showToast(message) {
            var toast = new bootstrap.Toast(document.getElementById('checkRegiToast'));
            var toastBody = document.querySelector('#checkRegiToast .toast-body');
            toastBody.textContent = message;
            document.getElementById('checkRegiToast').style.top = '80px';
        }
    
        function hideToast() {
            var toast = new bootstrap.Toast(document.getElementById('checkRegiToast'));
            toast.hide();
        }
        
    }); /////////////////////////////////////////////////////////////////////////////////////////////
    
	// 페이지 당 버튼 개수
    const buttonsPerPage = 16;
    
    // 현재 페이지 번호
    let currentPageNumber = 1;
    let btnCount = 0; 
    
    // 페이지 버튼과 페이지 번호 요소 가져오기
    const paginationButtons = document.getElementById('paginationButtons');
    const currentPage = document.getElementById('currentPage');
    
    // 검색 필터링된 부품 리스트
    let displayedBtn = [];
    
    // 기본 페이지 or 검색 페이지 확인 플래그
    let isSearchPage = false; 
    
    
    
    
    ////////////////////////////////////////
    //// 부품버튼 클릭 이벤트 => 자동 입력 ///
    ///////////////////////////////////////
    function componentBtnClick(compoName, compoNo) {
        console.log(compoName);
        $("#componentName-addSupplier").val(compoName);
        $("#preCompoNoHide").val(compoNo);
        console.log(compoNo);
    };
    
    ////////////////////
    //// 기본 페이징 ////
    ////////////////////
    function showButtonsByPage() {
        const buttons = document.querySelectorAll('#componentBtnDiv div');
        const totalPages = Math.ceil(buttons.length / buttonsPerPage);
        console.log("totalPages : " + totalPages);
        
    
        currentPageNumber = Math.max(1, Math.min(currentPageNumber, totalPages));
    
        buttons.forEach((button, index) => {
            const startIdx = (currentPageNumber - 1) * buttonsPerPage;
            const endIdx = startIdx + buttonsPerPage;
            if (index >= startIdx && index < endIdx ) {
                console.log(index);
                button.style.display = 'block';
            } else {
                button.style.display = 'none';
            }
        });
    
        currentPage.textContent = currentPageNumber;
    }
    
    showButtonsByPage();

    
    ////////////////////
    //// 검색 페이징 ////
    ////////////////////
    function showButtonsBySearch() {
        const buttons = document.querySelectorAll('#componentBtnDiv div');
        const totalPages = Math.ceil(btnCount / buttonsPerPage);
        console.log("totalPages : " + totalPages);
    
        currentPageNumber = Math.max(1, Math.min(currentPageNumber, totalPages));
    
        displayedBtn.forEach((button, index) => {
            const startIdx = (currentPageNumber - 1) * buttonsPerPage;
            const endIdx = startIdx + buttonsPerPage;
            console.log("index : " + index);
       
            if (index >= startIdx && index < endIdx ) {
                button.style.display = 'block';
            } else {
                button.style.display = 'none';
            }
        });
    
        currentPage.textContent = currentPageNumber;
    }
    
    ///////////////////////////////
    //// 페이지 버튼 클릭 이벤트 ////
    ///////////////////////////////
    function changePage(pageDiff) {
        currentPageNumber += pageDiff;
        if (isSearchPage) {
            showButtonsBySearch();
        } else {
            showButtonsByPage();
        }
    }
    
    
    /////////////////////////////
    // 공급사 select 리스트 선택 //
    ////////////////////////////
    var suppliers = [
		    <c:forEach var="supplier" items="${supplierList}" varStatus="loop">
		        {
		            suppl_name: '${supplier.supplier.suppl_name}',
		            ceo_name: '${supplier.supplier.ceo_name}',
		            category: '${supplier.supplier.category}',
		            phone: '${supplier.supplier.phone}',
		            address: '${supplier.address}'
		        }
		        <c:if test="${!loop.last}">,</c:if>
		    </c:forEach>
		];
	 console.log(suppliers);
    
	 function searchSupplier() {
		    var input = document.getElementById("suplierName-addSupplier");
		    var select = document.getElementById("supplierSelect");

		    var inputValue = input.value.trim();

		    if (inputValue.length === 0) {
		        select.style.display = "none";
		        return;
		    }

		    showSearchResults(inputValue);
		}

		function showSearchResults(inputValue) {
		    var select = document.getElementById("supplierSelect");
		    select.innerHTML = ""; 

		    for (var i = 0; i < suppliers.length; i++) {
		        var supplierName = suppliers[i].suppl_name;
		        if (supplierName.includes(inputValue)) {
		            var option = document.createElement("option");
		            option.value = supplierName;
		            option.textContent = supplierName;
		            select.appendChild(option);
		        }
		    }

		    // 선택된 값이 변경될 때마다 정보 업데이트
		    $("#supplierSelect").on("change", function () {
		        var selectedOption = $(this).val();
		        for (var i = 0; i < suppliers.length; i++) {
		            if (suppliers[i].suppl_name === selectedOption) {
		            	$("#suplierName-addSupplier").val(suppliers[i].suppl_name);
		            	$("#ceoName-addSupplier").val(suppliers[i].ceo_name);
		                $("#category-addSupplier").val(suppliers[i].category);
		                $("#phNumber-addSupplier").val(suppliers[i].phone);
		                $("#address-addSupplier").val(suppliers[i].address);
		                break;
		            }
		        }
		        select.style.display = "none";
		    });

		    select.style.display = "block";
		}
    

		
/* 		// Dropzone에서 파일이 추가되었을 때의 이벤트 처리
	    logoDropzone.on("addedfile", function(file) {
	        console.log("Logo file added:", file);
	    });

	    proposalDropzone.on("addedfile", function(file) {
	        console.log("Proposal file added:", file);
	    });

	    // Dropzone에서 파일이 업로드되었을 때의 이벤트 처리
	    logoDropzone.on("success", function(file, response) {
	        console.log("Logo file uploaded:", response);
	    });

	    proposalDropzone.on("success", function(file, response) {
	        console.log("Proposal file uploaded:", response);
	    });	 */
</script>

<%@include file="includes/footer.jsp"%>