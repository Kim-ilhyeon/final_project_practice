<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
</head>
<body>
<h1>회원가입</h1>

<p>
    <label for="username">아이디</label>
    <input type="text" id="username">
</p>

<p>
    <label for="password">비밀번호</label>
    <input type="password" id="password">
</p>

<p>
    <label for="passwordConfirm">비밀번호 확인</label>
    <input type="password" id="passwordConfirm">
</p>

<button type="button"
        onclick="alert('회원가입 기능은 아직 연결하지 않았습니다.');">
    가입하기
</button>

<p>
    <a href="${pageContext.request.contextPath}/">메인으로</a>
</p>
</body>
</html>