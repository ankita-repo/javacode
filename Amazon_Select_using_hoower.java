package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Select_using_hoower {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement prime= driver.findElement(By.xpath("//span[text()='Prime']"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(prime).perform();
		
		
		
		/*searchTF.sendKeys(Keys.ARROW_DOWN);
		searchTF.sendKeys(Keys.ARROW_DOWN);
		searchTF.sendKeys(Keys.ARROW_DOWN);
		searchTF.sendKeys(Keys.ARROW_DOWN);
		searchTF.sendKeys(Keys.ARROW_DOWN);*/
		//driver.close();
		
		


	}

}
