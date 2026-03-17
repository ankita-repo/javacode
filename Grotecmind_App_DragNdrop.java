package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotecmind_App_DragNdrop {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
	WebElement drag= driver.findElement(By.xpath("//div[@id='container-3']"));
	WebElement drop =driver.findElement(By.xpath("//div[@id='div2']"));
	
	Actions a1= new Actions(driver);
	a1.dragAndDrop(drag, drop).perform();
		
		//driver.close();
		

	}

}
