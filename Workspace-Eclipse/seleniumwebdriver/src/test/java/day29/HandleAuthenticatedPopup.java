package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup {

	public static void main(String[] args) {
		
		//Authenticated popup (alert)
		
		WebDriver driver = new ChromeDriver();
		
		// 	http://login:password@rest_of_link
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
