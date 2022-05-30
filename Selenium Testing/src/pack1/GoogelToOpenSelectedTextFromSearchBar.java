package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogelToOpenSelectedTextFromSearchBar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement> element = driver.findElements(By.xpath("//div//ul[@class='G43f7e']//li"));
		int size = element.size();
		System.out.println(size);
		for(WebElement ele : element)
		{
			String text = ele.getText();
			WebDriverWait wait= new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			System.out.println(text);
			
			if(text.equals("selenium ide"))
			{
				WebDriverWait wait1 = new WebDriverWait(driver, 5);
				wait1.until(ExpectedConditions.visibilityOf(ele));
				ele.click();
				break;
			}
		}
	}


}
