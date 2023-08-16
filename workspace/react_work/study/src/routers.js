import HomePage from './pages/HomePage';
import EditPage from './pages/EditPage';
import ListPage from './pages/ListPage';
import CreatePage from './pages/CreatePage';
import ShowPage from './pages/ShowPage';
import AdminPage from './pages/AdminPage';

const routers=[
    {
        path:'/',
        component:HomePage
    },
    {
        path:'/blog',
        component:ListPage
    },
    {
        path:'/admin',
        component:AdminPage
    },
    {
        path:'/blog/create',
        component:CreatePage
    },

    {
        path:'/blog/:id',
        component:ShowPage
    },
    {
        path:'/blog/:id/edit',
        component:EditPage
    },
]

export default routers;