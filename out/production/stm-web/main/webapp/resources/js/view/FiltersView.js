define(['jquery','underscore','backbone',"mustache","collection/FilterCollection","text!template/FilterTemplate.html"],
    function ($,_,Backbone,Mustache,FilterCollection,filterTemplate) {
        return Backbone.View.extend({
            $el: this.$(".filters"),
            events: {

            },

            initialize: function () {
                this.filterCollection = new FilterCollection();
                this.listenTo(this.filterCollection,'sync', this.handleFilterUpdate, this);
            },
            fetchCollection:function(){
                this.filterCollection.fetch();
            },

            handleFilterUpdate:function(){
                this.render();
            },

            render: function () {

                var json={
                    filters:this.filterCollection.models
                };
                console.log("filters:", json.filters);
                $(".filters").html(Mustache.to_html(filterTemplate,json));
                return this;
            }
        });
});
