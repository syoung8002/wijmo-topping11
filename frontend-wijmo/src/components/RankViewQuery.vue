<template>

    <v-card outlined style="border-radius: 0;">
        <v-card-title>
            RankView
        </v-card-title>
    
        <v-card-text>
            <v-row style="margin-top: 15px;">
                <String class="attributes-list" label="Name" v-model="value.parameters.name" :editMode="editMode"/>
            </v-row>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                @click="search"
                flat
                style="color:white; background-color: #9A7BCF; border-radius: 0;"
            >
                <v-icon>mdi-magnify</v-icon>Search
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'RankViewQuery',
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
            this.value.parameters.name = '';
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

