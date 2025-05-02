package SeleniumJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait3 {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver", "C:\\Selenium
		// Tools\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// WebDriver Methods
		driver.get("https://www.geeksforgeeks.org/javascript/");// launches website// void

		System.out.println(driver.getTitle());// To get the title of current page

		driver.manage().window().maximize(); // maximize

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//				The implicitlyWait() method takes two arguments: the duration of the waiting period and
//				the time unit of the waiting period
//				
//		Implicit wait makes WebDriver to wait for a specified amount of time when trying to
//		locate an element before throwing a NoSuchElementException. When implicit wait is set,
//		the WebDriver will wait for a defined period, allowing for elements to load dynamically.
		

//		
//		
//		An explicit wait makes WebDriver wait for a certain condition to occur before proceeding further with execution. 


	}	}

//In Selenium, an explicit wait allows the script to pause its execution until a specific condition is met or a specified 
//timeout is reached. This provides more control over waiting for elements to load or conditions to become true than
//a global implicit wait. Explicit waits are defined within the code and can target specific elements or conditions, 
//making them more precise and efficient than implicit waits. 

//Explicit waits can target specific elements or conditions, unlike implicit waits which apply globally to all elements.
// Elements to be clickable, Draggable, dropable, image to be uploaded,image to be downloded , screen short to be taken 





// 
