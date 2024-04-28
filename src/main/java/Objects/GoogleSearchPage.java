package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchbox = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea");
	By search_button = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[6]/center/input[1]");
	By faceboo_link_button = By.xpath("/html/body/div[4]/div/div[12]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3");
	public void searchGoogle(String Searchinput) {
		try {
			driver.findElement(searchbox).sendKeys(Searchinput);
			Thread.sleep(5000);
			driver.findElement(search_button).click();
		} catch(Exception e) {
			System.out.println("Exceptions Caught"+ e.getMessage());
		}
		
	}
	
	public void clickFacebook() {
		try {
			this.searchGoogle("facebook");
			Thread.sleep(5000);
			driver.findElement(faceboo_link_button).click();
		} catch(Exception e) {
			System.out.println("Exceptions Caught"+ e.getMessage());
		}
		
	}
}