<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Admin View</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <style>
    * {
      box-sizing: border-box;
    }

    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(to right, #667eea, #764ba2);
      margin: 0;
      padding: 20px;
      color: #333;
    }

    .container {
      background-color: #ffffff;
      padding: 25px;
      border-radius: 12px;
      max-width: 1000px;
      margin: auto;
      box-shadow: 0 8px 16px rgba(0,0,0,0.2);
      overflow-x: auto;
    }

    h2 {
      text-align: center;
      margin-bottom: 24px;
      color: #2c3e50;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      min-width: 600px;
    }

    th, td {
      padding: 14px 12px;
      border: 1px solid #ccc;
      text-align: center;
    }

    th {
      background-color: #f2f2f2;
      color: #222;
    }

    tbody tr:nth-child(even) {
      background-color: #f9f9f9;
    }

    .btn-group {
      display: flex;
      justify-content: flex-end;
      margin-top: 25px;
      gap: 12px;
      flex-wrap: wrap;
    }

    button {
      padding: 10px 20px;
      border: none;
      border-radius: 6px;
      font-size: 16px;
      font-weight: bold;
      cursor: pointer;
      transition: background-color 0.3s ease;
    }

    .back-btn {
      background-color: #34495e;
      color: white;
    }

    .logout-btn {
      background-color: #e74c3c;
      color: white;
    }

    button:hover {
      opacity: 0.9;
    }

    /* Responsive Styles */
    @media (max-width: 768px) {
      body {
        padding: 10px;
      }

      .container {
        padding: 20px;
      }

      table {
        min-width: 100%;
        font-size: 14px;
      }

      th, td {
        padding: 10px;
      }

      .btn-group {
        justify-content: center;
      }

      button {
        flex: 1;
        min-width: 120px;
      }
    }

    @media (max-width: 480px) {
      table, thead, tbody, th, td, tr {
        display: block;
      }

      thead {
        display: none;
      }

      tbody tr {
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 8px;
        background-color: #fefefe;
        padding: 10px;
      }

      td {
        text-align: left;
        padding: 8px 10px;
        position: relative;
      }

      td::before {
        content: attr(data-label);
        font-weight: bold;
        color: #444;
        display: block;
        margin-bottom: 4px;
      }
    }
  </style>
</head>
<body>

  <div class="container">
    <h2>Admin Dashboard</h2>
    <table>
      <thead>
        <tr>
          <th>User</th>
          <th>Status Update</th>
          <th>Checker Status</th>
          <th>Remark</th>
        </tr>
      </thead>
      <tbody>
        <!-- Loop through projects and show data dynamically -->
        <c:forEach var="p" items="${projects}">
          <tr>
            <td>${p.userName}</td>
            <td>${p.makerStatus}</td>
            <td>${p.projectCheckerStatus}</td>
            <td>${p.projectCheckerRemark}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>

    <div class="btn-group">
      <button class="logout-btn" onclick="logout()">Logout</button>
    </div>
  </div>

  <script>
    function logout() {
      window.location.href = "userlogin";
    }
  </script>

</body>
</html>
