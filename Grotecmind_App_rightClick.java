package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotecmind_App_rightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions a1= new Actions(driver);
		a1.contextClick(gmail).perform();
		
				
		//driver.close();
		

	}

}
