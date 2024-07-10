package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		
		
		//min
		WebElement min_slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		System.out.println("Before: "+min_slider.getLocation()); //(59,251) 
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 0).perform();
		
		System.out.println("After : "+min_slider.getLocation()); //(59,251) 
		
		//max
		WebElement max_slider = driver.findElement(By.xpath("(//span[2]"));
		System.out.println("Before : "+max_slider.getLocation());
		
		act.dragAndDropBy(max_slider,-200,0).perform();
		
		System.out.println("After : "+max_slider.getLocation());
	}

}
