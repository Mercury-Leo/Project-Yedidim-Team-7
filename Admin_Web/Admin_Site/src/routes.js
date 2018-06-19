import Login from './components/Login'
import Home from './Home'
import Missions from './components/init/Missions'
import Nav_data from './components/init/Navigation_Data'
import Teams from './components/init/Teams'
import Nav_end from './components/manage/End_Navgiation'
import Map from './components/manage/Main_Map'
import Points from './components/manage/Point_Insert'
import Score from './components/manage/Score_List'
import Send_Msg from './components/manage/Send_Team_Message'
import Team_Data from './components/manage/Team_Data'

export const routes = [
  {
    path: '/',
    component: Login
  },
  /*
  {
    path: '/send-message',
    component: Send_Msg
  },*/
  {
    path: '/team-data',
    component: Team_Data
  },
  /*
  {
    path: '/points',
    component: Points
  },*/
  /*
  {
    path: '/main-map',
    component: Map
  },
  */
  {
    path: '/end-nav',
    component: Nav_end
  },
  /*
  {
    path: '/teams',
    component: Teams
  },*/
  {
    path: '/nav-data',
    component: Nav_data
  },
  {
    path: '/home',
    component: Home
  },
  /*
  {
    path: '/missions',
    component: Missions
  }
  */

];
