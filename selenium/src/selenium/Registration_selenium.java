package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_selenium {

	public static void main(String[] args) throws InterruptedException  {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAXGEN-TESTING\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		//Thread.sleep(2000);
		//driver.findElement(By.id("firstName")).sendKeys("Shital");	
		
		//Thread.sleep(2000);
		//driver.findElement(By.id("lastName")).sendKeys("Khalse");
		
		//Thread.sleep(2000);
		//driver.findElement(By.id("userEmail")).sendKeys("shital@gmail.com");
		
		//driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		//driver.findElement(By.id("gender-radio-2")).click();
		//driver.findElement(By.xpath("//*[@id=\"gender-radio-2\"]")).click();
		//driver.findElement(By.id("userNumber")).sendKeys("9999999999");

		Thread.sleep(2000);
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.className("react-datepicker__month-select")).sendKeys("June");
		
		Thread.sleep(2000);
		driver.findElement(By.className("react-datepicker__year-select")).sendKeys("1996");
		
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]")).click();
		
		//driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper:nth-child(2) div.mt-2.row:nth-child(5) div.col-md-9.col-sm-12 div.react-datepicker__tab-loop div.react-datepicker-popper div.react-datepicker div.react-datepicker__month-container:nth-child(4) div.react-datepicker__month div.react-datepicker__week:nth-child(4) > div.react-datepicker__day.react-datepicker__day--019.react-datepicker__day--selected:nth-child(4)")).click();
		//driver.findElement(By.className("react-datepicker__day react-datepicker__day--019 react-datepicker__day--selected")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'19')]")).click();
		//driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[4]")).click();
		//driver.findElement(By.className("subjects-auto-compzlete__control css-yk16xz-control")).sendKeys("Hindi");
		//driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")).sendKeys("English");
		
	}

}
