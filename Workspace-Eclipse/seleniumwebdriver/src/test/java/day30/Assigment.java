package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("test");
		
		driver.findElement(By.linkText("https://a9t9.com")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame5);
		
		Boolean image = driver.findElement(By.xpath("//img[@src = '/Content/Images/ui.vision.logo2.webp']")).isDisplayed();
		System.out.println("Check if image is visible : "+image);

	}

}
