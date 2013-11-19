<html>
<head>
    <title>Task Management</title>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    <!-- Bootstrap -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="resources/css/colorpicker.css" rel="stylesheet" media="screen">
</head>

<body>
<div class="filters page-header">
    <div class="input-append color" data-color="rgb(255, 146, 180)" data-color-format="rgb">
        <span class="add-on"><i style="background-color: rgb(255, 146, 180)"></i></span>
    </div>
    <label class="checkbox">
        <input type="checkbox" value="option1" id="inlineCheckbox1"> Filter 1
    </label>
    <button type="button" data-loading-text="Loading..." class="btn btn-primary">
        Add a New Status
    </button>
</div>
<div class="tasks">
    <button type="button" data-loading-text="Loading..." class="btn btn-primary">
        Add a New Task
    </button>

    <fieldset class=""style="border-style: solid;">
        <div class=task>
            <legend class="task">Task 1</legend>

            <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                    Action
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <!-- dropdown menu links -->
                </ul>
            </div>
            <div class="taskNotes">
                <textarea></textarea>
            </div>

        </div>
    </fieldset>
</div>
<script data-main="resources/js/requireConfig" src="resources/js/lib/require.js"></script>
</body>
</html>