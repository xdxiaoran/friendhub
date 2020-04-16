<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2020/4/9
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>注册</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/fore/style.css" rel="stylesheet">
</head>
<body>
<div class="register">
    <div class="registor">
        <div class="tital">
            FriendHub在线注册
        </div>
        <div class="data">
            <form method="post" class="loginForm">
                <div class="reg">
                    <span class="glyphicon glyphicon-user username"></span>
                    <input type="text" class="color" id="name" name="username" placeholder="设置用户名" size="30px"/>
                </div>
                <div class="reg">
                    <span class="glyphicon glyphicon-lock"></span>
                    <input type="text" class="color" id="password" name="password"  placeholder="设置密码" size="30px"/>
                </div>
                <div class="reg">
                    <span class="glyphicon glyphicon-pencil"></span>
                    <span><font size="4px">男</font></span>
                    <input type="radio" name="gender" value="man" >
                    <span><font size="4px">女</font></span>
                    <input type="radio" name="gender" value="woman" >
                </div>
                <div class="reg">
                    <span class="glyphicon glyphicon-calendar"></span>
                    <input type="text" class="color" id="age" name="age"  placeholder="设置你的年龄" size="30px"/>
                </div>
                <input type="submit"  class="submit1" value="注册"/><br>
            </form>
        </div>
    </div>
    <div class="something">
        <a href="#nowhere">反馈建议</a>
        <span>|</span>
        <a href="#nowhere">客服人员</a>
        <span>|</span>
        <a href="#nowhere">注册账号</a>
        <span>|</span>
        <a href="#nowhere">侵权投诉</a>
        <span>|</span>
        <a href="#nowhere">最近活动</a>
        <span>|</span>
        <a href="#nowhere">官方微博</a><br>
        <a id="centrue" href="#nowehre">Copyright © 1999 - 2020 FriendHub.All Rights Reserved.</a>
    </div>
</div>
</body>
</html>
