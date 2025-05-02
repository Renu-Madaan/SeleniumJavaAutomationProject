package SeleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods03 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.navigate().to("https://vinothqaacademy.com/multiple-windows/");
		for (String window : driver.getWindowHandles()) {
			String mainWindow = driver.getWindowHandle();// Retrive the current window handle
			WebDriver window2 = driver.switchTo().newWindow(WindowType.WINDOW);// selenium 4.XX Onwards
			window2.get("https://mvnrepository.com/");

			Thread.sleep(4000);
			if (window2.equals(mainWindow)) {
				driver.close();// close the new window
			}

			Thread.sleep(5000);
			driver.switchTo().window(mainWindow);// boolean default value is 'false'// int 0 //Ascii value //char
													// 'a';'A'
			Thread.sleep(5000);
			driver.quit();

		}
	}
}