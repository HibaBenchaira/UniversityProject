<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Department Edition</title>
</head>
<body>
<header>
    <h1>Department Edition</h1>
</header>
<main>
    <form action="updateDepartement" method="post">
        <div>
            <label hidden="hidden" for="id">Department ID : </label>
            <input hidden="hidden" id="id" name="id" value="${departementView.id}">
        </div>
        <div>
            <label for="nomDepartement">Department Name : </label>
            <input type="text" id="nomDepartement" name="nomDepartement" value="${departementView.nomDepartement}">
        </div>

        <div>
            <input type="submit" value="Update">
        </div>
    </form>
</main>
<footer>
    <a href="departementsList">Departements List</a>
</footer>
</body>
</html>
