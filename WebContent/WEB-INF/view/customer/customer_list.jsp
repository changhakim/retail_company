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
<h1>고객목록</h1>
</div>
<div class="grid-item" id="content">
<table style="margin:auto">
  <tr>
   	<th>NO.</th> 
    <th>아이디</th> 
    <th>이름</th>
    <th>생년월일</th>
    <th>성 별</th>
    <th>전화번호</th>
    <th>우편번호</th>
    <th>지번주소</th>
    <th>상세주소</th>
   
    
  </tr>
  
 <c:forEach items="${list}"  var="cust" varStatus="status">


 
  <tr>
    
   	<td>${cust.no}</td>
    <td>${cust.customerID}</td>
    <td>${cust.customerName}</td>
    <td>${cust.ssn}</td>
    <td>${cust.gender}</td>
    <td>${cust.phone}</td>
    <td>${cust.postalCode}</td>
    <td>${cust.city}</td>
    <td>${cust.address}</td>
  </tr>
 </c:forEach>
</table>



<div class="center">
  <div class="pagination">
  <a href="#" >&laquo;</a>
  <a id ="1_btn" href="#" class="active">1</a>
  <a id ="2_btn" href="#">2</a>
  <a id ="3_btn" href="#" >3</a>
  <a id ="4_btn" href="#">4</a>
  <a id ="5_btn" href="#">5</a>
  <a id ="6_btn" href="#">6</a>
  <a id ="7_btn" href="#">7</a>
  <a href="#">&raquo;</a>
  </div>
</div>
</div>
<jsp:include page="../home/bottom.jsp"/>

<script>
$('#1_btn').click(function(){
	
	location.assign('${ctx}/customer.do?cmd=cust_list&page=customer_list&page_num=1&page_size=5')
	// page_num,pageSize,cmd,dir,page
	// ?cmd=list&page=list&page_num=2&page_size=5

});
$('#2_btn').click(function(){
	
	location.assign('${ctx}/customer.do?cmd=cust_list&page=customer_list&page_num=2&page_size=5')
	// page_num,pageSize,cmd,dir,page
	// ?cmd=list&page=list&page_num=2&page_size=5

});
$('#3_btn').click(function(){
	
	location.assign('${ctx}/customer.do?cmd=cust_list&page=customer_list&page_num=3&page_size=5')
	// page_num,pageSize,cmd,dir,page
	// ?cmd=list&page=list&page_num=2&page_size=5

});
$('#4_btn').click(function(){
	
	location.assign('${ctx}/customer.do?cmd=cust_list&page=customer_list&page_num=4&page_size=5')
	// page_num,pageSize,cmd,dir,page
	// ?cmd=list&page=list&page_num=2&page_size=5

});
$('#5_btn').click(function(){
	
	location.assign('${ctx}/customer.do?cmd=cust_list&page=customer_list&page_num=5&page_size=5')
	// page_num,pageSize,cmd,dir,page
	// ?cmd=list&page=list&page_num=2&page_size=5

});
$('#6_btn').click(function(){
	
	location.assign('${ctx}/customer.do?cmd=cust_list&page=customer_list&page_num=6&page_size=5')
	// page_num,pageSize,cmd,dir,page
	// ?cmd=list&page=list&page_num=2&page_size=5

});
$('#7_btn').click(function(){
	
	location.assign('${ctx}/customer.do?cmd=cust_list&page=customer_list&page_num=7&page_size=5')
	// page_num,pageSize,cmd,dir,page
	// ?cmd=list&page=list&page_num=2&page_size=5

});
</script>
    