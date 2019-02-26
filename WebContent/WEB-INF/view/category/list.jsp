<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/customer/customer_list.css" />
<div class="grid-item" id="navi_bar">
				
				<div class="new_navi_bar grid-item">
					<div id="li_navi1"><a href="home.do">홈으로</a></div>
					<div id="li_navi2"><a id="category" href="#">카테고리</a></div>
					<div id="li_navi3"><a href="#">사원</a></div>
					<div id="li_navi4"><a href="#">주문</a></div>
					<div id="li_navi5"><a href="#">상품</a></div>
					<div id="li_navi6"><a href="#">선박</a></div>
					<div id="li_navi7"><a href="#">공급업체</a></div>
					
					</div>
					
				
</div>
<div class="grid-item" id="side_bar">
<div class="container" style="width: 200px">
	 
	  <ul class="list-group"id="cate_side_menu" >
	    <li class="list-group-item" id="cate_list"style="background-color: #d9edf7">카테고리 목록</li>
	    <li class="list-group-item" id="cate_register">카테고리 등록</li>
	    <li class="list-group-item" id="search">카테고리 조회</li>
	    <li class="list-group-item" id="cate_update">카테고리 수정</li>
	    <li class="list-group-item" id="cate_delete">카테고리 삭제</li>
	  </ul>
	</div>

</div>
<div class="grid-item" id="content">
<div id= "add">
<span id="pro_btn" class="label label-danger" >상품추가</span>
</div>
<table style="margin:auto">
 					<!-- ,
			       categoryName,
			       description; -->
  <tr>
   	<th>NO.</th> 
    <th>카테고리명</th> 
    <th>설명</th>

    
    
   
    
  </tr>
  
 <c:forEach items="${list}"  var="cate" varStatus="status">


 
  <tr>
     				
   	
    <td>${cate.categoryID}</td>
    <td><a href="${ctx}/category.do?cmd=category_retrieve&page=category_detail&category_id=${cate.categoryID}"></a>${cate.categoryName}</td>
    <td>${cate.description}</td>
   
   
    

  </tr>
 </c:forEach>
</table>



<div class="center">
  <div class="pagination">
  <c:if test="${pagination.existPrev}">
  		<a href="${ctx}/category.do?cmd=category_list&page=list&page_size=5&page_num=${pagination.prevBlock}" >&laquo;</a>
  </c:if>
  
  <c:forEach begin="${pagination.startpage}" end="${pagination.endpage}" varStatus="status">
  		<c:choose>
  		<c:when test="${pagination.pageNum eq status.index}">
  		<a class ="pagec active" href="#">${status.index}</a>
  		</c:when>
  		<c:otherwise>
  		<a class ="pagec" href="#">${status.index}</a>
  		</c:otherwise>
  		</c:choose>
  		
  </c:forEach>
  
  	<c:if test="${pagination.existNext}">
  		<a href="${ctx}/category.do?cmd=category_list&page=list&page_size=5&page_num=${pagination.nextBlock}">&raquo;</a>
  	</c:if>
  </div>
</div>
</div>
<jsp:include page="../home/bottom.jsp"/>

<script src="${js}/category.js">

</script>
    