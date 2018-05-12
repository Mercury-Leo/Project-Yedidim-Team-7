<template>
    <div class = "login">
      <h3>התחברות מנהל</h3>
      <input type = "text" placeholder="User" v-model="User_name"><br>
      <input type = "password" placeholder = "Password" v-model="User_pass"><br>
      <button @click = "Log_User"><router-link to="Control"></router-link>התחברות</button>
      <p>פרטים להתחברות ניתן לקבל מעמותת ידידים.</p>
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
            console.log("did it");
            this.$router.push('Control');
          }
          else{
            alert("Wrong password or Username.");
          }
        }
      }
    }
</script>

<style scoped>

</style>
