package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//1) open app
//2_ test logo presence
//3) login to the app
//4) close the app

public class OragneHRMTest {
  
	WebDriver driver;
	
	@Test(priority=1)
	void appopen()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	void logocheck() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean image = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Image status : "+image);
	}
	
	//Username : Admin
	//Password : admin123
	@Test(priority=3)
	void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	@Test(priority=4)
	void loguot()
	{
		driver.quit();
	}
	
	
	
}
