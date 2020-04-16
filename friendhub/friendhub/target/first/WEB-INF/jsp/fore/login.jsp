
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>登录</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/fore/style.css" rel="stylesheet">
</head>
<script>
    $(function(){
//      <c:if test="${!empty msg}">
//      $("span.errorMessage").html("${msg}");
//      $("span.errorMessage").show();
//      </c:if>

        $("form.loginForm").submit(function(){
            if(0==$("#name").val().length||0==$("#password").val().length){
                $("span.errorMessage").html("请输入账号密码");
                $("span.errorMessage").show();
                return false;
            }
            return true;
        });

        $("form.loginForm input").keyup(function(){
            $("span.errorMessage").hide();
        });
    })
</script>
<body>
<div class="all">
    <div class="content">
        <span><font size="20px" color="white">FriendHub</font></span><br>
        <span><font size="5px" color="">收获你的精彩</font></span>
    </div>
    <div class="login">
        <div class="logintop">
            <span class="logintop">会员登录</span>
        </div>
        <form method="post" class="loginForm">
            <div class="count">
                <span class="glyphicon glyphicon-user username"></span>
                <input type="text" class="color" id="name" name="username" placeholder="用户名/手机/邮箱" size="30px"/>
            </div>
            <div class="count">
                <span class="glyphicon glyphicon-lock"></span>
                <input type="text" class="color" id="password" name="password"  placeholder="密码" size="30px"/>
            </div>
            <input type="submit"  class="submit" value="登录"/><br>
        </form>
        <span class="errorMessage" ></span>
        <div class="care">
            <a href="#nowhere">注册账号</a>
            <span>|</span>
            <a href="#nowhere">忘记密码</a>
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
