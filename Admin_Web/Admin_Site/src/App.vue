<template>
  <div id="app">

    <Top_Nav></Top_Nav>
    <router-view></router-view>

  </div>
</template>

<script>
import topnav from './components/Top_Nav'

let Top_Nav = topnav;
import Vue from 'vue'
Vue.mixin({
  methods: {
    Is_Logged: function () {
      if(!(this.$cookies.isKey("User_Logged"))){
        this.$router.push('/');
      }
    }
  },
  mounted() {
    this.Is_Logged();
  },
  beforeMount(){
    this.Is_Logged();
  }

});
export default {
  name: 'App',
  components: {Top_Nav}
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -webkit-input-placeholder: text-align right;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  background-color: #42A4B7;
}
</style>
