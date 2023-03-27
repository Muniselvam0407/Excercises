package selenium;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class searchOption {

	static WebDriver driver;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String browser = sc.next();

		if (browser.equals("GC")) {

			System.setProperty("webdriver.chrome.driver",
					"E:\\Testing\\New folder\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		} else if (browser.equals("FF")) {

			System.setProperty("webdriver.gecko.driver",
					"E:\\Testing\\New folder\\geckodriver-v0.32.2-win32\\geckodriver.exe");
			driver = new FirefoxDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		} else {
//			System.setProperty("webdriver.ie.driver", "E:\\Testing\\New folder\\chromedriver_win32\\chromedriver.exe");
//			driver = new InternetExplorerDriver();
//
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		}

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.quit();
	}

}
