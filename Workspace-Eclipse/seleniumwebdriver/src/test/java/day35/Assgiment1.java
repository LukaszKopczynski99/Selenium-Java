package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assgiment1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Double Click
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act = new Actions (driver);
		
		act.doubleClick(button).build().perform();
		
		//Drag and drop
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("	//div[@id='droppable']"));
		
		System.out.println("-------------------------Before-------------------------");
		
		
				System.out.println(drop.getText());
		
		act.dragAndDrop(drag, drop).perform();
		
		System.out.println("-------------------------After-------------------------");
		
		System.out.println(drop.getText());
		
		

		
		
	
		
		

	}

}
