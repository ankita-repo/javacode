package selenium_Auto62;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Grotecmind {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/courses/ai-powered-automation-testing-with-selenium-and-java-with-bdd-cucumber/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ChatBot=driver.findElement(By.id("chat-bot-message-close"));
		ChatBot.click();
		Thread.sleep(3000);
		WebElement iframe=driver.findElement(By.id("chat-bot-iframe"));
		driver.switchTo().frame(iframe);
		WebElement Namefield=driver.findElement(By.id("textInput"));
		Namefield.sendKeys("Ankita.Kumari");

	}

}
