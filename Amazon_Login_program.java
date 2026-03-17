package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login_program {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.name("email"));
		login.sendKeys("ankitaom25@gmail.com");
		WebElement signinContinue=driver.findElement(By.id("continue"));
		signinContinue.click();
		driver.close();
		
		


	}

}
