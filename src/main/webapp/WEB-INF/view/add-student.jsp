<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset=UTF-8">
    <title>Student Details</title>
</head>
<body>
    <div align="center">
        <h3>Add Student</h3>
        <form:form action="savestudent" modelAttribute="student" method="POST">
            <label>Name:</label>
            <form:input path="name"/> </br>

            <label>Marks:</label>
            <form:input path="marks"/> </br>

            <input type="submit" value="Submit">
        </form:form>
    </div>
</body>
</html>