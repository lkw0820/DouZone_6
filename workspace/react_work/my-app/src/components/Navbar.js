import { Link, NavLink } from "react-router-dom";

const NavBar = () =>{
    return(
        <nav className="navbar navbar-dark bg-dark">
            <div className='container'>
                {/* Link는 a태그라고 생각 */}
                <Link className="navbar-brand" to="/">HOME</Link>
                <ul className="navbar-nav">
                    <li className="nav-item active">
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