<template>
  <div>
    <p>בחר האם לערוך אזור קיים או לייצר אזור חדש</p>
    <select v-model="Mission_Area.Picked_area" >
      <option>אזור חדש</option>
      <option v-for = "quest in MissionRef">{{quest['.key']}}</option>
    </select>

    <table v-if = "!Mission_Area.Picked_area.localeCompare('אזור חדש') && !Reset_New_Mission()" align="center">
      <tr >
        <td>
          <input type = "text" v-model="Mission.Mission_Name" >
        </td>
        <td>
          <label :for = "Mission.Mission_Name" >שם הניווט</label>
        </td>
      </tr>
      <tr>
        <td>
          <input type = "number" v-model="Mission.num">
        </td>
        <td>
          <label :for = "Mission.num">מספר משימות</label>
        </td>
      </tr>
      <tr>
        <td>
          <input type = "number" v-model="Mission.start.lat">
          <input type = "number" v-model="Mission.start.lng">
        </td>
        <td>
          <label :for = "Mission.start.lat" >תחילת קו אורך</label>
          <label :for = "Mission.start.lng" >תחילת קו רוחב</label>
        </td>
      </tr>
      <tr>
        <td>
          <input type = "text" v-model="Mission.last.lat">
          <input type = "text" v-model="Mission.last.lng">
        </td>
        <td>
          <label :for = "Mission.last.lat" >סוף קו אורך</label>
          <label :for = "Mission.last.lng" >סוף קו רוחב</label>
        </td>
      </tr>
  </table>

    <table v-if = "Mission_Area.Picked_area.localeCompare('אזור חדש') && !Get_Mission_Data()" align="center">
      <tr >
        <td>
          <input type = "text" v-model="Mission.Mission_Name" >
        </td>
        <td>
          <label :for = "Mission.Mission_Name" >שם הניווט</label>
        </td>
      </tr>
      <tr>
        <td>
          <input type = "number" v-model="Mission.num">
        </td>
        <td>
          <label :for = "Mission.num">מספר משימות</label>
        </td>
      </tr>

    </table>

    <b-btn v-b-toggle.collapse1 variant="primary">משימות</b-btn>
    <b-collapse id="collapse1" class="mt-2">
      <b-card>
        <p>יצירת משימה</p>
        <select>
          <option>1</option>
          <option>2</option>
          <option>3</option>
          <option>4</option>
        </select>
        <b-btn v-b-toggle.collapse1_inner size="sm">צפייה במשימות</b-btn>
        <b-collapse id=collapse1_inner class="mt-2">
          <p>לצפייה במשימות</p>
        </b-collapse>
      </b-card>
    </b-collapse>

  </div>
</template>

<script>

  import mdb from '../MissionFireBase'

  let mission_list = [];

    export default {
        name: "Missions",
      firebase: {
          MissionRef: mdb.ref('/')
      },
      data(){
          return {
            Mission_Area:{
              Picked_area: 'אזור חדש'
            },
            Mission: {
              Mission_Name: 'שם ניווט',
              center: {
                lat: "0",
                lng: "0"
              },
              last: {
                lat: "0",
                lng: "0"
              },
              mission: {
                1: {
                  history: "holder",
                  location: {
                    lat: "0",
                    lng: "0"
                  },
                  option: {
                    1: "hold",
                    2: "hold",
                    3: "hold",
                    4: "hold"
                  },
                  question: "quest",
                  rightAnwers: 1,
                  typeOfQuestion: 1
                },
                2: {
                  history: "holder",
                  location: {
                    lat: "0",
                    lng: "0"
                  },
                  question: "quest",
                  typeOfQuestion: 2
                },
                3: {
                  history: "holder",
                  location: {
                    lat: "0",
                    lng: "0"
                  },
                  question: "quest",
                  typeOfQuestion: 3
                },
                4: {
                  history: "holder",
                  location: {
                    lat: "0",
                    lng: "0"
                  },
                  question: "quest",
                  typeOfQuestion: 4
                }
              },
              num: 0,
              start: {
                lat: "0",
                lng: "0"
              }
            },
            Get_Mission_Data: function(){
              let area_name = this.$data.Mission_Area.Picked_area;
              let Mission_num = 0;
              let mission_start_lng = "0";
              let mission_start_lat = "0";
              let mission_end_lng = "0";
              let mission_end_lat = "0";
              let mission_ref =mdb.ref(area_name);
              this.$data.Mission.Mission_Name = this.$data.Mission_Area.Picked_area;
              mission_ref.child('num').once("value", function(snapshot){
               Mission_num = snapshot.val();
              });
              mission_ref.child('child').once("value", function(snapshot){
                snapshot.forEach(function(child){
                  if(child.key.localeCompare('lat'))
                   mission_start_lat = child.val();
                  else
                    mission_end_lng = child.val();
                })
              });
              this.$data.Mission.start.lng = mission_start_lng;
              this.$data.Mission.start.lat = mission_start_lat;
              this.$data.Mission.num = Mission_num;
            },
            Reset_New_Mission: function () {
              this.$data.Mission_Area.Picked_area = 'אזור חדש';
              this.$data.Mission.Mission_Name = 'אזור חדש';
              this.$data.Mission.start.lat = "0";
              this.$data.Mission.start.lng = "0";
              this.$data.Mission.num = 0;
              this.$data.Mission.last.lat = "0";
              this.$data.Mission.last.lng = "0";
            }

        }
      }
    }
</script>

<style scoped>

</style>
