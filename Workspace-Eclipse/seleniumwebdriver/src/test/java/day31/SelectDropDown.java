package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropdownEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select dropdown = new Select (dropdownEle);
		
		dropdown.selectByValue("uk");
		//dropdown.selectByVisibleText("France");
		//dropdown.selectByIndex(2);

		//capture the options from the dropdown
		
		List<WebElement>options=dropdown.getOptions();
		
		System.out.println("Number of elements in the dropdown: "+options.size());
		
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		
	}

}
