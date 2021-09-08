package flipkartWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
WebDriver dro;

	public void flipkartloginpagedisplay()
	{
		System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe" );
	
	
		dro=new ChromeDriver();
		dro.get("https://www.flipkart.com");
	}
}
