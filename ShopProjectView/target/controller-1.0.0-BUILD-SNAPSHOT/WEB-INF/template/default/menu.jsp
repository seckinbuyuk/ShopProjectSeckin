<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<spring:url value="/" var="home"></spring:url>
<spring:url value="/login/view" var="login"></spring:url>
<spring:url value="/logout" var="logout"></spring:url>
<spring:url value="/contact" var="contact"></spring:url>
<c:set value="${sessionScope['scopedTarget.userLoginBean']}" var="userBean"/>
<a href="${home}" style="margin-right: 5px;">Home</a>

<a href="${contact}" style="margin-right: 5px;">Contact</a>
<br/>
