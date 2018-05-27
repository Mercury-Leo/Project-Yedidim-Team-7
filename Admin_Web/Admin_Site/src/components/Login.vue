<template>
    <div class = "login">
      <h3>התחברות מנהל</h3>
      <input type = "text" placeholder="משתמש" v-model="User_name"><br>
      <input type = "password" placeholder = "סיסמה" v-model="User_pass"><br><br>

      <b-button @click = "$router.push('Home')" >התחברות</b-button>

      <p>פרטים להתחברות ניתן לקבל מעמותת ידידים</p>
    </div>
</template>

<script>

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
            this.$router.push('Control');
            return true;
          }
          else{
            alert("שם משתמש או סיסמה לא נכונים");
            return false;
          }
        }
      }
    }
</script>

<style scoped>

</style>
