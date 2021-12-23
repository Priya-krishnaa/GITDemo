package RahulAcademyTestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import resources.base;

public class ConsultingPageTitle extends base{
	
	@Test
	public void consultingTitle() throws IOException {
    
		System.out.println("Entered into Consulting page test case");
		indexpage.consulting().click();
		String title=driver.getTitle();
		System.out.println("TestCase to get title of consulting page");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Title is : " + title);
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(title, "Rahul Shetty Academy", "Title mismatch");
		
		log.info("consultingurl info msg");
		log.debug("Debug msg of consultingurl");
		log.error("Error msg of consultingurl");
		System.out.println("Develop branch 1");
		System.out.println("Develop branch 2");
		System.out.println("Develop branch 3");
		
	// Adding a comment 
			sa.assertAll();
			
		
	}
	
		

}
