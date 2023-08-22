import logo from "./logo.svg";
import "./App.css";
import Headerbar from "./components/HeaderBar";
import SideBar from "./components/SideBar";

import { 
    BrowserRouter as Router, 
    Switch,
    Route,
    Link
} from 'react-router-dom';
import routes from './routes';

function App() {
    return (


        <Router>

        <SideBar/>
        <Headerbar/>

        <div className="ms-8">
            <Switch>
                {routes.map((route) => { 
                    return <Route exact key={route.path} path={route.path} component={route.component}/>
                })}
            </Switch>
        </div>

        </Router>
    );
}

export default App;
