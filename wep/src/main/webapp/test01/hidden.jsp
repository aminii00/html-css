<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String user_id = request.getParameter("user_id");
    String user_pw = request.getParameter("user_pw");
%>

   <fieldset>
      <lengend>로그인 정보</lengend>
      <h3>아이디 : <%= user_id %></h3>
      <h3>비밀번호 : <%= user_pw %></h3>
      <h3>등급 : ${grade}</h3>
      
   </fieldset>
</body>
</html>