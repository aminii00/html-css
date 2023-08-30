<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
     isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<%
 request.setCharacterEncoding("utf-8");
 String number1 = request.getParameter("number1");
 String number2 = request.getParameter("number2");
 String range = request.getParameter("range");
 String command = request.getParameter("command");
%>

<fieldset>
  <legend>로그인 정보</legend>
   <h3>참여인원 : <%= number1 %></h3>
   <h3>지원물품 : <%= number2 %></h3>
   <h3>희망단계 : <%= range %></h3>
   <h3>추신 : <%= command %></h3>
</fieldset>
</body>
</html>