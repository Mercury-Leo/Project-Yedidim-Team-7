import Firebase from 'firebase'

let Mission_config = {

  apiKey: "AIzaSyC5hKYU0_uQ-ZHeHUdfhTmsei3fGUwG7Xc",
  authDomain: "missions-yedidim.firebaseapp.com",
  databaseURL: "https://missions-yedidim.firebaseio.com",
  projectId: "missions-yedidim",
  storageBucket: "missions-yedidim.appspot.com",
  messagingSenderId: "345297485703"

};

let mission_app = Firebase.initializeApp(Mission_config, "mission_app");
let mdb = mission_app.database();

export default mdb

