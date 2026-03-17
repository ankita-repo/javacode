package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Dropdown_program 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Thread.sleep(2000);
	Select s1= new Select(dropdown);
	//s1.selectByIndex(3);
	Thread.sleep(2000); 
	s1.selectByVisibleText("Amazon Pharmacy");
		
	}

}
