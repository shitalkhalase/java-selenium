package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\MAXGEN-TESTING\\\\Desktop\\\\New folder\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");

		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.id("droppable"));
		
		
		Actions shital = new Actions(driver);
		shital.dragAndDrop(drag,drop).perform();
	}
				
}
 