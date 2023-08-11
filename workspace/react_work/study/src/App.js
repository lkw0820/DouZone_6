import logo from './logo.svg';
import './App.css';
import {
  BrowserRouter as Router,
  Switch,
  Route
} from 'react-router-dom';
import Navbar from './components/Navbar';
import routers from './routers';


function App() {


  return (
    <Router>
      <Navbar/>
      <Switch>
        {routers.map((router)=>{
          return <Route key={router.path} exact path={router.path} component={router.component}/>
        })}
      </Switch>
    </Router>

  );
}

export default App;
