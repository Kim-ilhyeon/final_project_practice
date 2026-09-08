<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>로그인</title>
</head>
<body>
<h1>로그인</h1>

<p>
    <label for="username">아이디</label>
    <input type="text" id="username">
</p>

<p>
    <label for="password">비밀번호</label>
    <input type="password" id="password">
</p>

<button type="button"
        onclick="alert('로그인 기능은 아직 연결하지 않았습니다.');">
    로그인
</button>

<p>
    <a href="${pageContext.request.contextPath}/">메인으로</a>
</p>
</body>
</html>