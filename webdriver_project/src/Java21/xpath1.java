package Java21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.OffsetMapping.ForThrowable;

public class xpath1 {

	public static void main(String[] args) throws Throwable {
		// create instance object for firefox
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://stagesflight.com/Account/Register");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("chetan");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("wanare");
		driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys("9765034306");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("chetuwanare@gmail.com");
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		

	


	}

}
