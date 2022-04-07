package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_me {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAXGEN-TESTING\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
        
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Shital");	
		
		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\MAXGEN-TESTING\\Pictures\\Screenshots\\wallpaper.jpg");
		

	}

}
