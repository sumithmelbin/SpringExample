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
			<form:form action="HospitalPerson" commandName="PersonDetails">
				<h3 align="center">Initial Nurse Assessment</h3>
				<h3 align="center">&nbsp&nbsp&nbspPerson Details</h3>
				<form:errors path="*" cssClass="errorblock" element="div"></form:errors>
				<center>
					<table class="tablenurse">
						<tr>
							<td><form:label path="admndate" class="labelnurse">Admission&nbspDate</form:label></td>
							<td><form:input type="text" path="admndate"
									class="textnurse" placeholder="MM/DD/YYYY" /></td>
						</tr>
						<tr>
							<td><form:label path="fname" class="labelnurse">First&nbspName</form:label></td>
							<td><form:input type="text" path="fname" class="textnurse" /></td>
						</tr>
						<tr>
							<td><form:label path="lname" class="labelnurse">Last&nbspName</form:label></td>
							<td><form:input type="text" path="lname" class="textnurse" /></td>

						</tr>
						<tr>
							<td><form:label path="dob" class="labelnurse">Date&nbspof&nbspBirth</form:label></td>
							<td><form:input type="text" path="dob" class="textnurse"
									placeholder="MM/DD/YYYY" /></td>
						</tr>
						<tr>
							<td><form:label path="height" class="labelnurse">Height</form:label></td>
							<td><form:input type="text" path="height" class="textnurse" /></td>
						</tr>
						<tr>
							<td><form:label path="weight" class="labelnurse">Weight</form:label></td>
							<td><form:input type="text" path="weight" class="textnurse" /></td>
						</tr>
						<tr>
							<td><form:label path="religion" class="labelnurse">Religion</form:label></td>
							<td><form:input type="text" path="religion"
									class="textnurse" /></td>
						</tr>
						<tr>
							<td><form:label class="labelnurse" path="nationality">Nationality</form:label></td>
							<td><form:input type="text" path="nationality"
									class="textnurse" /></td>
						</tr>
						<tr>
							<th class="labelnurse">Person&nbspto&nbspbecontacted</th>
							<th>Relationship</th>
						</tr>
						<tr>
							<td><form:input type="text" path="pcontact"
									class="textnurse" /></td>
							<td><form:input type="text" path="relation"
									class="textnurse" /></td>
						</tr>
						<tr>
							<td><form:label path="pnumber" class="labelnurse">Phone&nbspNumber</form:label></td>
							<td><form:input type="text" path="pnumber" class="textnurse" /></td>
						</tr>
						<tr>
							<td><form:label path="plang" class="labelnurse">Preferred&nbspLanguage</form:label></td>
							<td><form:input type="text" path="plang" class="textnurse" /></td>
					</table>
					<table>
						<tr>
							<input type="submit" value="NEXT" class="button" />
						</tr>
					</table>
			</form:form>
		</div>
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