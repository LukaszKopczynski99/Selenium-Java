package day38;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomationMsgOnScreen {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
			
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://demoqa.com/");
	
		String act_title  = driver.getTitle();
		
		if(act_title.equals("DEMOQA")){
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}

	}

}
