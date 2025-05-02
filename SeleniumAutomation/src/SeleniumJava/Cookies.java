package SeleniumJava;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();// maximize the brower window
		// driver.manage().window().minimize();// minimize the browser window
		// driver.manage().window().fullscreen();// open the browser in full screen

		driver.manage().window().getSize(); // retrive the currrent size of the browser
		driver.manage().window().getPosition();// retrive the current position of the browser window
		System.out.println(driver.getTitle());

		Dimension window = new Dimension(800, 550);
		driver.manage().window().setSize(window);// set a specific size for the browser window

//	Point window1 =new Dimension(800, 550);
//	driver.manage().window().setPosition(window1);// set the position of the bsowser window 

//	driver.manage().getCookies();// Retrive all cookies 
//	driver.manage().getCookieNamed(null);//retrive a specific cookie by its name
//	driver.manage().addCookie(null);//add a new cookie to the browser
//	driver.manage().deleteCookie(null);//delete a specific cookie
//	driver.manage().deleteCookieNamed(null);//delete a cookie by name
//	driver.manage().deleteAllCookies();// clear all cookies from browser 

		driver.close();
	}
}
