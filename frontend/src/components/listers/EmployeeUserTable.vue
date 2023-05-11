<template>

    <v-data-table
            :headers="headers"
            :items="employeeUser"
            :items-per-page="5"
            class="elevation-1"
    ></v-data-table>

</template>

<script>

    export default {
        name: 'EmployeeUserList',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { 
                    text: "id", 
                    value: "id" 
                },
                { 
                    text: "userId", 
                    value: "userId" 
                },
                { 
                    text: "password", 
                    value: "password" 
                },
                { 
                    text: "userName", 
                    value: "userName" 
                },
            ],
            employeeUser : [],
        }),
        async created() {
            if(!this.value) this.value = [];
        },
        methods: {
        }
    }
</script>

