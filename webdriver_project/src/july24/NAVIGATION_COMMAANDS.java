package july24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NAVIGATION_COMMAANDS {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com");
		System.out.println("pageTitle[1]"+driver.getCurrentUrl());
		Thread.sleep(5000);
		//click on gmail link
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("pageTitle[2]"+driver.getTitle());
		Thread.sleep(5000);
		//click back button in browser
		driver.navigate().back();
		System.out.println("pageTitle[3]"+driver.getTitle());
		Thread.sleep(5000);
		// click forward button in a browser
		driver.navigate().forward();
		System.out.println("paheTitle[4]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
