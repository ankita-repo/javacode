package selenium_Auto62;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Autosuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	WebElement searchf=	driver.findElement(By.xpath("//textarea[@name='q']"));
	searchf.sendKeys("India");
	Thread.sleep(2000);
	
	List<WebElement> list=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	int count= list.size();
	System.out.println(count);
	list.get(0).click();
	
	driver.close();

	}

}
