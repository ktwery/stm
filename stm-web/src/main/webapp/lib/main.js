/* main import script for all libraries
 * maintains correct importing order
 */
define([
    "order!lib/shim/console",
    "order!lib/json2/json2-min",
    "order!lib/jquery/jquery-1.7.2.min",
    "order!lib/jquery/jquery.cookie",
    "order!lib/jquery/jquery.qtip.min",
    "order!lib/jquery/jquery-ui-1.8.16.custom.min",
    "order!lib/jquery/jquery.idle-timer-0.9.100511",
    "order!lib/jquery/jqplot/jquery.jqplot.min",
    "order!lib/jquery/jqplot/jqplot.pieRenderer.min",
    "order!lib/jquery/jqplot/jqplot.donutRenderer.min",
    "order!lib/jquery/bcbsm/bcbsm-accums-chart",
    "order!lib/jquery/bcbsm/bcbsm-annual-max-chart",
    "order!lib/jquery/jquery.async",
    "order!lib/datatables/jquery.dataTables.min",
    "order!lib/datatables/paging",
    "order!lib/datatables/customColumnSort",
    "order!lib/underscore/underscore-min",
    "order!lib/backbone/backbone-min",
    "order!lib/mustache/mustache.main",
    "order!lib/bootstrap/bootstrap.min",
    "order!lib/datejs/date.min",
    "order!lib/tinymce/jquery.tinymce",
    "order!lib/jquery/jquery.uniform.min",
    "order!lib/jquery/jqplot/printFix",
    "order!lib/jquery/autoellipsis/jquery.autoellipsis-1.0.10.min"
], function() {
    return {};
});