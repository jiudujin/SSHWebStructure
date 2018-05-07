<%--
  Created by IntelliJ IDEA.
  User: scw
  Date: 2017/12/19 0019
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>欢迎进入测试主页面</title>
  </head>
  <body>
  <h1>欢迎进入测试主页面</h1>

  <a href="${pageContext.request.contextPath}/pagejump">点击我一下，给你跳转</a>
  <br>
  <a href="${pageContext.request.contextPath}/getperson">给你跳转</a>
  </body>
</html>
