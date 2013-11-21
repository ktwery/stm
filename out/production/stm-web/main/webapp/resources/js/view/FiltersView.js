define(['jquery','underscore','backbone',"mustache","collection/FilterCollection","text!template/FilterTemplate.html"],
    function ($,_,Backbone,Mustache,FilterCollection,filterTemplate) {
        return Backbone.View.extend({

            events: {
                "click .addFilter":"addFilter"
            },

            initialize: function () {
                this.$el= $(".filters");
                this.filterCollection = new FilterCollection();
                this.listenTo(this.filterCollection,'sync', this.handleFilterUpdate, this);
                this.setUpColorSelector();
            },
            setUpColorSelector:function(){
                $(".basic").spectrum({
                    color: "#f00"
                });
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
                //TODO use $el
                $(".filters").html(Mustache.to_html(filterTemplate,json));
                this.setUpColorSelector();
                return this;
            },
            addFilter:function(){
                console.log('launch the ajax');
                $.ajax({
                    type:"PUT",
                    url:"/stm/addFilter",
                    contentType:"application/json",
                    success: function(){
                        this.filterCollection.fetch();
                        this.filterCollection.sync();
                    },
                    error: $.noop
                });

            }
        });
});
