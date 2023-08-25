const Home = () => {
    return (
        <div className="content">
			<div class="card mb-3">
				<div class="card-body">
					<div class="row align-items-center g-3 text-center text-xxl-start">
						<div class="col-12 col-xxl-auto">
							<div class="avatar avatar-5xl">
								<img class="rounded-circle" src="resources/assets/img/team/12.webp" alt="" />
							</div>
						</div>
						<div class="col-12 col-sm-auto flex-1">
							<h3 class="fw-bolder mb-2">Samsung</h3>
							<p class="mb-0">Mobile SPU Chips</p>
							<a class="fw-bold" href="#!">
								test
							</a>
						</div>
					</div>
				</div>
			</div>
			<div className="row">
				<div className="col-4">
					<div class="card mb-3">
						<div class="card-body">
							<div class="d-flex align-items-center mb-5">
								<h3>About Retailer</h3>
								<button class="btn btn-link px-3" type="button">
									Edit
								</button>
							</div>

							<div class="mb-4">
								<div class="d-flex align-items-center mb-1">
									<span class="me-2 uil uil-phone"> </span>
									<h5 class="text-1000 mb-0">Phone</h5>
								</div>
								<a href="tel:+1234567890">+1234567890 </a>
							</div>
							<div class="mb-4">
								<div class="d-flex align-items-center mb-1">
									<span class="me-2 uil uil-globe"></span>
									<h5 class="text-1000 mb-0">Website</h5>
								</div>
								<a href="#!">www.bb.ru.com </a>
							</div>
							<div class="mb-4">
								<div class="d-flex align-items-center mb-1">
									<span class="me-2 uil uil-building"></span>
									<h5 class="text-1000 mb-0">Industry</h5>
								</div>
								<p class="mb-0 text-800">Large Enterprise</p>
							</div>
							<div class="mb-4">
								<div class="d-flex align-items-center mb-1">
									<span class="me-2 uil uil-postcard"></span>
									<h5 class="text-1000 mb-0">Number of employees</h5>
								</div>
								<p class="mb-0 text-800">126</p>
							</div>
							<div class="mb-4">
								<div class="d-flex align-items-center mb-1">
									<span class="me-2 uil uil-dollar-alt"></span>
									<h5 class="text-1000 mb-0">Annual Revenue</h5>
								</div>
								<p class="mb-0 text-800">$12000 </p>
							</div>
							<div class="mb-4">
								<div class="d-flex align-items-center mb-1">
									<span class="me-2 uil uil-clock"></span>
									<h5 class="text-1000 mb-0">Last contacted</h5>
								</div>
								<p class="mb-0 text-800">12 November 2021, 10:54 AM</p>
							</div>
							<div class="mb-4">
								<div class="d-flex align-items-center mb-1">
									<span class="me-2 uil uil-file-check-alt"></span>
									<h5 class="text-1000 mb-0">Lead source</h5>
								</div>
								<p class="mb-0 text-800">Advertisement</p>
							</div>
							<div>
								<div class="d-flex align-items-center mb-1">
									<span class="me-2 uil uil-check-circle"></span>
									<h5 class="text-1000 mb-0">Lead status</h5>
								</div>
								<span class="badge badge-phoenix badge-phoenix-primary">New Lead</span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
    )
}

export default Home;