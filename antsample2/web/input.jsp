<%@page contentType="text/html; charset=Windows-31J"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>

<html>
<body>

<p>�g���Ƒ̏d�����āu�v�Z�v�{�^���������Ă��������B

html:form action="/bmi">
	�g��<html:text property="height"/>(cm)
	<br>
	�̏d<html:text property="weight"/>(kg)
	<br>
	<html:submit value="�v�Z"/>
</html:form>

<html:errors/>

</body>
</html>
