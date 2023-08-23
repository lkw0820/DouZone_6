import React, { useEffect, useRef, useState } from "react";
import { Link } from "react-router-dom/cjs/react-router-dom";

const SideBar = () => {

    const [isNavbarCollapsed, setIsNavbarCollapsed] = useState(false);

    useEffect(() => {

        const { getItemFromStore, setItemToStore, resize } = window.phoenix.utils;

        const Selector = {
            NAVBAR_VERTICAL_TOGGLE: '.navbar-vertical-toggle',
            NAVBAR_VERTICAL_COLLAPSE: '.navbar-vertical .navbar-collapse',
            ACTIVE_NAV_LINK: '.navbar-vertical .nav-link.active',
            BODY: 'body'
        };

        const Events = {
            CLICK: 'click',
            NAVBAR_VERTICAL_TOGGLE: 'navbar.vertical.toggle'
        };

        const ClassNames = {
            NAVBAR_VERTICAL_COLLAPSED: 'navbar-vertical-collapsed'
        };

        const navbarVerticalToggle = document.querySelector(Selector.NAVBAR_VERTICAL_TOGGLE);
        const navbarVerticalCollapse = document.querySelector(Selector.NAVBAR_VERTICAL_COLLAPSE);
        const activeNavLinkItem = document.querySelector(Selector.ACTIVE_NAV_LINK);

        const isNavbarVerticalCollapsed = getItemFromStore('phoenixIsNavbarVerticalCollapsed', false);

        const handleNavbarVerticalToggle = (e) => {
            navbarVerticalToggle.blur();
            document.documentElement.classList.toggle(ClassNames.NAVBAR_VERTICAL_COLLAPSED);

            setItemToStore('phoenixIsNavbarVerticalCollapsed', !isNavbarVerticalCollapsed);
            setIsNavbarCollapsed((prevIsCollapsed) => !prevIsCollapsed);

            const event = new CustomEvent(Events.NAVBAR_VERTICAL_TOGGLE);
            e.currentTarget?.dispatchEvent(event);
        };
        
        if (navbarVerticalToggle) {
            navbarVerticalToggle.addEventListener(Events.CLICK, handleNavbarVerticalToggle);
        }

        if (navbarVerticalCollapse && activeNavLinkItem && !isNavbarVerticalCollapsed) {
            activeNavLinkItem.scrollIntoView({ behavior: 'smooth' });
        }

        const setDocumentMinHeight = () => {
            const bodyHeight = document.querySelector(Selector.BODY).offsetHeight;
            const navbarVerticalHeight = document.querySelector(Selector.NAVBAR_VERTICAL)?.offsetHeight;

            if (document.documentElement.classList.contains(ClassNames.NAVBAR_VERTICAL_COLLAPSED) && bodyHeight < navbarVerticalHeight) {
                document.documentElement.style.minHeight = `${navbarVerticalHeight}px`;
            } else {
                document.documentElement.removeAttribute('style');
            }
        };

        setDocumentMinHeight();
        resize(setDocumentMinHeight);

        if (navbarVerticalToggle) {
            navbarVerticalToggle.addEventListener(Events.NAVBAR_VERTICAL_TOGGLE, setDocumentMinHeight);
        }
    }, []);

    return (
        

        <nav className='navbar navbar-vertical navbar-expand-lg badge-light' style={{ minHeight: "100%", height: "1050px" }}>
            <div className='collapse navbar-collapse' id='navbarVerticalCollapse'>
                <div className='navbar-vertical-content'>
                    <ul className='navbar-nav flex-column' id='navbarVerticalNav'>
                        <li className='nav-item'>
                            <h6 className='navbar-vertical-label text-info' style={{ fontSize: "small" }}>
                                SCM
                            </h6>

                            <div className='nav-item-wrapper'>
                                <a className='nav-link dropdown-indicator label-1' href='#nv-e-commerce' role='button' data-bs-toggle='collapse' aria-expanded='false' aria-controls='nv-e-commerce'>
                                    <div className='d-flex align-items-center'>
                                        <div className='dropdown-indicator-icon'>
                                            <span className='fas fa-caret-right'></span>
                                        </div>
                                        <span className='nav-link-icon ms-1'>
                                            <i className="fa-regular fa-pen-to-square"></i>
                                        </span>
                                        <span className='nav-link-text'>등록(Registration)</span>
                                    </div>
                                </a>
                                <div className='parent-wrapper label-1'>
                                    <ul className='nav collapse parent' data-bs-parent='#navbarVerticalCollapse' id='nv-e-commerce'>
                                        <li className='collapsed-nav-item-title d-none'>등록(Registration)</li>
                                        <li className='nav-item'>
                                            <Link className='nav-link' to='/addSupplier' data-bs-toggle='' aria-expanded='false'>
                                                <div className='d-flex align-items-center'>
                                                    <span className='nav-link-text'>부품-공급사 등록</span>
                                                </div>
                                            </Link>
                                        </li>
                                        <li className='nav-item'>
                                            <Link className='nav-link' to='/addRetailer' data-bs-toggle='' aria-expanded='false'>
                                                <div className='d-flex align-items-center'>
                                                    <span className='nav-link-text'>제품-고객사 등록</span>
                                                </div>
                                            </Link>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                            <div className='nav-item-wrapper'>
                                <a className='nav-link dropdown-indicator label-1' href='#nv-CRM' role='button' data-bs-toggle='collapse' aria-expanded='false' aria-controls='nv-CRM'>
                                    <div className='d-flex align-items-center'>
                                        <div className='dropdown-indicator-icon'>
                                            <span className='fas fa-caret-right'></span>
                                        </div>
                                        <span className='nav-link-icon ms-1'>
                                            <i className="fa-solid fa-scale-unbalanced-flip"></i>
                                        </span>
                                        <span className='nav-link-text'>비교분석(Comparison)</span>
                                    </div>
                                </a>

                                <div className='parent-wrapper label-1'>
                                    <ul className='nav collapse parent' data-bs-parent='#navbarVerticalCollapse' id='nv-CRM'>
                                        <li className='collapsed-nav-item-title d-none'>비교분석(Comparison)</li>
                                        <li className='nav-item'>
                                            <Link className='nav-link' to='/compareSupplier' data-bs-toggle='' aria-expanded='false'>
                                                <div className='d-flex align-items-center'>
                                                    <span className='nav-link-text'>공급 제안 비교</span>
                                                </div>
                                            </Link>
                                        </li>
                                        <li className='nav-item'>
                                            <Link className='nav-link' to='/compareRetailer' data-bs-toggle='' aria-expanded='false'>
                                                <div className='d-flex align-items-center'>
                                                    <span className='nav-link-text'>판매 예측 비교</span>
                                                    
                                                </div>
                                            </Link>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                            <div className='nav-item-wrapper'>
                                <a className='nav-link dropdown-indicator label-1' href='#nv-project-management' role='button' data-bs-toggle='collapse' aria-expanded='false' aria-controls='nv-project-management'>
                                    <div className='d-flex align-items-center'>
                                        <div className='dropdown-indicator-icon'>
                                            <span className='fas fa-caret-right'></span>
                                        </div>
                                        <span className='nav-link-icon ms-1'>
                                            <i className="fa-solid fa-chart-line"></i>
                                        </span>
                                        <span className='nav-link-text'>통계(Statistics)</span>
                                    </div>
                                </a>
                                <div className='parent-wrapper label-1'>
                                    <ul className='nav collapse parent' data-bs-parent='#navbarVerticalCollapse' id='nv-project-management'>
                                        <li className='collapsed-nav-item-title d-none'>통계(Statistics)</li>
                                        <li className='nav-item'>
                                            <Link className='nav-link' to='/showChart' data-bs-toggle='' aria-expanded='false'>
                                                <div className='d-flex align-items-center'>
                                                    <span className='nav-link-text'>통합 통계</span>
                                                </div>
                                            </Link>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>

                        <hr className='navbar-vertical-line' />
                    </ul>
                </div>
            </div>

            <div className='navbar-vertical-footer'>
                <button className='btn navbar-vertical-toggle border-0 fw-semi-bold w-100 white-space-nowrap d-flex align-items-center'>
                    <span className='uil uil-left-arrow-to-left fs-0'></span>
                    <span className='uil uil-arrow-from-right fs-0'></span>
                    <span className='navbar-vertical-footer-text ms-2'>사이드바 접기</span>
                </button>
            </div>
        </nav>
    );
};

export default SideBar;
