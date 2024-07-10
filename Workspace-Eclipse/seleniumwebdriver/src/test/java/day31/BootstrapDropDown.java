package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		
		
		driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click(); //open drop down options
		//1) Select single option
		
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//2) capture the options from the drop down and find the size
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
		System.out.println(options.size());
		//printing options from drop down
		for(WebElement opt:options) {
			
			String op = opt.getText();
			
			if(  op.equals("Web Development")    ||  op.equals("Programming Languages") 
					|| op.equals("Databases")  )
			{
				continue;
			}
			else
			{
				System.out.println(opt.getText());
			}
			
				
		}
		
		//4) select multiple options
		
		for(WebElement opt:options) {
			
			String option = opt.getText();
			
			if(option.equals("Java") || option.equals("Python"))
			{
				opt.click();
			}
		
	}
		

	}

}
