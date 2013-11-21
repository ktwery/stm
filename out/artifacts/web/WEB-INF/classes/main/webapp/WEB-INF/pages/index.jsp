<html>
<head>
    <title>Task Management</title>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    <!-- Bootstrap -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="resources/css/spectrum.css" rel="stylesheet" media="screen">
    <link href="resources/less/style.less" rel="stylesheet" type="text/css">
</head>

<body>
<div class="filters page-header">
    <input type='text' class="basic" />
    <div class="btn" data-toggle="button"> Filter1</div>
    <button type="button" data-loading-text="Loading..." class="btn btn-primary">
        Add a New Status
    </button>
</div>
<div class="tasks">
    <button type="button" data-loading-text="Loading..." class="btn btn-primary">
        Add a New Task
    </button>

    <fieldset class="tasks"style="border-style: solid;">
        <legend class="task">Task 1

        <div class="btn-group">
            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                Action
                <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <!-- dropdown menu links -->
            </ul>
        </div>
        <div class="taskNotes inline">
            <textarea></textarea>
        </div>
        </legend>
    </fieldset>
</div>
<script data-main="resources/js/requireConfig" src="resources/js/lib/require/require.js"></script>
</body>
</html>