package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_program3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement searchbar=	driver.findElement(By.id("twotabsearchtextbox"));
	searchbar.sendKeys("shoes");
	WebElement Searchbutton= driver.findElement(By.id("nav-search-submit-button"));
	Searchbutton.click();
		
		
		
		//driver.close();
		
	}

}
