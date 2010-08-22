<html>
<head>
    <title>Controllers</title>
    <meta name="layout" content="main" />
</head>
<body>
    <div class="body">
        <h1>Controllers</h1>
        <g:each var="controller" in="${map}">
            <div>
                <h3>${controller.key}</h3>
                <g:each var="action" in="${controller.value}">
                    <li><g:link controller="${controller.key}" action="${action}">${action}</g:link></li>
                </g:each>
            </div>
        </g:each>
    </div>
<script type="text/javascript" charset="utf-8">

</script>
</body>
</html>