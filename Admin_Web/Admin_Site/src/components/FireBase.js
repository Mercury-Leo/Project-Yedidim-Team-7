import Firebase from 'firebase'


let config = {

  apiKey: "AIzaSyBhZ7e-fF4i5w8tlxrEP97wO3A8nDCx09k",
  authDomain: "yedidim-a05ec.firebaseapp.com",
  databaseURL: "https://yedidim-a05ec.firebaseio.com",
  projectId: "yedidim-a05ec",
  storageBucket: "yedidim-a05ec.appspot.com",
  messagingSenderId: "183472267803"

};

let app = Firebase.initializeApp(config);
let db = app.database();

export default db

