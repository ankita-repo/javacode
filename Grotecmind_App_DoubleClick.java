package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotecmind_App_DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
	WebElement fname=driver.findElement(By.id("firstName"));
	fname.sendKeys("Ankita");
	
	Thread.sleep(2000);
	
	Actions a1= new Actions(driver);
	a1.doubleClick(fname).perform();
	
	fname.sendKeys(Keys.COMMAND + "c");
	
	WebElement lastname=driver.findElement(By.id("lastName"));
	
	lastname.sendKeys(Keys.COMMAND +"v");
	
	
		
		
		
	
		
		//driver.close();
		

	}

}
