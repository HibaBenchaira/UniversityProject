<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
    <html>
        <head>
            <meta charset="utf-8">
            <title>Personnels List</title>
        </head>
        <body>
            <header>
                <h1>Personnels List</h1>
            </header>
            <main>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Nom Personnel</th>
                            <th scope="col">Email</th>
                            <th scope="col">Telephone</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${personnelsVue}" var="personnel">
                            <tr>
                                <td>${personnel.id}</td>
                                <td>${personnel.nomPersonnel}</td>
                                <td>${personnel.email}</td>
                                <td>${personnel.telephone}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

            </main>
            <footer>
                <a href="createPersonnel">Personnel Creation</a>
            </footer>
        </body>
</html>

