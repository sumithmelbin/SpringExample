<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>HOSPITAL MANAGEMENT SYSTEM</title>
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>" />
<script type="text/javascript"
	src="<c:url value="/resources/script/sample.js"/>"></script>
<body>

	<div id="header">
		<div id="navigation">
			<ul>
				<li><a href="index.jsp">HOME</a></li>
				<li><a href="about.jsp">ABOUT US</a></li>
				<li><a href="PatientRegistration">NEW PATIENT </a></li>
				<li><a href="distributerlogin.jsp">DISTRIBUTER </a></li>
				<li><a href="customer.jsp">CUSTOMER</a></li>
				<li><a href="contactus.jsp">CONTACT US</a></li>
			</ul>
		</div>
	</div>

	<table width="800" border="0" cellspacing="14" cellpadding="0"
		align="center">
		<tr align="justify">
			${msg}
			<td valign="top" align="center" />
			<!-- SPRING FORM -->
			<td width="760" valign="top" align="center">
				<h1>PATIENT REGISTRATION</h1> <form:form method="POST"
					action="PatientRegistrationSave" commandName="patientreg">
					<table cellspacing="2" cellpadding="5" class="table">
						<form:errors path="*" cssClass="errorblock" element="div"></form:errors>
						<tr>
							<td>FirstName</td>
							<td><form:input path="firstname" class="text"
									name="firstname" /></td>
						</tr>
						<tr>
							<td>LastName</td>
							<td><form:input path="lastname" class="text" name="lastname"></form:input></td>
						</tr>
						<tr>

							<td>Address</td>
							<td><form:input path="address" class="text" name="address"></form:input></td>
						</tr>
						<tr>
							<td>Sex</td>
							<td><form:select path="sex" class="select" name="sex">
									<form:option value="none" label="---SELECT ONE---"></form:option>
									<form:options items="${sexList}"></form:options>
								</form:select></td>
						</tr>
						<tr>
							<td>Dob</td>
							<td><form:input path="bod" class="text" name="bod"></form:input></td>
						</tr>
						<tr>
							<td>Place</td>
							<td><form:input path="place" class="text" name="place"></form:input></td>
						</tr>
						<tr>
							<td>Phone Number</td>
							<td><form:input path="phonenumber" class="text"
									name="phonenumber"></form:input></td>
						</tr>
						<tr>
							<td>Email</td>
							<td><form:input path="email" class="text" name="email"></form:input></td>
						</tr>
						<table cellspacing="2" cellpadding="5">
							<tr>
								<input type="submit" class="button" value="Registration" />
							</tr>

						</table>
					</table>
				</form:form>
			</td>
	</table>
	<div id="footer">
		<div id="footer_1">
			<br /> <span id="design">Designed by <a id="dum"
				href="http://mynute.com/mynute/index.jsp" target="_blank">www.mynute.com</a></span>
			<script type="text/javascript">
				document.onload = ctck();
			</script>
		</div>
	</div>
</body>
</html>

</head>

<body>
	<div id="footer_top">
		<div id="footer_navigation"></div>

		<div id="footer_copyright">

			<center>
				<img alt="business" width="196" height="106">
			</center>
			<br>
			<p>Each people plan their site layouts depending upon their
				business type. Here comes a free designer template which provides
				you with a selection of different kinds of webdesign starting from
				business template, fashion template, media template, Science
				template, Arts template and much more.</p>

			Copyright © Mynute Innovations
		</div>
	</div>

	<script type="text/javascript">
		document.onload = ctck();
	</script>
	</div>

</body>
</html>
