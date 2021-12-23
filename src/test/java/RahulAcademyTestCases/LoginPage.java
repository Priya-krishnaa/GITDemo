package RahulAcademyTestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.base;

public class LoginPage extends base {
	
	@Test(dataProvider = "getData")
	public void loginpage(String email, String pwd, String text) throws InterruptedException, IOException {
	
	
		System.out.println("Entered into login page data provider test case");
		indexpage.login().click();
		Thread.sleep(2000);
		loginpage.email().sendKeys(email);
		loginpage.pwd().sendKeys(pwd);
		loginpage.login().click();
		Thread.sleep(5000);
		System.out.println("error in page is: " + loginpage.errormsg().getText());
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Printing text from DP :" + text);
		
		log.info("loginpage info msg");
		log.debug("Debug msg of loginpage");
		log.error("Error msg of loginpage");
		
	}

	
	@DataProvider
	public Object[][] getData() {
		Object[][] data= new Object[2][3];
		// 0th data
		data[0][0]= "priy47@gmail.com";
		data[0][1]="jhjk";
		data[0][2]= "First data is invalid";
		
		// 1st data
		data[1][0]= "sjdf@gmail.com";
		data[1][1]= "fsdnf";
		data[1][2]= "Second data is wrong";
		return data;
		
				
				
				
		
	}
	

}
