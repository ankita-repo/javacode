package selenium_Auto62;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Autosuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement searchProduct=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		searchProduct.sendKeys("Shoes");
		Thread.sleep(4000);
		
	List<WebElement> searchShoes=	driver.findElements(By.xpath("//form[@class='_Bidnv header-form-search XN_jdV']/ul/li"));
		
int countAutosuggestion=	searchShoes.size();
for(int i=0;i<searchShoes.size();i++)
{
	Thread.sleep(4000);
	WebElement PrintAutosuggestion= searchShoes.get(i);
	String print= PrintAutosuggestion.getText();
	System.out.println(print);
	//System.out.println(PrintAutosuggestion);
	}
System.out.println(countAutosuggestion);
	searchShoes.get(4).click();
		

	}

}
