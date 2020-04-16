<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2020/4/9
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>管理登录</title>
    <link rel="stylesheet" href="css/back/xadmin.css">
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
</head>
<script>
    $(function(){
  <c:if test="${!empty msg}">
  $("span.errorMessage").html("${msg}");
   </c:if>
        $("form.layui-form").submit(function(){
            if(0==$("#name").val().length||0==$("#password").val().length){
                $("span.errorMessage").html("请输入账号密码");
                $("span.errorMessage").show();
                return false;
            }
            return true;
        });

        $("form.layui-form input").keyup(function(){
            $("span.errorMessage").hide();
        });
    })
</script>
<body class="login-bg">
<div class="login">
    <div class="message">FriendHub管理登录</div>
    <div id="darkbannerwrap"></div>
    <form method="post" class="layui-form" action="back_login" >
        <input name="adminName" placeholder="用户名" id="name"  type="text" lay-verify="required" class="layui-input" >
        <hr class="hr15">
        <input name="password"  id="password" placeholder="密码"  type="password" class="layui-input">
        <hr class="hr15">
        <input value="登录"  style="width:100%;" type="submit">
        <hr class="hr20" >
        <div style="text-align: center;color:red; font-size: 18px;"><span class="errorMessage"></span></div>
    </form>
</div>
</body>
</html>
