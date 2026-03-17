package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotecmind_Keysfunctionality {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
	WebElement fname=	driver.findElement(By.id("firstName"));
	fname.sendKeys("Ankita");
	fname.sendKeys(Keys.COMMAND+ "a");
	fname.sendKeys(Keys.COMMAND+ "c");
	
	WebElement lname=driver.findElement(By.id("lastName"));
	lname.sendKeys(Keys.COMMAND+ "v" );
	Thread.sleep(5000);
	
		
		//driver.close();
		

	}

}
