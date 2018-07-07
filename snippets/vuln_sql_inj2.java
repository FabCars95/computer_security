",
		txtUser.Text, txtPassword.Text));
	SqlDataReader reader = cmd.ExecuteReader();
if(reader.HasRows())
	IssueAuthenticationTicket();
else
	RedirectToErrorPage();
}