<template>
  <div>
    <p>ניהול משחק ידידים</p>
    <p>
      מלאו את הפרטים של הניווט בשביל להתחיל משחק.
    </p>

    <table align="center">
      <tr >
        <td>
          <input type = "number" v-model="Team_num.Team_Count" >
        </td>
        <td>
          <label :for = "Team_num.Team_Count" >כמה קבוצות משתתפות</label>
        </td>
      </tr>
      <tr>
        <td>
          <input type = "time" v-model="navigation_time.end_time">

        </td>
        <td>
          <label :for = "navigation_time.end_time">זמן סיום נייוט</label>
        </td>
      </tr>
      <tr>
        <td>
          <input type = "text" v-model="instructor.instructor_name">
        </td>
        <td>
          <label :for = "instructor.instructor_name" >שם מדריך</label>
        </td>
      </tr>
      <tr>
        <td>
          <input type = "number" v-model="instructor.instructor_phone">
        </td>
        <td>
          <label :for = "instructor.instructor_phone">טלפון מדריך</label>
        </td>
      </tr>
      <tr>
        <td>
          <input type = "number" v-model="Diff.difficult">
        </td>
        <td>
          <label :for = "Diff.difficult" >רמת קושי</label>
        </td>
      </tr>
      <tr>
        <td>
          <input type = "text" v-model="school.school_name">
        </td>
        <td>
          <label :for = "school.school_name" >שם בית הספר</label>
        </td>
      </tr>
      <tr>
        <td>
          <select v-model = "navigation_area.area">
            <option>azrieli</option>
            <option>jerusalem</option>
          </select>
        </td>
        <td>
          <label :for="navigation_area.area" >אזור ניווט</label>
        </td>
      </tr>
    </table>

    <b-button @click = push_init >תחילת משחק</b-button>

  </div>
</template>

<script>
  //mdb.ref('/').child("negev").set({ }) ---> setting a child named negev in parent node

  import db from '../FireBase'
  import mdb from '../MissionFireBase'

  let TeamRef = db.ref('Teams');
  let StartRef = db.ref('start');

  let  team_key_list = [];
  let random_num = [];

  export default {
    name: "Navigation_Data",
    firebase: {
      TeamArray: db.ref('Teams'),
      MissionArray: mdb.ref('/')
    },
    data(){
      return {
        navigation_time: {
          end_time: "00:00"
        },
        instructor: {
          instructor_name: '#Do_not_Use_this_name',
          instructor_phone: "0"
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
        },

      }
    },
    methods: {
      push_init: function () {
        if(this.Create_Start()){
          if(this.Create_Teams()){
            this.$router.push('Missions')
          }
        }
      },
      Create_Start: function(){
        let time_string = this.$data.navigation_time.end_time;
        time_string = time_string.replace(':','');
        if(!this.$data.instructor.instructor_name.localeCompare('#Do_not_Use_this_name')){
          alert("נא בחר בשם מדריך אחר.");
          return false;
        }
        if(!this.$data.instructor.instructor_phone.localeCompare("0") || !this.$data.instructor.instructor_phone.localeCompare("") ){
          alert("טלפון מדריך לא יכול להיות ריק או 0");
          return false;
        }
        if(!this.$data.navigation_area.area.localeCompare('')){
          alert("יש לבחור אזור ניווט");
          return false;
        }
        let start_init = {
          numOfTeam: this.$data.Team_num.Team_Count,
          difficult: this.$data.Diff.difficult,
          startGame: "true",
          admin: {
            name: this.$data.instructor.instructor_name,
            num: this.$data.instructor.instructor_phone
          },
          finish: {
            time: time_string + "00"
          },
          city: "https://missions-yedidim.firebaseio.com/" + this.$data.navigation_area.area
        };
        StartRef.set(start_init);
        return true;
      },
      Create_Teams: function () {
        this.uniqueNumber();
        let i = 0;
        let team_code_rand = 0;
        if(this.$data.Team_num.Team_Count > 0 && this.$data.Team_num.Team_Count < 51 && this.$data.Diff.difficult >= 0 && this.$data.Diff.difficult <4){
          for( i ; i < this.$data.Team_num.Team_Count; i++) {
            team_code_rand = random_num[i];

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
        else {
          alert("ניתן לייצר עד 50 קבוצות ורמת קושי בין 0 ל3");
          return false;
        }
        this.Get_Keys();
        let Team_obj = [];
        let mission_ref = mdb.ref(this.$data.navigation_area.area).child("num");

        mission_ref.on("value", function(snapshot){
          for( i = 0; i < snapshot.val(); i++) {
            Team_obj.push({
              "finish": "no"
            });
          }
          for(i = 0; i< team_key_list.length; i++){
            TeamRef.child(team_key_list[i]).child('mission').set(Team_obj);
          }
        });
        return true;
      },
      Get_Keys: function () {
        this.$firebaseRefs.TeamArray.once("value",function(snapshot){
          snapshot.forEach(function(child){
            team_key_list.push(child.key);
          })
        });
      },
      uniqueNumber: function () {
        let i = 0;
        for(i; i< this.$data.Team_num.Team_Count; i++){
          let randomnumber = Math.floor(Math.random()*100000) + 1;
          console.log(randomnumber);
          if(random_num.indexOf(randomnumber) > -1 ) continue;
          if(randomnumber.toString().length != 5){
            i--;
          }
          else{
            random_num[random_num.length] = randomnumber;
          }

        }
      }
      },

  }
</script>

<style scoped>

</style>
