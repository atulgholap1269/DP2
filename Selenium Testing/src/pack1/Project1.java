package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Project1 {
	//create is a method of WorkbookFactory class which return the workbook object and call the getSheet method
	//getSheet is a  method of workbook class which return the Sheet object and call the getRow method
	//getRow method is a method of Sheet class which return the Row object and call the getCell method
	//getCell method is a method of Row class which return the Cell object and call the getStringCellValue
	//getStringCellValue() is a method of Cell class which return the string 

	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
			
			String path = "C:\\Users\\DELL\\Desktop\\Atul.xlsx";
		FileInputStream file = new FileInputStream(path);
	Sheet value =	WorkbookFactory.create(file).getSheet("Atul");
int lastRow = value.getLastRowNum();

int lastCell = value.getRow(0).getLastCellNum();

	
	for(int i=0;i<lastRow;i++)	
	{
		Row row = value.getRow(i);
	
		for(int j=0;j<lastCell;j++)
		{
			String result =row.getCell(j).getStringCellValue();
			System.out.print(result+",");
		}
		System.out.println();
	}
     
		}	
}		
			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver();
			driver.get("https://in.jobrapido.com/L-T-jobs?r=auto&utm_source=yahoo&utm_medium=cpc&utm_campaign=IN_JOB_SEARCH&r=auto&utm_agid=756899525&utm_kwid=kwd-8131657567:aud-806553731:loc-90&ext=&int=&phy=90&mt=b&dev=c&net=o&msclkid=8460e9e98686141207938809f561f0cf&utm_source=bing&utm_medium=cpc&utm_campaign=IN_JOB_SEARCH&utm_term=career%20l%20t&utm_content=0-5002-career");
	WebElement dreamjob = driver.findElement(By.xpath("//input[@name='what']"));
		dreamjob.sendKeys("IT");
		Thread.sleep(3000);
		WebElement city = driver.findElement(By.xpath("//input[@name='where']"));
		city.sendKeys("pune");
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Your email address']"));
		email.sendKeys("atulgholap8@gmail.com");
		Thread.sleep(3000);
		WebElement selectgmail = driver.findElement(By.xpath("//a[text()='@gmail.com']"));
		selectgmail.click();
		Thread.sleep(3000);
		WebElement activate = driver.findElement(By.xpath("//button[@id='submit-proposal']"));
		activate.click();
		Thread.sleep(3000);*/

