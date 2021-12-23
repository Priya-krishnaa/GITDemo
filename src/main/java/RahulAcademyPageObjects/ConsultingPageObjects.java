package RahulAcademyPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsultingPageObjects  {
	
	public WebDriver driver;
	public ConsultingPageObjects(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/app-root/div/app-consulting/section/div/div/h1")
	private WebElement jobsupport;
	
	public WebElement jobsupport() {
		return jobsupport;
	}

}
