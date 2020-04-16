<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2020/4/16
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@include file="head.jsp"%>
<html>
<head>
    <title>帖子详情</title>
    <meta charset="UTF-8">
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/back/style.css" rel="stylesheet">
</head>
<ol class="breadcrumb top">
    <li><a href="topic">帖子管理</a></li>
    <li class="active">帖子详情</li>
</ol>
<body>
<div class="panel panel-warning topic" style="height:1000px;">
    <div class="panel-heading">帖子题目:${topic.title}</div>
    <div class="panel-body">
        <textarea disabled="disabled" style="font-size: 16px">    ${topic.content}</textarea>
        <c:forEach items="${topic.pts}" var="pic">
        <div class="topicimg" ><img src="image/topic/${pic}"/></div>
        </c:forEach>
    </div>
</div>
<div class="footer">
    <div class="copyright">Copyright ©2020 FriendHub v1.0 All Rights Reserved</div>
</div>
</body>
</html>
