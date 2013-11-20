/* represents a collection of Accumulator objects */
define(['jquery','underscore','backbone',"model/FilterModel"],
    function ($,_,Backbone,FilterModel) {
        return Backbone.Collection.extend({
            model:FilterModel,
            url:"/stm/filters",
            initialize:function(){
                _.extend(this, Backbone.Events);
            },
            getDisplayModels:function () {
                return this.map(function (claim) {
                    return claim.getDisplayModel();
                });
            }
        });
    });