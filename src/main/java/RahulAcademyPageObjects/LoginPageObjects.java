package RahulAcademyPageObjects;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
WebDriver driver;
	public LoginPageObjects(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="email")
	private WebElement email;
	
	public WebElement email() {
		return email;
	}
	
	@FindBy(name="password")
	private WebElement pwd;
	
	public WebElement pwd() {
		return pwd;
	}
	
	@FindBy(name="commit")
	private WebElement login;
	
	public WebElement login() {
		return login;
	}
	
	@FindBy(xpath="/html/body/main/div/div")
	private WebElement errormsg;
	
	public WebElement errormsg() {
		// TODO Auto-generated method stub
		return errormsg;
	}
	
	
	

}
