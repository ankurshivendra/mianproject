package functionalstep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Mainclass.main;

public class loginsteps extends main {

	public void enter_valid_username_password(String user, String pass) {

		WebElement ele = driver.findElement(By.xpath("//input[@id='user-name']"));
		ele.sendKeys(user);
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='password']"));
        ele2.sendKeys(pass);

	}

	public void click_on_login_button() {

		WebElement ele = driver.findElement(By.xpath("//input[@id='login-button']"));
		clickevent(ele);
	
	

	}

	

}
