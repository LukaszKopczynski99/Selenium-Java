package travelAgencyTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TravelAgancyMain {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.blazedemo.com/");
		
		WebElement departure_city = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select cdc = new Select (departure_city);
		cdc.selectByValue("Mexico City");
		
		WebElement destination_city = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select ddc = new Select (destination_city);
		ddc.selectByValue("Rome");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		
		double the_lowest_price=1000000000;
		int lower_price_row=0;
		
		for(int r=1;r<rows;r++)
		{
			String price_s = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			
			Double price_d = Double.parseDouble(price_s.substring(1));
			
			if(the_lowest_price>price_d)
			{
				the_lowest_price=price_d;
				lower_price_row++;
			}
			
		}
		
		System.out.println("The lowest flight price : "+the_lowest_price+"$");
		System.out.println("The lowest flight price row : "+lower_price_row);
		
		driver.findElement(By.xpath("//table[@class='table']//tr["+lower_price_row+"]//td[1]")).click();
		
		driver.findElement(By.id("inputName")).sendKeys("David");
		driver.findElement(By.id("address")).sendKeys("123 notAmainSt.");
		driver.findElement(By.id("city")).sendKeys("Miami");
		driver.findElement(By.id("state")).sendKeys("Florida");
		driver.findElement(By.id("zipCode")).sendKeys("21370");
		
		WebElement card = driver.findElement(By.id("cardType"));
		Select sc = new Select(card);
		sc.selectByValue("dinersclub");
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("6969 0000 6969 0000");
		driver.findElement(By.id("creditCardMonth")).sendKeys("10");
		driver.findElement(By.id("creditCardYear")).sendKeys("2137");
		driver.findElement(By.id("nameOnCard")).sendKeys("XYZ");
		
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		String title = driver.findElement(By.xpath("//div[@class='container hero-unit']/h1")).getText();
		
		if(title.equals("Thank you for your purchase today!"))
		{
			System.out.println("Valid purchase");
		}
		else
		{
			System.out.println("Invalid purchase");
		}
		
		driver.quit();
		
	}

}
