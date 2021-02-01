<html>

<head>
    <title>Login page</title>
</head>
<body>
    <h1>Login</h1>
    ${SPRING_SECURITY_LAST_EXCEPTION.message}
    <form action="login" method="post">
        <input type="text"/><br>
        <input type="password"/><br>
        <input type="submit" name="submit" value="submit"/>
    </form>
</body>
</html>