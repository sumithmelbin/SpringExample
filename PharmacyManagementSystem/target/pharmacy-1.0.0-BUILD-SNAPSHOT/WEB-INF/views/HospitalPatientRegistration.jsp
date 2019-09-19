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

	<!-- hospitalpatientregistration section starts here -->
	<section class="contact1">
		<div class="patientnavigation">

			<h3 class="head" align="center">PATIENT REGISTRATION</h3>
			<div class="patientreg1">
				<form:form action="HospitalPatient" commandName="hopat">
					<!--<form:errors path="firstname" cssClass="errorblock" element="div"></form:errors>-->
					<table class="tablepat1">
						<tr>
							<td><form:label path="firstname" class="labelpat">FIRST NAME</form:label></td>
							<td><form:input path="firstname" type="text" class="textpat" /></td>
						</tr>
						<tr>
							<td><form:label path="lastname" class="labelpat">LAST NAME</form:label></td>
							<td><form:input path="lastname" type="text" class="textpat" /></td>
						</tr>
						<tr>
							<td><form:label path="spousename" class="labelpat">SPOUSE NAME</form:label></td>
							<td><form:input path="spousename" type="text"
									class="textpat" /></td>
						</tr>
						<tr>
							<td><form:label path="sex" class="labelpat">SEX</form:label></td>
							<td><form:select path="sex" class="selectpat">
									<form:option value="none" label="SELECT ONE"></form:option>
									<form:options items="${sexList}"></form:options>
								</form:select></td>
						</tr>
						<tr>
							<td><form:label path="phonenumber" class="labelpat">PHONE NUMBER</form:label></td>
							<td><form:input path="phonenumber" type="text"
									class="textpat" /></td>
						</tr>
						<tr>
							<td><form:label path="address" class="labelpat">ADDRESS</form:label></td>
							<td><form:input path="address" type="text" class="textpat" /></td>
						</tr>
						<tr>
							<td><form:label path="city" class="labelpat">CITY</form:label></td>
							<td><form:input path="city" type="text" class="textpat" /></td>
						</tr>
					</table>
			</div>
			<div class="patientreg2">

				<table class="tablepat1">
					<tr>
						<td><form:label path="state" class="labelpat">STATE</form:label></td>
						<td><form:input path="state" type="text" class="textpat" /></td>
					</tr>
					<tr>
						<td><form:label path="zip" class="labelpat">ZIP</form:label></td>
						<td><form:input path="zip" type="text" class="textpat" /></td>
					</tr>
					<tr>
						<td><form:label path="emgcontact" class="labelpat">EMERGENCY CONTACT</form:label></td>
						<td><form:input path="emgcontact" type="text" class="textpat" /></td>
					</tr>
					<tr>
						<td><form:label path="email" class="labelpat">EMAIL</form:label></td>
						<td><form:input path="email" type="text" class="textpat" /></td>
					</tr>
					<tr>
						<td><form:label path="doctor" class="labelpat">DOCTOR</form:label></td>
						<td><form:input path="doctor" type="text" class="textpat" /></td>
					</tr>
					<tr>
						<td><form:label path="reason" class="labelpat">REASON</form:label></td>
						<td><form:input path="reason" type="text" class="textpat" /></td>
					</tr>
				</table>

				<div class="buttondiv">
					<table class="tablebuttonpat1">

						<center>
							<input type="submit" value="Register" class="buttonpat" />
						</center>

					</table>
					</form:form>
				</div>
			</div>

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