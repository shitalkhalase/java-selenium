package selenium_introduction;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAXGEN-TESTING\\Desktop\\Selenium Files\\Browser drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		//id
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Shital");	
		
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Khalse");
		
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail")).sendKeys("shital@gmail.com");
		
		//Xpath
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		
		driver.findElement(By.id("userNumber")).sendKeys("9999999999");
		
		//driver.findElement(By.id("dateOfBirthInput")).click();
		//driver.findElement(By.className("react-datepicker__month-select")).sendKeys("June");
		//driver.findElement(By.className("react-datepicker__year-select")).sendKeys("1996");
		//driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]"))sendke.;
		//driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]")).click();
		//driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[4]")).sendKeys("19");
		//driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[4]")).click();
		//driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")).sendKeys("Hindi");
	
		
		//driver.findElement(By.id("hobbies-checkbox-1")).click();
		driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']")).click();
		

	}

}
