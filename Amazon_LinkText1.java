package selenium_Auto62;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_LinkText1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	List<WebElement> Link=	driver.findElements(By.tagName("a"));
	int SizeOfLink=Link.size();
	System.out.println(SizeOfLink);
	for (int i =0; i<=Link.size();i++)
	{
		Thread.sleep(2000);
		WebElement first=Link.get(i);
		//String Linkpresent=first.getDomAttribute("href");
		//System.out.println(Linkpresent);
		
		String Text=first.getText();
		System.out.println(Text);
		
		
	}
	
	
	
		


	}

}
