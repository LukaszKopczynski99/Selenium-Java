package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathDemo {

	public static void main(String[] args) throws InterruptedException {
	
//		WebDriver driver = new ChromeDriver();
//		
//		
//		driver.get("https://demoqa.com/text-box");
//		
//		driver.manage().window().maximize();
//		
//		//Xpath with a single attribute
//		
//		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Lukasz K");
//		
//		//Xpath with multiple attributes //tag[@attr][@attr]
//
//		driver.findElement(By.xpath("//input[@placeholder='name@example.com'][@id='userEmail']"))
//		.sendKeys("lk@op.pl");
//		
//		//Xpath with 'and' 'or' operators 
//		
//		driver.findElement(By.xpath("//textarea[@placeholder='Current Address' and @id='currentAddress']"))
//		.sendKeys("WWa");
//		
//		driver.findElement(By.xpath("//textarea[@id='permanentAddress' or @class='form-controllllllllasdadasd']"))
//		.sendKeys("Krk");
//		
//		Thread.sleep(3000);
//		
//		driver.quit();
//		
//		Thread.sleep(1000);
		
//		WebDriver driver1 = new ChromeDriver();
//		//xpath with inner text = text()
//		//tag[text()='value']
//		
//		driver1.get("https://demoqa.com/links");
//		
//		driver1.manage().window().maximize();
//		
//		//driver1.findElement(By.xpath("//a[text()='Home']")).click();
//		
//		
//		//Display status header in the console 
//		
//		 boolean h1DS = driver1.findElement(By.xpath("//h1[text()='Links']")).isDisplayed();
//		 System.out.println(h1DS);
//		 String h1Text = driver1.findElement(By.xpath("//h1[text()='Links']")).getText();
//		 System.out.println(h1Text);
//		 
//		 // xpath with contain() 
//		 
//		 //driver1.findElement(By.xpath("//a[contains(@id,'simple')]")).click();
//		 
//		
//		 
//		 //xpath with starts-with()
//		 
//		 driver1.findElement(By.xpath("//a[starts-with(@id,'simple')]")).click();
//		 
//		  Thread.sleep(3000);
//		  
//		 driver1.quit();
		 
		//Dynamic attributes
		
//		 
//		 WebDriver driver2 = new ChromeDriver();
//		 
//		 driver2.get("https://demoqa.com/dynamic-properties");
//		 
//		 driver2.manage().window().maximize();
//		 
//		 //Display text that has random ID 
//		 
//		 String rand_text = driver2.findElement(By.xpath("//p[contains(text(),'This text has random Id')]")).getText();
//		 System.out.println(rand_text);
//		 if(rand_text.equals("This text has random Id"))
//		 {
//			 System.out.println(true);
//		 }
//		 else
//		 {
//			 System.out.println(false);
//		 }
//		 
//		 driver2.close();
//		 
		 //name=xyz001 -> xyz002-> xyz003 -> xyz001 ... 
		 //*[contains(name,'xyz')]
		 //*[starts-with(name,'xyz')]
		 
		 //chained xpath 
		
		
		WebDriver driver3 = new ChromeDriver();
		
		driver3.get("https://www.globalsqa.com/demo-site/");
		driver3.manage().window().maximize();
		
		driver3.findElement(By.className("fc-button-label")).click();
		
		Thread.sleep(2000);
		
		boolean status_img = driver3.findElement(By.xpath("//div[@class='logo_img']/a/img")).isDisplayed();
		System.out.println(status_img);
		
		driver3.quit();
		
	}

}
