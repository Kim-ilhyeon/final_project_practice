<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시글 목록</title>
</head>
<body>
<h1>게시글 목록</h1>

<table>
    <thead>
    <tr>
        <th>글 번호</th>
        <th>제목</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>1</td>
        <td>
            <a href="${pageContext.request.contextPath}/posts/1">
                첫 번째 게시글입니다
            </a>
        </td>
    </tr>
    </tbody>
</table>

<p>
    <a href="${pageContext.request.contextPath}/posts/write">글 작성</a>
    <a href="${pageContext.request.contextPath}/">메인으로</a>
</p>
</body>
</html>