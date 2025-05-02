package SeleniumJava;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivermethods02 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.newbalance.com");
		driver.navigate().to("https://vinothqaacademy.com/multiple-windows/");
		System.out.println(driver.getWindowHandle());// Retrive the current window handle
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click(); // sub child
		System.out.println(driver.getWindowHandles());

		driver.switchTo().window(driver.getWindowHandle());
		System.out.println("Switch to the parent window and the title is" + driver.getTitle());// getTitle is also used
		Thread.sleep(3000);

		driver.quit();

	}

}// what is the difference between window handle and windowhandles // return type // set // it doesnot allow duplicate value 
//Retrive the current window handle

