package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();

			
			driver.get("http://leaftaps.com/opentaps");

			driver.manage().window().maximize();
			String title = driver.getTitle();
			System.out.println(title);

			// Find the user name and enter the value
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

			// Find the password and enter the password
			driver.findElement(By.id("password")).sendKeys("crmsfa");

			// Find the login and click
			driver.findElement(By.className("decorativeSubmit")).click();

			// Click on CRM/SFA
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.linkText("Find Contacts")).click();
			driver.findElement(By.linkText("Email")).click();
			driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
			driver.findElement(By.className("x-btn-text")).click();
			driver.close();
			
	}

}
