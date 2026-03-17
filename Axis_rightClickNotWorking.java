package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Axis_rightClickNotWorking {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://omni.axis.bank.in/axisretailbanking/");
		Thread.sleep(2000);
	WebElement loginID=	driver.findElement(By.xpath("//input[@id='custid']"));
	loginID.sendKeys("Ankita Kumari");
	WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys("Keshav1234");
	
	WebElement loginclick=driver.findElement(By.id("APLOGIN"));	
	loginclick.click();
		

	}

}
