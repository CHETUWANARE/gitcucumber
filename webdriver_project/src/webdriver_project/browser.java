package webdriver_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {

	public static void main(String[] args) throws Throwable {
		// create instance ogject for chrome
		WebDriver driver = new ChromeDriver();
		/*// create instance object for firefox browser
		WebDriver dr= new FirefoxDriver();
		// cretae instance object for microsoft edge
		WebDriver dl = new EdgeDriver();
		*/
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://google.com");
		//suspend tool for 5 sec
		Thread.sleep(5000);
	
		//driver.close()
		driver.quit();
	}
		

}
