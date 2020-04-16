<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2020/4/15
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="head.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>帖子管理</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/back/style.css" rel="stylesheet">
</head>
<script>
    $(function () {
       $("a").click(function () {
           var deleteLink=$(this).attr("deleteLink");
           if(deleteLink=="true"){
               var comfirmDle=comfirmDle("是否要删除");
               if (comfirmDle){
                   return true;
               }
               return false;
           }
       }) ;
    });
</script>
<body>
<div class="top">
    <span class="	glyphicon glyphicon-list-alt">帖子管理</span></div>
<div class="listDataTableDiv">
    <table class="table table-striped table-bordered table-hover  table-condensed">
        <thead>
        <tr class="success">
            <th>ID</th>
            <th>发帖人</th>
            <th>标题</th>
            <th>内容摘要</th>
            <th>发表时间</th>
            <th>详情查看</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${topics}" var="topic">
        <tr>
            <td>${topic.id}</td>
            <td>${topic.user.userName}</td>
            <td>${topic.title}</td>
            <td>${fn:substring(topic.content, 0, 15)}...</td>
            <td><fmt:formatDate value="${topic.sendDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <td><a href="topic_detail?id=${topic.id}"><span class="glyphicon glyphicon-edit"></span></a></td>
            <td><a deleteLink="true" href="topic_delete?id=${topic.id}"><span class=" glyphicon glyphicon-trash"></span></a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%@include file="adminPage.jsp"%>
<div class="footer">
    <div class="copyright">Copyright ©2020 FriendHub v1.0 All Rights Reserved</div>
</div>
</body>
</html>
