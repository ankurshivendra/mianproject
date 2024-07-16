package functionalstep;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Mainclass.main;

public class cartsteps extends main {

	public void add_product_into_cart() {

		WebElement ele = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		clickevent(ele);

	}

	public void verify_cart_element() {

		WebElement el = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		String num = el.getText();

		assertEquals(num, "1");
	}
	
	public void click_on_cart_btn() throws InterruptedException {
		
		driver.navigate().refresh();
		
		WebElement ele = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		
	
		
		clickevent(ele);
		
		String actual = driver.getCurrentUrl();
		
		assertEquals(actual,"https://www.saucedemo.com/cart.html");
		Thread.sleep(10000);
		
	}
	

}
