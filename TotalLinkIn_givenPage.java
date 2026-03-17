package selenium_Auto62;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TotalLinkIn_givenPage {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	List<WebElement> totalLink=driver.findElements(By.tagName("a"));
	int countLink=totalLink.size();
	
	System.out.println(countLink);
		
				
		//driver.close();
		

	}

}
