<template>
  <div>
    <p>ניהול משחק ידידים</p>
    <p>
      מלאו את הפרטים של הניווט בשביל להתחיל משחק.
    </p>
    <form>

      <input type = "time" v-model="start_time">
      <label :for = "start_time">זמן תחילת ניווט</label>
      <input type = "time" v-model="end_time">
      <label :for = "end_time">זמן סיום נייוט</label><br>
      <input type = "text" v-model="instructor_name">
      <label :for = "instructor_name" >שם מדריך</label>
      <input type = "number" v-model="instructor_phone">
      <label :for = "instructor_phone">טלפון מדריך</label><br>
      <input type = "text" v-model="school_name">
      <label :for = "school_name" >שם בית הספר</label><br>


      <select>
        <option value = "jer" >ירושלים</option>
        <option value = "negev">נגב</option>
      </select>
      <label :for="area" >אזור ניווט</label>
    </form>
    <button @click = "submit_init">התחל ניווט</button>
  </div>
</template>

<script>

  export default {
    name: "Navigation_Data",
    data(){
      return {
        navigation_time: {
          start_time: 0,
          end_time: 0
        },
        instructor: {
          instructor_name: '',
          instructor_phone: 0
        },
        school: {
          school_name: ''
        },
        navigation_area: {
          area: ''
        }
      }
    },
    methods: {
      submit_init: function(){
        this.$router.push('Manage');
      }
    }
  }
</script>

<style scoped>

</style>
