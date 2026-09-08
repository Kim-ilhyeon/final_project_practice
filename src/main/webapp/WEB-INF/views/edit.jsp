<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시글 수정</title>
</head>
<body>
<h1>게시글 수정</h1>

<p>
    <label for="title">제목</label>
    <input type="text" id="title"
           value="첫 번째 게시글입니다">
</p>

<p>
    <label for="content">내용</label>
    <br>
    <textarea id="content" rows="10" cols="50">안녕하세요. 연습용으로 작성한 게시글입니다.</textarea>
</p>

<button type="button"
        onclick="alert('화면 연습용이므로 변경 내용은 저장되지 않습니다.');">
    수정 완료
</button>

<a href="${pageContext.request.contextPath}/posts/1">취소</a>
</body>
</html>