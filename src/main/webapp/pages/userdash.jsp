<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>User View</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap JS (with Popper) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  
  <style>
    * {
      box-sizing: border-box;
    }

    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(to right, #667eea, #764ba2);
      padding: 20px;
      margin: 0;
      color: #333;
    }

    .container {
      background-color: white;
      padding: 25px;
      border-radius: 12px;
      max-width: 1100px;
      margin: auto;
      box-shadow: 0 8px 16px rgba(0,0,0,0.1);
      overflow-x: auto;
    }

    h2 {
      text-align: center;
      margin-bottom: 24px;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      min-width: 800px;
    }

    th, td {
      padding: 12px;
      border: 1px solid #ccc;
      text-align: center;
    }

    th {
      background-color: #f0f0f0;
      color: #333;
    }

    tbody tr:nth-child(even) {
      background-color: #f9f9f9;
    }

    button {
      padding: 10px 16px;
      border: none;
      border-radius: 6px;
      cursor: pointer;
      font-size: 14px;
      font-weight: bold;
      transition: 0.3s;
    }

    .logout-btn {
      background-color: #d9534f;
      color: white;
      float: right;
      margin-bottom: 15px;
    }

    .approve-btn {
      background-color: #28a745;
      color: white;
    }

    button:hover {
      opacity: 0.9;
    }

    .newbutton {
      text-align: center;
      margin-top: 20px;
    }

    .new-btn {
      background-color: #34495e;
      color: white;
      margin: 10px;
    }

    /* Responsive Design */
    @media (max-width: 768px) {
      .container {
        padding: 15px;
      }

      table, thead, tbody, th, td, tr {
        display: block;
      }

      thead tr {
        display: none;
      }

      tbody tr {
        margin-bottom: 15px;
        background-color: #ffffff;
        border-radius: 10px;
        box-shadow: 0 2px 5px rgba(0,0,0,0.1);
        padding: 10px;
      }

      td {
        text-align: left;
        padding-left: 50%;
        position: relative;
      }

      td::before {
        content: attr(data-label);
        position: absolute;
        left: 10px;
        top: 10px;
        width: 45%;
        font-weight: bold;
        white-space: nowrap;
        color: #555;
      }

      .logout-btn {
        float: none;
        display: block;
        margin: 10px auto;
        width: 100%;
      }

      button {
        width: 100%;
        margin: 5px 0;
      }

      .newbutton {
        display: flex;
        flex-direction: column;
        align-items: center;
      }
    }
  </style>
</head>
<body>

  <div class="container">
    <button class="logout-btn" onclick="logout()">Logout</button>
    <h2>Submitted Details</h2>

    <table>
      <thead>
        <tr>
          <th>Project Name</th>
          <th>Project Lead</th>
          <th>Location</th>
          <th>Remarks</th>
          <th>Maker Sub Date</th>
          <th>Checker Status</th>
          <th>Checker Remark</th>
          <th>Submit Date</th>
          <th>Edit</th>
          <th>Delete</th>
          <th>Approve</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${temp}" var="e">
          <tr>
            <td data-label="Project Name">${e.project_name}</td>
            <td data-label="Project Lead">${e.project_lead}</td>
            <td data-label="Location">${e.location}</td>
            <td data-label="Project Remarks">${e.project_remark}</td>
            <td data-label="Maker Submit Date">${e.maker_submit_date}</td>
            <td data-label="Checker Status">${e.project_checker_status}</td>
            <td data-label="Checker Remark">${e.project_checker_remark}</td>
            <td data-label="Submit Date">${e.checker_submit_date}</td>
            <td data-label="Edit"><a href="Edit/${e.project_id}" class="btn btn-success">Edit</a></td>
            <td data-label="Delete"><a href="Delete/${e.project_id}" class="btn btn-danger">Delete</a></td>
           
            <td data-label="Approve">
              <form action="approveProject/${e.project_id}" method="post" style="margin:0;">
               <input type="hidden" class="form-control" id="userid" name="userid" value=${e.userid}>
              
                <button type="submit" class="approve-btn">Approve</button>
              </form>
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>

  <div class="newbutton">
    <button class="new-btn" onclick="newbtn()">New</button>
  </div>

  <script>
    function logout() {
      window.location.href = "userlogin";
    }

    function newbtn() {
      window.location.href = "formpage";
    }
  </script>

</body>
</html>
