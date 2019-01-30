<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h1>사원등록</h1>
</div>
<div class="grid-item" id="content">
<table style="width:100%">
  <tr>
    <th>NO.</th>
    <th>고객명</th> 
    <th>이름</th>
    <th>닉네임</th>
    <th>도시</th>
    <th>상세주소</th>
    <th>우편번호</th>
    <th>국가</th>
  </tr>
  <tr>
    <td>1</td>
    <td>1234</td>
    <td>홍길동</td>
    <td>HONG</td>
    <td>서울시 강남구</td>
    <td>강남대로 1</td>
    <td>12345</td>
    <td>대한민국</td>
  </tr>
 
</table>



<div class="center">
  <div class="pagination">
  <a href="#">&laquo;</a>
  <a href="#">1</a>
  <a href="#" class="active">2</a>
  <a href="#">3</a>
  <a href="#">4</a>
  <a href="#">5</a>
  <a href="#">6</a>
  <a href="#">&raquo;</a>
  </div>
</div>
</div>
<jsp:include page="../home/bottom.jsp"/>
    