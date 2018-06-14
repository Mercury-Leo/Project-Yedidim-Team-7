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

    <b-button @click = push_init >add</b-button>
    <div v-for = "teamKey in TeamArray">
      {{teamKey['.key']}}
      <p @click = Create_Teams(teamKey)>התחל ניווט </p>
    </div>


  </div>
</template>

<script>
  import Vue from 'vue'

  import db from '../FireBase'

  let TeamRef = db.ref('Teams');

  export default {
    name: "Navigation_Data",
    firebase: {
      TeamArray: db.ref('Teams'),
      TeamObject: {
        source: db.ref('Teams'),
        asObject: true
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
        let i = 0;
        let team_code_rand = 0;
        if(this.$data.Team_num.Team_Count > 0 && this.$data.Team_num.Team_Count < 51 && this.$data.Diff.difficult >= 0 && this.$data.Diff.difficult <4){
          for( i ; i < this.$data.Team_num.Team_Count; i++) {
            team_code_rand = (Math.random()*100000 | 0);

            this.$firebaseRefs.TeamArray.push({
              "done": 0,
              "ip": "nul",
              "mission": {
                "Holder": "nul"
              },
              "point": 0,
              "teamCode": team_code_rand,
              "teamHead": "team_head",
              "teamName": "Hold",
              "teamNum": "num"
            });
          }

        }

        //this.$router.push('Missions')
      },
      Create_Teams: function (team) {
        let i = 0;
        //let Mission_Array = [{1: "no"}, {2: "no"},{3: "no"},{4: "no"},{5: "no"},{6: "no"},{7: "no"},{8: "no"},{9: "no"},{10: "no"},{11: "no"},{12: "no"},{13: "no"},{14: "no"},{15: "no"},{16: "no"},{17: "no"},{18: "no"},{19: "no"},{20: "no"},{21: "no"},{22: "no"},{23: "no"},{24: "no"},{25: "no"},{26: "no"},{27: "no"},{28: "no"},{29: "no"},{30: "no"},{31: "no"},{32: "no"},{33: "no"},{34: "no"},{35: "no"},{36: "no"},{37: "no"},{38: "no"},{39: "no"},{40: "no"},{41: "no"},{42: "no"},{43: "no"},{44: "no"},{45: "no"},{46: "no"},{47: "no"},{48: "no"},{49: "no"},{50: "no"},];
        let Team_obj = [];
        for( i ; i < this.$data.Team_num.Team_Count; i++) {
          Team_obj.push({
              "finish": "no"
          });
        }
        TeamRef.child(team['.key']).child('mission').set(Team_obj);
      }
    },
  }
</script>

<style scoped>

</style>
