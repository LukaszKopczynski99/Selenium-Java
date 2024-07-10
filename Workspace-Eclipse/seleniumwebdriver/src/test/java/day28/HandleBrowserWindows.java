package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String>windowIDs = driver.getWindowHandles();
		
		//Approach 1 - preffered for less elements (up to 3)
//		List<String> windowList = new ArrayList(windowIDs);
//		String  parentID = windowList.get(0);
//		String  ChildID = windowList.get(1);
//		
//		System.out.println("------before-----");
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().window(ChildID);
//		System.out.println("------after-----");
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().window(parentID);
//		System.out.println("------back to the start-----");
//		System.out.println(driver.getTitle());
		
		
		//Approach 2 - loop statement
		
		for(String winID:windowIDs)
		{
			String title = driver.switchTo().window(winID).getTitle();
			
			if(title.equals("OrangeHRM")) //go to the  page you are interested (by title) in and do stuff you want
			{
				System.out.println(driver.getCurrentUrl());
			}
			else
			{
				System.out.println(driver.getCurrentUrl());
			}
			
			
		}
	}

}
