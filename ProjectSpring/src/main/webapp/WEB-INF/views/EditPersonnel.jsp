<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Personnel Edition</title>
    </head>
    <body>
        <header>
            <h1>Personnel Edition</h1>
        </header>
        <main>
            <form action="updatePersonnel" method="post">
                <div>
                    <label hidden="hidden" for="id">Personnel ID : </label>
                    <input hidden="hidden" id="id" name="id" value="${personnelView.id}">
                </div>
                <div>
                    <label for="nomPersonnel">Personnel Name : </label>
                    <input type="text" id="nomPersonnel" name="nomPersonnel" value="${personnelView.nomPersonnel}">
                </div>
                <div>
                    <label for="email">Email : </label>
                    <input type="email" id="email" name="email" value="${personnelView.email}">
                </div>
                <div>
                    <label for="telephone">Telephone : </label>
                    <input type="tel" id="telephone" name="telephone"  value="${personnelView.telephone}" >
                </div>
                <div>
                    <input type="submit" value="Update">
                </div>
            </form>
        </main>
        <footer>
            <a href="personnelsList">Personnels List</a>
        </footer>
    </body>
</html>

