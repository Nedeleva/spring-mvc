<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <title>Hello World!</title>
</head>
<body>
<h1>List of patients</h1>
<table border="2">
    <thead>
    <th>id</th>
    <th>full name</th>
    <th>age</th>
    </thead>
    <tbody>
    <c:forEach items="${patients}" var="patient">
        <tr>
            <td>${patient.id}</td>
            <td>${patient.fullName}</td>
            <td>${patient.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<h1>List of doctors</h1>
<table border="2">
    <thead>
    <th>id</th>
    <th>full name</th>
    <th>position</th>
    <th>age</th>
    </thead>
    <tbody>
    <c:forEach items="${doctors}" var="doctor">
        <tr>
            <td>${doctor.id}</td>
            <td>${doctor.fullName}</td>
            <td>${doctor.position}</td>
            <td>${doctor.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

