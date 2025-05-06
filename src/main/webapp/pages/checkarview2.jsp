<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Checker View</title>
  <style>
    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(to right, #667eea, #764ba2);
      padding: 85px;
    }
    .container {
      border: 2px solid black;
      padding: 19px;
      max-width: 700px;
      margin: auto;
      border-radius: 9px;
      background-color: white;
    }
    table {
      width: 100%;
      border-collapse: collapse;
      margin-bottom: 10px;
    }
    th, td {
      text-align: left;
      padding: 8px;
    }
    .button-group {
      margin-top: 10px;
    }
    button {
      margin-right: 10px;
      padding: 6px 14px;
      cursor: pointer;
    }
    .close-button {
      float: right;
      cursor: pointer;
      font-weight: bold;
      padding: 10px;
    }
  </style>
</head>
<body>
  <div class="container">
    <div class="close-button" onclick="closeForm()">Close</div>
    <table>
      <tr>
        <th>Project Name</th>
        <th>Project Leader</th>
        <th>Location</th>
        <th>Remark</th>
      </tr>
      <tr>
        <td>${temp.get().project_name}</td>
        <td>${temp.get().project_lead}</td>
        <td>${temp.get().location}</td>
        <td>${temp.get().project_remark}</td>
      </tr>
    </table>

    <form action="/updateproject" method="post" id="statusForm">
      <input type="hidden" name="projectId" value="${temp.get().project_id}" />
      <input type="hidden" name="project_name" value="${temp.get().project_name}" />
      <input type="hidden" name="project_lead" value="${temp.get().project_lead}" />
      <input type="hidden" name="location" value="${temp.get().location}" />
      <input type="hidden" name="MakerStatus" value="${temp.get().makerStatus}" />
      <input type="hidden" name="project_remark" value="${temp.get().project_remark}" />
      <input type="hidden" name="maker_submit_date" value="${temp.get().maker_submit_date}" />
      <input type="hidden" name="userid" value="${temp.get().userid}" />
      <input type="hidden" name="mangerid" value="${temp.get().mangerid}" />

      <h4>Checker Remark</h4>
      <input type="text" name="project_checker_remark" required />

      <input type="hidden" name="project_checker_status" id="project_checker_status" />
      <div class="button-group">
        <button type="submit" onclick="setStatus('Done')">Approve</button>
        <button type="submit" onclick="setStatus('Rejected')">Reject</button>
      </div>
    </form>
  </div>

  <script>
    function setStatus(status) {
      document.getElementById('project_checker_status').value = status;
      document.getElementById('statusForm').submit();
    }

    function closeForm() {
      window.location.href ="checker"; // redirect to main list
    }
  </script>
</body>
</html>
