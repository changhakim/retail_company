<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/customer/customer_list.css" />
<div class="grid-item" id="navi_bar">
<ul class="ul_navi_bar">
					
					<li ><a href="home.do">홈으로</a></li>
					<li ><a href="#">카테고리</a></li>
					<li ><a href="#">사원</a></li>
					<li ><a href="#">주문</a></li>
					<li ><a href="#">상품</a></li>
					<li ><a href="#">선박</a></li>
					<li ><a href="#">공급업체</a></li>
					
				</ul>
</div>
<div class="grid-item" id="side_bar">
<h1>상품목록</h1>
</div>
<div class="grid-item" id="content">
<div id= "add">
<span id="pro_btn" class="label label-danger" >상품추가</span>
</div>
<table style="margin:auto">
 
  <tr>
   	<th>제품번호</th> 
    <th>상품이름</th> 
    <th>담당자아이디</th>
    <th>카테고리아이디</th>
    <th>재고</th>
    <th>가격</th>
    <th>수정</th>
    <th>삭제</th>
    
   
    
  </tr>
  
 <c:forEach items="${list}"  var="pro" varStatus="status">


 
  <tr>
     				   <!-- productID,
				   productName,
				   supplierID,
				   categoryID,
				   unit,
				   price; -->
   	<td>${pro.productID}</td>
    <td><a href="${ctx}/product.do?cmd=product_retrieve&page=product_detail&product_id=${pro.productID}">${pro.productName}</a></td>
    <td>${pro.supplierID}</td>
    <td>${pro.categoryID}</td>
    <td>${pro.unit}</td>
    <td>${pro.price}</td>
    <td>
    	<div id= "update">
		<span id="pro_btn" class="label label-danger"><a href="${ctx}/product.do?cmd=product_retrieve&page=product_update&product_id=${pro.productID}">수정</a></span>
		</div>
	</td>
    <td>
    	
		<a href="${ctx}/product.do?cmd=product_delete&page=product_list&product_id=${pro.productID}">삭제</a>
		
	</td>
    

  </tr>
 </c:forEach>
</table>



<div class="center">
  <div class="pagination">
  <c:if test="${pagination.existPrev}">
  		<a href="${ctx}/product.do?cmd=product_list&page=product_list&page_size=5&page_num=${pagination.prevBlock}" >&laquo;</a>
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
  		<a href="${ctx}/product.do?cmd=product_list&page=product_list&page_size=5&page_num=${pagination.nextBlock}">&raquo;</a>
  	</c:if>
  </div>
</div>
</div>
<jsp:include page="../home/bottom.jsp"/>

<script>

$('#add').click(function(){
	location.assign('${ctx}/product.do?cmd=move&page=product_register');
});
$('.pagec').each(function(index){
$(this).click(function(){
		location.assign('${ctx}/product.do?cmd=product_list&page=product_list&page_size=5&page_num='+$(this).text());
	});

});


</script>
    