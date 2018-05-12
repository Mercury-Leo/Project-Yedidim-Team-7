import Login from './components/Login'
import Control from './components/Control_App'
import Manage from './components/manage/manage_main'

export const routes = [
  {
    path: '',
    component: Login
  },
  {
    path: '/Control',
    component: Control
  },
  {
    path: '/Manage',
    component: Manage
  }

];
