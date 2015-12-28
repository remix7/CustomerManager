<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
第[${page.pagenum}]页/共[${page.totalpage}]页&nbsp;&nbsp;
 <a href="${pageContext.request.contextPath}/servlet/ShowAllCustomerServlet?pagenum=${1}">首页</a>&nbsp;&nbsp;
 <a href="${pageContext.request.contextPath}/servlet/ShowAllCustomerServlet?pagenum=${page.pagenum-1==0?1:page.pagenum-1}">上一页</a>&nbsp;&nbsp;
  <c:forEach begin="${page.startpage}" end="${page.endpage}" var="num">
  	<a href="${pageContext.request.contextPath}/servlet/ShowAllCustomerServlet?pagenum=${num}">${num}</a>
  </c:forEach>
  <a href="${pageContext.request.contextPath}/servlet/ShowAllCustomerServlet?pagenum=${page.pagenum==page.totalpage?page.totalpage:page.pagenum+1}">下一页</a>&nbsp;&nbsp;
  <a href="${pageContext.request.contextPath}/servlet/ShowAllCustomerServlet?pagenum=${page.totalpage}">尾页</a>
  <select id='s'>
  	<c:forEach begin="1" end="${page.totalpage}" var="num">
  		<option value="${num}" ${page.pagenum==num?'selected="selected"':'' }>${num}</option>
  	</c:forEach>
  </select>
  &nbsp;&nbsp;
  <a href="javascript:jump()">跳转</a>
  <script type="text/javascript">
  	function jump(){
		var num = document.getElementById("s").value;
		window.location.href="${pageContext.request.contextPath}/servlet/ShowAllCustomerServlet?pagenum="+num;
  	  }
  </script>