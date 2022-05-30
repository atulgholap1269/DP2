package atul1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.WebSocketWillSendHandshakeRequest;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.Select;

public class Vishal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver();// this is a upcasting
			driver.get("https://www.facebook.com/r.php");
			Thread.sleep(3000);
			//WebElement CreateAcc = driver.findElement(By.xpath("//a[@id='u_0_2_nW']"));
			//CreateAcc.click();
				//Thread.sleep(3000);
			 //driver.navigate().forward();
				//Thread.sleep(3000);
			 //driver.navigate().refresh();
			//WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
			WebElement name = driver.findElement(By.xpath("//input[@aria-label='First name']"));
			name.sendKeys("Atul");
			Thread.sleep(3000);
			WebElement surname = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
			 surname.sendKeys("Gholap");
			Thread.sleep(3000);
			 WebElement mobileno = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
			 mobileno.sendKeys("8329691487");
			 Thread.sleep(3000);
		  
		   WebElement password = driver.findElement(By.xpath("//input[@aria-label='New password']"));
			password.sendKeys("atul@1995");
			Thread.sleep(3000);
			 WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
			day.click();
			  Select sel = new Select(day);
			    sel.selectByVisibleText("8");
			 WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
				month.click();
				 Select selec = new Select(month);
				    selec.selectByVisibleText("Jul");
				    WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
					year.click();
					 Select selected = new Select(year);
					    selected.selectByVisibleText("1995");
			  WebElement female = driver.findElement(By.xpath("//label[text()='Female']")); 
			  boolean result = female.isSelected();//proper use only for checbox
			  System.out.println(result);
			  if(result==true)
			  {
				  System.out.println("alrady selected");
			  }
			  else 
			  {
				  female.click();//first check button is selected or not. if not selected then only click on  web element
			  }
			  //female.click();
			  WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));  
			  male.click();
			 WebElement custom = driver.findElement(By.xpath("//label[text()='Custom']"));  
			  custom.click();
			  WebElement pronoun = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
			  boolean result1 = pronoun.isDisplayed();
			  System.out.println(result1);
			  if(result1==true)
			  {
				  System.out.println("pronoun is displayed");
			  }
			  else 
			  {
				custom.click();
			  }
			  //pronoun.click();
			  Select selec1 = new Select(pronoun);
			  selec1.selectByIndex(1);
			    WebElement gender = driver.findElement(By.xpath("//input[@name='custom_gender']"));
			   gender.sendKeys("male");
			
			   WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
			   submit.click();
			
			
			/*WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
			username.sendKeys("atulgholap8@gmail.com");
			Thread.sleep(3000);*/
			
			
			
			
			
			
			
			
		
			
			//get method used to launch the application in browser by providing the url as a string argument. 
			
			/*driver.navigate().to("https://www.facebook.com/login.php");
			//Navigate method used to launch application & it has additional feature to perform forward, backward and refresh functionality. 
			Thread.sleep(3000);
			
			driver.navigate().back();// with the help of navigate method we can  back pages in application
			Thread.sleep(3000);
			
			driver.navigate().forward();//with the help of navigate method we can forward pages in application
			Thread.sleep(3000);
			
			driver.navigate().refresh();//with the help of navigate method we can refresh pages in application
			Thread.sleep(3000);
			
			String Url = driver.getCurrentUrl();//This method is used to get the Url of current page opened in the browser.
		    System.out.println(Url);// return type of getCurrent method is string
		    
		    String title = driver.getTitle();//This method is used to get title of the curRent page open on the browser
		    System.out.println(title);// return type of getTitle method is string.
		    
		    // How to maximize browser?
		    
		    driver.manage().window().maximize();// we can maximize the method with the help of method chaining.
		    
		    // How to minimize the method
		    //Ans: In selenium 3.14 there is no any method for minimize but in newly updated version 4.11 there is method for minimization.
			
		    driver.manage().window().minimize();
		    
		    //How to change the size of the browser?
		    //Ans: To change the size of the browser we need to call  setSize();  method of window interface which accept the dimension type 
		    //argument. i.e,(Object of Dimension class)
		   
		    Dimension d = new Dimension(400,800);//  length & hight is in pixel
		    driver.manage().window().setSize(d);
		    
		    //How change the position of Browser?
		    //Ans:To change the position of pixel we need to call setPosition(); method of window interface which accept the point type argument
		    // i.e ( Object of Point Class.)
		    
		    Point P = new Point(200,300);// x & y axis Coordinates is in pixel.
		    driver.manage().window().setPosition(P);
		    
		    // Difference between close & quit method?
		     driver.close(); // close method is used to close the current tab or current browser open by selenium.
		     driver.quit();//This method is used to close the all the tab & all browser open by selenium
		    
		    */
		    
		} 


}
