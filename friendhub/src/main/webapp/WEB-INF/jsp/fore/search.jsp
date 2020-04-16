<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2020/4/9
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>搜索</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/fore/style.css" rel="stylesheet">
    <script src="js/city.js"></script>
</head>
<script>
    $(function () {
        for(var i=16;i<=60;i++){
            var old = $("#age").html();
            $("#age").html(old+"<option value="+i+">"+i+"</option>");
            $("#age1").html(old+"<option value="+i+">"+i+"</option>");
        }
        var allCity = city.citylist;
        $.each(allCity,function(i,n){
            //添加每一个省
            $("#province").append('<option value="'+ n.p +'">' + n.p + '</option>');
        });
        $("#province").change(function(){
            $("#country").show();
            //执行后面函数之前清空一下
            $("#city").html('<option value="市">市</option>');
            $("#country").html('<option value="县">县</option>');
            $.each(allCity,function(i,n){
                if($("#province").val()==n.p){
                    $.each(n.c,function(a,b){
                        //添加每一个市
                        $("#city").append('<option value="'+ b.n + '">' + b.n + '</option>');
                    });
                }
            });
        });
        $("#city").change(function(){
            //执行后面函数之前清空一下
            $("#country").html('<option value="县">县</option>');
            $.each(allCity,function(i,n){
                if($("#province").val()==n.p){
                    $.each(n.c,function(a,b){
                        if($("#city").val()==b.n){
                            if(b.a){//判断有没有县，有就显示，没有就隐藏
                                $.each(b.a,function(c,d){
                                    //添加每一个县
                                    $("#country").append('<option value="'+ d.s + '">' + d.s + '</option>');
                                })
                            }else{
//                      $("#country").hide();
                            }
                        }
                    });
                }
            });
        });
    });
