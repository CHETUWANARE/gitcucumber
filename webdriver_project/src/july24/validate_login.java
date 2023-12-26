package july24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validate_login {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//store username textbox into webelement
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("test");
		//capture username value 
		String EnterUsername= username.getAttribute("value");
		//store password textbox into webelement
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		//capture password value
		String Enterpassword = password.getAttribute("Value");
		System.out.println(EnterUsername+"  "+Enterpassword);
		//click login button 
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		String Expected ="dashboard";
		String Actual= driver.getCurrentUrl();
		if(Actual.contains(Expected)) {
			System.out.println("Login Success:: "+Expected+"   "+Actual);
		}
		else {
			//capture error message
			String Error_Message= driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(Error_Message+"  "+Expected+"  "+Actual);
		}
		driver.quit();
		
		}
			
		
		
	}


