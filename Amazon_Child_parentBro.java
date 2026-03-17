package selenium_Auto62;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Child_parentBro {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
	WebElement seachTB=	driver.findElement(By.id("twotabsearchtextbox"));
	Thread.sleep(3000);
	seachTB.sendKeys("Shoes"+ Keys.ENTER);
	
List<WebElement> searchshoes=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
Thread.sleep(3000);
searchshoes.get(0).click();
Thread.sleep(3000);
 

	}

}
