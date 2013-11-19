/* represents an Accumulator object */
define(["lib/jquery/jquery",
    "lib/underscore-amd/underscore",
    "lib/backbone-amd/backbone-min"],
    function ($, _, Backbone) {
        return Backbone.Model.extend({
            urlRoot:"/filters",
            getDisplayModel:function () {
                return $.extend(true, {}, this.toJSON());
            }
        });
    });
