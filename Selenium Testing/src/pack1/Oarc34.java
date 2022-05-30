package pack1;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.logging.FileHandler;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Oarc34 {


		public static void main(String[] args)  throws IOException, InterruptedException{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.redbus.in/?gclid=CjwKCAjwi6WSBhA-EiwA6Niok7k2nk2JbRBuKU7T4KNWaavJvrY1JmBOo2L_B5AbCw73WW-r3ck89BoCQRYQAvD_BwE");
			WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			search.sendKeys("pune");
			WebElement search1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			search1.sendKeys("mumbai");
			WebElement search3 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			WebElement search4 = driver.findElement(By.xpath("(//table//tr//td)[10]"));
			Actions act = new Actions(driver);
			act.click(search3).moveToElement(search4).click().build().perform();
			Thread.sleep(5000);
			
			WebElement search5 = driver.findElement(By.xpath("//button[@id='search_btn']"));
		search5.click();
		
			/*System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//Implicit wait = waiting time only - applicable throught the browser
			driver.get("https://demo.guru99.com/test/delete_customer.php"); 
		
			//WebDriverWait wait = new WebDriverWait(driver, 20);//20sec  maximum waiting
			//Explicit wait-waiting time + condition applicable to only one element
			//WebElement login= wait.until(ExpectedConditions.visibilityOfElementLocated
					//(By.xpath("//input[@type='submit']")));
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					             .withTimeout(Duration.ofSeconds(20))
					             .pollingEvery(Duration.ofMillis(100))
					             .ignoring(NoSuchElementException.class);
			WebElement login = wait.until(new Function<WebDriver, WebElement>(){
				public WebElement apply(WebDriver driver)
				{
					return driver.findElement(By.xpath("//input[@type='submit']"));
				}
			});
			 login.click();
			 Thread.sleep(3000);
			 Alert alt = driver.switchTo().alert();
			 alt.accept();
			 Thread.sleep(3000);
			 driver.switchTo().alert().accept();
			
			
			
			
			
			
			
			
			
		//TakesScreenshot ts = (TakesScreenshot)driver;
		//File fs = ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(fs, new File("C:\\Users\\DELL\\Desktop\\Selenium Screeshot\\login.jpg"));
			 /* for(int i=0;i<=5;i++)
		{
			//	TakesScreenshot ts = (TakesScreenshot)driver;
		
				File fs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 Date d = new Date();
			     SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY_HHmmsss");
			     String timestamp = sdf.format(d);
			   
			      FileUtils.copyFile(fs,new File("C:\\Users\\DELL\\Desktop\\Selenium Screeshot\\page"+timestamp+i+".jpg"));
		}*/
	}

}

