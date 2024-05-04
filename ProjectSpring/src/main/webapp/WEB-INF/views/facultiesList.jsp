<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Faculties List</title>
</head>
<body>
<header>
    <h1>Faculties List</h1>
</header>
<main>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Nom Faculte</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${facultiesVue}" var="faculte">
            <tr>
                <td>${faculte.id}</td>
                <td>${faculte.nomFaculte}</td>
                <td>
                    <a onclick="return confirm('Are you sure you want to delete?')"
                       href="/deleteFaculte?id=${faculte.id}">
                        Delete
                    </a>
                    <a href="/editFaculte?id=${faculte.id}">
                        Edit
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</main>
<footer>
    <a href="createFaculte">Create Faculty</a>
</footer>
</body>
</html>
