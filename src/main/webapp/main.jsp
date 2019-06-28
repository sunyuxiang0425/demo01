<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/23 0023
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>主页面</title>
        <meta http-equiv="content-type" content="text/html" charset="UTF-8">
        <script type="text/javascript" src="js/jquery-1.9.1.js"></script>
        <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
        <script type="text/javascript">
            $(function () {
                $.ajax({
                    url:"/showMenu",
                    success:function (data) {
                        if (data) {
                            for (var i=0;i<5;i++ ){
                                $("ul:eq(i)").click(function () {
                                    $("ul:eq(i)").children().toggle();
                                });
                            }
                        }
                    }
                });

            });
        </script>
    </head>
    <body>
    <div style="">
        <div style="height: 15% ;float: top">
            <div style="height:120px;width: 400px;line-height: 120px; float:left;padding-left:30px;">
                <span style="font-size: 20px;font-weight:bold;">欢迎<span style="font-size: 10px">${user.username }</span>来到:</span>
                <span style=";font-size:30px; font-weight: bold;">舔狗的悲惨世界!</span>
            </div>
            <div style="height:120px;width:450px;line-height:200px;font-size:20px;float:right;">
                <tr>
                    <td><a href="#">消息</a></td>
                    <td><a href="#">问题</a></td>
                    <td><a href="#">登录</a></td>
                    <td><a href="#">注册</a></td>
                </tr>
            </div>
        </div>
        <hr/>
        <div style="height: 70%; width: 10%;float: left;">
            <div style="padding: 10px">
                菜单
                <c:forEach items="${list }" var="menu">
                    <ul id="s_ul" >${menu.name }
                        <c:forEach items="${menu.children }" var="child">
                            <li id="s_li">${child.name}</li>
                        </c:forEach>
                    </ul>
                </c:forEach>
            </div>
        </div>
        <div style="height: 70%; width:90%;float: right;">
            <div style="padding: 10px">
                主页面
            </div>
        </div>
        <div style="height: 15%;width: 100%;float:left">
            <div style="height: 100px;line-height: 100px;text-align: center; font-size:20px; padding-left: 30px">
                Copyright &copy; 2019 by sun
            </div>
        </div>
    </div>

    </body>
</html>
