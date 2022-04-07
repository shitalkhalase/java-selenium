package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAXGEN-TESTING\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("jqueryui")).click();
		
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}
