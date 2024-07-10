package day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("fc-button-label")).click();
		
		Thread.sleep(3000);
		//name locator 
		
		//driver.findElement(By.name("username")).sendKeys("Username");
		
		// id locator
		
		//Can not find any id on the website (is.Displayed() - check if image is visivle or not)
		
		
		//linktext & partiallinkText
		
		//Thread.sleep(5000);
		//driver.findElement(By.linkText("Click Here for Valid Link")).click();
		//driver.findElement(By.partialLinkText("Valid")).click();
		
		
		//classname -group of elements 
//		List<WebElement>header_link = driver.findElements(By.className("container"));
//		int temp = header_link.size();
//		System.out.println(temp);
		
		//tag name - group of elements
		
//		List<WebElement>links=driver.findElements(By.tagName("a"));
//		System.out.println("Total links on a webpage : "+links.size());
		
		//Total number of images on the page
		
		List<WebElement> image_number = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images : "+image_number.size());
		
		
		
		driver.quit();
		
		

	}

}
