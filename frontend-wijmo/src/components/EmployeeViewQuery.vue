<template>
    <v-card outlined style="border-radius: 0; max-height:15vh; margin-top:-10px;">
        <v-card-title>
            EmployeeView
        </v-card-title>
    
        <v-card-text>
            <v-row no-gutters style="margin-top: 15px; margin-bottom:-30px;">
                <v-col style="max-width:140px;">
                    <String class="attributes-list" label="UserId" v-model="value.parameters.userId" :editMode="editMode"/>
                </v-col>
                <v-col style="max-width:140px;">
                    <String class="attributes-list" label="UserName" v-model="value.parameters.userName" :editMode="editMode"/>
                </v-col>
                <v-col style="max-width:140px;">
                    <DepartmentId offline label="Department" v-model="value.parameters.department" :editMode="editMode" @change="change"/>
                </v-col>
                <v-col>
                    <v-btn class="gs-query-search-btn"
                        @click="search"
                        flat
                        small
                    >
                        <v-icon small>mdi-magnify</v-icon>검색
                    </v-btn>
                </v-col>
            </v-row>
        </v-card-text>
    </v-card>
</template>

<script>
    export default {
        name: 'EmployeeViewQuery',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {
                apiPath: '',
                parameters: {}
            },
        }),
        created() {
            this.value.parameters.userId = '';
            this.value.parameters.userName = '';
            this.value.parameters.department = {};
        },
        watch: {
        },
        methods: {
            search() {
                this.$emit('search', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>
<style>
.attributes-list{
    margin-left: 15px;
}
</style>

