<template>
  <div>


  <div >
    <h1>Testing stuff</h1>
  </div>
  <div >
    <div>
      <h3>Team list</h3>
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
  import Firebase from 'firebase'


  let config = {

    apiKey: "AIzaSyBhZ7e-fF4i5w8tlxrEP97wO3A8nDCx09k",
    authDomain: "yedidim-a05ec.firebaseapp.com",
    databaseURL: "https://yedidim-a05ec.firebaseio.com",
    projectId: "yedidim-a05ec",
    storageBucket: "yedidim-a05ec.appspot.com",
    messagingSenderId: "183472267803"

  };

  const firebaseApp = Firebase.initializeApp(config);
  const db = firebaseApp.database();

  let team  = db.ref('teams');
    export default {
        name: "Control_App",
      firebase:{
        test: team
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

<style scoped>

</style>
