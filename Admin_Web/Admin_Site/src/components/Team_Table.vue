<template>
  <div>
    <b-table striped hover :items="items"></b-table>
  </div>
</template>

<script>

  import firebase from './FireBase'

  let team  = firebase.ref('teams');


  const items = [
    { Team_Code: 55,Team_Name: "a" },
    { Team_Code: 45, Team_Name: "b" },
    { Team_Code: 35, Team_Name: "c"}
  ]

    export default {
        name: "Team_Table"
    }
</script>

<style scoped>

</style>
