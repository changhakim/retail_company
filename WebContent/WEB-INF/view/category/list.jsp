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
     				   <!-- productID,
				   productName,
				   supplierID,
				   categoryID,
				   unit,
				   price; -->
   	
    <td>${cate.categoryID}</td>
    <td><a href="${ctx}/product.do?cmd=product_retrieve&page=product_detail&product_id=${cate.categoryID}"></a>${cate.categoryName}</td>
    <td>${cate.description}</td>
   
   
    

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
$('#category').attr('style','cursor:pointer')
.click(function(){
	location.assign('${ctx}/category.do?cmd=category_list&page=list');
});

$('#cate_register').click(()=>{
	$('#cate_side_menu > li').attr('style','background-color: white');
	$('#cate_register').attr('style','background-color: #d9edf7');
	
	$('#content').html(
				'<form id="form">'
			+'    <div class="form-group">'
			+'      <label for="text">카테고리이름</label>'
			+'      <input type="text" class="form-control" id="cate_name" placeholder="Enter email" name="cate_name">'
			+'    </div>'
			+'    <div class="form-group">'
			+'      <label for="text">상세설명</label>'
			+'      <textarea rows="4" clos="50" class="form-control" id="description" placeholder="Enter password" name="description"></textarea>'
			+'    </div>'
			+'    <button type="submit" class="btn btn-primary">Submit</button>'
			+'  </form>'
			+'</div>');
});
$('#search').click(()=>{
	
	
	$('#cate_side_menu > li').attr('style','background-color: white');
	$('#search').attr('style','background-color: #d9edf7');
	$('#content').html(
				'<form id="form">'
			+'    <div class="form-group">'
			+'      <label for="text">카테고리 검색:</label>'
			+'      <input type="text" class="form-control" id="cate_name" placeholder="Enter email" name="cate_name">'
			+'    </div>'
			+'<select>'
			+' <option name="cate_id" value="1000">스마트폰</option>'
			+' <option name="cate_id" value="1001">데스크탑</option>'
			+' <option name="cate_id" value="1002">노트북</option>'
			+' </select>'
			+'    <button type="submit" class="btn btn-primary">Search</button>'
			+'  </form>'
			+'</div>');
});

$('#cate_update').click(()=>{
	$('#cate_side_menu > li').attr('style','background-color: white');
	$('#cate_update').attr('style','background-color: #d9edf7');
	$('#content').html(
			 
			 		'<form action="/action_page.php">'
			  +			 '<h1>수정할카테고리</h1>'
			  +			'<input type="radio" name="gender" value="male"> 스마트폰<br>'
			  +			'<input type="radio" name="gender" value="female">데스크탑<br>'
			  +			'<input type="radio" name="gender" value="other"> 노트북<br>'
			  +			'</form>'	
			  +'<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">'
			  +'  수정하기'
			  +'</button>'
			
			  
			  +'<div class="modal" id="myModal">'
			  +'<div class="modal-dialog">'
			  +		'<div class="modal-content">'
			 
			  +'    <div class="modal-header">'
			  +'        <h4 class="modal-title">카테고리수정</h4>'
			  +'        <button type="button" class="close" data-dismiss="modal">&times;</button>'
			  +'      </div>'
			        
			  
			  +'       <div class="modal-body">'
			  +'       카테고리이름'
			  +'  	  <input type="text" class="form-control" id="cate_name" placeholder="Enter email" name="cate_name"> '  
			  +'       카테고리설명'
			  +'   <textarea rows="4" clos="50" class="form-control" id="description" placeholder="Enter password" name="description"></textarea>'   
			  +'</div>'
			        
			  
			  +'      <div class="modal-footer">'
			  +'        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>'
			  +'      </div>'
			        
			  +'    </div>'
			  +'  </div>'
			  +' </div>'
			  
			 
			 );
});
	






$('#cate_delete').click(()=>{
	$('#cate_side_menu > li').attr('style','background-color: white');
	$('#cate_delete').attr('style','background-color: #d9edf7');
	$('#content').html(
			'<form action="/action_page.php">'
			+'<h1>삭제할카테고리</h1>'
			+'<input type="checkbox" name="vehicle1" value="Bike"> 스마트폰<br>'
			+'<input type="checkbox" name="vehicle2" value="Car"> 데스크탑<br>'
			+'<input type="checkbox" name="vehicle3" value="Boat" checked> 노트북<br><br>'
			+'<input type="submit" value="Submit">'
			+'</form>'		
	
	);
});
</script>
    