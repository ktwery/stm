define(['jquery', 'underscore','backbone'],
    function ($,_, Backbone) {
        return Backbone.View.extend({
            filtersElement: '$(.filters)',
            events: {

            },
            initialize: function () {
                _.bindAll(this, 'render');
            },
            render:function(){
                console.log("got here");
            }
    });
});
