<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f4f8;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .registration-container {
            background-color: #ffffff;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        h2 {
            text-align: center;
            color: #333333;
        }

        label {
            display: block;
            margin-top: 15px;
            color: #555555;
        }

        input[type="text"],
        input[type="email"],
        input[type="date"],
        input[type="password"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #cccccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            margin-top: 20px;
            background-color: #007bff;
            border: none;
            color: white;
            font-weight: bold;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="registration-container">
    <h2>User Registration</h2>
    <form action="/register" method="post">
        <label for="userId">User ID:</label>
        <input type="number" id="userId" name="userId" required>

        <label for="userName">Username:</label>
        <input type="text" id="userName" name="userName" required>

        <label for="userEmail">Email:</label>
        <input type="email" id="userEmail" name="userEmail" required>

        <label for="userDOB">Date of Birth:</label>
        <input type="date" id="userDOB" name="userDOB" required>

        <label for="userPassword">Password:</label>
        <input type="password" id="userPassword" name="userPassword" required>

        <label for="userConfirmPass">Confirm Password:</label>
        <input type="password" id="userConfirmPass" name="userConfirmPass" required>

        <input type="submit" value="Register">
    </form>
</div>

</body>
</html>
