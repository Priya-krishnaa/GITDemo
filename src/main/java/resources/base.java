package resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import RahulAcademyPageObjects.ConsultingPageObjects;
import RahulAcademyPageObjects.HomePageObjects;
import RahulAcademyPageObjects.IndexPageObjects;
import RahulAcademyPageObjects.LoginPageObjects;


public class base {
	public WebDriver driver;
	public IndexPageObjects indexpage;
	public LoginPageObjects loginpage;
	public ConsultingPageObjects consultingpage;
	public HomePageObjects homepage;
	public Properties prop;
	public static Logger log= LogManager.getLogger(base.class.getName());
	public static String path=System.getProperty("user.dir");
	
	
	
	@BeforeMethod(alwaysRun=true)
	public WebDriver setup() throws IOException {
		prop= new Properties();
		FileInputStream fis= new FileInputStream(path + "\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
	//	String browsername= System.getProperty("browser");
		String url= prop.getProperty("url");
		if(browsername.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./resources/chromedriver96.exe");
			ChromeOptions option= new ChromeOptions();
			option.addArguments("--disable-notifications");
			if(browsername.contains("headless"))
			{
			option.addArguments("headless");
			}
			 driver= new ChromeDriver(option);
			
		}
	
	// Firefox
	else if (browsername.equalsIgnoreCase("firefox")) {
		System.out.println("Browser in which it is executing is : " + browsername);

		System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	// Edge
	else if (browsername.equalsIgnoreCase("edge")) {
		System.out.println("Browser in which it is executing is : " + browsername );

		System.setProperty("webdriver.edge.driver", "./resources/msedgedriver.exe");
		driver = new EdgeDriver();
	}
		System.out.println("Hitting url");
	//	driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ObjectCreation();
		return driver;
		
	
	}	
public void ObjectCreation() {
	System.out.println("Objects created");
	indexpage= new IndexPageObjects(driver);
	loginpage=new LoginPageObjects(driver);
	consultingpage= new ConsultingPageObjects(driver);
	homepage= new HomePageObjects(driver);

		
		
	}

/*public String getScreenshot(String testcasename, WebDriver driver) throws IOException {
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 String destn=path +"\\reports\\"+ testcasename + ".png";
	 FileUtils.copyFile(src, new File(destn));
	 return destn ;
	 
	 
}*/

@AfterMethod(alwaysRun = true)
public void closebrowser() {
	System.out.println("Closed browser");
	driver.quit();
	
}


}
