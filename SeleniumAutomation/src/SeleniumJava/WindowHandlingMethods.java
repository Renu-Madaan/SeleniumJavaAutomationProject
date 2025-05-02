package SeleniumJava;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingMethods {

	public static void main(String[] args) {
		// Create a instance of the Chrome browser using using Selenium
		WebDriver driver = new ChromeDriver();
		// Minimize the browser Window
		driver.manage().window().minimize();

		// Set the browser to fullScreen Mode
		driver.manage().window().fullscreen();

		// Maximize the Browser Window
		driver.manage().window().maximize();

		// Open the specified Url
		driver.navigate().to("https://www.facebook.com");

//		// Returns the Window handle of the current page.
//		System.out.println(driver.getWindowHandle());

		// Switch to new window type TAB
		WebDriver window1 = driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://vinothqaacademy.com/alert-and-popup/");// open a specified URl but in new tab

		// Switch to new window type Window
		WebDriver window2 = driver.switchTo().newWindow(WindowType.WINDOW);// selenium 4.XX Onwards
		//driver.navigate().to("https://mvnrepository.com/");
		window2.get("https://mvnrepository.com/");

//		// Return a set of all WindowHandles
//		 System.out.println(driver.getWindowHandles());
		
        // Switch control to the Parent Window 
		 driver.switchTo().window(driver.getWindowHandle());
		 System.out.println("Switch to the parent window and the title is" + driver.getTitle());
		

		// close only the current Window
		driver.close();
		// close all remaining Window
		driver.quit();
	}

}
