define(["requireConfig",
    "lib/jquery/jquery",
    "lib/underscore/underscore",
    "lib/backbone/backbone-min",
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