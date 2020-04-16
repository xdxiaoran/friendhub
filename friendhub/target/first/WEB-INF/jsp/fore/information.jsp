<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2020/4/9
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>某某的个人信息</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/fore/style.css" rel="stylesheet">
</head>
<%@include file="head.jsp"%>
<body class="color">
<ul id="myTab" class="nav nav-tabs">
    <li class="active">
        <a href="#dota" data-toggle="tab">
            个人信息
        </a>
    </li>
    <li><a href="#lol" data-toggle="tab">照片</a></li>
</ul>

<div id="myTabContent" class="tab-content">
    <br><br>
    <div class="tab-pane fade in active" id="dota">
        <div class="myinformation" >个人信息</div>
        <form>
            <div class="basic">
                基本资料
            </div>
            <div name="name" id="name">
                <span> 用户名:</span>
                <span style="margin-left: 230px;">吴彦祖</span>
            </div>

            <div name="gender" id="gender">
                <span> 性别:</span>
                <span id="gender" style="margin-left: 250px;">男</span>
            </div>
            <div name="age" id="age">
                <span> 年龄:</span>
                <span style="margin-left: 250px;">24岁</span>
            </div>
            <div classs="province">
                <span>省份:</span>
                <span style="margin-left: 250px;">陕西省</span>
                <div class="city">
                    <span>市区:</span>
                    <span style="margin-left: 250px;">西安市</span>
                </div>
                <div class="country">
                    <span>区县:</span>
                    <span style="margin-left: 250px;">长安区</span>
                </div>

                <div class="apprence">外表</div>
                <div classs="haircolor">
                    <span>发色:</span>
                    <span style="margin-left: 250px;">黄色</span>
                </div>
                <div classs="hairlength">
                    <span>发长:</span>
                    <span style="margin-left: 250px;">秃头</span>
                </div>


                <div classs="height">
                    <span>身高:</span>
                    <span style="margin-left: 250px;">185cm</span>
                </div>

                <div classs="weight">
                    <span>体重:</span>
                    <span style="margin-left: 250px;">70kg</span>
                </div>

                <div classs="shape">
                    <span>体型:</span>
                    <span style="margin-left: 250px;">完美</span>
                </div>


                <div class="habit">生活习惯</div>
                <div classs="drink">
                    <span>是否喝酒:</span>
                    <span style="margin-left: 250px;">否</span>
                </div>

                <div classs="smoke">
                    <span>是否吸烟:</span>
                    <span style="margin-left: 250px;">否</span>
                    </select>
                </div>

                <div classs="overnight">
                    <span>是否熬夜:</span>
                    <span style="margin-left: 250px;">是</span>
                </div>


                <div class="words">交友宣言</div>
                <br><br>
                <span>雪色与夜色之间,你是第三种绝色</span>
        </form>
    </div>
</div>

<div class="tab-pane fade" id="lol">
    <div class="wall">
        照片墙
    </div>
    <section>
        <div class="label bottomleft">
            <img src="../image/lavazza01.jpg" />
        </div>

        <div class="label topright">
            <img src="../image/lavazza02.jpg" />
        </div>

        <div class="label topright">
            <img src="../image/lavazza03.jpg" />
        </div>

        <div class="label bottomleft">
            <img src="../image/lavazza04.jpg" />
        </div>

        <div class="label bottomleft">
            <img src="../image/lavazza05.jpg" />
        </div>

        <div class="label bottomleft">
            <img src="../image/lavazza08.jpg" />
        </div>

    </section>
</div>
</div>
</body>
<%@include file="footer.jsp"%>
</html>

