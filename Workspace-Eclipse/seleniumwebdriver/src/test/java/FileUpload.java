import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();

		//Single file upload - Test1.txt
		
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\mateu\\Desktop\\Test1.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equals("Test1.txt"))
		{
			System.out.println("Wysłano plik poprawnie");
		}
		else
		{
			System.out.println("Problem z wyslaniem");
		}
		*/
		
		//Multiple files
		
		String file1 = "C:\\Users\\mateu\\Desktop\\Test1.txt";
		String file2 = "C:\\Users\\mateu\\Desktop\\Test2.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int num = driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();
		System.out.println(num);
		
	}

}
