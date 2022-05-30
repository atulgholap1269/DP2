package atul1;

import java.net.URL;

import org.apache.batik.bridge.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Commarce {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	

;
	driver.get("https://demo.nopcommerce.com/");
	 String URL = driver.getCurrentUrl();
	 System.out.println(URL);
	if(URL =="https://demo.nopcommerce.com//") 
	{
		System.out.println("pass"); 
	}
	else 
		{
			System.out.println("fails");
		}

	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	WebElement register= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ico-register']")));
	//WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
    register.click();
	WebElement male = driver.findElement(By.xpath("//input[@value='M']"));
	WebElement female = driver.findElement(By.xpath("//input[@value='F']"));
	boolean result = male.isSelected();
	System.out.println(result);
	if(result==true)
	{
		System.out.println("already selected");
	}
	else 
	{
		male.click();
	}
	WebElement firstname = driver.findElement(By.xpath("//input[@name='FirstName']"));
	firstname.sendKeys("Atul");
	WebElement Lastname = driver.findElement(By.xpath("//input[@name='LastName']"));
	Lastname.sendKeys("Gholap");
	WebElement day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		
	WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
   WebElement year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
   Select sel = new Select(day);
   sel.selectByVisibleText("8");
   Select sel1 = new Select(month);
   sel1.getOptions().size();
  
   sel1.selectByVisibleText("July");
   Select sel2 = new Select(year);
   sel2.selectByVisibleText("1995");
   WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));
   email.sendKeys("atulgholap1995@gmail.com");
   WebElement company = driver.findElement(By.xpath("//input[@name='Company']"));
   company.sendKeys("Trinity Academy of engineering");
   WebElement check = driver.findElement(By.xpath("(//input[@name='Newsletter'])[1]"));
 
	boolean result1 = check.isSelected();
	System.out.println(result);
	if(result1==true)
	{
		System.out.println("already selected");
	}
	else 
	{
		check.click();
	}
	 WebElement pass = driver.findElement(By.xpath("(//input[@name='Password'])[1]"));
	 pass.sendKeys("Atul@1995");
	 WebElement repeat = driver.findElement(By.xpath("(//input[@name='ConfirmPassword'])[1]"));
	 repeat.sendKeys("Atul@1995");
	 WebElement registerdone = driver.findElement(By.xpath("//button[@name='register-button']"));
	 registerdone.click();
	 WebElement continue1 = driver.findElement(By.xpath("//a[text()='Continue']"));
	 continue1.click();
	 WebElement electronics = driver.findElement(By.xpath("//img[@title='Show products in category Electronics']"));
	 electronics.click();
	 WebElement phone = driver.findElement(By.xpath("//img[@alt='Picture for category Cell phones']"));
	phone.click();
	WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Search store']"));
	 searchbar.sendKeys("apple");
    WebElement search = driver.findElement(By.xpath("//button[text()='Search']"));
   search.click();
   WebElement click2 = driver.findElement(By.xpath("//img[@alt='Picture of Apple MacBook Pro 13-inch']"));
  click2.click();
  WebElement click3 = driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
  click3.click();
  JavascriptExecutor js = (JavascriptExecutor)driver;
  js.executeScript("Window.scrollBy(0,500)");
	}
}


