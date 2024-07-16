package Mainclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class main {

	public static WebDriver driver;
	public static Properties prop;
	static String pro = "/src/test/java/Resources/evn.properties";
	static {

		try {

			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + pro);
			prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Before
	public void LaunchBrowser() {

		String Launchbrow = prop.getProperty("browser");

		switch (Launchbrow) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();

		default:

			break;
		}

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

	}

	public void clickevent(WebElement clck) {

		try {
               clck.click();
		} catch (Exception e) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("argument[0].click()", clck);
		}
	}

	public void handleAlert(String key) {

		Alert alert = driver.switchTo().alert();

		switch (key) {
		case "accept":
			alert.accept();
			break;

		case "dismiss":
			alert.dismiss();
			break;

		default:
			break;
		}

	}

	public void switchframe(int i) {

		driver.switchTo().frame(i);

	}

	public void explicitwait(String value, int time, WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));

		switch (value) {
		case "alert":
			wait.until(ExpectedConditions.alertIsPresent());
			break;

		case "clickable":

			wait.until(ExpectedConditions.elementToBeClickable(ele));
			break;

		case "visible":

			wait.until(ExpectedConditions.visibilityOf(ele));
			break;
		default:
			break;
		}

	}

	public void selectdropdown(WebElement webele, String value, String type) {

		Select scl = new Select(webele);

		switch (type) {
		case "visibletext":
			scl.selectByVisibleText(value);
			break;

		case "value":
			scl.selectByValue(value);
			break;

		case "selectindex":
			scl.selectByIndex(Integer.parseInt(value));
		default:
			break;
		}

	}

	public void dropdown(List<WebElement> list, String value) {

		for (WebElement ele : list) {

			String word = ele.getText();

			if (word.equals(value)) {
				System.out.println(word);

				clickevent(ele);

			}

		}

	}

	@After

	public void Closewindow(Scenario s) throws IOException {

		if (s.isFailed()) {

			TakesScreenshot sc = (TakesScreenshot) driver;
			File src = sc.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("Screenshot/" + s.getName() + ".png"));
		}

		driver.quit();
	}

}
