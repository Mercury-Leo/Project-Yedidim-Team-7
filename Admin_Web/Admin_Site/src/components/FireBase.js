import Firebase from 'firebase'

let Team_config = {

  apiKey: "AIzaSyB_4Q03kH4GClmLrBeESuhzuxgAICZ9MUk",
  authDomain: "teams-yedidim.firebaseapp.com",
  databaseURL: "https://teams-yedidim.firebaseio.com",
  projectId: "teams-yedidim",
  storageBucket: "teams-yedidim.appspot.com",
  messagingSenderId: "825991088727"

};

let team_app = Firebase.initializeApp(Team_config, "team_app" );
let db = team_app.database();

export default db

