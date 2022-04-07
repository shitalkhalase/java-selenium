package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_scroll {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAXGEN-TESTING\\Desktop\\Selenium Files\\Browser drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.javatpoint.com/selenium-tutorial");
		
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,6000)" );

	}

}
