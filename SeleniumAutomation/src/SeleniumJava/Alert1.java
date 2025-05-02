package SeleniumJava;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// WebDriver Methods
		driver.get("https://vinothqaacademy.com/alert-and-popup/");// launches website// void
		Thread.sleep(2000);

		// Click on "ClickToGetAlert
		driver.findElement(By.name("promptalertbox1234")).click();// locators 8
		// click the button to display an alert box:

		Alert a1 = driver.switchTo().alert();
		a1.sendKeys("Renu Madan");
		System.out.println("Alert Popup Text is : " + a1.getText());
		Thread.sleep(2000);
		a1.accept();
//		a1.dismiss();// At one time we can use accept or dismiss 
		System.out.println("Clicked on Alert Ok Button");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Browser Closed");
	}
}
// id,name,class,css,xpath,Linktext,Partial link text, Tag name 