<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Filieres List</title>
</head>
<body>
<header>
    <h1>Filieres List</h1>
</header>
<main>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Nom Filiere</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${filieresVue}" var="filiere">
            <tr>
                <td>${filiere.id}</td>
                <td>${filiere.nomFiliere}</td>

                <td>
                    <a      onclick="return confirm('Are you sure you want to delete?')"
                            href="/deleteFiliere?id=${filiere.id}">
                        Delete
                    </a>
                </td>
                <td>
                    <a href="/editFiliere?id=${filiere.id}">
                        Edit
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</main>
<footer>
    <a href="createFiliere">Filiere Creation</a>
</footer>
</body>
</html>

