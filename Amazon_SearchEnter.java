package selenium_Auto62;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon_SearchEnter {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	/*	WebElement login=driver.findElement(By.name("email"));
		login.sendKeys("ankitaom25@gmail.com");
		WebElement signinContinue=driver.findElement(By.id("continue"));
		signinContinue.click();*/
		Thread.sleep(5000);
	WebElement searchTF= driver.findElement(By.id("twotabsearchtextbox"));
	searchTF.sendKeys("Toys" + Keys.ENTER);
	//searchTF.sendKeys(Keys.ENTER);
		//driver.close();
		
		Date d1= new Date();
		Date d2= new Date(d1.getTime());
		String format1= d2.toString();
		String Date= format1.substring(8, 10);
		String month=format1.substring(4, 7);
		String Year= format1.substring(format1.length()-4);
		String hour= format1.substring(11, 13);
		String min=format1.substring(14, 16);
		String Sec=format1.substring(17, 19);
		String format2= Date.concat(" ").concat(month).concat(" ").concat(Year).concat(" ").concat(hour).concat(" ").concat(min).concat(" ").concat(Sec);
		
		TakesScreenshot ts=	driver;
		File source= ts.getScreenshotAs(OutputType.FILE);	
		File destination= new File("/Users/ankita/eclipse-workspace/Automation/Screenshot62/One"+" "+format2+ " "+".png");
		FileHandler.copy(source, destination); 
		


	}

}
