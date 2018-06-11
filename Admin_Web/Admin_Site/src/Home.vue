<template>
  <div>

    <p >
      האתר מחולק לשתי חלקים, ניהול ואתחול<br>
      להתחיל את הניווט יש קודם למלא את הפרטים בדף האתחול

    </p>
    <br>
    <b-table striped hover :items="items"></b-table>
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
        קיימות 3 אופציות לאתחול
          <br>
            נתוני פעילות
          <br>
            קבוצות
          <br>
            משימות
          <br>
        </td>
        <td class = "Fix_Hebrew">
          קיימות 6 אופציות לניהול
          <br>
          שליחת הודעה - ניתן לשלוח הודעה למספר קבוצות
          <br>
          טבלת ניקוד - הניקוד הנוכחי של הקבוצות
          <br>
          נתוני קבוצה - פרטים על הקבוצות המשחקות
          <br>
          שתילת נקודה - לתת נקודות לקבוצות
          <br>
          סיום ניווט - לסיים את הניווט ולשלוח את הקבוצות לנקודת סיום
          <br>
          מפה ראשית - ניתן לראות את כול ראשי הקבוצות ואת המיקום שלהם

        </td>
      </tr>
    </table>
  </div>
</template>

<script>
  const items = [
    { isActive: true, age: 40, first_name: 'Dickerson', last_name: 'Macdonald' },
    { isActive: false, age: 21, first_name: 'Larsen', last_name: 'Shaw' },
    { isActive: false, age: 89, first_name: 'Geneva', last_name: 'Wilson' },
    { isActive: true, age: 38, first_name: 'Jami', last_name: 'Carney' }
  ]


    export default {
        name: "Home",
    }
</script>

<style scoped>
  .home_table {
    text-align: -webkit-center;
  }
  .Fix_Hebrew{
    text-align: -webkit-right;
  }
</style>
