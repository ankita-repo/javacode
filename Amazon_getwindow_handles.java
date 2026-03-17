package selenium_Auto62;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_getwindow_handles {

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
for(int i=0;i<5;i++)
{
	searchshoes.get(i).click();
}
Thread.sleep(3000);
Set<String> ids= driver.getWindowHandles();

List<String>l1=new ArrayList<String>(ids);
Iterator<String>id=ids.iterator();
String Parentid=id.next();
System.out.println("Parent browser id"+ Parentid);
for(int i=0;i<5;i++)
{
	String Childid=id.next();
	System.out.println("Child Browser id"+ i +" "+ Childid);
	driver.switchTo().window(Childid);
	
}
driver.close();

//pSet<String> s1=new ArrayList();


//driver.switchTo().window(Childid);


 
}


}
