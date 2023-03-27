package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLogin {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\New folder\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("munis239");
		driver.findElement(By.id("pass")).sendKeys("1234");
		WebElement button = driver.findElement(By.name("login"));
		button.click();

		TakesScreenshot TS = (TakesScreenshot) driver;

		File screenshotAs = TS.getScreenshotAs(OutputType.FILE);
		// System.out.println(screenshotAs);

		File destination = new File("C:\\Users\\Poongkodiselvam\\Desktop\\Screenshot\\fblogin.png");

		try {
			FileUtils.copyFile(screenshotAs, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			driver.quit();

		}

	}
}