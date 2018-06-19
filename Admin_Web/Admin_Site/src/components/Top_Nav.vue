<template>
  <header>
    <div>
      <b-navbar type="dark" variant="primary" toggleable class = "mr-auto">
        <b-navbar-toggle target="nav_dropdown_collapse"></b-navbar-toggle>
        <b-collapse is-nav id="nav_dropdown_collapse">
          <b-navbar-nav class="ml-auto">
            <b-nav-item-dropdown text="משתמש" right>
              <b-dropdown-item @click = "Log_out" class = "Fix_Hebrew">התנתקות</b-dropdown-item>
            </b-nav-item-dropdown>
            <!-- Navbar dropdowns -->
            <b-nav-item-dropdown text="אתחול" right >
              <b-dropdown-item @click = "$router.push('nav-data')" class = "Fix_Hebrew">נתוני פעילות</b-dropdown-item>
             <!-- <b-dropdown-item @click = "$router.push('teams')" class = "Fix_Hebrew">קבוצות</b-dropdown-item> -->
              <!-- <b-dropdown-item @click = "$router.push('Missions')" class = "Fix_Hebrew">משימות</b-dropdown-item> -->
            </b-nav-item-dropdown>
            <b-nav-item-dropdown text="ניהול" right>
              <!-- <b-dropdown-item @click = "$router.push('send_message')" class = "Fix_Hebrew">שליחת הודעה</b-dropdown-item> -->
              <b-dropdown-item @click = "$router.push('team-data')" class = "Fix_Hebrew">נתוני קבוצה</b-dropdown-item>
              <!-- <b-dropdown-item @click = "$router.push('points')" class = "Fix_Hebrew">שתילת נקודה</b-dropdown-item> -->
              <b-dropdown-item @click = "$router.push('end-nav')" class = "Fix_Hebrew">סיום ניווט</b-dropdown-item>
              <!-- <b-dropdown-item @click = "$router.push('main-map')" class = "Fix_Hebrew">מפה ראשית</b-dropdown-item> -->
            </b-nav-item-dropdown>

            <b-nav-item @click = "$router.push('home')">בית</b-nav-item>
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
      Log_out: function () {
        this.$cookies.remove("User_Logged");
        this.$router.push('/');
      }
    }
  }
</script>

<style scoped>
  .Fix_Hebrew{
    text-align: -webkit-right;
  }
</style>
