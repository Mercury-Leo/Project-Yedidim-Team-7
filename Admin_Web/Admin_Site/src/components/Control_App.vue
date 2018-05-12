<template>
  <div>
    <p>ניהול משחק ידידים</p>
    <p>
      מלאו את הפרטים של הניווט בשביל להתחיל משחק.
    </p>
    <form>
      <label :for = "start_time">זמן תחילת ניווט</label>
      <input type = "time" v-model="start_time">
      <label :for = "end_time">זמן סיום נייוט</label>
      <input type = "time" v-model="end_time"><br>
      <label :for = "instructor_name" >שם מדריך</label>
      <input type = "text" v-model="instructor_name"><br>
      <label :for = "instructor_phone">טלפון מדריך</label>
      <input type = "number" v-model="instructor_phone">
      <label :for = "school_name" >שם בית הספר</label>
      <input type = "text" v-model="school_name"><br>
      <label :for="navigation_area" >אזור ניווט</label>
      <select>
        <option value = "jer" >ירושלים</option>
        <option value = "negev">נגב</option>
      </select>
    </form>
    <button @click = "submit_init">התחל ניווט</button>
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
          },
          start_time: {

          },
          end_time: {

          },
          instructor_name: {

          },
          instructor_phone: {

          },
          school_name: {

          },
          navigation_area: {

          }
        }
      },
      methods: {
        addData: function(){
          team.push(this.newTeam);
          this.newTeam.id = 0;
        },
        submit_init: function(){
          this.$router.push('Manage');
        }
      }
    }
</script>

<style scoped>

</style>
