 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ page session="false" %>

<h1>
	Hello world!  
</h1>
   
  <spring:url value="/cart/addToCart/${product.id}" var="addToCart"></spring:url>
  
  <form:form action="${addToCart}" method="post">

  <div style="float: left;min-height:400px; left;width:700px; border-left-style: solid; border-right-style: solid; border-top-style: solid; border-bottom-style: solid; margin-left: 10px; margin-bottom: 10px; ">
  
   <div style="float: left;min-height:200px; left;width:300px;" >
   
   <img  src="${pageContext.servletContext.contextPath}/resources/${product.productImage}"/>
   
   </div>
   
   <b>Urun Adi  : </b> <b>${product.name}</b> </br><br/>
   <b>Urun Fiyati  : </b> <b>${product.price}</b></br><br/>
   <b>Renk  : </b> <b>${product.colour}</b></br><br/></br><br/>
  
   <b>Miktar : </b><input type="text" id="quantity"  name="quantity">
   <b>Sonuc: </b> <div id="result"></div>
   <input type="submit" id="button" value="Sepete Ekle"/>
  <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
    <script>
    $(document).ready(function(){
      $("#button").click(function(e){
          e.preventDefault();
        $.ajax({type: "POST",
                url: "${addToCart}",
                data: { quantity: $("#quantity").val()},
                dataType: "application/json",
                success:function(result){
         console.log(result);
        }});
      });
    });
    </script>
  </div>
         
         
  </form:form>      


