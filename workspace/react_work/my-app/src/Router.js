import HomePage from './pages/HomePage';
import CreatePage from './pages/CreatePage';
import ListPage from './pages/ListPage';
import EditPage from './pages/EditPage';
import ShowPage from './pages/ShowPage';
import AdminPage from './pages/AdminPage';

const routers=[
  {
    path: '/',
    component:HomePage
  },
  {
    path: '/blogs',
    component: ListPage
  },
  {
    path: '/admin',
    component: AdminPage
  },
  {
    path: '/blogs/create',
    component: CreatePage
  },
  {
    path: '/blogs/:id/edit',
    component: EditPage
  },
  {
    path: '/blogs/:id', //id값이 들어가는 router는 가장 뒤에 작성 안그럼 create edit가 인터셉트됨
    component: ShowPage
  },
]

export default routers;