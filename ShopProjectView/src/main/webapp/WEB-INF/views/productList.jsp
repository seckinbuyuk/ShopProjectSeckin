<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>

<h1>
 
</h1>

  <c:forEach items="${products}" var="product">

  <div style="float: left;min-height:350px; left;width:180px; border-left-style: solid; border-right-style: solid; border-top-style: solid; border-bottom-style: solid; margin-right: 30px; marmargin-left: 30px; margin-bottom: 30px; ">
         
         
         <img style="  width: 150px;height: 200px;float:left" src="${pageContext.servletContext.contextPath}/resources/${product.productImage}"/>
         <br/> 
         <br/> 
         <br/> 
        <b> <p><c:out value="${product.name}"></c:out> </p> </b>
         
         
         <span style="color: red">  <p><c:out value="${product.price}"></c:out> </p> </span>
          
          <spring:url value="/products/details/${product.id}" var="details"></spring:url>
         <a href="${details}">Details Page</a>
    </div>


</c:forEach>