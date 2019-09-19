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
<script type="text/javascript"
	src="<c:url value="/resources/script/NurseAssessment.js"/>"></script>
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
	<section class="nursecontact2" id="nurseassess2">
		<div class="nursenavigation2">
			<form:form name="assess" action="NurseAssesmentFirst"
				commandName="Nursehad">
				<form:errors path="*" cssClass="errorblock" element="div"></form:errors>
				<h3 align="center">Do you have or have you ever had?</h3>
				<center>
					<table class="tablenurse1">
						<tr>
							<td><form:label path="highbp" class="labelnurse">High&nbspBlood&nbsppressure</form:label></td>
							<td><form:select id="bp" path="highbp" class="textnurse" 
									onchange="showChange()">
									<form:option value="none" label="SELECT"></form:option>
									<form:options items="${optionList}"></form:options>
								</form:select></td>
							<td><form:label path="hcomment" class="labelnurse">Comment</form:label></td>
							<td><form:input id="hc" path="hcomment" type="text"
									class="textnurse"  /></td>
						</tr>
						<tr>
							<td><form:label class="labelnurse" path="hattack">Heart&nbspAttack</form:label></td>
							<td><form:select path="hattack" class="textnurse" id="ha"
									onchange="showChange()">
									<form:option value="none" label="SELECT"></form:option>
									<form:options items="${optionList}"></form:options>
								</form:select></td>
							<td><form:label path="hacomment" class="labelnurse">Comment</form:label></td>
							<td><form:input path="hacomment" type="text"
									class="textnurse" id="hac" /></td>

						</tr>
						<tr>
							<td><form:label path="cholestrol" class="labelnurse">Cholesterol</form:label></td>
							<td><form:select path="cholestrol" class="textnurse" id="cl"
									onchange="showChange()">
									<form:option value="none" label="SELECT"></form:option>
									<form:options items="${optionList}"></form:options>
								</form:select></td>
							<td><form:label path="clcomment" class="labelnurse">Comment</form:label></td>
							<td><form:input path="clcomment" type="text"
									class="textnurse" id="clc" /></td>

						</tr>
						<tr>
							<td><form:label class="labelnurse" path="diabetes">Diabetes</form:label></td>
							<td><form:select path="diabetes" class="textnurse" id="db"
									onchange="showChange()">
									<form:option value="none" label="SELECT"></form:option>
									<form:options items="${optionList}"></form:options>
								</form:select></td>
							<td><form:label path="dbcomment" class="labelnurse">Comment</form:label></td>
							<td><form:input path="dbcomment" type="text"
									class="textnurse" id="dbc" /></td>

						</tr>
						<tr>
							<td><form:label class="labelnurse" path="hdisease">Heart Disease</form:label></td>
							<td><form:select path="hdisease" class="textnurse" id="hd"
									onchange="showChange()">
									<form:option value="none" label="SELECT"></form:option>
									<form:options items="${optionList}"></form:options>
								</form:select></td>
							<td><form:label path="hdcomment" class="labelnurse">Comment</form:label></td>
							<td><form:input path="hdcomment" type="text"
									class="textnurse" id="hdc" /></td>

						</tr>
						<tr>
							<td><form:label class="labelnurse" path="thyroid">Thyroid</form:label></td>
							<td><form:select path="thyroid" class="textnurse" id="th"
									onchange="showChange()">
									<form:option value="none" label="SELECT"></form:option>
									<form:options items="${optionList}"></form:options>
								</form:select></td>

							<td><form:label path="tcomment" class="labelnurse">Comment</form:label></td>
							<td><form:input path="tcomment" type="text"
									class="textnurse" id="tc" /></td>
						</tr>
					</table>
					<h3 align="center">Have you had previous surgery or hospital
						admissions?</h3>
					<center>
						<table class="tablenurse1">
							<tr>
								<td><form:select path="option" class="textnurse" id="opt"
										onchange="showForm()">
										<form:option value="none" label="SELECT"></form:option>
										<form:options items="${optionList}"></form:options>
									</form:select></td>
							</tr>
						</table>
						<h4>If YES,Please provide details below</h4>
						<table class="tablenurse1 ">
							<tr>
								<th>Month&nbsp&&nbspYear</th>
								<th>Operation/Illness</th>
							</tr>
							<tr>
								<td><form:input id="monyr" type="text" path="myear"
										class="textnurse" /></td>
								<td><form:input id="ol" type="text" path="oporil"
										class="textnurse" /></td>
							</tr>
							<tr>
								<td><form:label class="labelnurse" path="hname">Hospital</form:label></td>
								<td><form:input id="hosname" type="text" path="hname"
										class="textnurse" /></td>
							</tr>
						</table>
						<table>
							<tr>
								<input type="submit" value="SUBMIT" class="button" />
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