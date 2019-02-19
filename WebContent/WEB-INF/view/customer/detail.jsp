<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/customer/mypage.css" />
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
<div class="grid-item" id= "side_bar">

	<div class= "myphoto">
	
	<div class= "myphotoin">
	<form id="file_form">
		<img src="${img}${image.imgName}.${image.imgExtention}"  style="height: 200px; width: 100%; ">
		<input type="file" name="file_upload" />
		<input type="submit" id="file_upload_btn" />
		<input type="hidden" name="cmd" value="cust_file_upload" />
		<input type="hidden" name="page" value="detail" />
	</form>
	</div>
	
	</div>
</div>
	<div class="grid-item" id= "content">


<div class="mypage">
	<div class="mypage1">아이디</div>
	<div class="mypage2">${cust.customerID}</div>
	<div class="mypage1">이름</div>
	<div class="mypage2">${cust.customerName}</div>
	<div class="mypage1">생년월일</div>
	<div class="mypage2">${cust.ssn}</div>
	<div class="mypage1">성별</div>
	<div class="mypage2">${cust.gender}</div>
	<div class="mypage1">전화번호</div>
	<div class="mypage2">${cust.phone}</div>
	<div class="mypage1">주소</div>
	<div class="mypage2">${cust.city}</div>
	<div class="mypage1">상세주소</div>
	<div class="mypage2">${cust.address}</div>
	<div class="mypage1">우편번호</div>
	<div class="mypage2">${cust.postalCode}</div>
</div>


</div>
<div class="grid-item update">
<div class= "update_btn1">
<span id="photo_btn" class="label label-danger" >사진수정</span>
</div>
<div class= "update_btn2">
<span id="update_btn" class="label label-warning" >정보수정</span>
</div>


</div>



		   
<jsp:include page="../home/bottom.jsp"/>



<script>
$('#update_btn').click(function(){
	
	alert('버튼클릭');
	location.assign('${ctx}/customer.do?cmd=cust_retrieve&page=update&customer_id=${cust.customerID}');
});
$('#file_upload_btn').attr('style','cursor:pointer').click(function(){
	$('#file_form')
	.attr('method','post')
	.attr('action','${ctx}/customer.do?cmd=cust_file_upload&page=detail&customer_id=${cust.customerID}')
	.attr('enctype','multipart/form-data')
	.submit();
	
});
</script>				   
				   
				   
