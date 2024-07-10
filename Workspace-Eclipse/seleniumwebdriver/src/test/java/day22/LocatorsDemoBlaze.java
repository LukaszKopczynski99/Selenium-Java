package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemoBlaze {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		
		List<WebElement> total_num_of_links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are : "+total_num_of_links.size());
		
		
		List<WebElement> total_num_of_img = driver.findElements(By.tagName("img"));
		System.out.println("Total number of imgs are : "+total_num_of_img.size());
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Samsung galaxy s6")).click();
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
	}

}
