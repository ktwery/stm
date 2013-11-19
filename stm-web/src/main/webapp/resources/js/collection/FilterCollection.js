/* represents a collection of Accumulator objects */
define(["lib/jquery/jquery",
    "lib/underscore-amd/underscore",
    "lib/backbone-amd/backbone-min",
    "model/FilterModel"],
    function ($, _, Backbone, FilterModel) {
        return Backbone.Collection.extend({
            model:FilterModel,
            url:"/filters",
            getDisplayModels:function () {
                return this.map(function (filter) {
                    return filter.getDisplayModel();
                });
            }
        });
    });