<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PHARMACY MANAGEMENT SYSTEM</title>
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>" />
<script type="text/javascript"
	src="<c:url value="/resources/script/sample.js"/>"></script>
<body>

	<div id="header">
		<div id="navigation"></div>
	</div>

	<table width="960" border="0" cellspacing="14" cellpadding="0"
		align="center">
		<tr align="justify">
			<td valign="top" width="220px"><img
				src="<c:url value="/resources/images/hioxindia-pharmacy_10.jpg"/>"
				alt="" border="0" /> <br />
				<h1>Pharmaceutist</h1>
				<p>Freedesignertemplates.com has a wide collection of HTML web
					design templates.</p>
				<p align="right">
					<a href="#" class="more">View More</a>
				</p></td>

			<td valign="top" align="center">
				<%
					out.print("<font color=red>LOGIN");
				%> <!-- SPRING FORM --> <form:form id="myForm" method="POST"
					action="addAdmin" commandName="admin">
					<table cellspacing="2" cellpadding="5" class="table">
						<tr>
							<h1 align="left">${msg}</h1>

						</tr>
						<form:errors path="*" cssClass="errorblock" element="div"></form:errors>
						<tr>
							<td>Email</td>
							<td><form:input path="name" class="text" name="name" /></td>
						</tr>
						<tr>
							<td><form:label path="password">Password</form:label></td>
							<td><form:input path="password" type="password" class="text"
									name="password"></form:input></td>

						</tr>
						<!-- <tr>
							<td>Mode</td>
							<td><form:select path="mode" class="select" name="mode">
									<form:option value="none" label="---SELECT ONE---"></form:option>
									<form:options items="${modeList}"></form:options>
								</form:select></td>
						</tr>-->
					</table>
					<table cellspacing="2" cellpadding="5">
						<tr>
							<input type="submit" class="button" value="Sign In" />
						</tr>
						<tr>
							<td><a href="UserRegistration"><font color="blue"><i>UserRegistration</a></font></i></td>
							<td><a href="ForgotUserPassword"><font color="blue"><i>ForgotUsernameOrPassword</i></font></a></td>
						</tr>
					</table>
				</form:form>
			<td valign="top"><img
				src="<c:url value="/resources/images/hioxindia-pharmacy_10.jpg"/>"
				alt="" border="0" />
				<h1>Drug Store</h1>
				<p>Anyone can use these HTML templates just by replacing the
					content to the pre-existing site designs.</p>
				<p align="right">
					<a href="#" class="more">View More</a>
				</p></td>
			<td valign="top"><img
				src="<c:url value="/resources/images/hioxindia-pharmacy_12.jpg"/>"
				alt="" border="0" />
				<h1>Tablets</h1>
				<p>This high quality free pharmaceutical company template is
					built using XHTML and CSS..</p>
				<p align="right">
					<a href="#" class="more">View More</a>
				</p></td>

		</tr>
		<tr>
			<td colspan="4" style="border-bottom: 1px solid #CCCCCC;"></td>
		</tr>
	</table>


	<div id="content">
		<table width="960" border="0" cellspacing="0" cellpadding="0">
			<tr align="justify">
				<td width="200" valign="top"><img
					src="<c:url value="/resources/images/hioxindia-pharmacy_19.jpg"/>"
					alt="" border="0" /></td>
				<td width="760" valign="top">
					<h1>Welcome to Pharmacy</h1>
					<p>This is free Pharmaceutical Company Template for your online
						website, blog or web page which is under Health and Medicine
						category. Anyone wants good, professional, template for their
						pharmacy, drug store, medical store then this template would be
						the best one. This free pharmaceutical company template is
						designed by professional designers to make your task much easier
						to customize it.</p> <br />

					<p>There are many other template categories like Arts,
						Agriculture, Computers, Satellite, Cars, Finance, Nature, Music,
						Personal Website, Religious, Fashion, Furniture, Holiday, Travel,
						Night club are available in this site. Have a look at the
						collection of HTML templates, pick the right one, preview and
						download it easily.</p>
				</td>
			</tr>
		</table>
	</div>

	<div id="footer">
		<div id="footer_1">
			<ul>
				<li><a href="#">Home</a></li>
				<li><a href="#">About Us</a></li>
				<li><a href="#">Specials</a></li>
				<li><a href="#">All Products</a></li>
				<li><a href="#">Contact Us</a></li>
			</ul>
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
