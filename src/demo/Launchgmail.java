package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchgmail {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		/*List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i <=links.size(); i++) 
		{
			System.out.println(links.get(i).getText());
			
		}
		String a=driver.getCurrentUrl();
		String b=driver.getPageSource();
		System.out.println(a);
		System.out.println(b);*/
driver.findElement(By.linkText("Sign in")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("alladisubrahmanyam@gmail.com");
driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	}

}
