<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Entities JSON Converter</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
        }
        pre {
            background-color: #f4f4f4;
            padding: 15px;
            border-radius: 5px;
            overflow-x: auto;
        }
        .navigation {
            margin-top: 20px;
            padding: 10px;
            background-color: #f0f0f0;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<h1>Entities JSON Converter</h1>

<h2>Entities from Database</h2>
<pre id="jsonDisplay">
<%= request.getAttribute("jsonEntities") != null
        ? request.getAttribute("jsonEntities")
        : "No entities found" %>
    </pre>

<div class="navigation">
    <h3>Navigation</h3>
    <ul>
        <li><a href="entities">Refresh Entities</a></li>
        <li><a href="websocket-client.html">Go to WebSocket Client</a></li>
    </ul>
</div>

</body>
</html>