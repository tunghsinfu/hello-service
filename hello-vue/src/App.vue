<script setup lang="ts">
import { ref } from 'vue'
import axios from 'axios'

const apiOneUrl = import.meta.env.VITE_API_ONE
const apiTwoUrl = import.meta.env.VITE_API_TWO

const item1 = ref({}) as any
const item2 = ref({}) as any

axios.get(apiOneUrl+'/itme/1')
  .then(function (response) {
    console.log(response);
    item1.value = (response.data)
  })
  .catch(function (error) {
    console.log(error);
  });



axios.get(apiTwoUrl+'/itme/1')
  .then(function (response) {
    item2.value = (response.data)
  })
  .catch(function (error) {
    console.log(error);
  });

</script>

<template>
  <header>
    <img alt="Vue logo" class="logo" src="@/assets/logo.svg" width="125" height="125" />
  </header>

  <dev v-text="'item1:' + item1.ID" /><br>
  <dev v-text="'item2:' + item2.ID" />

</template>
