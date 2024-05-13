<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>University Edition</title>
</head>
<body>
<header>
    <h1>University Edition</h1>
</header>
<main>
    <form action="updateUniversite" method="post">
        <div>
            <label hidden="hidden" for="id">Universite ID : </label>
            <input hidden="hidden" id="id" name="id" value="${universiteView.id}">
        </div>
        <div>
            <label for="nomUniversite">University Name : </label>
            <input type="text" id="nomUniversite" name="nomUniversite" value="${universiteView.nomUniversite}">
        </div>


        <div>
            <input type="submit" value="Update">
        </div>
    </form>
</main>
<footer>
    <a href="universitiesList">Universities List</a>
</footer>
</body>
</html>


