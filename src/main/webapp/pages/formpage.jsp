<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Project Form</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f7f9fc;
	padding: 30px;
}

.form-container {
	background-color: #fff;
	padding: 25px;
	max-width: 600px;
	margin: auto;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h2 {
	text-align: center;
	margin-bottom: 20px;
	color: #333;
}

label {
	display: block;
	margin-bottom: 5px;
	font-weight: bold;
}

input[type="text"], input[type="number"], input[type="date"], textarea {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

textarea {
	resize: vertical;
}

button {
	background-color: #007bff;
	color: white;
	border: none;
	padding: 10px 20px;
	border-radius: 4px;
	cursor: pointer;
	width: 100%;
}

button:hover {
	background-color: #0056b3;
}

.hidden {
	display: none;
}
</style>

<body>
	<div class="container mt-5">
		<h2>Project Form</h2>
		<form action="/projectdetail" method="post">

			<div class="form-group">
				<label for="project_id"></label> <input type="hidden"
					class="form-control" id="project_id" name="project_id" required>
			</div>

			<div class="form-group">
				<label for="project_name">Project Name</label> <input type="text"
					class="form-control" id="project_name" name="project_name" required>
			</div>
			<div class="form-group">
				<label for="project_lead">Project Lead</label> <select
					class="form-control" name="project_lead" id="project_lead" required>
					<option value="">-- Select Project Lead --</option>
					<c:forEach var="e" items="${checkerdata}">
						<option value="${e.checkerId}">${e.checkerName}</option>
						
						
					</c:forEach>
				</select>
				
			</div>


			<div class="form-group">
				<label for="project_remark">Project Remark</label>
				<textarea class="form-control" id="project_remark"
					name="project_remark" rows="3"></textarea>
			</div>

			<div class="form-group" class="hidden">
				<label for="project_checker_status"></label> <input type="hidden"
					class="form-control" id="project_checker_status"
					name="project_checker_status" value="Pending">
			</div>
			<div class="form-group">
				<label for="project_location">Location</label> <input type="text"
					class="form-control" id="location" name="location">
			</div>

			<div class="form-group" class="hidden">
				<label for="project_checker_remark"></label>
				<textarea class="hidden" id="project_checker_remark"
					name="project_checker_remark" rows="3">NA</textarea>
			</div>


			<div class="form-group">
				<label for="maker_submit_date">Maker Submit Date</label> <input
					type="date" class="form-control" id="maker_submit_date"
					name="maker_submit_date">
			</div>
			<div class="form-group">
				<label for="maker_submit_date">Maker Status</label> <input
					type="text" class="form-control" id="MakerStatus"
					name="MakerStatus">
			</div>

			<div class="form-group" class="hidden">
				<label for="checker_submit_date"></label> <input type="hidden"
					class="form-control" id="checker_submit_date"
					name="checker_submit_date" value="DD/MM/YY">
			</div>
			<div class="form-group" class="hidden">
				<label for="User_id"></label> <input type="hidden"
					class="form-control" id="userid" name="userid" value="${ID}">
			</div>
			

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

</body>
</html>
