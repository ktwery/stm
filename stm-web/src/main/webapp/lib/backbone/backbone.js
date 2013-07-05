define(["shared/BackboneSyncOverride", "lib/main"], function(BackboneSyncOverride){
    var _ = window._;
    var Backbone = window.Backbone;

    var dispatcher = _.extend({}, Backbone.Events, {
        cid: "dispatcher"
    });

    _.each([Backbone.Collection.prototype, Backbone.Model.prototype, Backbone.View.prototype, Backbone.Router.prototype], function(proto) {
        return _.extend(proto, {
            global_dispatcher: dispatcher
        });
    });

    BackboneSyncOverride.install(Backbone);

    return Backbone;
});