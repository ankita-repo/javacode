package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Select_using_delete {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement searchTF= driver.findElement(By.id("twotabsearchtextbox"));
		searchTF.sendKeys("Toys" + (Keys.ARROW_RIGHT));
		searchTF.sendKeys(Keys.DELETE);
		
		
		
		/*searchTF.sendKeys(Keys.ARROW_DOWN);
		searchTF.sendKeys(Keys.ARROW_DOWN);
		searchTF.sendKeys(Keys.ARROW_DOWN);
		searchTF.sendKeys(Keys.ARROW_DOWN);
		searchTF.sendKeys(Keys.ARROW_DOWN);*/
		//driver.close();
		
		


	}

}
