public void onLogon(Field txtUser, Field txtPassword) {
	SqlCommand cmd = new SqlCommand(String.Format(
	  	``SELECT * 
		FROM Users 
		WHERE username='{0}' AND password='{1}';``,
		txtUser.Text, txtPassword.Text));
	SqlDataReader reader = cmd.ExecuteReader();
if(reader.HasRows())
	IssueAuthenticationTicket();
else
	RedirectToErrorPage();
}