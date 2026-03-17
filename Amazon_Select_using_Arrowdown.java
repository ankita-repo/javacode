package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Select_using_Arrowdown {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement searchTF= driver.findElement(By.id("twotabsearchtextbox"));
		searchTF.sendKeys("Toys");
		for(int i=0;i>6;i++)
		{
			Thread.sleep(1000);
			searchTF.sendKeys(Keys.ARROW_DOWN);
			
		}
		searchTF.sendKeys(Keys.ENTER);
		
		
		/*searchTF.sendKeys(Keys.ARROW_DOWN);
		searchTF.sendKeys(Keys.ARROW_DOWN);
		searchTF.sendKeys(Keys.ARROW_DOWN);
		searchTF.sendKeys(Keys.ARROW_DOWN);
		searchTF.sendKeys(Keys.ARROW_DOWN);*/
		//driver.close();
		
		


	}

}
