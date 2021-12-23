package RahulAcademyPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	public WebDriver driver;
	public HomePageObjects(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(css=".course-listing-title")
	private WebElement coursetitle;
	
	public WebElement coursetitle() {
		return coursetitle;
	}
	@FindBy(id="search-courses")
	private WebElement search;
	
	public WebElement search() {
		return search;
	}
	

}
