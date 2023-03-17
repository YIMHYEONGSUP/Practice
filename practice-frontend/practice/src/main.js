import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from 'axios'

const app = createApp(App);
// [store / 저장소]
app.config.globalProperties.$store = store; 
// [axios / http 통신]
app.config.globalProperties.$axios = axios; 

app.use(router)
app.mount('#app')
