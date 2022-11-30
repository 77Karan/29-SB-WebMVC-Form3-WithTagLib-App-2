<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Studnet Registration Form</h3>
<form:form action="submitform" method="POST" modelAttribute="studentObjKey">
  <table>
    <tr>
      <td>Name: </td>
      <td><form:input path="StudentName"/></td>
    </tr>
    
    <tr>
      <td>Email: </td>
      <td><form:input path="studentEmail"/></td>
    </tr>
    
    <tr>
      <td>PhNo:</td>
      <td><form:input path="studentPhno"/></td>
    </tr>
    
    
    <tr>
      <td>Gender:</td>
      <td><form:radiobutton path="studentGender" value="M"/>Male</td>
      <td><form:radiobutton path="studentGender" value="F"/>Fe-Male</td>
    </tr>
    
    <tr>
      <td>Course:</td>
      <td>
        <form:select path="studentCourse">
          <form:option value="">-SELECT-</form:option>
          <form:option value="java">JAVA</form:option>
          <form:option value="phyton">Phyton</form:option>
          <form:option value="devOps">DevOps</form:option>
          <form:option value="angular">Angular</form:option>
        </form:select>
      </td>
    </tr>
    
    <tr>
    <td>Timings</td>
      <td><form:checkbox path="timings" value="mrng"/>Morning</td>
      <td><form:checkbox path="timings" value="noon"/>AfterNoon</td>
      <td><form:checkbox path="timings" value="eve"/>Evening</td>
    </tr>
  
    
    <tr>
      <td><input type="submit" value="Register"></td>
    </tr>
    
    
</table>
</form:form>
      
</body>
</html>