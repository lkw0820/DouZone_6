<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@include file="includes/header.jsp"%>

      <div class="container-fluid bg-300 dark__bg-1200">
        <div class="bg-holder bg-auth-card-overlay" style="background-image:url(resources/assets/img/bg/35png);">
        </div>
        <!--/.bg-holder-->

        <div class="row flex-center position-relative min-vh-100 g-0 py-5">
          <div class="col-11 col-sm-10 col-xl-8">
            <div class="card border border-200 auth-card">
              <div class="card-body pe-md-0">
                <div class="row align-items-center gx-0 gy-7">
                  
                  <div class="col mx-auto">
                    <div class="auth-form-box">
                      <div class="text-center mb-4"><a class="d-flex flex-center text-decoration-none mb-4" href="l">
                          <div class="d-flex align-items-center fw-bolder fs-5 d-inline-block"><img src="resources/assets/img/icons/logo.png" alt="phoenix" width="58" />
                          </div>
                        </a>
                        <h3 class="text-1000">Sign In</h3>
                        <p class="text-700">Get access to your account</p>
                      </div>
                      <form method="post" action="/login" id="loginForm">
                      <div class="mb-3 text-start">
                        <label class="form-label" for="id">ID</label>
                        <div class="form-icon-container">
                          <input class="form-control form-icon-input" id="id" type="text" placeholder="User ID" name="username"/><span class="fas fa-user text-900 fs--1 form-icon"></span>
                        </div>
                      </div>
                      <div class="mb-3 text-start">
                        <label class="form-label" for="password">PASSWORD</label>
                        <div class="form-icon-container">
                          <input class="form-control form-icon-input" id="password" type="password" placeholder="Password" name="password"/><span class="fas fa-key text-900 fs--1 form-icon"></span>
                        	<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }"/>
                        </div>
                      </div>
                      </form>
                      <div class="row flex-between-center mb-7">
                        <div class="col-auto">
                          <div class="form-check mb-0">
                            <input class="form-check-input" id="basic-checkbox" type="checkbox" checked="checked" />
                            <label class="form-check-label mb-0" for="basic-checkbox">Save ID</label>
                          </div>
                        </div>
                        <div class="col-auto"><a class="fs--1 fw-semi-bold" href="">lost ID/PW</a></div>
                      </div>
                      <button class="btn btn-primary w-100 mb-3" form="loginForm">LOGIN</button>
                      <div class="text-center"><a class="fs--1 fw-bold" href="">SIGN UP</a></div>

                      <div class="position-relative mb-6">
                        <hr class="bg-200 mt-5 mb-4" />
                        <div class="divider-content-center bg-white">or use google email</div>
                      </div>
                      <button class="btn btn-phoenix-secondary w-100 mb-3"><span class="fab fa-google text-danger me-2 fs--1"></span>google login</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>


<%@include file="includes/footer.jsp"%>