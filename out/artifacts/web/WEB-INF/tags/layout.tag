<%@attribute name="title" fragment="true" %>
<%@attribute name="links" fragment="true" %>
<%@attribute name="style" fragment="true" %>
<%@attribute name="script" fragment="true" %>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<!--[if HTML5]><![endif]-->
<!doctype html>
<!--[if lt IE 7]><html class="no-js lt-ie9 lt-ie8 lt-ie7"><![endif]-->
<!--[if IE 7]><html class="no-js lt-ie9 lt-ie8"><![endif]-->
<!--[if IE 8]><html class="no-js lt-ie9"><![endif]-->
<!--[if gt IE 8]><!--><html class="no-js"><!--<![endif]-->
<head>
    <meta charset="utf-8">

    <title><jsp:invoke fragment="title" /></title>

    <jsp:invoke fragment="style"/>

</head>
</html>
