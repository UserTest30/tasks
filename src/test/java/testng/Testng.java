package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng {

 @Parameters({"username"})
 @Test
	 private void username(String user) {
System.out.println("username is "+user);
	}
		@Parameters("password")
		@Test(priority = 4)
		private void password(String pass) {
System.out.println("password is "+pass);
	}
	@Test(priority = 9)
	private void btn() {
System.out.println("btnclick");
	}
}
