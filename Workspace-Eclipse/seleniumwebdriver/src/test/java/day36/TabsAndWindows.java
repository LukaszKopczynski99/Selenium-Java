package day36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		//SELENIUM 4 ! 
		//driver.switchTo().newWindow(WindowType.TAB); // open new tab
		driver.switchTo().newWindow(WindowType.WINDOW); // open new window
		driver.get("https://www.opencart.com/");
		
		driver.manage().window().maximize();

		
		//https://www.opencart.com/
	}

}
