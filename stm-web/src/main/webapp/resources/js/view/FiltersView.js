define(["lib/jquery/jquery",
    "lib/underscore-amd/underscore",
    "lib/backbone-amd/backbone-min",
    "text!/stm/resources/html/template/FilterTemplate.html",
    "collection/FilterCollection"],
    function ($, _, Backbone, filterTemplate,FilterCollection) {
        return Backbone.View.extend({
            $el: this.$(".filters"),
            events: {

            },
            initialize: function () {
                console.log("GOT HERE***");
                _.bindAll(this, 'render');
                var proxy = $.proxy(this.render, this);
                FilterCollection.bind("reset", proxy);
                FilterCollection.fetch({
                    'contentType':'application/json'
                });
            },

            render: function (opts) {
                console.log("***GOT HERE***");
                var displayModels = FilterCollection.getDisplayModels();

                var json = {
                    claims: displayModels
                };

                $(this.el).html(Mustache.to_html(filterTemplate, json));
                return this;

            }
        });
    })
;
