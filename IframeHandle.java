package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
	WebElement frameWebElement=	driver.findElement(By.name("login_page"));
	driver.switchTo().frame(frameWebElement);
	
WebElement username=	driver.findElement(By.name("fldLoginUserId"));
username.sendKeys("Ankita Kumari");

	}

}
