<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>

<br/>
<br/>
<c:forEach items="${categories}" var="cat">

	<spring:url value="/products/category/${cat.id}/" var="catlink"/>
	<br/>
	<br/>
	<a href="${catlink}">${cat.name}</a> <br/>

</c:forEach>




	

