<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>회원 탈퇴</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<%@ include file="common/header.jsp" %>
<main class="container">
    <section class="card form-card"><h1 class="page-title">회원 탈퇴</h1>
        <p class="notice">탈퇴하면 회원 정보와 작성한 데이터 처리 정책을 확인해 주세요.</p>
        <form action="#" method="post">
            <div class="form-group"><label for="withdrawPassword">비밀번호 확인</label><input id="withdrawPassword"
                                                                                        type="password"
                                                                                        placeholder="비밀번호를 입력하세요"></div>
            <div class="button-row">
                <button class="button danger" type="submit">회원 탈퇴</button>
                <a class="button secondary" href="mypage.jsp">취소</a>
            </div>
        </form>
    </section>
</main>
<%@ include file="common/footer.jsp" %>
</body>
</html>
