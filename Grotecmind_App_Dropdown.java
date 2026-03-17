package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotecmind_App_Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		WebElement genderdrop=driver.findElement(By.xpath("//select[@id='gender']"));
		Thread.sleep(2000);
		Select s1= new Select(genderdrop);
		//s1.selectByIndex(1);
		//s1.selectByVisibleText("Female");
		s1.selectByValue("female");
	
	
		
		//driver.close();
		

	}

}
