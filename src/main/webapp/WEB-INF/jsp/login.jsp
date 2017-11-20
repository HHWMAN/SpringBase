<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
	<meta charset="UTF-8">
	<meta name="renderer" content="webkit">
	<title>登录页</title>

	<!-- kendoUI -->
	<link rel="stylesheet" type="text/css" href="${ctx}/styles/kendoUI/styles/kendo.common.min.css">
	<link rel="stylesheet" type="text/css" href="${ctx}/styles/kendoUI/styles/kendo.metro.min.css">

	<script src="${ctx}/js/kendoUI/js/jquery.min.js" type="text/javascript"></script>
	<script src="${ctx}/js/kendoUI/js/kendo.all.min.js" type="text/javascript"></script>

	<!-- 自定义 -->
	<link rel="stylesheet" type="text/css" href="${ctx}/styles/login.css" />
</head>
<body>
	<!-- 背景图片 -->
	<div class="bgBody">
		<img src="${ctx}/img/login-bg.png"/>
	</div>

    
     
	<!-- 登陆内容区 -->
	<div class="loginContent">
		<div class="headPotrait">
			<img class="potrait" src="${ctx}/img/loginlogo.png" alt="这是头像">
			<img class="tradeName" src="${ctx}/img/logoName.png" alt="这是商品的名字">
		</div>
		<form id="loginForm" class="" action="${ctx}/login" method="post">
			<div class="user">
				<input class="k-input" id="username" name="username" type="text" data-bind="value: userName" placeholder="请输入账号" />
			</div>
			<div class="user">
				<input class="k-input" id="password" name="password" type="password" data-bind="value: userPassword" placeholder="请输入密码" />
			</div>
			
			<div class="checkbox clearFloat">
				 <div class="alignLeft">
	                 <input type="checkbox" id="eq1" name="remember-me" class="k-checkbox">
      				 <label class="k-checkbox-label" for="eq1">记住密码</label>
	             </div>
	             <div class="alignRight">
	             	<input type="checkbox" id="eq2" class="k-checkbox">
          			<label class="k-checkbox-label" for="eq2">自动登录</label>
	             </div>
			</div>
			

				<%--${SPRING_SECURITY_LAST_EXCEPTION.message}--%>
			<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION.message}">
				<div class="alertErorr">
				<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />
				<c:remove var = "SPRING_SECURITY_LAST_EXCEPTION" scope = "session" />
				</div>
			</c:if>

		
			
			<input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
			<div class="buttonGroup clearFloat">
				<button class="k-button" type="submit" data-role="button" role="button" aria-disabled="false" tabindex="0">登录</button><a class="k-link">忘记密码?</a>
			</div>
		</form>
	</div>
	<script>
        $(document).ready(function() {
            var viewModel = kendo.observable({
                userName: "",
                userPassword: ""
            });
	 		
            kendo.bind($("div.loginContent form"), viewModel);
        });

		$("#loginForm").submit(function(){
		    var username = $("#username").val();
			var password = $("#password").val();
			if(username==""||null==username)
			{
				alert("用户名不能为空！");
				$("#username").focus();
				return false;
			}

			if(password==""||null==password)
			{
				alert("密码不能为空！");
				$("#password").focus();
				return false;
			}

		});
    </script>
</body>
</html>