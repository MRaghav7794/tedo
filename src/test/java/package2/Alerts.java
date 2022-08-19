package package2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts
{
	public static void main(String[] args) throws InterruptedException 
	{
		Alerts.alertMethod();
	}
	
	public static void alertMethod() throws InterruptedException
	{
		System.setProperty("webDriverChromeDriver","ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		driver.manage().window().maximize();System.setProperty("webDriverChromeDriver","ChromeDriver.exe");
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		Thread.sleep(500);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(6000);
		alert.accept();
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		alert.accept();
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		alert.sendKeys("Raghav");
		alert.accept();
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		driver.quit();
	}

}
