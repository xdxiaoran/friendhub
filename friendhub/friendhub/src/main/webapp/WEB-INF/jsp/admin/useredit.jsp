<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2020/4/15
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@include file="head.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户编辑</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/back/style.css" rel="stylesheet">
</head>
<script>
    $(function () {
        $("form.editForm").submit(function () {
            if($("#name").val().length==0||$("#password").val().length==0||$("#gender").val().length==0||$("#age").val().length==0){
                $("span.errorMessage").html("请完善资料");
                $("span.errorMessage").show();
                return false;
            }
            return true;
        });
        $("input").keyup(function(){
            $(".errorMessage").hide();
        });
    });
</script>
<body>

<ol class="breadcrumb top">
    <li><a href="admin">用户管理</a></li>
    <li class="active">用户编辑</li>
</ol>
<div class="panel panel-warning editUser">
    <div class="panel-heading">用户编辑</div>
    <div class="panel-body">
        <form method="post" class="editForm" action="edit_post">
            <table class="addTable">
                <tr>
                    <td>用户名</td>
                    <td><input  id="name" name="userName" value="${user.userName}" type="text" class="form-control"></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input  id="password" name="password" value="${user.password}" type="text" class="form-control"></td>
                </tr>
                <tr>
                    <td>性别</td>
                    <td><input  id="gender" name="gender"value="${user.gender}" type="text" class="form-control"></td>
                </tr>
                <tr>
                    <td>年龄</td>
                    <td><input  id="age" name="age" value="${user.age}" type="text" class="form-control"></td>
                </tr>
                <tr >
                    <td colspan="2" align="center">
                        <span style="color: red; font-size: 18px;" class="errorMessage"></span>
                    </td>
                </tr>
                <input hidden="hidden" name="id" value="${user.id}">
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
