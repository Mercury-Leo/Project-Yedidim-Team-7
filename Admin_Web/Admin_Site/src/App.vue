<template>
  <div id="app">

    <Top_Nav></Top_Nav>
    <!--
    This site was created by Mercury Finnegan.
    Final production for release 20 of June 2018.
    All rights of this code belong to Mercury Finnegan.
    -->
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
    },
    Load_page: function() {
      alert("hey");
      this.$router.push(this.$route.fullPath);
    }
  },

  beforeMount(){

    this.Is_Logged();
    //this.Load_page();

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
  background-color:#6fd1d6;
}
</style>
