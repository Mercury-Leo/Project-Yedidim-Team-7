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

      </tbody>
    </table>
    <p>team code</p><input type = "number" v-model="Team.teamCode"><br>
    <p>team name</p> <input type = "text" v-model="Team.teamName"><br>
    <button @click = "addData">add team</button>
  </div>


</template>

<script>

  import firebase from '../FireBase'

  let Team_List  = firebase.ref('start');


  export default {
    name: "Teams",
    firebase: {
      Teams_Array: Team_List
    },
    data()  {
      return {
        Team: {
          done: 0,
          ip: "127.0.0.1",
          mission: [],
          point: 0,
          teamCode: 12345,
          teamHead: "leader",
          teamName: "team_name",
          teamNum: "100"
        }
      }
    },
    methods: {
      addData: function () {


      },
    }
  }
</script>

<style scoped>

</style>
