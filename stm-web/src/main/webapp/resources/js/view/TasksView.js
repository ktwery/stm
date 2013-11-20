define(['jquery','underscore','backbone',"mustache","collection/TaskCollection","text!template/TaskTemplate.html"],
    function ($,_,Backbone,Mustache,TaskCollection,taskTemplate) {
        return Backbone.View.extend({
            $el: this.$(".tasks"),
            events: {

            },

            initialize: function () {
                this.taskCollection = new TaskCollection();
                this.listenTo(this.taskCollection,'sync', this.handleTaskUpdate, this);
            },
            fetchCollection:function(){
                this.taskCollection.fetch();
            },

            handleTaskUpdate:function(){
                this.render();
            },

            render: function () {

                var json={
                    tasks:this.taskCollection.models
                };
                console.log("tasks:", json.tasks);
                $(".tasks").html(Mustache.to_html(taskTemplate,json));
                return this;
            }
        });
    });
