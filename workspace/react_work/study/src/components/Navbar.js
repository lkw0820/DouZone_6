import { Link } from 'react-router-dom/cjs/react-router-dom.min';

const Navbar = () =>{
    return(
    <nav className="navbar navbar-expand-lg bg-body-tertiary">
        <div className="container-fluid">
          <Link className="navbar-brand" to="/">Home</Link>
            <ul className="navbar-nav">
              <li className="nav-item">
                <Link className="nav-link active"  to="/blog">Blog</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link active"  to="/blog/create">create</Link>
              </li>

            </ul>
        </div>
      </nav>
    );
}

export default Navbar;