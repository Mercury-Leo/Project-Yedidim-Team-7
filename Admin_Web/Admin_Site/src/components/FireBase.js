import Firebase from 'firebase'


let config = {

  apiKey: "AIzaSyB_4Q03kH4GClmLrBeESuhzuxgAICZ9MUk",
  authDomain: "teams-yedidim.firebaseapp.com",
  databaseURL: "https://teams-yedidim.firebaseio.com",
  projectId: "teams-yedidim",
  storageBucket: "teams-yedidim.appspot.com",
  messagingSenderId: "825991088727"

};

let app = Firebase.initializeApp(config);
let db = app.database();

export default db

