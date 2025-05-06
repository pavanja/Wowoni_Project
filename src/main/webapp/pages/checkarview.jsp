<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Checker View</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    * {
      box-sizing: border-box;
    }

    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(to right, #667eea, #764ba2);
      padding: 20px;
    }

    .nav-buttons {
      display: flex;
      justify-content: flex-end;
      gap: 10px;
      margin-bottom: 20px;
      flex-wrap: wrap;
    }

    .nav-buttons button {
      padding: 10px 18px;
      border: none;
      border-radius: 6px;
      background-color: #fb0a5e;
      color: white;
      font-size: 14px;
      cursor: pointer;
      transition: background-color 0.3s ease;
    }

    .nav-buttons button:hover {
      background-color: #0056b3;
    }

    table {
      width: 100%;
      max-width: 900px;
      margin: auto;
      border-collapse: collapse;
      background-color: white;
      box-shadow: 0 0 10px rgba(0,0,0,0.05);
      border-radius: 8px;
      overflow: hidden;
    }

    th, td {
      padding: 14px;
      border: 1px solid #ddd;
      text-align: center;
    }

    th {
      background-color: #f2f2f2;
      font-weight: bold;
    }

    .disabled {
      color: gray;
      text-decoration: none;
      pointer-events: none;
    }

    a {
      color: #007bff;
      text-decoration: none;
    }

    a:hover:not(.disabled) {
      text-decoration: underline;
    }

    /* Responsive */
    @media (max-width: 768px) {
      table, thead, tbody, th, td, tr {
        display: block;
      }

      thead {
        display: none;
      }

      tbody tr {
        margin-bottom: 15px;
        background-color: white;
        padding: 10px;
        border-radius: 8px;
        box-shadow: 0 0 5px rgba(0,0,0,0.1);
      }

      td {
        text-align: left;
        padding-left: 50%;
        position: relative;
        border: none;
        border-bottom: 1px solid #eee;
      }

      td::before {
        content: attr(data-label);
        position: absolute;
        left: 10px;
        top: 12px;
        font-weight: bold;
        color: #333;
      }

      .nav-buttons {
        justify-content: center;
        margin-bottom: 30px;
      }

      .nav-buttons button {
        width: 100%;
        max-width: 200px;
      }
    }
  </style>
</head>
<body>

<div class="nav-buttons">
  <button onclick="goBack()">Back</button>
  <button onclick="logout()">Logout</button>
</div>

<table>
  <thead>
    <tr>
      <th>User Name</th>
      <th>Project Name</th>
      <th>Maker Update Status</th>
      <th>View</th>
    </tr>
  </thead>
  <tbody>
 <c:forEach var="e" items="${checkerdata}">
  <tr>
    <td data-label="User Name">${e.userName}</td>
    <td data-label="Project Name">${e.projectName}</td>
    <td data-label="Maker Update Status">${e.makerStatus}</td>
    <td data-label="View"><a href="checkarview2/${e.projectId}">Click to View</a></td>
  </tr>
</c:forEach>
  </tbody>
</table>

<script>
  function goBack() {
    window.location.href = "checker"; 
  }

  function logout() {
    alert("You have been logged out.");
     window.location.href = "userlogin";     // Uncomment this to redirect
  }
</script>

</body>
</html>
