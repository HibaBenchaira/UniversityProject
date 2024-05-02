<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Personnel Creation</title>
    </head>
    <body>
        <header>
            <h1>Personnel Creation</h1>
        </header>
        <main>
            <form action="savePersonnel" method="post">
                <div>
                    <label for="nomPersonnel">Personnel Name : </label>
                    <input type="text" id="nomPersonnel" name="nomPersonnel">
                </div>
                <div>
                    <label for="email">Email : </label>
                    <input type="email" id="email" name="email">
                </div>
                <div>
                    <label for="telephone">Telephone : </label>
                    <input type="tel" id="telephone" name="telephone">
                </div>
                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
        </main>
        <footer>
            <a href="personnelsList">Personnels List</a>
        </footer>
    </body>
</html>

