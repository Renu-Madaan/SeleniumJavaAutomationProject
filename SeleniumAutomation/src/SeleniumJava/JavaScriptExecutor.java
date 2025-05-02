package SeleniumJava;
//To scroll up and down a webpage using Selenium WebDriver, you can use JavaScriptExecutor, 

//which allows you to run JavaScript commands to scroll

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,6000)"); // Scrolls down 500 pixels
		Thread.sleep(5000);
		// js.executeScript("window.scrollBy(0,-5000)"); // Scrolls up 500 pixels

		// -----------------------------
		// ✅ 3. Scroll to Bottom of the Page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		// ✅ 4. Scroll to Top of the Page
		js.executeScript("window.scrollTo(0, 0)");
		// __________________________________________
		// ✅ 5. Scroll to a Specific Web Element
		// WebElement element = driver.findElement(By.id("someElementId"));
		// js.executeScript("arguments[0].scrollIntoView(true);", element);
		driver.close();
	}

}
