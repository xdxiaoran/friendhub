<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2020/4/15
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="head.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户管理</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/back/style.css" rel="stylesheet">
</head>
<script>
    $(function() {
        $("a").click(function () {
            var deleteLink = $(this).attr("deleteLink");
            if ("true" == deleteLink) {
                var confirmDelete = confirm("确认要删除");
                if (confirmDelete)
                    return true;
                return false;
            }
        });
    });
</script>
<body>
<div class="top">
    <span class="glyphicon glyphicon-user">用户管理</span></div>
<div class="listDataTableDiv">
    <table class="table table-striped table-bordered table-hover  table-condensed">
        <thead>
        <tr class="success">
            <th>ID</th>
            <th>用户名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>编辑</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.userName}</td>
            <td>${user.gender}</td>
            <td>${user.age}</td>
            <td><a href="user_edit?id=${user.id}"><span class="glyphicon glyphicon-edit"></span></a></td>
            <td><a deleteLink="true" href="user_delete?id=${user.id}"><span class=" glyphicon glyphicon-trash"></span></a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%@include file="adminPage.jsp"%>
<div class="panel panel-warning addUser">
    <div class="panel-heading">新增用户</div>
    <div class="panel-body">
        <form method="post" id="addForm" action="add_user">
            <table class="addTable">
                <tr>
                    <td>用户名</td>
                    <td><input  id="name" name="userName" type="text" class="form-control"></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input  id="password" name="password" type="text" class="form-control"></td>
                </tr>
                <tr>
                    <td>性别</td>
                    <td><input  id="gender" name="gender" type="text" class="form-control"></td>
                </tr>
                <tr>
                    <td>年龄</td>
                    <td><input  id="age" name="age" type="text" class="form-control"></td>
                </tr>
                <tr class="submitTR">
                    <td colspan="2" align="center">
                        <button type="submit" class="btn btn-success">提 交</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>
<div class="footer">
    <div class="copyright">Copyright ©2020 FriendHub v1.0 All Rights Reserved</div>
</div>
</body>
</html>
