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
  {
    path: '/Send Message',
    component: Send_Msg
  },
  {
    path: '/Team Data',
    component: Team_Data
  },
  {
    path: '/Scores',
    component: Score
  },
  {
    path: '/points',
    component: Points
  },
  {
    path: '/main map',
    component: Map
  },
  {
    path: '/Nav end',
    component: Nav_end
  },
  {
    path: '/Teams',
    component: Teams
  },
  {
    path: '/Nav data',
    component: Nav_data
  },
  {
    path: '/Home',
    component: Home
  },
  {
    path: '/Missions',
    component: Missions
  }

];
