<template>
  <div>
    <p>ניהול משחק</p>

    <table>

      <thead>
      <tr>
        <th>
          שם קבוצה
        </th>
        <th>
          קוד קבוצה
        </th>
      </tr>
      </thead>
      <tbody>
        <tr v-for = "team in test">
          <td>
            {{team.name}}
          </td>
          <td>
            {{team.id}}
          </td>
        </tr>
      </tbody>
    </table>
    <p>team code</p><input type = "number" v-model="newTeam.id"><br>
   <p>team name</p> <input type = "text" v-model="newTeam.name"><br>
    <button @click = "addData">add team</button>
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

  let  app = Firebase.initializeApp(config);
  let db = app.database();

  let team  = db.ref('teams');


    export default {
        name: "manage_main",
      firebase: {
        test: team
      },
      data()  {
          return {
            newTeam: {
              id: 0,
              name: ''
            },

          }
      },
      methods: {
        addData: function () {
          team.push(this.newTeam);
          this.newTeam.id = 0;
          this.newTeam.name = '';
        },
      }
    }
</script>

<style scoped>

</style>
