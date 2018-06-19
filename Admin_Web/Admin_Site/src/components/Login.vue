<template>
    <div class = "login">
      <h3>התחברות מנהל</h3>
      <input type = "text" placeholder="משתמש" v-model="User_name"><br>
      <input type = "password" placeholder = "סיסמה" v-model="User_pass"><br><br>

      <b-button @click = Log_User >התחברות</b-button>

      <p>פרטים להתחברות ניתן לקבל מעמותת ידידים</p>
    </div>
</template>



<script>
  import Vue from 'vue'
  Vue.use(require('vue-cookies'));
  export default {
        name: "Login",
        data: function() {
          return {
            User_name: '',
            User_pass: '',
            Server_name: 'yedidim',
            Server_pass: 'yedidim7'
          }
        },
      methods: {
        Log_User: function() {
          if(this.Server_name == this.User_name && this.Server_pass == this.User_pass){
            this.$cookies.set("User_Logged","25j_7Sl6xDq2Kc3ym0fmrSSk2xV2XkUkX","0");
            this.$router.push('home');
            return true;
          }
          else{
            alert("שם משתמש או סיסמה לא נכונים");
            return false;
          }
        },
        Is_Logged:function () {
          if((this.$cookies.isKey("User_Logged"))){
            this.$router.push('/home');
          }
        }

      },
    beforeMount() {
      this.Is_Logged();
    }

    }
</script>

<style scoped>

</style>
