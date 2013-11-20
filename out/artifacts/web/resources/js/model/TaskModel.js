define(['jquery','underscore','backbone'],
    function ($,_,Backbone) {
        return Backbone.Model.extend({
            initialize:function(){

            },
            getDisplayModel:function () {
                return $.extend(true, {}, this.toJSON());
            }
        });
    });
