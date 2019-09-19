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
	<!-- SPRING FORM -->
	<table width="960" border="0" cellspacing="10" cellpadding="0"
		align="center">

	</table>


	<div id="content">
		<table width="850" border="0" cellspacing="0" cellpadding="0">
			<h3 class="msg">
				<i>${msg}</i>
			</h3>
			<tr align="justify">
				<td width="200" valign="top"></td>
				<td width="760" valign="top" align="center">
					<h1>USER REGISTRATION</h1> <form:form method="POST"
						action="UserRegistartionSave" commandName="user">
						<table cellspacing="2" cellpadding="5" class="table">
							<form:errors path="*" cssClass="errorblock" element="div"></form:errors>
							<tr>
								<td>FirstName</td>
								<td><form:input path="firstname" class="text"
										name="firstname" /></td>
							</tr>
							<tr>
								<td>LastName</td>
								<td><form:input path="lastname" class="text"
										name="lastname"></form:input></td>
							</tr>
							<tr>

								<td>Email</td>
								<td><form:input path="email" class="text" name="email"></form:input></td>
							</tr>
							<tr>
								<td>password</td>
								<td><form:input path="password" class="text"
										type="password" name="password"></form:input></td>
							</tr>
							<table cellspacing="2" cellpadding="5">
								<tr>
									<input type="submit" class="button" value="Create Account" />
								</tr>

							</table>
						</table>
					</form:form>
				</td>
			</tr>
		</table>
	</div>

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
