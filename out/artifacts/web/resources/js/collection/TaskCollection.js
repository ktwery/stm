define(['jquery','underscore','backbone',"model/TaskModel"],
    function ($,_,Backbone,TaskModel) {
        return Backbone.Collection.extend({
            model:TaskModel,
            url:"/stm/tasks",
            initialize:function(){
                _.extend(this, Backbone.Events);
            },
            getDisplayModels:function () {
                return this.map(function (task) {
                    return task.getDisplayModel();
                });
            }
        });
    });