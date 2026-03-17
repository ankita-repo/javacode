package selenium_Auto62;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_moveControlFromParent {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
	WebElement seachTB=	driver.findElement(By.id("twotabsearchtextbox"));
	Thread.sleep(2000);
	seachTB.sendKeys("Shoes"+ Keys.ENTER);
	
List<WebElement> searchshoes=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
Thread.sleep(3000);
for(int i=0;i<4;i++)
{
	Thread.sleep(2000);
	searchshoes.get(i).click();  //Clicking on first five links
}
Thread.sleep(3000);
Set<String> ids= driver.getWindowHandles(); 

List<String>l1=new ArrayList<String>(ids);// changing set into list
for(int i=0;i<4;i++)
{
	String childids=l1.get(i);
	
	System.out.println(childids);
			
}
String firstCID=l1.get(0);
String secondCID=l1.get(1);
String thirdCID=l1.get(2);
String fourthCID=l1.get(3);

driver.switchTo().window(secondCID);

}

}
