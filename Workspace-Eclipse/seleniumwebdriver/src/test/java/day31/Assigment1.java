package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		
		//1) Counting
		WebElement Country = driver.findElement(By.xpath("//select[@id='country-list']"));
		Select Ctr = new Select(Country);
		
		Ctr.selectByValue("5"); //3)
		
		List<WebElement> ctr_options = Ctr.getOptions();
		System.out.println("Number of countries in the dropdown : "+(ctr_options.size()-1));
		
		WebElement State = driver.findElement(By.xpath("//select[@id='state-list']"));
		Select Stt = new Select(State);
		
		Stt.selectByValue("1"); //3)
		
		List<WebElement> stt_options = Stt.getOptions();
		System.out.println("Number of states in the dropdown : "+(stt_options.size()-1));
		
		//2) Printing
		
		for(int i=1;i<ctr_options.size();i++)
		{
			System.out.println(ctr_options.get(i).getText());
		}
		
		System.out.println("----------------------------------------------");
		
		for(WebElement stopt:stt_options)
		{
			if(stopt.getText().equals("Select State"))
			{
				continue;
			}
			else
			{
				System.out.println(stopt.getText());
			}
			
		}
		
		//3 Pick one done before since we need to pick state before printing
		
		
		
		
		

	}

}
