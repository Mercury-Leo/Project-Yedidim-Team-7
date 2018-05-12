// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import VueRouter from 'vue-router'
import VueFire from 'vuefire'
import { routes } from './routes'


Vue.use(VueFire);

Vue.use(VueRouter);

const router = new VueRouter({
  routes,
  mode: 'history'
});

Vue.config.productionTip = false;

new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
});
