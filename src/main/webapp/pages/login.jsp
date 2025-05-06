<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Login Page</title>
  <style>
    * {
      box-sizing: border-box;
    }

    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      background: url("\technology-6701504_1280.jpg");
      background-size: cover;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .login-container {
      background-color: rgba(237, 249, 245, 0.95);
      padding: 30px 25px;
      border-radius: 10px;
      box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
      width: 100%;
      max-width: 400px;
    }

    .login-container label {
      display: block;
      margin-top: 10px;
      font-weight: bold;
    }

    .login-container input[type="text"],
    .login-container input[type="password"],
    .login-container select {
      width: 100%;
      padding: 10px;
      margin-top: 5px;
      border: 1px solid #ccc;
      border-radius: 5px;
    }

    .button-group {
      display: flex;
      justify-content: space-between;
      margin-top: 15px;
      flex-wrap: wrap;
    }

    .button-group button {
      flex: 1;
      padding: 10px;
      border: none;
      background-color: #008cba;
      color: white;
      border-radius: 5px;
      cursor: pointer;
      margin: 5px 5px 0 0;
    }

    .login-btn {
      display: block;
      width: 100%;
      margin-top: 20px;
      padding: 10px;
      background-color: #4CAF50;
      color: white;
      border: none;
      border-radius: 6px;
      font-size: 16px;
      cursor: pointer;
    }

    .login-btn:hover,
    .button-group button:hover {
      opacity: 0.9;
    }

    @media (max-width: 400px) {
      .button-group {
        flex-direction: column;
        gap: 10px;
      }

      .button-group button {
        width: 100%;
        margin: 0;
      }
    }
  </style>
</head>
<body>

  <div class="login-container">
  <form action="loginusercheck" method="post">
    <label for="role">Select Role</label>
    <select name="role" id="role" required>
      <option value="">Select</option>
      <option value="user">User</option>
      <option value="admin">Admin</option>
      <option value="checker">Checker</option>
    </select>

    <label for="username">User Name</label>
    <input type="text" id="username" name="username" required>

    <label for="password">Password</label>
    <input type="password" id="password" name="password" required>

    <div class="button-group">
      <button type="button" onclick="alert('Password reset not implemented.')">Forget Password</button>
      <button type="button" onclick="clearFields()">Cancel</button>
    </div>

    <button type="submit" class="login-btn">Login</button>
  </form>
</div>

  <script>
    function login() {
      const role = document.getElementById("role").value;
      if (role === "admin") {
        window.location.href = "admin.jsp";
      } else if (role === "user") {
        window.location.href = "user.jsp";
      } else if (role === "checker") {
        window.location.href = "checkarview.jsp";
      } else {
        alert("Please select a valid role.");
      }
    }

    function clearFields() {
      document.getElementById("username").value = "";
      document.getElementById("password").value = "";
      document.getElementById("role").selectedIndex = 0;
    }
  </script>
</body>
</html>
