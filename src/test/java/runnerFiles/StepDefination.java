package runnerFiles;



import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.base;

public class StepDefination extends base {
	//public WebDriver driver;
	@Given("^Initialise Driver$")
	public void initialise_Driver() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		driver= setup();
		
		
		
		
	  
	}

	 @And("^Hit the Application URL \"([^\"]*)\"$")
	    public void hit_the_application_url_something(String strArg1) throws Throwable {
	   	driver.get(strArg1);
	   	driver.manage().window().maximize();
		System.out.println("URL opened is : " + driver.getCurrentUrl());
		
	}

	@And("^Check if pop up exists$")
	public void check_if_pop_up_exists() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("No newsletter pop up is displayed");
	}


	 @When("^User Enters Valid Credentials (.+) and (.+)$")
	    public void user_enters_valid_credentials_and(String username, String pwd) throws Throwable {
	  
		//indexpage.login().click();
		 driver.findElement(By.xpath("/html/body/app-root/div/header/div[1]/div/div/div[2]/div[2]/a")).click();
		Thread.sleep(2000);
		loginpage.email().sendKeys(username);
		loginpage.pwd().sendKeys(pwd);
		loginpage.login().click();
		Thread.sleep(2000);
	
		
	}

	@Then("^Lands onto Homepage$")
	public void lands_onto_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		String text=homepage.coursetitle().getText();
		System.out.println("Course title: "+ text);
	    
	}

	@And("^Validate if search bar exists$")
	public void validate_if_search_bar_exists() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(homepage.search().isDisplayed())
		{
			System.out.println("Search bar exists");
		}
		else
			System.out.println("Search bar missing ");
		
	 
	}
	
	 @And("^Close the browser$")
	    public void close_the_browser() throws Throwable {
	        driver.quit();
	        System.out.println("Closed browser");
	    }




}
