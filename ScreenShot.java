package selenium_Auto62;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		{
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize(); 
		WebElement seachTB=	driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		seachTB.sendKeys("Shoes"+ Keys.ENTER);
		
	List<WebElement> searchshoes=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	Thread.sleep(3000);
	for(int i=0;i<4;i++)
	{
		Thread.sleep(2000);
		searchshoes.get(i).click();  //Clicking on first five links
	}
	Thread.sleep(3000);
	Set<String> ids= driver.getWindowHandles(); 
	System.out.println(ids);

	List<String>l1=new ArrayList<String>(ids);// changing set into list
	for(int i=0;i<4;i++)
	{
		String childids=l1.get(i);
		
		System.out.println(childids);
				
	}
	String firstCID=l1.get(0);
	String secondCID=l1.get(1);
	String thirdCID=l1.get(2);
	String fourthCID=l1.get(3);
	driver.switchTo().window(secondCID);

	// For Date, month,Year,hour,min and Sec
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
	//Step1
TakesScreenshot ts=	driver;
//step2
File source= ts.getScreenshotAs(OutputType.FILE);
//step3
//File destination= new File("/Users/ankita/eclipse-workspace/Automation/Screenshot62/One.png");
File destination= new File("/Users/ankita/eclipse-workspace/Automation/Screenshot62/One"+" "+format2+ " "+".png");
//step4
FileHandler.copy(source, destination); 	
    }
  }
}


