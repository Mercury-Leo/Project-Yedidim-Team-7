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
          {{team.teamName}}
        </td>
        <td>
          {{team.teamCode}}
        </td>
      </tr>
      </tbody>
    </table>
    <p>team code</p><input type = "number" v-model="Team.teamCode"><br>
    <p>team name</p> <input type = "text" v-model="Team.teamName"><br>
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
    name: "Teams",
    firebase: {
      test: team
    },
    data()  {
      return {
        Team: {
          Score: 7,
          teamCode: 55555,
          teamName: 'black panther',
          telNum: 911,
          NumberOfMission: 0
        },
        CityName: {


        }
      }
    },
    methods: {
      addData: function () {
        team.push(this.Team);
        this.Team.Score = 0;
        this.Team.teamCode = 0;
        this.Team.teamName = '';
        this.Team.telNum = 0;

      },
    }
  }
</script>

<style scoped>

</style>
