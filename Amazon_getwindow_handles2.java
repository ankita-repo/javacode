package selenium_Auto62;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_getwindow_handles2 {

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
	searchshoes.get(i).click();  //Clicking on first five links
}
Thread.sleep(3000);
Set<String> ids= driver.getWindowHandles(); 

List<String>l1=new ArrayList<String>(ids);// changing set into list

Iterator<String> i1=l1.iterator();
String Parentid=i1.next();

for (int i=0;i<5;i++)
{
	String childid=i1.next();
	System.out.println(childid);
	driver.switchTo().window(childid);
	driver.findElement(By.id("add-to-cart-button")).click();
	Thread.sleep(3000);
	}
driver.close();





//pSet<String> s1=new ArrayList();


//driver.switchTo().window(Childid);


 
}


}
