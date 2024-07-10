package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1) Select specyfic checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2 ) Select all checkboxes
		List<WebElement>checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//		
//		for(WebElement check:checkboxes)
//		{
//			check.click();
//		}
		
		//3 select last 3 checkboxes
		
//		for(int i=(checkboxes.size()-3);i<checkboxes.size();i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		//4 select first 3 checkboxes
		
//		for(int i=0;i<3;i++) {
//			checkboxes.get(i).click();		
//	}
		
		//5 unselect checkboxes if they are selected
	
		for(int i=0;i<3;i++) 
		{
			checkboxes.get(i).click();		
		}
		
		Thread.sleep(2000);
		
		for(int i=0;i<3;i++) 
		{
			
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();	
			}
				
		}

}
	
}
