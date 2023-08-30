<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
<style>

  @import url('https://fonts.googleapis.com/css2?family=Dongle&display=swap');


body {

   font-size :25px;
   font-family: 'Dongle', sans-serif;
}
</style>
</head>
<body>
 <%
    request.setCharacterEncoding("utf-8");
	String user_id = request.getParameter("user_id");
	String user_pw = request.getParameter("user_pw");
	String user_pw2 = request.getParameter("user_pw2");
	String user_name = request.getParameter("user_name");
	String user_birth = request.getParameter("user_birth");
	String user_tel = request.getParameter("user_tel");
	String user_mail = request.getParameter("user_mail");
	String user_addr = request.getParameter("user_addr");
	
	request.setAttribute("user_id", user_id);
	request.setAttribute("user_pw", user_pw);
	request.setAttribute("user_pw2", user_pw2);
	request.setAttribute("user_name", user_name);
	request.setAttribute("user_birth", user_birth);
	request.setAttribute("user_tel", user_tel);
	request.setAttribute("user_mail", user_mail);
	request.setAttribute("user_addr", user_addr);

 %>
 
 <fieldset>
   <legend><h2>로그인 정보</h2></legend>
   <h3>아이디 : <%= user_id %></h3>
   <h3>비밀번호 : <%= user_pw %></h3>
   <h3>비밀번호 확인 : <%= user_pw2 %></h3>
   <h3>이름 : <%= user_name %></h3>
   <h3>생년월일 : <%= user_birth %></h3>
   <h3>전화번호 : <%= user_tel %></h3>
   <h3>이메일 : <%= user_mail %></h3>
   <h3>주소 : <%= user_addr %></h3>
 </fieldset>
</body>
</html>


