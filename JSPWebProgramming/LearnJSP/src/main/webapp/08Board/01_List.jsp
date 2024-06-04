<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="model1.board.BoardDAO" %>
<%@ page import="model1.board.BoardDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//DAO를 생성해 DB에 연결
BoardDAO dao = new BoardDAO(application);    

//사용자가 입력한 검색 조건을 Map에 저장
Map<String, Object> param = new HashMap<String, Object>();
String searchFiled = request.getParameter("searchFiled");
String searchWord = request.getParameter("searchWord");

if (searchWord != null) {
	param.put("searchFiled", searchFiled);
	param.put("searchWord", searchWord);
}

int totalCount = dao.selectCount(param);
List<BoardDTO> boardLists = dao.selectList(param);
dao.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판</title>
</head>
<body>
	<jsp:include page="../Common/01_Link.jsp" /> <!-- 공통링크 -->
	<h2>목록 보기(List)</h2>
	<!-- 검색폼 -->
	<form method="get">
	<table border="1" width="90%">
	<tr>
		<td align="center">
			<select name="searchField">
				<option value="title">제목</option>
				<option value="content">내용</option>
			</select>
			<input type="text" name="searchWord" />
			<input type="submit" value="검색하기" />
	</tr>
	</table>
	</form>
	
	<!-- 게시물 목록 테이블(표) -->
	<table border="1" width="90%">
		<!-- 각 칼럼의 이름 -->
		<tr>
			<th width="10%">번호</th>
			<th width="50%">제목</th>
			<th width="15%">작성자</th>
			<th width="10%">조회수</th>
			<th width="15%">작성일</th>
		</tr>
		<!-- 목록의 내용 -->
<%
if (boardLists.isEmpty()) { //게시물이 하나도 없을 때
	
%>
	<tr>
		<td colspan="5" align="center">
			등록된 게시물이 없습니다~^^
		</td>
	</tr>

<%
} else { //게시물이 있을 때
	int virtualNum = 0; //화면상에서의 게시물 번호
	for(BoardDTO dto : boardLists) {
		virtualNum = totalCount--; //전체 게시물 수에서 시작해 1씩 감소
%>
		<tr align="center">
			<td><%= virtualNum %></td>	<!-- 게시물 번호 -->
			<td align="left">			<!-- 제목(+ 하이퍼링크) -->
				<a href="View.jsp?num=<%= dto.getNum() %>"><%= dto.getTitle() %>
				</a>
			</td>
				
			<td align="center"><%= dto.getId() %></td>
			<td align="center"><%= dto.getVisitcount() %></td>
			<td align="center"><%= dto.getPostdate() %></td>
		</tr>
<%
	}
}
%>		
	</table>
	
	<!-- 목록 하단의 [글쓰기] 버튼 -->
	<table border="1" width="90%">
		<tr align="right">
			<td><button type="button" onclick="location.href='03_Write.jsp';">글쓰기</button>
			</td>
	</table>
</body>
</html>