
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/fore/style.css" rel="stylesheet">
    <%@include file="head.jsp"%>


</head>
<script>
    $(function(){
        var showContent = $(".content1");
        showContent[0].scrollTop = showContent[0].scrollHeight;
    })
</script>
<body>
<div class="border">
    <div class="top1">
        <img src="image/lavazza03.jpg" id="touxiang">
        <span>与小可爱的对话</span>
    </div>
    <div class="content1">
        <div class="leftcontent">
            <img src="image/lavazza03.jpg" id="touxiang">
            <span>你好呀!</span>
            <span id="date">2020 4 1 10 28</span>
        </div>
        <div class="rightcontent">
            <span id="date">2020 4 1 10 28</span>
            <span>最近在干嘛!</span>
            <img src="image/lavazza03.jpg" id="touxiang">
        </div>
        <div class="leftcontent">
            <img src="image/lavazza03.jpg" id="touxiang">
            <span>最近在干嘛!</span>
            <span id="date">2020 4 1 10 28</span>
        </div>
        <div class="leftcontent">
            <img src="image/lavazza03.jpg" id="touxiang">
            <span>最近在干嘛!</span>
            <span id="date">2020 4 1 10 28</span>
        </div>
    </div>
    <div class="editarea">
        <div class="edit">
            <textarea class="myinput"></textarea>
        </div>
        <div class="button">
            <button class="submit">发送</button>
        </div>
    </div>
</div>
</body>
<%@include file="footer.jsp"%>
</html>
