package SeleniumJava;// class/interface/Enum first letter should be Uppercase

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://vinothqaacademy.com/iframe/");
		driver.switchTo().frame("employeetable");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[text()='Add Row']")).click();
		Alert a1 = driver.switchTo().alert();
		a1.sendKeys("Renu Madan");
		System.out.println("Alert Popup Text is : "+a1.getText());
		Thread.sleep(2000);
		a1.accept();
//		a1.dismiss();// At one time we can use accept or dismiss 
		System.out.println("Clicked on Alert Ok Button");
		// switch using the frame name or iD.// Name and Id store in String
		// driver.switchTo().frame(-1);// Index store in int
		// Switch using the index based on 0
		// driver.switchTo().frame( "frameElement");//element stores o WebElement
		// WebElement presenting the frame.
		driver.switchTo().parentFrame();
		// switch back to parent frame
		driver.switchTo().defaultContent();
		// return the top level page content .

	}

}

// frames are HTML document embeded inside another document.use this method to interact with element inside them.
