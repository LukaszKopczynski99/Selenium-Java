package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1) find total number of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		//int rows = driver.findElements(By.tagName("tr")).size(); //only when there is a single table
		System.out.println("Number of rows : "+rows);

		//2) Find total number of colums in a table
		
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of colums : "+columns);
		
		//3) Read data from specific row and column (ex: 5th row and 1st column)
		//String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		//System.out.println(bookName);
		
		//4)Read data from all the rows and columns
//		System.out.println("-----------------------------------------------");
//		for(int r=2;r<=rows;r++) 
//		{
//			for(int c=1;c<=columns;c++)
//			{
//				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(value+"\t");
//			}
//			System.out.println();
//		}
		//5) Read data which author are Mukesh
		
//		for(int r=2;r<=rows;r++)
//		{
//			String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//			if(authorName.equals("Mukesh"))
//			{
//				String bookNameM = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
//				System.out.println(bookNameM+"\t"+authorName);
//			}
//		}
		//6) Find total prize of all books
		int total=0;
		for(int r=2;r<=rows;r++)
		{
				String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				total+=Integer.parseInt(price);
				
		}
		System.out.println("Total price of the books : "+total);
		
		driver.quit();
	}

}
