 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ page session="false" %>

<h1>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SHOPPING CART
</h1>
  
  <table width="600" height="350" border="0" cellspacing="0" cellpadding="0"> 
<tr> 
<td> 

<div style="width: 100%; height: 100%; overflow: scroll; border: 0px;"> 
<table >
<c:forEach items="${allCartItems}" var="items">
<tr>
<td>
   <img style="  width: 180px;height: 180px;float:left" src="${pageContext.servletContext.contextPath}/resources/${items.product.productImage}"/>
 <td/>
 <td>  
  <b> <c:out value="Quantity : ${items.quantity}"></c:out></b>
  <td/>
 <td>
   <b> <c:out value="Price : ${items.price}"></c:out></b>
   <br/>
</td>
</tr>

</c:forEach>


</table>




</div> 
</td> 
</tr> 
</table >
<br/><br/>
<b>Total : <c:out value="${totalAmount} TL"></c:out>   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </b>   <input type="submit" id="button" value="Checkout"/>