package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnowCityTC {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://snowcityblr.com/contacts/");
		WebDriver frame1 = driver.switchTo().frame(0);
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		frame1.switchTo().frame(1);
		driver.findElement(By.xpath("//div[@class=\"icon navigate-icon\"]")).click();
		driver.quit();
	}
}