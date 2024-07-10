package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShots {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1) Full page screen shoot
		
		//TakesScreenshot ts = (TakesScreenshot) driver;
		
		/*	File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\ssfolder\\fullpage.jpg");
		
		sourcefile.renameTo(targetfile); //copy sourcefile to targetfile
		
		*/
		//2) Capture the screenshot of specyfic section
		
//		WebElement featuredProducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		
//		File sourcefile =  featuredProducts.getScreenshotAs(OutputType.FILE);
//		File targetfile = new File(System.getProperty("user.dir")+"\\ssfolder\\SectionFP.jpg");
//		sourcefile.renameTo(targetfile);
		
		
		
		//3) Screenshot of specyfic element
		
		WebElement image = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile1 =  image.getScreenshotAs(OutputType.FILE);
		File targetfile1 = new File(System.getProperty("user.dir")+"\\ssfolder\\LogoImage.jpg");
		sourcefile1.renameTo(targetfile1);
		
		driver.quit();
;	}

}
