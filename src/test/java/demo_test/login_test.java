package demo_test;

import org.testng.annotations.*;

import demo.login;

public class login_test {

	@Test
	public static void test_login() {
		
		login.initialize();
		login.browse();
	}
}
