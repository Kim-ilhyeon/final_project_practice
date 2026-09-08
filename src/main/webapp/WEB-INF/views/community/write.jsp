<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시글 작성</title>
</head>
<body>
<h1>게시글 작성</h1>

<p>
    <label for="title">제목</label>
    <input type="text" id="title">
</p>

<p>
    <label for="content">내용</label>
    <br>
    <textarea id="content" rows="10" cols="50"></textarea>
</p>

<button type="button"
        onclick="alert('화면 연습용이므로 실제 글은 저장되지 않습니다.');">
    등록
</button>

<a href="${pageContext.request.contextPath}/posts">취소</a>
</body>
</html>