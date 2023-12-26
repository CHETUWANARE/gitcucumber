package Java21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getValidationMethod {

	public static void main(String[] args) throws Throwable {
		// write a script to print title and url along with its length
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		String page_title = driver.getTitle();
		System.out.println(page_title);
		System.out.println(page_title.length());
		String str_url= driver.getCurrentUrl();
		System.out.println(str_url);
		System.out.println(str_url.length());
		driver.quit();
		
		

	}

}
