package functionalstep;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Mainclass.main;

public class filterbuttn extends main {

	public void verify_filter_button() {

		WebElement element = driver.findElement(By.cssSelector("select.product_sort_container"));

		Select sl = new Select(element);
		
		sl.selectByVisibleText("Price (low to high)");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().refresh();

	}

	public void verify_filter_success() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().refresh();

		WebElement element = driver.findElement(By.xpath("//a[@id='item_2_title_link']/div"));

		String word = element.getText();

		System.err.println(word);

		assertEquals(word, "Sauce Labs Onesie");

	}

}
