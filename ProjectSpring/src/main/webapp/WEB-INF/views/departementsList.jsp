<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Departements List</title>
</head>
<body>
<header>
    <h1>Departements List</h1>
</header>
<main>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Nom Departement</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${departementsVue}" var="departement">
            <tr>
                <td>${departement.id}</td>
                <td>${departement.nomDepartement}</td>

                <td>
                    <a      onclick="return confirm('Are you sure you want to delete?')"
                            href="/deleteDepartement?id=${departement.id}">
                        Delete
                    </a>
                </td>
                <td>
                    <a href="/editDepartement?id=${departement.id}">
                        Edit
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</main>
<footer>
    <a href="createDepartement">Departement Creation</a>
</footer>
</body>
</html>

