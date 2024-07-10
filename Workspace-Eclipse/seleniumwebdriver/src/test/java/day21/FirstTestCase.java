package day21;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		//1)Launch a browser (chrome browser)
		
		ChromeDriver driver = new ChromeDriver();
		
		//2) Open URL
		
		driver.get("https://demoqa.com/");
		
		//3 Check if the title is "DEMOQA"
		
		String act_title  = driver.getTitle();
		
		if(act_title.equals("DEMOQA")){
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}
		
		driver.close();
		//driver.quit();
	}

}