</script>
<body>
<%@include file="head.jsp"%>
<form>
    <div class="searchbar" style="margin-top:80px ;">
        <div class="one">
            <span id="search">寻找</span>
            <span>年龄</span>
            <span>省</span>
            <span>市</span>
            <span>县</span>
        </div><br><br>
        <form>
            <div class="two">
                <select id="gender"style="text-align: center;text-align-last: center;" name=   >
                    <option value="no">请选择</option>
                    <option >不限</option>
                    <option value="" >女</option>
                    <option value="" >男</option>
                </select>
                <select id="age" name="fristage" >
                    <option value="no">请选择</option>
                </select>

                <select id="age1" name="lastage">
                    <option value="no">请选择</option>
                </select>
                <!--省份选择-->
                <select id="province" style="text-align: center;text-align-last: center;">
                    <option value="no">请选择</option>
                </select>
                <select id="city" style="text-align: center;text-align-last: center;">
                    <option value="no">请选择</option>
                </select>
                <select id="country" style="text-align: center;text-align-last: center;">
                    <option value="no">请选择</option>
                </select>
                <input type="submit" class="btn btn-primary search">
            </div>
        </form>
    </div>
        <span class="glyphicon glyphicon-asterisk randomtext" style="margin-top: 4%;">搜索结果</span>
        <div class="random" style="margin-top: 2%;">
            <div class="information">
                <a href=""><img class="pictrue" src="../image/background.jpg"/></a>
                <span id="name">小美</span>
                <span class="glyphicon glyphicon-user"style="font-size: 20px;"></span><br>
                <span class="gender">性别:女</span>
                <span class="gender">年龄:20</span><br>
                <span class="location"> 陕西  西安<span><br>
				<a href=""><span class="glyphicon glyphicon-heart heart"></span></a>
				<a href=""><span class="glyphicon glyphicon-envelope message"></span></a>
            </div>
            <div class="information">
                <a href=""><img class="pictrue" src="../image/background.jpg"/></a>
                <span id="name">小美</span>
                <span class="glyphicon glyphicon-user"style="font-size: 20px;"></span><br>
                <span class="gender">性别:女</span>
                <span class="gender">年龄:20</span><br>
                <span class="location"> 陕西  西安<span><br>
				<a href=""><span class="glyphicon glyphicon-heart heart"></span></a>
				<a href=""><span class="glyphicon glyphicon-envelope message"></span></a>
            </div>
            <div class="information">
                <a href=""><img class="pictrue" src="../image/background.jpg"/></a>
                <span id="name">小美</span>
                <span class="glyphicon glyphicon-user"style="font-size: 20px;"></span><br>
                <span class="gender">性别:女</span>
                <span class="gender">年龄:20</span><br>
                <span class="location"> 陕西  西安<span><br>
				<a href=""><span class="glyphicon glyphicon-heart heart"></span></a>
				<a href=""><span class="glyphicon glyphicon-envelope message"></span></a>
            </div>
            <div class="information">
                <a href=""><img class="pictrue" src="../image/background.jpg"/></a>
                <span id="name">小美</span>
                <span class="glyphicon glyphicon-user"style="font-size: 20px;"></span><br>
                <span class="gender">性别:女</span>
                <span class="gender">年龄:20</span><br>
                <span class="location"> 陕西  西安<span><br>
				<a href=""><span class="glyphicon glyphicon-heart heart"></span></a>
				<a href=""><span class="glyphicon glyphicon-envelope message"></span></a>
            </div>
            <div class="information">
                <a href=""><img class="pictrue" src="../image/background.jpg"/></a>
                <span id="name">小美</span>
                <span class="glyphicon glyphicon-user"style="font-size: 20px;"></span><br>
                <span class="gender">性别:女</span>
                <span class="gender">年龄:20</span><br>
                <span class="location"> 陕西  西安<span><br>
				<a href=""><span class="glyphicon glyphicon-heart heart"></span></a>
				<a href=""><span class="glyphicon glyphicon-envelope message"></span></a>
            </div>
            <div class="information">
                <a href=""><img class="pictrue" src="../image/background.jpg"/></a>
                <span id="name">小美</span>
                <span class="glyphicon glyphicon-user"style="font-size: 20px;"></span><br>
                <span class="gender">性别:女</span>
                <span class="gender">年龄:20</span><br>
                <span class="location"> 陕西  西安<span><br>
				<a href=""><span class="glyphicon glyphicon-heart heart"></span></a>
				<a href=""><span class="glyphicon glyphicon-envelope message"></span></a>
            </div>
            <div class="information">
                <a href=""><img class="pictrue" src="../image/background.jpg"/></a>
                <span id="name">小美</span>
                <span class="glyphicon glyphicon-user"style="font-size: 20px;"></span><br>
                <span class="gender">性别:女</span>
                <span class="gender">年龄:20</span><br>
                <span class="location"> 陕西  西安<span><br>
				<a href=""><span class="glyphicon glyphicon-heart heart"></span></a>
				<a href=""><span class="glyphicon glyphicon-envelope message"></span></a>
            </div>
            <div class="information">
                <a href=""><img class="pictrue" src="../image/background.jpg"/></a>
                <span id="name">小美</span>
                <span class="glyphicon glyphicon-user"style="font-size: 20px;"></span><br>
                <span class="gender">性别:女</span>
                <span class="gender">年龄:20</span><br>
                <span class="location"> 陕西  西安<span><br>
				<a href=""><span class="glyphicon glyphicon-heart heart"></span></a>
				<a href=""><span class="glyphicon glyphicon-envelope message"></span></a>
            </div>
            <div class="information">
                <a href=""><img class="pictrue" src="../image/background.jpg"/></a>
                <span id="name">小美</span>
                <span class="glyphicon glyphicon-user"style="font-size: 20px;"></span><br>
                <span class="gender">性别:女</span>
                <span class="gender">年龄:20</span><br>
                <span class="location"> 陕西  西安<span><br>
				<a href=""><span class="glyphicon glyphicon-heart heart"></span></a>
				<a href=""><span class="glyphicon glyphicon-envelope message"></span></a>
            </div>
            <div class="information">
                <a href=""><img class="pictrue" src="../image/background.jpg"/></a>
                <span id="name">小美</span>
                <span class="glyphicon glyphicon-user"style="font-size: 20px;"></span><br>
                <span class="gender">性别:女</span>
                <span class="gender">年龄:20</span><br>
                <span class="location"> 陕西  西安<span><br>
				<a href=""><span class="glyphicon glyphicon-heart heart"></span></a>
				<a href=""><span class="glyphicon glyphicon-envelope message"></span></a>
            </div>
        </div>
</body>
<div style="clear: both"></div>
<%@include file="footer.jsp"%>
</html>
