package TestScenario;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Objects.FacebookPage;
import Objects.GoogleSearchPage;


public class TestMethod_GoogleSearch {
	WebDriver driver;
	GoogleSearchPage objectrepo;
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.edge.driver",
				"E:\\selenium\\SymlexAdminPanel001\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver(); // launch edge browser
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
	}
	
	
	public void SearchOpeation() throws InterruptedException {
		GoogleSearchPage page = new GoogleSearchPage(driver);
		page.searchGoogle("facebook");
	}
	
	
	public void verifyandAccessFacebook() throws InterruptedException {
		objectrepo  = new GoogleSearchPage(driver);
		objectrepo.clickFacebook();
		
		Thread.sleep(5000);
	}
	
	@Test
	public void verifyLogin() throws InterruptedException {
		this.SearchOpeation();
		this.verifyandAccessFacebook();
		FacebookPage page  = new FacebookPage(driver);
		page.enterUsername();
		page.enterPassword();
		page.verifyLogin();
	}
	
	@AfterTest
	public void aftertest() {
		//driver.quit();
	}
	
}