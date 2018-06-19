<template>
  <div>

    <b-button @click = "erase_start">מחיקת ניווט</b-button>
    <b-button @click = "delete_teams">מחיקת קבוצות</b-button>
  </div>
</template>

<script>

  import db from '../FireBase'


    export default {
        name: "End_Navgiation",
      firebase: {
          TeamRef: db.ref('Teams'),
          StartRef: db.ref('start')
      },
      data(){
          return{

          }
      },
      methods: {
          end_nav: function () {

          },
        delete_teams: function () {
            if(confirm('האם למחוק את כול הקבוצות?')){
              this.$firebaseRefs.TeamRef.remove();
              this.$cookies.remove("Teams_Made");
            }

        },
        erase_start: function () {
            let start_obj = {
              admin: {
                name: '#Do_not_Use_this_name',
                num: 0
              },
              city: 'israel',
              difficult: 0,
              finish: {
                time: "000000"
              },
              numOfTeam: '0',
              startGame: 'false'

            };
          if(confirm('לאפס את פרטי הניווט?')){
            this.$firebaseRefs.StartRef.set(start_obj);
          }
        }
      }
    }
</script>

<style scoped>

</style>
