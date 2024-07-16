package functionalstep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Mainclass.main;

public class lauchurl extends main {

	WebDriver driver;
	
	public void verify_url() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}

}
