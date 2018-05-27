<template>
  <div id="app">
    <tdd></tdd>
    <Top_Nav></Top_Nav>

    <router-view></router-view>

  </div>
</template>

<script>
import topnav from './components/Top_Nav'
import teamdata from './components/Team_Table'
var tdd = teamdata;
var Top_Nav = topnav;
export default {
  name: 'App',
  components: {Top_Nav,
                tdd
              }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  background-color: #42A4B7;
}
</style>
