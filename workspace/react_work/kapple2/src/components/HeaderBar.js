const Headerbar = () => {
    return (
        <nav className='navbar navbar-top fixed-top navbar-expand' id='navbarDefault'>
            <div className='collapse navbar-collapse justify-content-between'>
                <div className='navbar-logo'>
                
                    <a className='navbar-brand me-1 me-sm-3' href='/'>
                        <div className='d-flex align-items-center'>
                            <div className='d-flex align-items-center'>
                                <img src='resources/assets/img/icons/logo.png' alt='phoenix' width='50' />
                                <p className='logo-text ms-2 d-none d-sm-block'>Kapple SCM</p>
                            </div>
                        </div>
                    </a>
                </div>

                <div className='search-box navbar-top-search-box d-none d-lg-block' data-list='{"valueNames":["title"]}' style={{ width: "25rem" }}>
                    <form className='position-relative' data-bs-toggle='search' data-bs-display='static'>
                        <input className='form-control search-input fuzzy-search rounded-pill form-control-sm' type='search' placeholder='Search...' aria-label='Search' />
                        <span className='fas fa-search search-box-icon'></span>
                    </form>
                </div>

                <ul className='navbar-nav navbar-nav-icons flex-row'>
                    <li className='nav-item dropdown'>
                        <a className='nav-link' href='#!' style={{ minWidth: "2.5rem" }} role='button' data-bs-toggle='dropdown' aria-haspopup='true' aria-expanded='false' data-bs-auto-close='outside'>
                            <i className="fa-regular fa-bell" style={{ height: "20px", width: "20px" }}></i>
                        </a>

                        <div className='dropdown-menu dropdown-menu-end notification-dropdown-menu py-0 shadow border border-300 navbar-dropdown-caret' id='navbarDropdownNotfication' aria-labelledby='navbarDropdownNotfication'>
                            <div className='card position-relative border-0'>
                                <div className='card-header p-2'>
                                    <div className='d-flex justify-content-between'>
                                        <h5 className='text-black mb-0'>알림</h5>
                                        <button className='btn btn-link p-0 fs--1 fw-normal' type='button'>
                                            모두 읽음 처리
                                        </button>
                                    </div>
                                </div>
                                <div className='card-body p-0'>
                                    <div className='scrollbar-overlay' style={{ height: "27rem" }}>
                                        <div className='border-300'>
                                            <div className='px-2 px-sm-3 py-3 border-300 notification-card position-relative read border-bottom'>
                                                <div className='d-flex align-items-center justify-content-between position-relative'>
                                                    <div className='d-flex'>
                                                        <div className='avatar avatar-m status-online me-3'>
                                                            <img className='rounded-circle' src='resources/assets/img/team/40x40/30.webp' alt='' />
                                                        </div>
                                                        <div className='flex-1 me-sm-3'>
                                                            <h4 className='fs--1 text-black'>Jessie Samson</h4>
                                                            <p className='fs--1 text-1000 mb-2 mb-sm-3 fw-normal'>
                                                                <span className='me-1 fs--2'>💬</span>Mentioned you in a comment.<span className='ms-2 text-400 fw-bold fs--2'>10m</span>
                                                            </p>
                                                            <p className='text-800 fs--1 mb-0'>
                                                                <span className='me-1 fas fa-clock'></span>
                                                                <span className='fw-bold'>10:41 AM </span>August 7,2021
                                                            </p>
                                                        </div>
                                                    </div>
                                                    <div className='font-sans-serif d-none d-sm-block'>
                                                        <button className='btn fs--2 btn-sm dropdown-toggle dropdown-caret-none transition-none notification-dropdown-toggle' type='button' data-bs-toggle='dropdown' data-boundary='window' aria-haspopup='true' aria-expanded='false' data-bs-reference='parent'>
                                                            <span className='fas fa-ellipsis-h fs--2 text-900'></span>
                                                        </button>
                                                        <div className='dropdown-menu dropdown-menu-end py-2'>
                                                            <a className='dropdown-item' href='#!'>
                                                                Mark as unread
                                                            </a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div className='px-2 px-sm-3 py-3 border-300 notification-card position-relative unread border-bottom'>
                                                <div className='d-flex align-items-center justify-content-between position-relative'>
                                                    <div className='d-flex'>
                                                        <div className='avatar avatar-m status-online me-3'>
                                                            <div className='avatar-name rounded-circle'>
                                                                <span>J</span>
                                                            </div>
                                                        </div>
                                                        <div className='flex-1 me-sm-3'>
                                                            <h4 className='fs--1 text-black'>Jane Foster</h4>
                                                            <p className='fs--1 text-1000 mb-2 mb-sm-3 fw-normal'>
                                                                <span className='me-1 fs--2'>📅</span>Created an event.<span className='ms-2 text-400 fw-bold fs--2'>20m</span>
                                                            </p>
                                                            <p className='text-800 fs--1 mb-0'>
                                                                <span className='me-1 fas fa-clock'></span>
                                                                <span className='fw-bold'>10:20 AM </span>August 7,2021
                                                            </p>
                                                        </div>
                                                    </div>
                                                    <div className='font-sans-serif d-none d-sm-block'>
                                                        <button className='btn fs--2 btn-sm dropdown-toggle dropdown-caret-none transition-none notification-dropdown-toggle' type='button' data-bs-toggle='dropdown' data-boundary='window' aria-haspopup='true' aria-expanded='false' data-bs-reference='parent'>
                                                            <span className='fas fa-ellipsis-h fs--2 text-900'></span>
                                                        </button>
                                                        <div className='dropdown-menu dropdown-menu-end py-2'>
                                                            <a className='dropdown-item' href='#!'>
                                                                Mark as unread
                                                            </a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div className='card-footer p-0 border-top border-0'>
                                    <div className='my-2 text-center fw-bold fs--5 text-600'>
                                        <a className='fw-bolder' href='pages/notifications.html'>
                                            전체 알림 보기
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    
                    <li className='nav-item dropdown'>
                        <a className='nav-link lh-1 pe-0' id='navbarDropdownUser' href='#!' role='button' data-bs-toggle='dropdown' data-bs-auto-close='outside' aria-haspopup='true' aria-expanded='false'>
                            <div className='avatar avatar-l '>
                                <img className='rounded-circle ' src='resources/assets/img/team/40x40/9.webp' alt='' />
                            </div>
                        </a>
                        <div className='dropdown-menu dropdown-menu-end navbar-dropdown-caret py-0 dropdown-profile shadow border border-300' aria-labelledby='navbarDropdownUser'>
                            <div className='card position-relative border-0'>
                                <div className='card-body p-0'>
                                    <div className='text-center pt-4 pb-3'>
                                        <div className='avatar avatar-xl '>
                                            <img className='rounded-circle ' src='resources/assets/img/team/72x72/9.webp' alt='' />
                                        </div>
                                        <h6 className='mt-3 text-black'>
                                            <p>username</p>
                                        </h6>
                                    </div>
                                </div>
                                <div className='overflow-auto scrollbar' style={{ height: "10rem" }}>
                                    <ul className='nav d-flex flex-column mb-2 pb-1'>
                                        <li className='nav-item'>
                                            <a className='nav-link px-3' href='/home'>
                                                {" "}
                                                <span className='me-2 text-900' data-feather='user'></span>
                                                <span>Profile</span>
                                            </a>
                                        </li>
                                        <li className='nav-item'>
                                            <a className='nav-link px-3' href='#!'>
                                                <span className='me-2 text-900' data-feather='pie-chart'></span>Dashboard
                                            </a>
                                        </li>
                                        <li className='nav-item'>
                                            <a className='nav-link px-3' href='#!'>
                                                {" "}
                                                <span className='me-2 text-900' data-feather='settings'></span>Settings &amp; Privacy{" "}
                                            </a>
                                        </li>
                                        <li className='nav-item'>
                                            <a className='nav-link px-3' href='#!'>
                                                {" "}
                                                <span className='me-2 text-900' data-feather='help-circle'></span>Help Center
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                                <div className='card-footer'>
                                    <div className='my-2'>
                                        {" "}
                                        <a className='btn btn-phoenix-secondary d-flex flex-center w-100' href='/customLogout'>
                                            {" "}
                                            <span className='me-2' data-feather='log-out'>
                                                {" "}
                                            </span>
                                            logout
                                        </a>
                                    </div>
                                    <div className='my-2 text-center fw-bold fs--2 text-600'>
                                        <a className='text-600 me-1' href='#!'>
                                            Privacy policy
                                        </a>
                                        &bull;
                                        <a className='text-600 mx-1' href='#!'>
                                            Terms
                                        </a>
                                        &bull;
                                        <a className='text-600 ms-1' href='#!'>
                                            Cookies
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
    );
};

export default Headerbar;
