<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp"%>
      
      <div class="content">
        <form class="mb-5">
          <div class="row g-3 flex-between-end mb-2">
            <div class="col-auto">
              <h2 class="mb-2">부품별 공급사 등록</h2>
              <h5 class="text-700 fw-semi-bold">Registering as a supplier for each items</h5>
            </div>
          </div>
        </form>
        
        <div class="mx-lg-n4 mt-3">
          <div class="row g-3">
            <div class="col-12 col-xl-8 col-xxl-8 min-vh-75">
              <div class="card theme-wizard mb-5 min-vh-75" data-theme-wizard="data-theme-wizard">

                <div class="card-header bg-100 pt-3 pb-2 border-bottom-0">
                  <ul class="nav justify-content-between nav-wizard" role="tablist">
                    <li class="nav-item" role="presentation"><a class="nav-link active fw-semi-bold" href="#bootstrap-wizard-validation-tab1" data-bs-toggle="tab" data-wizard-step="1" aria-selected="true" role="tab">
                        <div class="text-center d-inline-block"><span class="nav-item-circle-parent"><span class="nav-item-circle"><svg class="svg-inline--fa fa-search" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="search" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" data-fa-i2svg=""><path fill="currentColor" d="M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z"></path></svg><!-- <span class="fas fa-lock"></span> Font Awesome fontawesome.com --></span></span><span class="d-none d-md-block mt-1 fs--1">부품검색</span></div>
                      </a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link fw-semi-bold" href="#bootstrap-wizard-validation-tab2" data-bs-toggle="tab" data-wizard-step="2" aria-selected="false" tabindex="-1" role="tab">
                        <div class="text-center d-inline-block"><span class="nav-item-circle-parent"><span class="nav-item-circle"><svg class="svg-inline--fa fa-building" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="building" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" data-fa-i2svg=""><path fill="currentColor" d="M436 480h-20V24c0-13.255-10.745-24-24-24H56C42.745 0 32 10.745 32 24v456H12c-6.627 0-12 5.373-12 12v20h448v-20c0-6.627-5.373-12-12-12zM128 76c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v40c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12V76zm0 96c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v40c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12v-40zm52 148h-40c-6.627 0-12-5.373-12-12v-40c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v40c0 6.627-5.373 12-12 12zm76 160h-64v-84c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v84zm64-172c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12v-40c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v40zm0-96c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12v-40c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v40zm0-96c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12V76c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v40z"></path></svg><!-- <span class="fas fa-user"></span> Font Awesome fontawesome.com --></span></span><span class="d-none d-md-block mt-1 fs--1">공급사등록</span></div>
                      </a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link fw-semi-bold" href="#bootstrap-wizard-validation-tab3" data-bs-toggle="tab" data-wizard-step="3" aria-selected="false" tabindex="-1" role="tab">
                        <div class="text-center d-inline-block"><span class="nav-item-circle-parent"><span class="nav-item-circle"><svg class="svg-inline--fa fa-cog" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="cog" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 460 512" data-fa-i2svg=""><path fill="currentColor" d="M487.4 315.7l-42.6-24.6c4.3-23.2 4.3-47 0-70.2l42.6-24.6c4.9-2.8 7.1-8.6 5.5-14-11.1-35.6-30-67.8-54.7-94.6-3.8-4.1-10-5.1-14.8-2.3L380.8 110c-17.9-15.4-38.5-27.3-60.8-35.1V25.8c0-5.6-3.9-10.5-9.4-11.7-36.7-8.2-74.3-7.8-109.2 0-5.5 1.2-9.4 6.1-9.4 11.7V75c-22.2 7.9-42.8 19.8-60.8 35.1L88.7 85.5c-4.9-2.8-11-1.9-14.8 2.3-24.7 26.7-43.6 58.9-54.7 94.6-1.7 5.4.6 11.2 5.5 14L67.3 221c-4.3 23.2-4.3 47 0 70.2l-42.6 24.6c-4.9 2.8-7.1 8.6-5.5 14 11.1 35.6 30 67.8 54.7 94.6 3.8 4.1 10 5.1 14.8 2.3l42.6-24.6c17.9 15.4 38.5 27.3 60.8 35.1v49.2c0 5.6 3.9 10.5 9.4 11.7 36.7 8.2 74.3 7.8 109.2 0 5.5-1.2 9.4-6.1 9.4-11.7v-49.2c22.2-7.9 42.8-19.8 60.8-35.1l42.6 24.6c4.9 2.8 11 1.9 14.8-2.3 24.7-26.7 43.6-58.9 54.7-94.6 1.5-5.5-.7-11.3-5.6-14.1zM256 336c-44.1 0-80-35.9-80-80s35.9-80 80-80 80 35.9 80 80-35.9 80-80 80z"></path></svg><!-- <span class="fas fa-file-alt"></span> Font Awesome fontawesome.com --></span></span><span class="d-none d-md-block mt-1 fs--1">부품상세</span></div>
                      </a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link fw-semi-bold" href="#bootstrap-wizard-validation-tab4" data-bs-toggle="tab" data-wizard-step="4" aria-selected="false" tabindex="-1" role="tab">
                        <div class="text-center d-inline-block"><span class="nav-item-circle-parent"><span class="nav-item-circle"><svg class="svg-inline--fa fa-check" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="check" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 400 512" data-fa-i2svg=""><path fill="currentColor" d="M438.6 105.4C451.1 117.9 451.1 138.1 438.6 150.6L182.6 406.6C170.1 419.1 149.9 419.1 137.4 406.6L9.372 278.6C-3.124 266.1-3.124 245.9 9.372 233.4C21.87 220.9 42.13 220.9 54.63 233.4L159.1 338.7L393.4 105.4C405.9 92.88 426.1 92.88 438.6 105.4H438.6z"></path></svg><!-- <span class="fas fa-check"></span> Font Awesome fontawesome.com --></span></span><span class="d-none d-md-block mt-1 fs--1">완료</span></div>
                      </a></li>
                  </ul>
                </div>
      
                <div class="card-body pt-4 pb-0">
                  <div class="tab-content">
                    <div class="tab-pane active" role="tabpanel" aria-labelledby="bootstrap-wizard-validation-tab1" id="bootstrap-wizard-validation-tab1">
                      <form class="needs-validation" id="wizardValidationForm1" novalidate="novalidate" data-wizard-form="1">
                        <h5 class="mb-2" for="bootstrap-wizard-validation-wizard-name">부품</h5>
                        <div class="mb-2">
                          <input class="form-control" type="text" name="name" placeholder="부품명" required="required" id="bootstrap-wizard-validation-wizard-name">
                          <div class="invalid-feedback">부품명을 정확히 입력하세요.</div>
                        </div>
                      </form>
                    </div>
      
                    <div class="tab-pane" role="tabpanel" aria-labelledby="bootstrap-wizard-validation-tab2" id="bootstrap-wizard-validation-tab2">
                      <form class="needs-validation" id="wizardValidationForm2" novalidate="novalidate" data-wizard-form="2">
                        <div class="row g-4 mb-4 dz-clickable" data-dropzone="data-dropzone" data-options='{"maxFiles": 1, "data": [{"name": "avatar.webp", "size": "54kb", "url": "resources/assets/img/team/avatar.webp"}]}'>

                          <div class="col-md-auto">
                            <div class="dz-preview dz-preview-single">
                              <div class="dz-preview-cover d-flex align-items-center justify-content-center mb-2 mb-md-0 dz-image-preview">
                                <div class="avatar avatar-4xl">
                                  <img class="rounded-circle avatar-placeholder" src="resources/assets/img/team/avatar.webp" alt="avatar.webp" data-dz-thumbnail="data-dz-thumbnail">
                                </div>
                                <div class="dz-progress">
                                  <span class="dz-upload" data-dz-uploadprogress=""></span>
                                </div>                                  
                              </div>
                            </div>
                          </div>

                          <div class="col-md">
                            <div class="dz-message dropzone-area px-2 py-3" data-dz-message="data-dz-message">
                              <div class="text-center text-1100">
                                <h5 class="mb-2"><svg class="svg-inline--fa fa-upload me-2" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="upload" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M105.4 182.6c12.5 12.49 32.76 12.5 45.25 .001L224 109.3V352c0 17.67 14.33 32 32 32c17.67 0 32-14.33 32-32V109.3l73.38 73.38c12.49 12.49 32.75 12.49 45.25-.001c12.49-12.49 12.49-32.75 0-45.25l-128-128C272.4 3.125 264.2 0 256 0S239.6 3.125 233.4 9.375L105.4 137.4C92.88 149.9 92.88 170.1 105.4 182.6zM480 352h-160c0 35.35-28.65 64-64 64s-64-28.65-64-64H32c-17.67 0-32 14.33-32 32v96c0 17.67 14.33 32 32 32h448c17.67 0 32-14.33 32-32v-96C512 366.3 497.7 352 480 352zM432 456c-13.2 0-24-10.8-24-24c0-13.2 10.8-24 24-24s24 10.8 24 24C456 445.2 445.2 456 432 456z"></path></svg><!-- <span class="fa-solid fa-upload me-2"></span> Font Awesome fontawesome.com -->회사 로고 및 사진 업로드</h5>
                                <p class="mb-0 fs--1 text-600 lh-sm">Upload a 300x300 jpg image with <br>a maximum size of 400KB</p>
                              </div>
                            </div>
                          </div>
                        </div>
                        <div class="mb-2">
                          <label class="form-label" for="bootstrap-wizard-validation-wizard-phone">공급사명</label>
                          <input class="form-control" type="text" name="suppliername" placeholder="Supplier Name" id="bootstrap-wizard-validation-wizard-phone" required="required">
                          <div class="invalid-feedback">This field is required.</div>
                        </div>
                        <div class="mb-2">
                          <label class="form-label" for="bootstrap-wizard-validation-wizard-phone">대표자명</label>
                          <input class="form-control" type="text" name="ceoname" placeholder="CEO Name" id="bootstrap-wizard-validation-wizard-phone" required="required">
                          <div class="invalid-feedback">This field is required.</div>
                        </div>
                        <div class="mb-2">
                          <label class="form-label" for="bootstrap-wizard-validation-wizard-phone">사업자번호</label>
                          <input class="form-control" type="text" name="suppliername" placeholder="Business Registration Number" id="bootstrap-wizard-validation-wizard-phone" required="required">
                          <div class="invalid-feedback">This field is required.</div>
                        </div>
                        <div class="mb-2">
                          <label class="form-label" for="bootstrap-wizard-validation-wizard-phone">대표번호</label>
                          <input class="form-control" type="text" name="phone" placeholder="Phone Number" id="bootstrap-wizard-validation-wizard-phone" required="required">
                          <div class="invalid-feedback">This field is required.</div>
                        </div>
                        <div class="mb-2">
                          <label class="form-label" for="bootstrap-wizard-validation-wizard-address">주소</label>
                          <textarea class="form-control" rows="4" id="bootstrap-wizard-validation-wizard-address" required="required"></textarea>
                          <div class="invalid-feedback">This field is required.</div>
                        </div>
                      </form>
                    </div>
      
                    <div class="tab-pane" role="tabpanel" aria-labelledby="bootstrap-wizard-validation-tab3" id="bootstrap-wizard-validation-tab3">
                      <form class="mb-2 needs-validation" id="wizardValidationForm3" novalidate="novalidate" data-wizard-form="3">
                        <div class="row gx-3 gy-2">
                          <div class="col-6">
                            <label class="form-label" for="bootstrap-wizard-validation-card-number">단가</label>
                            <input class="form-control" placeholder="XXXX XXXX XXXX XXXX" type="text" required="required" id="bootstrap-wizard-validation-card-number">
                            <div class="invalid-feedback">This field is required.</div>
                          </div>
                          <div class="col-6">
                            <label class="form-label" for="bootstrap-wizard-validation-card-name">단위</label>
                            <input class="form-control" placeholder="John Doe" name="cardName" type="text" id="bootstrap-wizard-validation-card-name" required="required">
                            <div class="invalid-feedback">This field is required.</div>
                          </div>
                          <div class="col-6">
                            <label class="form-label" for="bootstrap-wizard-validation-card-holder-country">불량률</label>
                            <div class="invalid-feedback">This field is required.</div>
                          </div>
                          <div class="col-6">
                            <label class="form-label" for="bootstrap-wizard-validation-card-holder-zip-code">품질등급</label>
                            <input class="form-control" placeholder="1234" name="zipCode" type="text" id="bootstrap-wizard-validation-card-holder-zip-code" required="required">
                            <div class="invalid-feedback">This field is required.</div>
                          </div>
                          <div class="col-6">
                            <label class="form-label" for="bootstrap-wizard-validation-card-exp-date">생산기간</label>
                            <input class="form-control" placeholder="15/2024" name="expDate" type="text" id="bootstrap-wizard-validation-card-exp-date" required="required">
                            <div class="invalid-feedback">This field is required.</div>
                          </div>
                          <div class="col-6">
                            <label class="form-label" for="bootstrap-wizard-validation-card-cvv">부품명</label>
                            <input class="form-control" placeholder="123" name="cvv" maxlength="3" pattern="[0-9]{3}" type="number" id="bootstrap-wizard-validation-card-cvv" required="required">
                            <div class="invalid-feedback">This field is required.</div>
                          </div>
                        </div>
                      </form>
                    </div>
      
                    <div class="tab-pane" role="tabpanel" aria-labelledby="bootstrap-wizard-validation-tab4" id="bootstrap-wizard-validation-tab4">
                      <div class="row flex-center pb-8 pt-4 gx-3 gy-4">
                        <div class="col-12 col-sm-auto">
                          <div class="text-center text-sm-start"><img class="d-dark-none" src="../../assets/img/spot-illustrations/38.webp" alt="" width="220"><img class="d-light-none" src="../../assets/img/spot-illustrations/dark_38.webp" alt="" width="220"></div>
                        </div>
                        <div class="col-12 col-sm-auto">
                          <div class="text-center text-sm-start">
                            <h3 class="mb-3">등록 완료</h3>
                            <p class="text-1100 fs--1">Now you can access your account<br>anytime anywhere</p><a class="btn btn-primary px-6" href="../../modules/forms/wizard.html">Start Over</a>
                          </div>
                        </div>
                      </div>
                    </div>
      
                  </div>
      
                </div>
                <div class="card-footer border-top-0" data-wizard-footer="data-wizard-footer">
                  <div class="d-flex pager wizard list-inline mb-0">
                    <button class="d-none btn btn-link ps-0" type="button" data-wizard-prev-btn="data-wizard-prev-btn"><svg class="svg-inline--fa fa-chevron-left me-1" data-fa-transform="shrink-3" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="chevron-left" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512" data-fa-i2svg="" style="transform-origin: 0.3125em 0.5em;"><g transform="translate(160 256)"><g transform="translate(0, 0)  scale(0.8125, 0.8125)  rotate(0 0 0)"><path fill="currentColor" d="M224 480c-8.188 0-16.38-3.125-22.62-9.375l-192-192c-12.5-12.5-12.5-32.75 0-45.25l192-192c12.5-12.5 32.75-12.5 45.25 0s12.5 32.75 0 45.25L77.25 256l169.4 169.4c12.5 12.5 12.5 32.75 0 45.25C240.4 476.9 232.2 480 224 480z" transform="translate(-160 -256)"></path></g></g></svg><!-- <span class="fas fa-chevron-left me-1" data-fa-transform="shrink-3"></span> Font Awesome fontawesome.com -->Previous</button>
                    <div class="flex-1 text-end">
                      <button class="btn btn-primary px-6 px-sm-6" type="submit" data-wizard-next-btn="data-wizard-next-btn">Next<svg class="svg-inline--fa fa-chevron-right ms-1" data-fa-transform="shrink-3" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="chevron-right" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512" data-fa-i2svg="" style="transform-origin: 0.3125em 0.5em;"><g transform="translate(160 256)"><g transform="translate(0, 0)  scale(0.8125, 0.8125)  rotate(0 0 0)"><path fill="currentColor" d="M96 480c-8.188 0-16.38-3.125-22.62-9.375c-12.5-12.5-12.5-32.75 0-45.25L242.8 256L73.38 86.63c-12.5-12.5-12.5-32.75 0-45.25s32.75-12.5 45.25 0l192 192c12.5 12.5 12.5 32.75 0 45.25l-192 192C112.4 476.9 104.2 480 96 480z" transform="translate(-160 -256)"></path></g></g></svg><!-- <span class="fas fa-chevron-right ms-1" data-fa-transform="shrink-3"> </span> Font Awesome fontawesome.com --></button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            
            <div class="col-12 col-xl-4 col-xxl-4 min-vh-75">
              <div class="card">
                <div class="card-header">
                  <div class="row justify-content-between align-items-center mb-4">

                    <div class="col-auto">
                      <h3 class="text-1100">미리보기</h3>
                    </div>

                  </div>
                </div>
                <div class="card-body">

                </div>
              </div>
            </div>
          </div>
        </div>


      
      
      </div>

    <%@include file="includes/footer.jsp"%>