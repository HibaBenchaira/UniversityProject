<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Filiere Edition</title>
</head>
<body>
<header>
    <h1>Filiere Edition</h1>
</header>
<main>
    <form action="updateFiliere" method="post">
        <div>
            <label hidden="hidden" for="id">Filiere ID : </label>
            <input hidden="hidden" id="id" name="id" value="${filiereView.id}">
        </div>
        <div>
            <label for="nomFiliere">Filiere Name : </label>
            <input type="text" id="nomFiliere" name="nomFiliere" value="${filiereView.nomFiliere}">
        </div>

        <div>
            <input type="submit" value="Update">
        </div>
    </form>
</main>
<footer>
    <a href="filieresList">Filieres List</a>
</footer>
</body>
</html>
