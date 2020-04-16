<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2020/4/9
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>最近消息</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/fore/style.css" rel="stylesheet">
</head>
<body>
<%@include file="head.jsp"%>
<!--我的消息-->
<span class="glyphicon glyphicon-asterisk mynews">我的消息</span>
<div style="margin-left:5%; margin-top:10px;width:90%; margin-bottom: 5px; border:1px solid #E0E0E0;"></div>
<div class="news">
    <a href=""><img src="../image/lavazza06.jpg" class="touxiang img-circle";"></a>
    <div class="basicinformation">
        <span class="glyphicon glyphicon-user named">刘亦菲</span>
        <span class="gender">女</span>
        <span class="age">16岁</span>
        <span calss="location1" style="font-size: 15px;">陕西 西安</span>
    </div>
    <div class="latestnews">
        <span class="glyphicon glyphicon-bell latest">最近消息：</span>
        <span class="newscontent">你好呀！最近在干嘛呢，怎么都不找我聊天，我想死你了！</span>
        <a href="" class="glyphicon glyphicon-comment message">1</a>
    </div>
</div>
<div class="news">
    <a href=""><img src="../image/lavazza03.jpg"" class="touxiang img-circle";"></a>
    <div class="basicinformation">
        <span class="glyphicon glyphicon-user named">范冰冰</span>
        <span class="gender">女</span>
        <span class="age">16岁</span>
        <span calss="location1" style="font-size: 15px;">陕西 西安</span>
    </div>
    <div class="latestnews">
        <span class="glyphicon glyphicon-bell latest">最近消息：</span>
        <span class="newscontent">你好呀一起玩</span>
        <a href="" class="glyphicon glyphicon-comment message">5</a>
    </div>

</div>
<div class="news">
    <a href=""><img src="../image/lavazza06.jpg" class="touxiang img-circle";"></a>
    <div class="basicinformation">
        <span class="glyphicon glyphicon-user named">刘亦菲</span>
        <span class="gender">女</span>
        <span class="age">16岁</span>
        <span calss="location1" style="font-size: 15px;">陕西 西安</span>
    </div>
    <div class="latestnews">
        <span class="glyphicon glyphicon-bell latest">最近消息：</span>
        <span class="newscontent">你好呀！最近在干嘛呢，怎么都不找我聊天，我想死你了！</span>
        <a href="" class="glyphicon glyphicon-comment message">2</a>
    </div>
</div>

<div class="news">
    <a href=""><img src="../image/lavazza06.jpg" class="touxiang img-circle";"></a>
    <div class="basicinformation">
        <span class="glyphicon glyphicon-user named">刘亦菲</span>
        <span class="gender">女</span>
        <span class="age">16岁</span>
        <span calss="location1" style="font-size: 15px;">陕西 西安</span>
    </div>
    <div class="latestnews">
        <span class="glyphicon glyphicon-bell latest">最近消息：</span>
        <span class="newscontent">你好呀！最近在干嘛呢，怎么都不找我聊天，我想死你了！</span>
        <a href="" class="glyphicon glyphicon-comment message">2</a>
    </div>
</div>
</body>
<div style="clear: both"></div>
<%@include file="footer.jsp"%>
</html>
