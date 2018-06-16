<template>
  <div>
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
  </div>
</template>

<script>


    export default {
        name: "Missions",
      data(){
          return {
            Mission: {
              center: {
                lat: "0",
                lng: "0"
              },
              last: {
                lat: "0",
                lng: "0"
              },
              mission: {
                1: {
                  history: "holder",
                  location: {
                    lat: "0",
                    lng: "0"
                  },
                  option: {
                    1: "hold",
                    2: "hold",
                    3: "hold",
                    4: "hold"
                  },
                  question: "quest",
                  rightAnwers: 1,
                  typeOfQuestion: 1
                },
                2: {
                  history: "holder",
                  location: {
                    lat: "0",
                    lng: "0"
                  },
                  question: "quest",
                  typeOfQuestion: 2
                },
                3: {
                  history: "holder",
                  location: {
                    lat: "0",
                    lng: "0"
                  },
                  question: "quest",
                  typeOfQuestion: 3
                },
                4: {
                  history: "holder",
                  location: {
                    lat: "0",
                    lng: "0"
                  },
                  question: "quest",
                  typeOfQuestion: 4
                }
              },
              num: 0,
              start: {
                lat: "0",
                lng: "0"
              }
            }

        }
      }
    }
</script>

<style scoped>

</style>
