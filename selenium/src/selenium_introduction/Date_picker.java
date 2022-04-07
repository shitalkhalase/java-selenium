package selenium_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAXGEN-TESTING\\Desktop\\Selenium Files\\Browser drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/date-picker");
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		driver.findElement(By.className("react-datepicker__month-select")).sendKeys("June");
		driver.findElement(By.className("react-datepicker__year-select")).sendKeys("1996");
		driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]")).click();
	}

}
