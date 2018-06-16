<template>
  <div>

    <p>מספר קבוצות פעילות</p>
    <p>{{counter}}</p>

  <table id ="table_style" align="center">
    <tr>
      <th>טלפון של ראש קבוצה</th>
      <th> ראש קבוצה</th>
      <th>משימות שבוצעו</th>
      <th>ניקוד</th>
      <th>קוד קבוצה</th>
      <th>שם קבוצה</th>

    </tr >

    <tr v-for = "team in Team_Array" id = "Lazy_Count">
      <td>{{team['teamNum']}}</td>
      <td>{{team['teamHead']}}</td>
      <td>{{team['done']}}</td>
      <td>{{team['point']}}</td>
      <td>{{team['teamCode']}}</td>
      <td>{{team['teamName']}}</td>
    </tr>
  </table>
  </div>
</template>

<script>
  import firebase from '../FireBase'

    export default {
        name: "Team_Data",
      firebase: {
        Team_Array: firebase.ref('Teams'),
      },
      method: {
          Get_Team_Num: function () {
            let Team_Count = firebase.ref('start').child("numOfTeam");
            Team_Count.on("value", function(snapshot){
              this.$data.Team_Num = snapshot.val();
            })

          }
      },
      data(){
          return{
            Team_Num: 0,
            counter: 0
          }
      },


    }
</script>

<style scoped>
  #table_style{
    margin-top:5%;
  }
  table, th, td {
    border: 1px solid black;
    background-color: white;
  }
</style>
