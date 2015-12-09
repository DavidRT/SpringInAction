<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" 
          href="<c:url value="/resources/style.css" />" >
          <style>
          label.error{
            color:red;
          }
          input.error{
          background-color:#ffcccc;
          }
          </style>
  </head>
  <body>
    <h1>Register</h1>

<sf:form method="POST" commandName="spitter">
<sf:errors path="*" element="div" cssClass="errors" />
    <!-- highlight field to display error. -->
    <sf:label path="firstName" cssErrorClass="error">First Name</sf:label>
     <sf:input path="firstName" /> <sf:errors path="firstName" cssClass="error"/> <br/>
      Last Name:   <sf:input path="lastName" /><br/>
      Email:  <sf:input path="email" /><br/>
      Username:  <sf:input path="username" /><br/>
      Password:  <sf:password path="password" /><br/>
      <input type="submit" value="Register" />
</sf:form>
  </body>
</html>