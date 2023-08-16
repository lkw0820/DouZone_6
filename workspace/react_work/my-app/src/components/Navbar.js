import { Link, NavLink } from "react-router-dom";

const NavBar = () =>{
    return(
        <nav className="navbar navbar-dark bg-dark">
            <div className='container'>
                {/* Link는 a태그라고 생각 */}
                <Link className="navbar-brand" to="/">HOME</Link>
                <ul className="navbar-nav" style={{flexDirection:'row'}}>
                    <li className="nav-item me-2">
                        <NavLink 
                            activeClassName="active"
                            className="nav-link" 
                            to="/admin"
                        >
                            Admin
                        </NavLink>
                    </li>
                    <li className="nav-item">
                        <NavLink 
                            activeClassName="active"
                            className="nav-link" 
                            to="/blogs"
                        >
                            Blogs
                        </NavLink>
                    </li>
                </ul>
            </div>
        </nav>
    )
}

export default NavBar;