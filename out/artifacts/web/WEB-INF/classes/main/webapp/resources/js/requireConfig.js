require.config({
    paths:{
        jquery: 'lib/jquery/jquery',
        underscore: 'lib/underscore/underscore',
        backbone: 'lib/backbone/backbone',
        template:'../html/template', // location of templates
        handlebars: 'lib/handlebars/handlebars',
        mustache: 'lib/mustache/mustache'
    },
    shim: {
        handlebars: {
            exports: 'Handlebars'
        },
        mustache:{
            exports: 'Mustache'
        },
        'underscore': {
            exports: '_'
        },
        'backbone': {
            //These script dependencies should be loaded before loading
            //backbone.js
            deps: ['underscore', 'jquery'],
            //Once loaded, use the global 'Backbone' as the
            //module value.
            exports: 'Backbone'
        }

    }

});
define(["model/FilterModel","collection/FilterCollection","view/FiltersView","view/TasksView"],
    function (FilterModel,FilterCollection,FilterView,TasksView) {
        console.log("gotHere%%%");

        var filterView = new FilterView();
        filterView.fetchCollection();
        var taskView = new TasksView();
        taskView.fetchCollection();
    });