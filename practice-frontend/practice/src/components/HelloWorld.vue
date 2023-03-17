<template>
  <div class="hello">

    <button @click="testMessage()">테스트</button>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },

  methods: {
    testMessage(){

      axios.get("/hello")
      .then(res => {
        console.log(res);
      })
      .catch(err => {
        console.log(err);
      })

     this.$axios.post('/api/test/message')
     .then(res => {
      console.log(res);
      alert("성공");
     })
     .catch(err => {
      console.log(err);
     })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
