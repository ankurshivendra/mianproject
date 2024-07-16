package functionalstep;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Mainclass.main;

public class succefulloginsteps extends main {
	
	public void verify_login_pages() {
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='app_logo']"));
		
		String word = ele.getText();
		assertEquals(word, "Swag Labs");

		
	}

}
