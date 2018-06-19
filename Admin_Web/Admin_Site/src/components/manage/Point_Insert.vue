<template>
  <div>
    <p>בבניה - לא פעיל</p>
    <p>בחר כמות נקודות להוספה</p>
    <select>
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
    </select>

    <table id ="table_style" align="center">
      <tr>
        <th>נבחר</th>
        <th> ראש קבוצה</th>
        <th>משימות שבוצעו</th>
        <th>ניקוד</th>
        <th>קוד קבוצה</th>
        <th>שם קבוצה</th>


      </tr >

      <tr v-for = "team in Team_Array" id = "Lazy_Count">
        <td><input type = "checkbox"></td>
        <td>{{team['teamHead']}}</td>
        <td>{{team['done']}}</td>
        <td>{{team['point']}}</td>
        <td>{{team['teamCode']}}</td>
        <td>{{team['teamName']}}</td>

      </tr>
    </table>

  <b-button>הוסף נקודות</b-button>

  </div>
</template>

<script>
  import db from '../FireBase'
    export default {
        name: "Point_Insert",
      firebase: {
        Team_Array: db.ref('Teams'),
      },
      data(){
          return {
            picked_teams: [],
            points: 0
          }
      }
    }
</script>

<style scoped>
  #table_style{
    margin-top:2%;
  }
  table, th, td {
    border: 1px solid black;
    background-color: white;
  }
</style>
