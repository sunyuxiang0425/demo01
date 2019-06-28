<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>单身狗的愤怒</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
    <body>
    <h3>爱登不登,不登滚蛋</h3>
    <hr/>
    <form action="login" method="post">
        昵称:<input type="text" name="username"/><br/>
        密码:<input type="password" name="password"/><br/>
        <input type="submit" value="登陆"/>
    </form>

    </body>
</html>
