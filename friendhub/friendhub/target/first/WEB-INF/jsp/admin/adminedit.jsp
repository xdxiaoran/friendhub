<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2020/4/14
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="head.jsp"%>
<html>
<head>
    <title>管理员编辑</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/back/style.css" rel="stylesheet">
</head>
<script>
    $(function(){
        <c:if test="${!empty msg}">
        $("span.errorMessage").html(${msg});
        $("span.errorMessage").show();
        </c:if>
        $("form.editForm").submit(function(){
            if($("#name").val().length==0||$("#past_password").val().length==0||$("#new_password").val().length==0){
                $("span.errorMessage").html("请输入账号密码");
                $("span.errorMessage").show();
                return false;
            }
            if($("#past_password").val()!=${admin1.password}&&$("#past_password").val().length!=0){
                $("span.errorMessage").html("原始密码错误");
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
<li><a href="admin">管理员管理</a></li>
<li class="active">管理员编辑</li>
</ol>
<div class="panel panel-warning editUser">
    <div class="panel-heading">管理员编辑</div>
    <div class="panel-body">
        <form method="post" class="editForm" action="edit_password">
            <table class="addTable">
                <tr>
                    <td>用户名</td>
                    <td><input  id="name"  name="adminName" type="text" class="form-control" value="${admin1.adminName}"></td>
                </tr>
                <tr>
                    <td>原始密码</td>
                    <td><input  id="past_password" name="past_password"  type="password" class="form-control"></td>
                </tr>
                <tr>
                    <td>更改密码</td>
                    <td><input  id="new_password" name="password" type="password" class="form-control"></td>
                </tr>
                <tr >
                    <td colspan="2" align="center">
                            <span style="color: red; font-size: 18px;" class="errorMessage"></span>
                    </td>
                </tr>
                <input hidden="hidden" name="id" value="${admin1.id}">
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
