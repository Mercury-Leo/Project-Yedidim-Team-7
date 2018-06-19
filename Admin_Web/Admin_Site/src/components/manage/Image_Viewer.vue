<template>
  <div id="app">
    <!-- directive -->
    <div class="images" v-viewer>
      <img src="1.jpg">
      <img src="2.jpg">
      ...
    </div>
    <!-- component -->
    <viewer :images="images">
      <img v-for="src in images" :src="src" :key="src">
    </viewer>
  </div>
</template>

<script>

  import 'viewerjs/dist/viewer.css'
  import Viewer from 'v-viewer'
  import Vue from 'vue'
  Vue.use(Viewer)
    export default {
        name: "Image_Viewer",
      data(){
          return {
            images: ['1.jpg', '2.jpg']
          }
      }
    }
</script>

<style scoped>

</style>
