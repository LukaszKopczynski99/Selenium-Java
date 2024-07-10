package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		//driver.get("https://demoqa.com/"); // accepts URL only in the string format
		
		
		
//		URL myurl = new URL("https://demoqa.com/");
//		driver.navigate().to(myurl); //accepts URL in string and URL object !!!
//		
//		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000); //for better view
		driver.navigate().back();
		System.out.println("---back-----");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000); //for better view
		driver.navigate().forward();
		System.out.println("---forward-----");
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(1000); //for better view
		driver.navigate().refresh();

	}

}
