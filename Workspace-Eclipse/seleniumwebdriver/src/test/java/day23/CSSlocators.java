package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSlocators {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		//CSS locator with an id tag#id
		
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Lukasz");
		
		//CSS locator with an atribute  tag[atribute]
		
		driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("lk@op.pl");
		
		//CSS locator with the atribute 2 
		
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Kop");
		
		//CSS locator with class and atribute
		
		//tag.class[atribute] - not not find any expample 
		
		//CSS locator with class 
		
		//tag.class 
		
		
		
		
		
		
	}

}
