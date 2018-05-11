<%--
  Created by IntelliJ IDEA.
  User: ZX
  Date: 2017/11/13
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Login and Registration Form with HTML5 and CSS3</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <%--<link rel="shortcut icon" href="../favicon.ico">--%>
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />


        <script>

        </script>
    </head>
    <body>
        <div class="container">
            <!-- Codrops top bar -->

            <header>
                <h1>欢迎使用 <span>ZX系统</span></h1>

            </header>
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form id="loginForm" class="" action="${ctx}/login" method="post">
                                <h1> 登 录 </h1>
                                <p align="center" style="color:red">
                                    <c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION.message}">
                                     <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />
                                    </c:if>
                                </p>
                                <p> 
                                    <label for="username" class="uname" data-icon="u" > 请输入用户名 </label>
                                    <input id="username" name="username" required="required" type="text" placeholder="myusername"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> 请输入密码 </label>
                                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO" /> 
                                </p>
                                <p class="keeplogin"> 
									<input type="checkbox" name="loginkeeping" id="rememberMe" value="loginkeeping" />
									<label for="rememberMe">记住我</label>
								</p>
                                <p class="login button"> 
                                    <input type="submit" value="登录" />
								</p>
                                <p class="login button">
                                  <a href="/loginQQ"><img src="../images/Connect_logo_4.png"></a>
                                </p>
                                <p class="change_link">
									还未注册 ?
									<a href="#toregister" class="to_register">成为会员</a>
								</p>
                            </form>
                        </div>

                        <div id="register" class="animate form">
                            <form id="registerForm" class="" action="${ctx}/register" method="post" enctype="multipart/form-data">
                                <h1> 注 册 </h1>
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">请输入用户名</label>
                                    <input id="usernamesignup" name="username" required="required" type="text" placeholder="mysuperusername690" />
                                </p>
                                <p>
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">请输入密码 </label>
                                    <input id="passwordsignup" name="password" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e" >请输入邮箱</label>
                                    <input id="emailsignup" name="email" required="required" type="email" placeholder="mysupermail@mail.com"/>
                                </p>

                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">请确认密码 </label>
                                    <input id="passwordsignup_confirm" name="password_confirm" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                </p>

                                <p>
                                    <label >上传头像 </label>
                                    <input id="photo" name="uploadPhoto" required="required" type="file" />
                                </p>
                                <p class="signin button"> 
									<input type="submit" value="注册" />
								</p>
                                <p class="change_link">  
									已经注册 ?
									<a href="#tologin" class="to_register"> 点击登录 </a>
								</p>
                            </form>
                        </div>
						
                    </div>
                </div>  
            </section>
        </div>
    </body>
</html>