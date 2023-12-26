package July25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_item {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Create new accou")).click();
		//store day , month, and year listbox into select class
		Select daylist = new Select (driver.findElement(By.name("")));
		
		
		

	}

}
