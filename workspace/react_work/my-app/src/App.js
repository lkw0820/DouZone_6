import logo from './logo.svg';
import './App.css';
import{
  BrowserRouter as Router,
  Switch,
  Route
} from 'react-router-dom';
import NavBar from './components/Navbar';
import routers from './Router';

function App() {

  return (
    <Router>
      <NavBar/>
      <div className='container mt-3'>
        <Switch>
        {/* exact는 정확한 url일때만 */}
          {routers.map((route)=>{
            return <Route key={route.path} exact path={route.path} component={route.component} />
          })}
        </Switch>
      </div>
      
    </Router>
    
  );
}

export default App;
