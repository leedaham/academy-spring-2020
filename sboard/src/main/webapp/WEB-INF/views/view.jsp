<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>글보기</title> 
		<link rel="stylesheet" href="/sboard/css/style.css" />
	</head>
	<body>
		<div id="board">
			<h3>글보기</h3>
			<div class="view">
				<form action="#" method="post">
					<table>
						<tr>
							<td>제목</td>
							<td><input type="text" name="subject" value="${boardArticleVO.title}" readonly />
							</td>
						</tr>
						<c:if test="${boardArticleVO.file == 1 }">
						<tr>
							<td>첨부파일</td>
							<td>
								<a href="#">테스트.hwp</a>
								<span>3회 다운로드</span>
							</td>
						</tr>
						</c:if>
						<tr>
							<td>내용</td>
							<td>
								<textarea name="content" rows="20" readonly>${boardArticleVO.content}</textarea>
							</td>
						</tr>
					</table>
					<div class="btns">
						<a href="/sboard/delete?seq=${boardArticleVO.seq}" class="cancel del">삭제</a>
						<a href="/sboard/modify?seq=${boardArticleVO.seq}" class="cancel mod">수정</a>
						<a href="/sboard/list" class="cancel">목록</a>
					</div>
				</form>
			</div><!-- view 끝 -->
			
			<!-- 댓글리스트 -->
			<section class="comments">
				<h3>댓글목록</h3>
				<c:forEach var="vo" items="${comments}">
					<div class="comment">
						<span>
							<span>${vo.uid}</span>
							<span>${vo.rdate.substring(0,10)}</span>
						</span>
						<textarea>${vo.content}</textarea>
						<div>
							<a href="#" class="del">삭제</a>
							<a href="#" class="mod">수정</a>
						</div>
					</div>
				</c:forEach>
				<c:if test="${empty comments}">
					<p class="empty">
						등록된 댓글이 없습니다.
					</p>
				</c:if>
			</section>
			
			<!-- 댓글쓰기 -->
			<section class="comment_write">
				<h3>댓글쓰기</h3>
				<div>
					<form action="/sboard/comment/write" method="post">
						<input type="hidden" name="parent" value="${boardArticleVO.seq}" />
						<textarea name="comment" rows="5"></textarea>
						<div class="btns">
							<a href="#" class="cancel">취소</a>
							<input type="submit" class="submit" value="작성완료" />
						</div>
					</form>
				</div>
			</section>
		</div><!-- board 끝 -->
	</body>

</html>










