package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAXGEN-TESTING\\Desktop\\New folder\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/software-testing.html");
		
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		
		//geturl , pagesource, pagetitle , 
		
		//String str = driver.getCurrentUrl();
		//System.out.println(str);
	
		//String stp = driver.getPageSource();
		//System.out.println(stp);
		
		String sp = driver.getTitle();
		System.out.println(sp);
		
		}

}
