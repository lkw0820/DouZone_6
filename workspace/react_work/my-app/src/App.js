import logo from './logo.svg';
import './App.css';
import{
  BrowserRouter as Router,
  Switch,
  Route
} from 'react-router-dom';
import NavBar from './components/Navbar';
import routers from './Router';
import useToast from './Hooks/toast';
import Toast from './components/Toast';
import { UseSelector, useSelector } from 'react-redux/es/hooks/useSelector';

function App() {
  const toasts = useSelector(state=>state.toast.toasts);
  const {deleteToast} = useToast();

  return (
    <Router>
      <NavBar/>
      <Toast
        toasts={toasts}
        deleteToast={deleteToast}
      />
      <div className='container mt-3'>
        <Switch>
        {/* exact는 정확한 url일때만 */}
          {routers.map((route)=>{
            return <Route 
              key={route.path} 
              exact 
              path={route.path} 
              component={route.component} 
            />
          })}
        </Switch>
      </div>
      
    </Router>
    
  );
}

export default App;
