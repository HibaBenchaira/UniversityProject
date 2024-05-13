<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Faculty Edition</title>
</head>
<body>
<header>
    <h1>Faculty Edition</h1>
</header>
<main>
    <form action="updateFaculte" method="post">
        <div>
            <label hidden="hidden" for="id">Faculty ID : </label>
            <input hidden="hidden" id="id" name="id" value="${faculteView.id}">
        </div>
        <div>
            <label for="nomFaculte">Faculty Name : </label>
            <input type="text" id="nomFaculte" name="nomFaculte" value="${faculteView.nomFaculte}">
        </div>

        <div>
            <input type="submit" value="Update">
        </div>
    </form>
</main>
<footer>
    <a href="facultiesList">Faculties List</a>
</footer>
</body>
</html>
