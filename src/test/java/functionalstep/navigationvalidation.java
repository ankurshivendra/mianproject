package functionalstep;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Mainclass.main;

public class navigationvalidation extends main {

	public void check_working_of_navigation_button_working() {

		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();

	}

	public void close_navigation_bar() {

		WebElement ele = driver.findElement(By.cssSelector("button#react-burger-menu-btn"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", ele);
//		

	}

	public void check_successful_selection_on_navigation() {

		List<WebElement> list = driver.findElements(By.xpath("//nav[@class='bm-item-list']/a"));

		dropdown(list, "Logout");

	}

	public void successful_selection() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement ele = driver.findElement(By.xpath("/html/body/div/header/div/div/div[2]/div/div/a/button[1]"));

		driver.navigate().refresh();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);

	}

}
