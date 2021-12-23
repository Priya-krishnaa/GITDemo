package RahulAcademyTestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import resources.base;

public class IndexPageTextVerify extends base {
	
	@Test
	public void textverify() throws IOException {
	
		System.out.println("Entered into Indexpage verify text testcase");
	String text=indexpage.text().getText().split("to")[1].trim().split("in your")[0];
	System.out.println("TestCase to verify text");
	System.out.println("-----------------------------------------------------------------------------------------------------");
	System.out.println("Text is :- " + text);
	
	SoftAssert sa= new SoftAssert();
	sa.assertEquals(text, "Learn Earn & Shine", "Text is not matching");
	log.info("textverify info msg");
	log.debug("Debug msg of textverify");
	log.error("Error msg of textverify");
		
	}
	
	
		

}
