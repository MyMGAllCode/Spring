<%@page isELIgnored="false"%>


<h1 style="text-align: center;">Login Form</h1>

${message}
<div style="text-align: center;">
<form  action="login.do" method="post">

UserId<input type="text" name="userId" required="required"></br>
Password<input type="password" name="pwd" required="required">
<input type="submit" value="Login">



</form>

</div>
