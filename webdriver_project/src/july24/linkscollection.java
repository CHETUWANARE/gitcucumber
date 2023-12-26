package july24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkscollection {

	public static void main(String[] args) throws Throwable{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("gnail.com/");
	Thread.sleep(5000);
	// get collection of link in web page
	List<WebElement>All_Links= driver.findElements(By.tagName("a"));
	System.out.println("No of links are::"+All_Links.size());
	Thread.sleep(5000);
	for (WebElement each : All_Links) {
		System.out.println(each.getText());
		System.out.println(each.getAttribute("href"));
	}
	Thread.sleep(5000);
	
	driver.quit();
	
	}
		
	
	
	
	

	}


