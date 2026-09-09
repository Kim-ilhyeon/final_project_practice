<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko"><head><meta charset="UTF-8"><title>로그인</title><link rel="stylesheet" href="css/style.css"></head>
<body><%@ include file="common/header.jsp" %>
<main class="container"><section class="card form-card"><h1 class="page-title">로그인</h1><form action="#" method="post"><div class="form-group"><label for="id">아이디</label><input id="id" name="id" type="text" placeholder="아이디를 입력하세요"></div><div class="form-group"><label for="password">비밀번호</label><input id="password" name="password" type="password" placeholder="비밀번호를 입력하세요"></div><div class="button-row"><button class="button" type="submit">로그인</button></div></form><p class="page-description">회원이 아니신가요? <a class="link-text" href="signup.jsp">회원가입</a></p></section></main><%@ include file="common/footer.jsp" %></body></html>
