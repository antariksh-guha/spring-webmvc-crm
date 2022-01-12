<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset=UTF-8">
    <title>Student Details</title>
</head>
<body>
    <h1 align="center">Students Management System</h3><br>
    <div align="center">
        <table border="1">
            <thead>
                <tr>
                    <td>id</td>
                    <td>name</td>
                    <td>marks</td>
                </tr>
            </thead>

            <c:forEach items="${students}" var="student">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.marks}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>