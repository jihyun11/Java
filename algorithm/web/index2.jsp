<%--
  Created by IntelliJ IDEA.
  User: mozzi
  Date: 2023/04/20
  Time: 8:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>대출금 확인</h1>
<jsp:useBean class="house.대출정보" id="loan" scope="session"></jsp:useBean>
<%
    request.setCharacterEncoding("euc-kr");
    String 주민번호 = request.getParameter("_ssn");
    String 주소 = request.getParameter("_address");
    String 대출일 = request.getParameter("_loandate");
    String 상환예정일 = request.getParameter("_expecteddate");

%>
<h1>대출금액: <%= String.format("%.1f", loan.대출(주민번호, 주소, Integer.parseInt(대출일), Integer.parseInt(상환예정일))) %></h1>


</body>
</html>
