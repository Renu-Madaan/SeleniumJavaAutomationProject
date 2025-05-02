package SeleniumJava;// class/interface/Enum first letter should be Uppercase

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.linkText("Single Iframe")).click();
		driver.switchTo().frame("singleframe");	// Enter into Frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Renu Madan");	// Wrong Locators
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();	// Exit from Frame
		Thread.sleep(2000);
		driver.close();
	}
}
