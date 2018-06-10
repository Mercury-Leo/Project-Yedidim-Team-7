<template>
  <div>

    <table>

      <thead>
      <tr>
        <th>
          שם קבוצה
        </th>
        <th>
          קוד קבוצה
        </th>
      </tr>
      </thead>
      <tbody>
      <tr v-for = "team in test">
        <td>
          {{team.teamName}}
        </td>
        <td>
          {{team.teamCode}}
        </td>
      </tr>
      </tbody>
    </table>

  </div>
</template>

<script>

  import firebase from './FireBase'

  let team  = firebase.ref('teams');

  var teams = [];

    export default {
        name: "Team_Table",
        data () {
        return {

        }
      },
      firebase: {
          test: team
      },


    }
</script>

<style scoped>

</style>
