<template>
  <div id="app">
    <div >
      <h1>Testing stuff</h1>
    </div>
    <div >
      <div>
        <h3>Team list</h3>
      </div>
      <div >

      </div>
    </div>
    <p>Enter team id</p>
    <input type = "text" id = "team_id" v-model = "newTeam.id">

    <button @click = "addData">
      Submit
    </button>
    <table>
      <tr>
        Id
      </tr>
      <tr v-for=" team in test" >
        {{team.id}}
      </tr>
    </table>
  </div>
</template>

<script>


  //Connection to Firebase server;
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

  let team = db.ref('teams');
  let test1 = db.ref('news');

export default {
  name: 'App',
  firebase:{
    test: team,
    news: test1
  },
  component:{

  },
  data(){
    return {
      newTeam: {
        id: 0
      }
    }
  },
  methods: {
    addData: function(){
      team.push(this.newTeam);
      this.newTeam.id = 0;
    }
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
