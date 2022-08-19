package package2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions 
{
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("WebDriverChromeDriver", "ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		Thread.sleep(1000);
		act.clickAndHold();
		act.click(e1).sendKeys(e1, "Bahubali");
		act.sendKeys(Keys.ENTER);
		
		
		
	}

}
