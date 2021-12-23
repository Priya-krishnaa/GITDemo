package RahulAcademyPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPageObjects {
	
	public WebDriver driver;
	
	public IndexPageObjects(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	//By Courses= By.xpath("//a[@href='#/lifetime-access']");
	
//	public WebElement Courses() {
//	return driver.findElement(with(By.tagName("a")).toLeftOf(Courses)).click();
//	}
	
	
	@FindBy(xpath="//div[@class='item active']//div//div//h2//span")
	public WebElement text;
	
	public WebElement text() {
		return text;
	}
	
	@FindBy(xpath="/html/body/app-root/div/app-home/div/section[1]/div/div/div[1]/a/div/div/h3/a")
	private WebElement consulting;
	
	public WebElement consulting() {
		return consulting;
	}
	
	@FindBy(xpath="/html/body/app-root/div/header/div[1]/div/div/div[2]/div[2]/a")
	private WebElement login;
	
	
	public WebElement login() {
		// TODO Auto-generated method stub
		return login;
	}

}
