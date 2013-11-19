define(["lib/jquery/jquery",
    "lib/underscore-amd/underscore",
    "lib/backbone-amd/backbone-min",
    "view/FiltersView"],
    function ($, _, Backbone, FiltersView) {
        var filterView = new FiltersView();
        filterView.render();
    }
);