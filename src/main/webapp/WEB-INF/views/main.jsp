<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Simple Board</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<%@ include file="common/header.jsp" %>
<main class="container">
    <section class="card"><h1 class="page-title">간단한 게시판</h1>
        <p class="page-description">회원과 게시글을 관리할 수 있는 기본 페이지입니다.</p>
        <div class="button-row"><a class="button secondary" href="login.jsp">로그인</a><a class="button secondary"
                                                                                       href="signup.jsp">회원가입</a><a
                class="button" href="list.jsp">게시글 목록 보기</a></div>
    </section>
</main>
<%@ include file="common/footer.jsp" %>
</body>
</html>
