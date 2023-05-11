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
                { 
                    text: "email", 
                    value: "email" 
                },
                { 
                    text: "address", 
                    value: "address" 
                },
                { 
                    text: "phone", 
                    value: "phone" 
                },
                { 
                    text: "long", 
                    value: "long" 
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

