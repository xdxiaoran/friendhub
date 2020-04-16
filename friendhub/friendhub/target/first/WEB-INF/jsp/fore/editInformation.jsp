<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2020/4/9
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>编辑信息</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/fore/style.css" rel="stylesheet">
    <script src="js/city.js"></script>
</head>
<script>
    $(function () {
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
                                $("#country").hide();
                            }
                        }
                    });
                }
            });
        });
        $("input#year").val(2020-$("input#age").val());
    });
</script>
<body>
<%@include file="head.jsp"%>
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
                <input style="margin-left: 230px;" type="text" value="吴彦祖" disabled="disabled">
            </div>

            <div name="gender" id="gender">
                <span> 性别:</span>
                <select name="gender">
                    <option value="man">男</option>
                    <option value="woman">女</option>
                </select>
            </div>
            <div name="age" id="age">
                <span> 年龄:</span>
                <input type="text" id="age" value="24">
            </div>
            <div classs="province">
                <span>省份:</span>
                <select id="province" name="province" >
                    <option value="省份">省份</option>
                </select>
            </div>
            <div class="city">
                <span>市区:</span>
                <select id="city" name="city" >
                    <option value="市区">市区</option>
                </select>
            </div>
            <div class="country">
                <span>区县:</span>
                <select id="country" name="country" >
                    <option value="省">区县</option>
                </select>
            </div>

            <div class="apprence">外表</div>
            <div classs="haircolor">
                <span>发色:</span>
                <select id="province" name="province" >
                    <option value="请选择">请选择</option>
                    <option value="黑色">黑色</option>
                    <option value="黄色">黄色</option>
                    <option value="红色">红色</option>
                    <option value="棕色">棕色</option>
                    <option value="其他">其他</option>
                </select>
            </div>
            <div classs="hairlength">
                <span>发长:</span>
                <select id="province" name="province" >
                    <option value="请选择">请选择</option>
                    <option value="秃头">秃头</option>
                    <option value="短发">短发</option>
                    <option value="中长">中长</option>
                    <option value="长发">长发</option>
                </select>
            </div>


            <div classs="height">
                <span>身高:</span>
                <input type="text" placeholder="cm" value="">
            </div>

            <div classs="weight">
                <span>体重:</span>
                <input type="text"placeholder="kg" value="">
            </div>

            <div classs="shape">
                <span>体型:</span>
                <select id="shape" name="shape" >
                    <option value="请选择">请选择</option>
                    <option value="娇小">娇小</option>
                    <option value="匀称">匀称</option>
                    <option value="完美">完美</option>
                </select>
            </div>


            <div class="habit">生活习惯</div>
            <div classs="drink">
                <span>是否喝酒:</span>
                <select id="drink" name="drink" >
                    <option value="请选择">请选择</option>
                    <option value="否">否</option>
                    <option value="有时喝">有时喝</option>
                    <option value="经常喝">经常喝</option>
                </select>
            </div>

            <div classs="smoke">
                <span>是否吸烟:</span>
                <select id="smoke" name="smoke" >
                    <option value="请选择">请选择</option>
                    <option value="否">否</option>
                    <option value="有时吸">有时吸</option>
                    <option value="经常吸">经常吸</option>
                </select>
            </div>

            <div classs="overnight">
                <span>是否熬夜:</span>
                <select id="overnight" name="overnight" >
                    <option value="请选择">请选择</option>
                    <option value="否">否</option>
                    <option value="有时熬">有时熬</option>
                    <option value="经常熬">经常熬</option>
                </select>
            </div>


            <div class="words">交友宣言</div>
            <textarea name="word" id="word"></textarea><br>
            <input type="submit" id="submit" />
        </form>
    </div>
    <div class="tab-pane fade" id="lol">
        <div class="wall">
            照片墙
        </div>
        <section>
            <div class="label bottomleft">
                <img src="image/lavazza01.jpg" />
            </div>

            <div class="label topright">
                <img src="image/lavazza02.jpg" />
            </div>

            <div class="label topright">
                <img src="image/lavazza03.jpg" />
            </div>

            <div class="label bottomleft">
                <img src="image/lavazza04.jpg" />
            </div>

            <div class="label bottomleft">
                <img src="image/lavazza05.jpg" />
            </div>

            <div class="label bottomleft">
                <img src="image/lavazza08.jpg" />
            </div>

        </section>
    </div>
</div>
</body>
<%@include file="footer.jsp"%>
</html>
