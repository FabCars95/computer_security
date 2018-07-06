int foo(int a, int b){
	int c = 14;
	char buf[8];
	gets(buf);
	//security bug -> vulnerability
	c = (a + b) * c;
	return c;
}