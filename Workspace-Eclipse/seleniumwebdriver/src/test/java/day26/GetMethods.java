package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		//get() will open the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		/// getTitle() - returns a title of the page
		String web_title = driver.getTitle();
		System.out.println(web_title);
		
		//getCurrentUrl - returns a current ulr of the page
		String curr_ulr = driver.getCurrentUrl();
		System.out.println(curr_ulr);
		
		//getPageSource() - returns source code of the page
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns ID of the single Brwoser window
		//String window_id = driver.getWindowHandle();
		//System.out.println(window_id);
		
		//getWindowHandles() - returns ID's of the multiple windows
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Thread.sleep(1000);
		
		Set<String> a = driver.getWindowHandles();
		System.out.println(a);
		
		
		
		
		
		

	}

}
