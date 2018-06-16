<template>
  <div>
    <p>בבניה - לא פעיל</p>
    <b-form-textarea id="textarea1"
                     v-model="text"
                     placeholder="הכנס הודעה"
                     :rows="3"
                     :max-rows="6">
    </b-form-textarea>
    <b-table striped hover :items="items"></b-table>
    <button @click = "$router.push('Teams')">שליחת הודעה</button>
  </div>
</template>

<script>

  const items = [
    { isActive: true, age: 40, first_name: 'Dickerson', last_name: 'Macdonald' },
    { isActive: false, age: 21, first_name: 'Larsen', last_name: 'Shaw' },
    { isActive: false, age: 89, first_name: 'Geneva', last_name: 'Wilson' },
    { isActive: true, age: 38, first_name: 'Jami', last_name: 'Carney' }
  ]
    export default {
        name: "Send_Team_Message",

        data () {
          return {
            text: '',
            items: items
          }
        },

    }
</script>

<style scoped>

</style>
