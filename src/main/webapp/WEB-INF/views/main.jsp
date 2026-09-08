<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시판 메인</title>
</head>
<body>
<h1>게시판</h1>
<p>게시판에 오신 것을 환영합니다.</p>

<a href="${pageContext.request.contextPath}/posts">게시글 목록</a>
<a href="${pageContext.request.contextPath}/login">로그인</a>
<a href="${pageContext.request.contextPath}/signup">회원가입</a>
</body>
</html>