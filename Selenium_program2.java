package selenium_Auto62;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_program2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title); 
		String CurrentURL=driver.getCurrentUrl();
		System.out.println(CurrentURL);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
		
		driver.close();
		
	}

}
