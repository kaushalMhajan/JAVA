<jsp:useBean id="interest" class="app.component.InterestBean" scope="page"/>
<jsp:setProperty name="interest" property="principle" />
<jsp:setProperty name="interest" property="rate" />
<jsp:setProperty name="interest" property="period" />

<html>
	<head>
		<title>simple-web-app</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	</head>
	<body style="font-family: cursive;">
		
		<div style="margin: auto; width: 25%;margin-top: 50px;font-size: larger;font-weight: bold;">Welcome to Simple Interest Calulator</div>
		<br>
		<div  style="margin: auto;width: 25%;">
			<form method="post">
				<div class="mb-3">
				  <label for="exampleInputEmail1" class="form-label">Principle</label>
				  <input type="text" class="form-control" id="exampleInputEmail1" name="principle" aria-describedby="emailHelp">
				</div>
				<div class="mb-3">
				  <label for="exampleInputPassword1" class="form-label">Rate</label>
				  <input type="text" class="form-control" id="exampleInputPassword1" name="rate">
				</div>
				<div class="mb-3">
				  <label for="exampleInputPassword1" class="form-label">Period</label>
				  <input type="number" class="form-control" id="exampleInputPassword1" name="period">
				</div>
				<button type="submit" class="btn btn-primary">Calculate</button>
			  </form>
			</div>

			<div  style="margin: auto; width: 25%;margin-top: 50px;">
				Your Simple Interest is : ${interest.simpleInterest}
			</div>


	</body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</html>

