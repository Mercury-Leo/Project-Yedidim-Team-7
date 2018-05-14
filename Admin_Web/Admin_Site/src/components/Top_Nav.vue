<template>
  <header>
    <div>
      <b-navbar type="dark" variant="primary" toggleable class = "mr-auto">
        <b-navbar-toggle target="nav_dropdown_collapse"></b-navbar-toggle>
        <b-collapse is-nav id="nav_dropdown_collapse">
          <b-navbar-nav class="ml-auto">
            <b-nav-item-dropdown text="משתמש" right>
              <b-dropdown-item @click = "User_Logout" class = "Fix_Hebrew">התנתקות</b-dropdown-item>
            </b-nav-item-dropdown>
            <!-- Navbar dropdowns -->
            <b-nav-item-dropdown text="אתחול" right >
              <b-dropdown-item @click = "Move_to_Nav_data" class = "Fix_Hebrew">נתוני פעילות</b-dropdown-item>
              <b-dropdown-item @click = "Move_to_Teams" class = "Fix_Hebrew">קבוצות</b-dropdown-item>
              <b-dropdown-item @click = "Move_to_Mission" class = "Fix_Hebrew">משימות</b-dropdown-item>
            </b-nav-item-dropdown>
            <b-nav-item-dropdown text="ניהול" right>
              <b-dropdown-item @click = "Move_to_Send_msg" class = "Fix_Hebrew">שליחת הודעה</b-dropdown-item>
              <b-dropdown-item @click = "Move_to_score" class = "Fix_Hebrew">טבלת ניקוד</b-dropdown-item>
              <b-dropdown-item @click = "Move_to_team_data" class = "Fix_Hebrew">נתוני קבוצה</b-dropdown-item>
              <b-dropdown-item @click = "Move_to_points" class = "Fix_Hebrew">שתילת נקודה</b-dropdown-item>
              <b-dropdown-item @click = "Move_to_Nav_end" class = "Fix_Hebrew">סיום ניווט</b-dropdown-item>
              <b-dropdown-item @click = "Move_to_map" class = "Fix_Hebrew">מפה ראשית</b-dropdown-item>
            </b-nav-item-dropdown>

            <b-nav-item @click = "Move_to_home">בית</b-nav-item>
          </b-navbar-nav>
        </b-collapse>
      </b-navbar>
    </div>

    <img src = "../assets/yedidim_logo.png" height="20%" width="20%" >

  </header>
</template>

<script>
    export default {
        name: "Top_Nav",
        methods: {
          User_Logout: function() {
            this.$router.push('/');
          },
          Move_to_control: function() {
            this.$router.push('Control');
          },
          Move_to_manage: function () {
            this.$router.push('Manage');
          },
          Move_to_home: function(){
            this.$router.push('Home');
          },
          Move_to_Mission: function () {
            this.$router.push('Missions');
          },
          Move_to_Nav_data: function () {
            this.$router.push('Nav data');
          },
          Move_to_Teams: function () {
            this.$router.push('Teams');
          },
          Move_to_Nav_end: function () {
            this.$router.push('Nav end');
          },
          Move_to_map: function () {
            this.$router.push('main map');
          },
          Move_to_points: function () {
            this.$router.push('Points');
          },
          Move_to_score: function () {
            this.$router.push('Scores');
          },
          Move_to_Send_msg: function () {
            this.$router.push('Send Message');
          },
          Move_to_team_data: function () {
            this.$router.push('Team Data');
          },
        }
    }
</script>

<style scoped>
  .Fix_Hebrew{
    text-align: -webkit-right;
  }
</style>
