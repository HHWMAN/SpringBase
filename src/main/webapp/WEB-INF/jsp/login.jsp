<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />


<html>
<head>
	<meta charset="UTF-8">
	<meta name="renderer" content="webkit">
	<title>登录页</title>
	<script>
        ctx = "${ctx}";

	</script>
	<%--<script type="text/JavaScript" src='<c:url value="/js/jquery.min.js"></c:url>'></script>
	<script type="text/JavaScript" src='<c:url value="../js/jquery.min.js"></c:url>'></script>--%>

	<script type="text/javascript" src="${ctx}./js/jquery.min.js"></script>
	<%--<script type="text/javascript" src="${ctx}/./js/jquery.min.js"></script>
	<script type="text/javascript" src="${ctx}/../js/jquery.min.js"></script>
	<script type="text/javascript" src="${ctx}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${ctx}/js/jquery.min.js"></script>--%>



</head>
<body>
	<!-- 背景图片 -->
	<div class="bgBody">
	<%--	<img src="${ctx}/img/login-bg.png"/>--%>
	</div>

    
     
	<!-- 登陆内容区 -->
	<div class="loginContent">
		<div class="headPotrait">

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
	                 <input type="checkbox" id="eq1" name="remember-me" >
      				 <label for="eq1">记住密码</label>
	             </div>
	             <div class="alignRight">
	             	<input type="checkbox" id="eq2" >
          			<label  for="eq2">自动登录</label>
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

</body>
</html>