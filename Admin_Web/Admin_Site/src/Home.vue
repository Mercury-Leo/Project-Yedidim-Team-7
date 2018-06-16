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
export default {
        name: "Home",
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
