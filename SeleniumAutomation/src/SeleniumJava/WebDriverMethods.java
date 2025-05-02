package SeleniumJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver", "C:\\Selenium
		// Tools\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// WebDriver Methods
		driver.get("https://www.geeksforgeeks.org/javascript/");// launches website// void

		System.out.println(driver.getTitle());// To get the title of current page

		driver.manage().window().maximize(); // maximize

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// when we try to interact with single element we use findElement methods
		// when we try to interact with list of element we use FindElements
		List<WebElement> w1 = driver
				.findElements(By.xpath("//div[@id='header-main__slider-outer-div']//div//ul//li//a"));// webelement

		// List of webelement
		int n = w1.size();
		System.out.println(" My list length is" + n);
		for (WebElement w : w1) {
			String title = w.getText();
			System.out.println(" The title are" + title);

		}

//		System.out.println(driver.getCurrentUrl());
//		String title = driver.getTitle();// useful to get title of the current page ..
//		Thread.sleep(2000);
//		System.out.println("title" + title);
//		Thread.sleep(2000);
//		String currentUrl = driver.getCurrentUrl();// Useful to get the current url of the brower/tab
//		System.out.println("CurrentUrl" + currentUrl);
//		Thread.sleep(2000);
//		
//		String pageSource = driver.getPageSource();
//		System.out.println("PageSource" + pageSource);
//
//		driver.manage().window().maximize();// void // to maximize the window screen
//		Thread.sleep(2000);
//		//driver.manage().window().minimize();// minimize
//		Thread.sleep(2000);
//		//driver.manage().window().fullscreen();// fullscreen
//		Thread.sleep(2000);
//		driver.navigate().to("https://www.newbalance.com");
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);

		driver.close();//
	}
}// what is the differnece between get/ navigate
