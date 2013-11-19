require.config({
    baseUrl:'resources/js',
    shim: {
        'backbone': {
            deps: ['underscore', 'jquery'],
            exports: 'Backbone'
        },
        'underscore': {
            exports: '_'
        }
    }
});
console.log("sdkljfslkfgdhlksfglsd");
require(["requireConfig",
    "lib/jquery/jquery",
    "lib/underscore-amd/underscore",
    "lib/backbone-amd/backbone-min",
    "view/FiltersView"],
    function (requireConfig, $, _, Backbone, FiltersView) {
        $(document).ready(function () {
            console.log("I don't want to play nice");
        });
        console.log("gotHere%%%");
        var filterView = new FiltersView();
        console.log("RENDERED VIEW!!!");
        filterView.render();
    });
console.log("omg why didnt it work");