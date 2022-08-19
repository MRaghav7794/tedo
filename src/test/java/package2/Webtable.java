package package2;


	import java.text.NumberFormat;
	import java.text.ParseException;
	import java.util.List;



	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;



	public class Webtable 
	{
	public static void main(String[] args) throws ParseException
	{
	     WebDriver driver = null;// TODO Auto-generated method stub       
	     System.setProperty("webdriver.chromedriver","chromedriver.exe");
	     WebDriver driver1=new ChromeDriver();
	     driver1.get("https://www.google.co.in/");
	     driver1.get("http://demo.guru99.com/test/web-table-element.php");
	     String max;
	     double m=0,r=0;
	     List col = driver1.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	     System.out.println("Total No of columns are : " +col.size());
	     List rows = driver1.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	     System.out.println("Total No of rows are : " + rows.size());
	     for (int i =1;i<rows.size();i++)
	     {
	         max= driver1.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
	         NumberFormat f = NumberFormat.getNumberInstance();
	         Number num = f.parse(max);
	         max = num.toString();
	         m = Double.parseDouble(max);
	         if(m>r)
	         {
	             r=m;
	         }
	     }
	     System.out.println("Maximum current price is : "+ r);
	     }
	}


