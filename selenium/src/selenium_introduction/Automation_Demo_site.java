package selenium_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Demo_site {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAXGEN-TESTING\\Desktop\\Selenium Files\\Browser drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		//url
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("shtl");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("khalase");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("shivkrushna mangal karyalay");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("shtl@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9999999999");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).sendKeys("French");
	}

}
