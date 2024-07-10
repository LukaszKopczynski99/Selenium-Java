package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/");
		
		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password =driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		String text = driver.findElement(By.xpath("//div[contains(text(), 'Pages')]")).getText();
		
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		
		//repating pages
		for(int p=1;p<=5;p++)
		{
			if(p>1)
			{
				WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(1000);
			}
			
			//reading data from the page
			
			int numOfRows = driver.findElements(By.xpath("//table[@class='able table-bordered table-hover']//tbody//tr")).size();
			
			for(int r= 1; r<=numOfRows;r++)
			{
				String customerName = driver.findElement(By.xpath("//table[@class='able table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				String customerEmail = driver.findElement(By.xpath("//table[@class='able table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
				String customerStatus = driver.findElement(By.xpath("//table[@class='able table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();
				
				System.out.println(customerName+"\t"+customerEmail+"\t"+customerStatus);
				
			}
			
			
		}
	}

}
