package day28;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment {

	public static void main(String[] args) throws InterruptedException {
		
		int count_links = 0;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//1) search for some phrase
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000); //need it becasue website need to load some stuff
		//2) Count how many links are there with this specific name ("selenium")
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			String linkText = link.getText();
			if(linkText.contains("Selenium"))
			{
				link.click(); //3) click on each using for loop
				count_links++;	
			}
		}
		
		System.out.println("Total number of links with a (selenium) phrase : "+count_links);
		
		Set<String>windowIDs = driver.getWindowHandles();
		for(String winID:windowIDs)
		{
			String title = driver.switchTo().window(winID).getTitle();
			System.out.println(title+"                 "+winID); //4) Get windows ID's for every broser window
			
			if(!title.equals("Selenium (software) - Wikipedia")) //5) close everything expect selenium software
			{
				driver.close();
			}
			
		}
		
	}

}