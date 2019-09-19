<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<title>HOSPITAL MANAGEMENT SYSTEM</title>
<link rel="stylesheet"
	href="<c:url value="/resources/css1/font-awesome.min.css"/>" />
<link rel="stylesheet"
	href="<c:url value="/resources/css1/bootstrap.min.css"/>" />
<link rel="stylesheet" href="<c:url value="/resources/css1/style.css"/>" />
<link rel="stylesheet"
	href="<c:url value="/resources/css1/style1.css"/>" />
<link
	href='http://fonts.googleapis.com/css1?family=Open+Sans:600italic,400,800,700,300'
	rel='stylesheet' type='text/css'>
<link
	href='<c:url value="http://fonts.googleapis.com/css?family=BenchNine:300,400,700"/>'
	rel='stylesheet' type='text/css'>
<script type="text/javascript"
	src="<c:url value="/resources/js/modernizr.js"/>"></script>
<!-- [if lt IE 9]> 
<script src="<c:url value="resources/js/html5shiv.js"/>"></script>
<script src="<c:url value="resources/js/respond.min.js"/>"></script>
<!-- [endif] -->
<script type="text/javascript"
	src="<c:url value="/resources/js/demo.js"/>"></script>
</head>
<body>
	<!-- ====================================================
	header section -->
	<header class="top-header">
		<div class="container">
			<div class="row">
				<div class="col-xs-5 header-logo">
					<br> <a href="index.html"><img
						src="<c:url value="/resources/img/logo.png"/>" alt=""
						class="img-responsive logo"></a>
				</div>


				<div class="col-md-7">
					<nav class="navbar navbar-default">
						<div class="container-fluid nav-bar">
							<!-- Brand and toggle get grouped for better mobile display -->
							<div class="navbar-header">
								<button type="button" class="navbar-toggle collapsed"
									data-toggle="collapse"
									data-target="#bs-example-navbar-collapse-1">
									<span class="sr-only">Toggle navigation</span> <span
										class="icon-bar"></span> <span class="icon-bar"></span> <span
										class="icon-bar"></span>
								</button>
							</div>

							<!-- Collect the nav links, forms, and other content for toggling -->
							<div class="collapse navbar-collapse"
								id="bs-example-navbar-collapse-1">

								<ul class="nav navbar-nav navbar-right">
									<li><a class="menu active" href="Welcome">Home</a></li>
									<li><a class="menu" href="#about">about us</a></li>
									<li><a class="menu" href="#service">our services </a></li>
									<li><a class="menu" href="#team">our team</a></li>
									<li><a class="menu" href="#contact"> contact us</a></li>
									<li><a class="menu" href="#contact"> logout</a></li>
								</ul>
							</div>
							<!-- /navbar-collapse -->
						</div>
						<!-- / .container-fluid -->
					</nav>
				</div>
			</div>
		</div>
	</header>
	<div class="api-map1" id="contact">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-12 map" id="map"></div>
			</div>
		</div>
	</div>

	<section class="nursecontact1" id="nurseassess1">
		<div class="nursenavigation1">

			<form:form action="HospitalPatient" commandName="hopat">
			</form:form>
			<form>
				<h2 align="center">Initial Nurse Assessment</h2>
				<h3 align="left">&nbsp&nbsp&nbspPERSON DETAILS</h3>
				<center>
					<table class="tablenurse">
						<tr>
							<td><label class="labelnurse">Admission&nbspDate</label></td>
							<td><input type="text" class="textnurse" placeholder="MM/DD/YYYY"/></td>
						</tr>
						<tr>
							<td><label class="labelnurse">First&nbspName</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td><label class="labelnurse">Last&nbspName</label></td>
							<td><input type="text" class="textnurse" /></td>

						</tr>
						<tr>
							<td><label class="labelnurse">Date&nbspof&nbspBirth</label></td>
							<td><input type="text" class="textnurse" placeholder="MM/DD/YYYY" /></td>
						</tr>
						<tr>
							<td><label class="labelnurse">Height</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td><label class="labelnurse">Weight</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td><label class="labelnurse">Religion</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td><label class="labelnurse">Nationality</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<th class="labelnurse">Person&nbspto&nbspbecontacted</th>
							<th>Relationship</th>
						</tr>


						<tr>
							<td><input type="text" class="textnurse" /></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td><label class="labelnurse">Phone&nbspNumber</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td><label class="labelnurse">Preferred&nbspLanguage</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td class="labelnurse"><a href="HospitalPatientRegistration"
								class="reason"></a><u>Reason</u></td>
						</tr>
					</table>
			</form>
		</div>

	</section>
	<section class="nursecontact2" id="nurseassess2">
		<div class="nursenavigation2">

			<form:form action="HospitalPatient" commandName="hopat">
			</form:form>
			<form>
				<h3>&nbsp&nbsp&nbspHave you had previous surgery or hospital
					admissions?</h3>
				<center>
					<table class="tablenurse1">
						<tr>
							<td>YES</td>
							<td><input type="checkbox" /></td>
							<td>NO</td>
							<td><input type="checkbox" /></td>
						</tr>
					</table class="tablenurse1">
					<h4>If YES,Please provide details below</h4>
					<table class="tablenurse1 ">
						<tr>
							<th>Month&nbsp&&nbspYear</th>
							<th>Operation/Illness</th>


						</tr>
						<tr>
							<td><input type="text" class="textnurse" /></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td><label class="labelnurse">Hospital</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
					</table>

					<h3>Do you have or have you ever had?</h3>
					<center>
						<table class="tablenurse1">
							<tr>
								<td><label>High&nbspBlood&nbsppressure</label></td>
								<td><select><option>YES</option>
										<option>NO</option></select></td>
								<td><label class="labelnurse">Comment</label></td>
								<td><input type="text" class="textnurse" /></td>
							</tr>
							<tr>
								<td class="labelnurse">Heart&nbspAttack</td>
								<td><select><option>YES</option>
										<option>NO</option></select></td>
								<td><label class="labelnurse">Comment</label></td>
								<td><input type="text" class="textnurse" /></td>

							</tr>
							<tr>
								<td>Cholesterol</td>
								<td><select><option>YES</option>
										<option>NO</option></select></td>
								<td><label class="labelnurse">Comment</label></td>
								<td><input type="text" class="textnurse" /></td>

							</tr>
							<tr>
								<td>Diabetes</td>
								<td><select><option>YES</option>
										<option>NO</option></select></td>
								<td><label class="labelnurse">Comment</label></td>
								<td><input type="text" class="textnurse" /></td>

							</tr>
							<tr>
								<td>Heart Disease</td>
								<td><select><option>YES</option>
										<option>NO</option></select></td>
								<td><label class="labelnurse">Comment</label></td>
								<td><input type="text" class="textnurse" /></td>

							</tr>
							<tr>
								<td>Thyroid</td>
								<td><select><option>YES</option>
										<option>NO</option></select></td>
								<td><label class="labelnurse">Comment</label></td>
								<td><input type="text" class="textnurse" /></td>
							</tr>
						</table>
			</form>
		</div>

	</section>
	<section class="nursecontact3" id="nurseassess3">
		<div class="nursenavigation3">

			<form:form action="HospitalPatient" commandName="hopat">
			</form:form>
			<form>
				<center>
					<table class="tablenurse1">
						<h3>Allergies</h3>
						<tr>
							<td>Medications</td>
							<td><select><option>YES</option>
									<option>NO</option></select></td>
							<td><label class="labelnurse">Comment</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td>Food</td>
							<td><select><option>YES</option>
									<option>NO</option></select></td>
							<td><label class="labelnurse">Comment</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td>Latex</td>
							<td><select><option>YES</option>
									<option>NO</option></select></td>
							<td><label class="labelnurse">Comment</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td>Other</td>
							<td><select><option>YES</option>
									<option>NO</option></select></td>
							<td><label class="labelnurse">Comment</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
					</table>
					<table class="tablenurse1">
						<h3>General Questions</h3>
						<tr>
							<td>Do&nbspyou&nbspsmoke?</td>
							<td><select><option>YES</option>
									<option>NO</option>
							</select></td>
							<td><label class="labelnurse">Comment</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td>Did&nbspyou&nbspever&nbspsmoke?</td>
							<td><select><option>YES</option>
									<option>NO</option></select></td>
							<td><label class="labelnurse">Comment</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td>Do&nbspyou&nbspdrink&nbspalchahol?</td>
							<td><select><option>YES</option>
									<option>NO</option></select></td>
							<td><label class="labelnurse">Comment</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td>Do you use any drugs?</td>
							<td><select><option>YES</option>
									<option>NO</option></select></td>
							<td><label class="labelnurse">Comment</label></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>


					</table>

					<table class="tablenurse1">
						<h3>Medications</h3>
						<tr>
							<th>Drug Name</th>
							<th>Dose</th>
						</tr>
						<tr>
							<td><input type="text" class="textnurse" /></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<th>Number of times taken</th>
							<th>Reason</th>
						</tr>
						<tr>
							<td><input type="text" class="textnurse" /></td>
							<td><input type="text" class="textnurse" /></td>
						</tr>
						<tr>
							<td><a href="#nurseassess1">Page 1</a></td>
							<td><input type="submit" value="SUBMIT" class="button" /></td>
							<td><a href="#nurseassess1">Page&nbsp2</a></td>
						</tr>
					</table>
			</form>
	</section>

	<!-- footer starts here -->
	<footer class="footer clearfix">
		<div class="container">

			<div class="col-xs-6 footer-para">
				<p>&copy;MynuteInnovasion All right reserved</p>
			</div>
			<div class="col-xs-6 text-right">
				<a href=""><i class="fa fa-facebook"></i></a> <a href=""><i
					class="fa fa-twitter"></i></a> <a href=""><i class="fa fa-skype"></i></a>
			</div>

		</div>
	</footer>

	<!-- script tags
	============================================================= -->
	<script src="<c:url value="/resources/js/jquery-2.1.1.js"/>"></script>
	<script
		src="<c:url value="/resources/http://maps.google.com/maps/api/js?sensor=true"/>"></script>
	<script src="<c:url value="/resources/js/gmaps.js"/>"></script>
	<script src="<c:url value="/resources/js/smoothscroll.js"/>"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="/resources/js/custom.js"/>"></script>
</body>
</html>