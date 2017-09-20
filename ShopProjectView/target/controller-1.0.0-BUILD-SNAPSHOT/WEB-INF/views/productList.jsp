<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>

<h1>
	Hello world!  
</h1>

  <c:forEach items="${products}" var="product">

  <div style="float: left;min-height:300px; left;width:250px; border-left-style: solid; border-right-style: solid; border-top-style: solid; border-bottom-style: solid; margin-left: 15px; margin-bottom: 15px; ">
         
         
         <img style="  width: 200px;height: 200px;float:left" src="${pageContext.servletContext.contextPath}/resources/${product.productImage}"/>
         <br/> 
         <br/> 
         <br/> 
         <b></b><c:out value="${product.name}"></c:out> </b>
         <br/>
         <br/>
          <b ><c:out value="${product.price}"></c:out> </b> 
          
          <spring:url value="/products/details/${product.id}" var="details"></spring:url>
         <a href="${details}">Detay Sayfası</a>
    </div>


</c:forEach>