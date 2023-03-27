package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class printScreen {

	static WebDriver driver;
	
	public static void screenshot() {
		
		
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile,C:\\Users\\Poongkodiselvam\\Desktop\\Screenshot+"/fblogin.png ");
	}

	/*	TakesScreenshot TS= (TakesScreenshot)driver;
		
		File screenshotAs = TS.getScreenshotAs(OutputType.FILE);
		//System.out.println(screenshotAs);
		
		File destination= new File("C:\\Users\\Poongkodiselvam\\Desktop\\Screenshot\\fblogin.png");
		
		try {
			FileUtils.copyFile(screenshotAs, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/

}

