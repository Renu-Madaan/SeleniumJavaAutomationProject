package SeleniumJava;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshorts {
	public static void main(String args[]) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();

		// Cast driver to TakesScreenshot
		TakesScreenshot ts = (TakesScreenshot) driver;// takesScreenshot is a interface we cannnot insensiate/create an object 

		// Capture the screenshot as a file
		File source = ts.getScreenshotAs(OutputType.FILE);

		// Set the destination where the screenshot will be saved
		File destination = new File("C:\\Users\\user\\OneDrive\\Pictures\\RenuAutomation.png");

		// Save the screenshot
		FileHandler.copy(source, destination);

		Thread.sleep(3000);
		// Optionally close the browser
		driver.quit();

		System.out.println("Screenshot captured successfully!");
	}
}
