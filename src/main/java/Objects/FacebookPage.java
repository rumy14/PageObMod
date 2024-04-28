package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {
	WebDriver driver;
	
	public FacebookPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username_editbox = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input");
	By password_editbox = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input");
	By login_button = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button");
	
	public void enterUsername() {
		driver.findElement(username_editbox).sendKeys("test@gmail.com");
	}
	
	public void enterPassword() {
		driver.findElement(password_editbox).sendKeys("123456");
	}
	
	public void verifyLogin() {
		driver.findElement(login_button).click();
		String title = driver.getTitle();
		assertEquals(title, "Login Page");
	}
}
