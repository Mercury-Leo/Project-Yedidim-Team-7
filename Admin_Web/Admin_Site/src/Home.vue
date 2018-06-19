<template>
  <div>

    <p >
      האתר מחולק לשתי חלקים, ניהול ואתחול<br>
      להתחיל את הניווט יש קודם למלא את הפרטים בדף האתחול

    </p>
    <br>
    <table class = "home_table"  >
      <tr>
        <th class = "Fix_Hebrew">
          אתחול
        </th>
        <th class = "Fix_Hebrew">
          ניהול
        </th>
      </tr>
      <tr>
        <td class = "Fix_Hebrew">

            נתוני פעילות - לתת ערכים ראשונים לקבוצות וקבלת קוד קבוצה


          <br>
        </td>
        <td class = "Fix_Hebrew">


          נתוני קבוצה - פרטים על הקבוצות המשחקות
          <br>

          סיום ניווט - לסיים את הניווט ולשלוח את הקבוצות לנקודת סיום
          <br>

        </td>
      </tr>
    </table>
    <b-btn @click = "Start_Game">התחלת ניווט</b-btn>
  </div>
</template>

<script>
  import db from './components/FireBase'
  let StartRef = db.ref('start');

export default {
        name: "Home",
  methods: {
    Start_Game: function () {
      if((!this.$cookies.isKey("Teams_Made"))){
        alert("קבוצות לא קיימות");
        return;
      }
      let obj = {
        startGame: 'true'
      };
      StartRef.update(obj);

    },

  }
    }

</script>

<style scoped>
  .home_table {
    text-align: -webkit-center;
    margin-left: 50%;
  }
  .Fix_Hebrew{
    text-align: -webkit-right;
  }
</style>
