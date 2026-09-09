<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시글 수정</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<%@ include file="common/header.jsp" %>
<main class="container">
    <section class="card form-card"><h1 class="page-title">게시글 수정</h1>
        <form action="#" method="post">
            <div class="form-group">
                <label for="title">제목</label>
                <input id="title" name="title" type="text" value="세 번째 게시글입니다.">
            </div>
            <div class="form-group">
                <label for="content">내용</label>
                <textarea id="content" name="content" style="resize: none">
                    게시글 내용이 들어가는 영역입니다. 간단한 게시판 페이지 예시입니다.
                </textarea>
            </div>
            <div class="button-row">
                <button class="button" type="submit">수정</button>
                <a class="button secondary" href="detail.jsp">취소</a>
            </div>
        </form>
    </section>
</main>
<%@ include file="common/footer.jsp" %>
</body>
</html>
