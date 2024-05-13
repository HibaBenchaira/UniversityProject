<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Department Creation</title>
</head>
<body>
<header>
    <h1>Department Creation</h1>
</header>
<main>
    <form action="saveDepartement" method="post">
        <div>
            <label for="nomDepartement">Department Name : </label>
            <input type="text" id="nomDepartement" name="nomDepartement">
        </div>

        <div>
            <input type="submit" value="Save">
        </div>
    </form>
</main>
<footer>
    <a href="departementsList">Departements List</a>
</footer>
</body>
</html>
