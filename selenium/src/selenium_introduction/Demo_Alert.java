package selenium_introduction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Alert {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAXGEN-TESTING\\Desktop\\Selenium Files\\Browser drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
			//driver.findElement(By.id("alertButton")).click();
		
		 //Alert alert = driver.switchTo().alert();

		//alert.accept();

		//driver.findElement(By.id("timerAlertButton")).click();
	
		
	//Alert alert = driver.switchTo().alert();
	//Thread.sleep(8000);
		//alert.accept();
		
		//driver.findElement(By.id("confirmButton")).click();
		
		//Thread.sleep(2000);
		//Alert alert = driver.switchTo().alert();
		
		//alert.accept();
		//alert.dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		
		driver.switchTo().alert().sendKeys("Shital ");
		alert.accept();
	}

}
