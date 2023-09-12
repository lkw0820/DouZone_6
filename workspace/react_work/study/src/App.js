import logo from './logo.svg';
import './App.css';
import {
  BrowserRouter as Router,
  Switch,
  Route
} from 'react-router-dom';
import Navbar from './components/Navbar';
import routers from './routers';
import { RecoilRoot } from 'recoil';


function App() {


  return (
    <RecoilRoot>
    <Router>
      <Navbar/>
      <Switch>
        {routers.map((router)=>{
          return <Route key={router.path} exact path={router.path} component={router.component}/>
        })}
      </Switch>
    </Router>
    </RecoilRoot>

  );
}

export default App;
