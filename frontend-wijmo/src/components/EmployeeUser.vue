<template>

</template>

<script>
    


    export default {
        name: 'EmployeeUser',
        components:{
        },
        props: {
            value: [Object, String, Number, Boolean, Array],
            editMode: Boolean,
            isNew: Boolean,
            offline: Boolean,
            inList: Boolean,
            label: String,
        },
        data: () => ({
        
        }),
        async created() {
            if(!('userId' in this.value)) {
                this.value.userId = '';
            }
            if(!('password' in this.value)) {
                this.value.password = '';
            }
            if(!('userName' in this.value)) {
                this.value.userName = '';
            }
            if(!('email' in this.value)) {
                this.value.email = '';
            }
            if(!('address' in this.value)) {
                this.value.address = '';
            }
            if(!('phone' in this.value)) {
                this.value.phone = '';
            }
            if(!('long' in this.value)) {
                this.value.long = 0;
            }
        },
        watch: {
            
        },

        methods: {
            edit() {
                this.editMode = true;
            },
            
        }
    }
</script>

