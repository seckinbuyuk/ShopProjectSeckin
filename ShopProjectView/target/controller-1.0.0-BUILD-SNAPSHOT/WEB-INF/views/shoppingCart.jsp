 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ page session="false" %>

<h1>
	Hello Shopping Cart world!  
</h1>
  
   <c:set var="sessionBean" value="${sessionScope['scopedTarget.shoppingCartSessionBean']}"/>
  
 
  <c:out value="${sessionBean.product.id} "></c:out>
  
  

