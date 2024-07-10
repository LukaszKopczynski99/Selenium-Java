package day38;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionsAtRunTime {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		File file = new File ("D:\\ECLIPSE\\Workspace-Eclipse\\crx-files\\Adblock-Plus-darmowy-adblocker.crx");
		
		options.addExtensions(file);
		
		
		
		ChromeDriver driver = new ChromeDriver(options);
	
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");

		
	//Step 1 : Add CRX Extractor/Downloader to chrome Browser (manually)
	//Step 2 : Add SelectorHub/Adblock plugin to chrome browser (manually)
	//Step 3 : Capture crx file for selectorhub extension
	//Step 4 : Pass crx file path in automation script in Chrome Options 
		
		
		
	}

}
