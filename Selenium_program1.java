package selenium_Auto62;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_program1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.close();
		
	}

}
