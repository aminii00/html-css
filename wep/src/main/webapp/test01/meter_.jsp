<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
  @import url('https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&display=swap');

body {
   background-color:#fff;
}

form legend {
   font-family: 'Dongle', sans-serif;
   font-family: 'Gamja Flower', cursive;
   list-style :none;
   margin : 15px 0;
   font-size:20px;
}
ul li {
   font-family: 'Dongle', sans-serif;
   font-family: 'Gamja Flower', cursive;
   list-style :none;
   margin : 15px 0;
   font-size:17px;
}
</style>
</head>
<body>

<%
   request.setCharacterEncoding("utf-8");
   String user_top = request.getParameter("top");
   String user_pants = request.getParameter("pants");
   String user_shoes = request.getParameter("shoes");
%>

 <form>
   <fieldset id = "subject">
     <legend>쇼핑몰 판매량</legend>
     <ul>
       <li>
       <label>상의</label>
       <meter value = <%= user_top %>></meter>
       </li>
      
      <li>
       <label>하의</label>
       <meter min="0" max ="100" value = <%= user_pants %>></meter>
       </li>
       
       <li>
       <label>신발</label>
       <meter min ="0" max="600" Low ="0" high="500" value = <%= user_shoes %>></meter>
       </li>
       
     </ul>
   </fieldset>
 </form>
</body>
</html>