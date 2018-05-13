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
            <b-nav-item-dropdown text="אתחול" left >
              <b-dropdown-item @click = "Move_to_control" class = "Fix_Hebrew">נתוני פעילות</b-dropdown-item>
              <b-dropdown-item href="#" class = "Fix_Hebrew">קבוצות</b-dropdown-item>
              <b-dropdown-item href="#" class = "Fix_Hebrew">משימות</b-dropdown-item>
            </b-nav-item-dropdown>
            <b-nav-item-dropdown text="ניהול" right>
              <b-dropdown-item class = "Fix_Hebrew">שליחת הודעה</b-dropdown-item>
              <b-dropdown-item class = "Fix_Hebrew">טבלת ניקוד</b-dropdown-item>
              <b-dropdown-item @click = "Move_to_manage" class = "Fix_Hebrew">נתוני קבוצה</b-dropdown-item>
              <b-dropdown-item class = "Fix_Hebrew">שתילת נקודה</b-dropdown-item>
              <b-dropdown-item class = "Fix_Hebrew">סיום ניווט</b-dropdown-item>
              <b-dropdown-item class = "Fix_Hebrew">מפה ראשית</b-dropdown-item>
            </b-nav-item-dropdown>

            <b-nav-item href="#">בית</b-nav-item>
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
          }
        }
    }
</script>

<style scoped>
  .Fix_Hebrew{
    text-align: -webkit-right;
  }
</style>
