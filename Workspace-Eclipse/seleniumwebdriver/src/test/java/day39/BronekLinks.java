package day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BronekLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");	
		driver.manage().window().maximize();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		int nObL = 0;
		
		System.out.println(links.size());
		
		for(WebElement linkElement :links)
		{
			String hrefattValue = linkElement.getAttribute("href");
			if(hrefattValue==null || hrefattValue.isEmpty())
			{
				System.out.println("Not possible to check");
				continue;
			}
			
			//hit url to the server
			try
			{
				URL linkULR = new URL(hrefattValue); //string href to URL 
				HttpURLConnection conn = (HttpURLConnection) linkULR.openConnection(); //open connection to the server
				conn.connect(); //connect to server and sent request to the server
			
				if(conn.getResponseCode() >= 400 )
				{
					System.out.println(hrefattValue+" --- > Broken link");
					nObL++;
				}
				else
				{
					System.out.println(hrefattValue+" --- > Not a broken link");
				}
			}
			
			catch(Exception e)
			{
				
			}
			
			
		}
		System.out.println(nObL);

	}

}
