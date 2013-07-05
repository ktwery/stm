/* entry for account overview */
define(["lib/jquery/jquery", "lib/backbone/backbone", "lib/underscore/underscore"],
    function ($, Backbone, _ /* libs */) {
        return Backbone.View.extend({
            initialize: function() {
                this.notification = this.options.notification;
                this.collections = this.options.collections;
            }
        });
    });