<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko"><head><meta charset="UTF-8"><title>게시글 작성</title><link rel="stylesheet" href="css/style.css"></head>
<body><%@ include file="common/header.jsp" %>
<main class="container"><section class="card form-card"><h1 class="page-title">게시글 작성</h1><form action="#" method="post"><div class="form-group"><label for="title">제목</label><input id="title" name="title" type="text" placeholder="제목을 입력하세요"></div><div class="form-group"><label for="content">내용</label><textarea id="content" name="content" placeholder="내용을 입력하세요"></textarea></div><div class="button-row"><a class="button secondary" href="list.jsp">취소</a><button class="button" type="submit">등록</button></div></form></section></main><%@ include file="common/footer.jsp" %></body></html>
