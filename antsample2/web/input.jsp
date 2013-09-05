<%@page contentType="text/html; charset=Windows-31J"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>

<html>
<body>

<p>身長と体重を入れて「計算」ボタンを押してください。

html:form action="/bmi">
	身長<html:text property="height"/>(cm)
	<br>
	体重<html:text property="weight"/>(kg)
	<br>
	<html:submit value="計算"/>
</html:form>

<html:errors/>

</body>
</html>
