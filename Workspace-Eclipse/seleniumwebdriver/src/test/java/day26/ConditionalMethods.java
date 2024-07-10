package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		
		//conditional methods - access these commands through WebElement
				//returns boolean value (T/F)
				// isDisplayed()
				// isEnabled()
				// isSelected()
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.manage().window().maximize();
		
		// isDisplayed()
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Check if logo is displayed : "+logo.isDisplayed());
		
		// isEnabled()
		
		WebElement first_name = driver.findElement(By.id("FirstName"));
		System.out.println("Enable status : "+first_name.isEnabled());
		
		// isSelected()
		
		System.out.println("------------Before selection-----------------");
		
		
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); // false
		
		
		System.out.println("------------After selecting female-----------");
		
		female_rd.click(); //select male rd button
		
		System.out.println(male_rd.isSelected()); 
		System.out.println(female_rd.isSelected()); 
		
	}

}
