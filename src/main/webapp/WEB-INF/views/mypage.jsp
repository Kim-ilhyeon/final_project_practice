<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko"><head><meta charset="UTF-8"><title>마이페이지</title><link rel="stylesheet" href="css/style.css"></head>
<body><%@ include file="common/header.jsp" %>
<main class="container"><h1 class="page-title">마이페이지</h1><section class="card"><dl class="info-list"><div><dt>아이디</dt><dd>honggildong</dd></div><div><dt>이름</dt><dd>홍길동</dd></div><div><dt>이메일</dt><dd>hong@example.com</dd></div><div><dt>가입일</dt><dd>2026-09-09</dd></div></dl><div class="button-row"><a class="button secondary" href="profile-edit.jsp">정보 수정</a><a class="button danger" href="withdraw.jsp">회원 탈퇴</a></div></section></main><%@ include file="common/footer.jsp" %></body></html>
