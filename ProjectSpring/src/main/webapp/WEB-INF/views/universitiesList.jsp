<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Universities List</title>
</head>
<body>
<header>
    <h1>Universities List</h1>
</header>
<main>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Nom Université</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${universitiesVue}" var="universite">
            <tr>
                <td>${universite.id}</td>
                <td>${universite.nomUniversite}</td>

                <td>
                    <a      onclick="return confirm('Are you sure you want to delete?')"
                            href="/deleteUniversite?id=${universite.id}">
                        Delete
                    </a>
                </td>
                <td>
                    <a href="/editUniversite?id=${universite.id}">
                        Edit
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</main>
<footer>
    <a href="createUniversite">University Creation</a>
</footer>
</body>
</html>

