<template>
  <div>
    <p>ניהול משחק ידידים</p>
    <p>
      מלאו את הפרטים של הניווט בשביל להתחיל משחק.
    </p>
    <form>

      <input type = "number" v-model="Team_num.Team_Count" >
      <label :for = "Team_num.Team_Count" >כמה קבוצות משתתפות</label><br>
      <input type = "time" v-model="navigation_time.end_time">
      <label :for = "navigation_time.end_time">זמן סיום נייוט</label><br>
      <input type = "text" v-model="instructor.instructor_name">
      <label :for = "instructor.instructor_name" >שם מדריך</label><br>
      <input type = "number" v-model="instructor.instructor_phone">
      <label :for = "instructor.instructor_phone">טלפון מדריך</label><br>
      <input type = "number" v-model="Diff.difficult">
      <label :for = "Diff.difficult" >רמת קושי</label><br>
      <input type = "text" v-model="school.school_name">
      <label :for = "school.school_name" >שם בית הספר</label><br>
      <p>{{navigation_area.area}}</p>

      <select>
        <option value = "jer" >ירושלים</option>
        <option value = "negev">נגב</option>
      </select>
      <label :for="navigation_area.area" >אזור ניווט</label>
    </form>
    <b-button @click = push_init>התחל ניווט </b-button>
    <p>{{Nav_Data}}</p>
  </div>
</template>

<script>
  import db from '../FireBase'

  let Init_nav  = db.ref('start');



  export default {
    name: "Navigation_Data",
    firebase: {
      Nav_Data: Init_nav,
      Arr: db.ref('Teams'),
      team_obj: {
        source: db.ref('start'),
        asObject: true,
        readyCallback: function() {

        }
      }
    },
    data(){
      return {
        navigation_time: {
          end_time: "00:00"
        },
        instructor: {
          instructor_name: '#Do_not_Use_this_name',
          instructor_phone: "0000"
        },
        school: {
          school_name: 'yedidim'
        },
        navigation_area: {
          area: ''
        },
        Team_num: {
          Team_Count: 0
        },
        Diff: {
          difficult: 0
        }


      }
    },
    methods: {
      push_init: function () {
        this.Create_Teams();
        if(this.$data.Team_num.Team_Count > 0 && this.$data.Team_num.Team_Count < 51 && this.$data.Diff.difficult >= 0 && this.$data.Diff.difficult <4){

          /*this.$firebaseRefs.Arr.push({
            difficult: this.$data.Diff.difficult,
            numOfTeam: this.$data.Team_num.Team_Count,
          })*/
        }

        //this.$router.push('Missions')
      },
      Create_Teams: function () {
        let i = 0;
        let team_code_ran = 0;
        for( i ; i < this.$data.Team_num.Team_Count; i++){
          team_code_ran = (Math.random()*100000 | 0);

          this.$firebaseRefs.Arr.push({
            "done": 0,
            "ip": "127.0.0.1",
            "Mission": {
              "Mission1": "0"
            },
            "point": 0,
            "teamCode": team_code_ran,
            "teamHead": "team_head",
            "teamName": "Hold",
            "teamNum": "num"
          })
        }
      }

    },
/*
    "items":{
      "admin":{
        "name": this.$data.instructor.instructor_name,
        "num": this.$data.instructor.instructor_phone
      },
      "city": "https://missions-yedidim.firebaseio.com" + this.$data.navigation_area.area,
      "difficult": this.$data.Diff.difficult,
      "finish": {
        "time": this.$data.navigation_time.end_time
      },
      "numOfTeam": this.$data.Team_num.Team_Count,
      "startGame": "true"
    }
*/
  }
</script>

<style scoped>

</style>
