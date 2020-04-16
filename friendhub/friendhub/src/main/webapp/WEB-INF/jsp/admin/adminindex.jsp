<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2020/4/14
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="head.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/back/style.css" rel="stylesheet">
</head>
<script>
    $(function(){
        function getFormatDate() {
            var date = new Date();
            var month = date.getMonth() + 1;
            var strDate = date.getDate();
            if (month >= 1 && month <= 9) {
                month = "0" + month;
            }
            if (strDate >= 0 && strDate <= 9) {
                strDate = "0" + strDate;
            }
            var currentDate = date.getFullYear() + "-" + month + "-" + strDate
                + " " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();
            return currentDate;
        }
        var currentDate=getFormatDate();
        var old=$("#time").html();
        $("#time").html(old+currentDate)
    });
</script>
<body>
<div class="top">
    <span class="glyphicon glyphicon-home">后台首页</span>
</div>
<div class="all">
    <div class="content">
        <div class="welcome">
            <span>欢迎管理员</span>
            <span id="name"><font color="red">${admin.adminName}</font></span>
            <span id="time">当前时间</span>
        </div>
        <div class="somedata">
            <span class="title">数据统计</span>
            <div class="three">
                <div>用户数</div>
                <span>${userNum}</span>
            </div>
            <div class="three">
                <div>管理员数</div>
                <span>${adminNum}</span>
            </div>
            <div class="three">
                <div>帖子数</div>
                <span>${topicNum}</span>
            </div>
        </div>
        <div class="somedata">
            <span class="title">系统消息</span>
            <table class="table table-striped  table-hover  table-condensed">
                <thead>
                <th>时间</th>
                <th>事件</th>
                </thead>
                <tbody>
                <tr>
                    <td>2020.4.10</td>
                    <td>FriendHub1.0上线啦</td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="somedata">
            <span class="title">系统信息</span>
            <table class="table table-condensed table-bordered">
                <tbody>
                <tr>
                    <td>系统版本</td>
                    <td>1.0</td>
                </tr>
                <tr>
                    <td>服务器地址</td>
                    <td>localhost</td>
                </tr>
                <tr>
                    <td>操作系统</td>
                    <td>win</td>
                </tr>
                <tr>
                    <td>服务器版本</td>
                    <td>Tomcat 7.0.47</td>
                </tr>
                <tr>
                    <td>数据库版本</td>
                    <td>mysql 5.7</td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="somedata">
            <span class="title">开发团队</span>
            <table class="table table-hover">
                <tbody>
                <tr>
                    <td>开发人员</td>
                    <td>17030130009 17030130013 17030130014 17030130015</td>
                </tr>
                <tr>
                    <td>版权所有</td>
                    <td></td>
                </tr>
            </table>
        </div>
    </div>
</div>
<div class="footer">
    <div class="copyright">Copyright ©2020 FriendHub v1.0 All Rights Reserved</div>
</div>

</body>
</html>
