package Java21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class xpath {

	public static void main(String[] args) {
		// create instace objectbfor firefox
		WebDriver driver = new FirefoxDriver(null);
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		

	}

}
