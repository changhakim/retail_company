<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="head.jsp"/>
	<style>
.grid-container {
  display: grid;

  grid-template-columns: auto auto auto auto;
  
  background-color: white;
  grid-gap: 4px;
  padding: 10px;
  }
.grid-container > div {
  background-color: rgba(255, 255, 255, 0.8);
  border : 1px solid aqua;
  text-align: center;
  padding: 50px 0;
  font-size: 15px;
  


}
#item1{
	grid-column-start: 1;
	grid-column-end: 5;
	padding-top: 20px;
	padding-bottom: 20px;
	font-size:50px;
	font-family: 'Cute Font', cursive;
}
#item2 {
	grid-column-start: 1;
	grid-column-end: 4;
	padding-top: 20px;
	padding-bottom: 20px;
	font-family: 'Jua', sans-serif;
	
	
}
#item3 {
	grid-column-start: 4;
	grid-column-end: 5;
	padding-top: 30px;
	padding-bottom: 30px;
}
#item4 {

	grid-column-start: 1;
	grid-column-end: 2;
	display: grid;
	grid-template-rows: 300px;
	
}
#item5 {
	grid-column-start: 2;
	grid-column-end: 5;
	font-size: 30px;
 	font-family: 'Nanum Brush Script', cursive;
/*font-family: 'Jua', sans-serif;
font-family: 'Cute Font', cursive;
font-family: 'East Sea Dokdo', cursive; */

	

}
#item6 {
	grid-column-start: 1;
	grid-column-end: 5;
}



</style>
<body>

<div class="grid-container">
	<div class="grid-item" id="item1">
	<jsp:include page="header.jsp"/>
	</div>
	<div class="grid-item" id="item2">
	<c:choose>
				<c:when test="${compo eq 'pre'}">
				<jsp:include page="pre-navi-bar.jsp"/>
				</c:when>
				<c:otherwise>
				<jsp:include page="post-navi-bar.jsp"/>
				</c:otherwise>
				</c:choose>
	</div>
	<div class="grid-item" id="item3">로그인</div>
	<div class="grid-item" id="item4">
	
	</div>
	<div class="grid-item" id="item5">
		<c:choose>
					<c:when test="${compo eq 'pre'}">
					<jsp:include page="../employee/register.jsp"/>
					</c:when>
					<c:otherwise>
					<jsp:include page="post-navi-bar.jsp"/>
					</c:otherwise>
				</c:choose>
	</div>
	<div class="grid-item" id="item6">
	<jsp:include page="footer.jsp"/>
	</div>
</div>
	

	</body>
</html>