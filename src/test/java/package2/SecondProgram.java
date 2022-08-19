package package2;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.io.FileHandler;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class SecondProgram {
    public static void main(String[] args) throws InterruptedException, IOException {
    /*System.setProperty("webdriver.chromedriver","C:\\Users\\kasturig\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://javatpoint.com/"); */
        
    /*    System.setProperty("webdriver.edge.driver", "C:\\Users\\kasturig\\eclipse-workspace\\girijak\\edgebroswer\\msedgedriver.exe");
        
        WebDriver driver=new EdgeDriver();
        
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("search_query")).sendKeys("Bahubali movie");
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(5000);
        driver.close(); */
        



           System.setProperty("webdriver.chromDriver", "chromeDriver.exe");
            
            WebDriver driver=new ChromeDriver();
            
            driver.get("https://askomdch.com/");
            Thread.sleep(3000);
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"woocommerce-product-search-field-0\"]")).sendKeys("Blue shoes");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button")).click();
            Thread.sleep(3000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,3000)");
            Thread.sleep(3000);
            js.executeScript("window.scrollBy(0,-3000)");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"product-1215\"]/div[2]/form/button")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/a")).click();
            Thread.sleep(3000);
            JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeScript("window.scrollBy(0,3000)");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("Girija");
            driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("KASTURI");
            Thread.sleep(1000);
            
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
              FileHandler.copy(scrFile, new File("screenshot.png"));
              
              
            /*driver.findElement(By.xpath("//*[@id=\"billing_country_field\"]/span/span/span[1]/span/span[2]/b")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"select2-billing_country-result-cfy5-US\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("Anugraha");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("Chennai");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"billing_state_field\"]/span/span/span[1]/span/span[2]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"select2-billing_state-result-xx9q-TN\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("600125");
            driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("kasturigirija@gmail.com");
            driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); */
    }
}