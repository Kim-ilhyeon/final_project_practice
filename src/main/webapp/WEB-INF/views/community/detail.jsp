<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시글 상세</title>
</head>
<body>
<h1>첫 번째 게시글입니다</h1>

<p>글 번호: 1</p>
<p>작성자: 홍길동</p>
<p>조회수: 0</p>

<hr>

<p>안녕하세요. 연습용으로 작성한 게시글입니다.</p>

<hr>

<a href="${pageContext.request.contextPath}/posts">목록으로</a>
<a href="${pageContext.request.contextPath}/posts/1/edit">수정</a>

<button type="button" onclick="confirmDelete()">삭제</button>

<script>
    function confirmDelete() {
        if (confirm('정말 삭제하시겠습니까?')) {
            alert('화면 연습용이므로 실제 글은 삭제되지 않습니다.');
        }
    }
</script>
<hr>

<h2>댓글</h2>

<p>
    <strong>김철수</strong>: 잘 읽었습니다.

    <button type="button"
            onclick="alert('댓글 수정 기능은 아직 연결하지 않았습니다.');">
        수정
    </button>

    <button type="button"
            onclick="if (confirm('이 댓글을 삭제하시겠습니까?')) {
                alert('화면 연습용이므로 댓글은 실제로 삭제되지 않습니다.');
            }">
        삭제
    </button>
</p>

<p>
    <label for="comment">댓글 작성</label>
    <br>
    <textarea id="comment" rows="3" cols="50"
              placeholder="댓글을 입력해 주세요."></textarea>
</p>

<button type="button"
        onclick="alert('화면 연습용이므로 댓글은 실제로 저장되지 않습니다.');">
    댓글 등록
</button>
</body>
</html>