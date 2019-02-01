package co.edureka.selenium.deom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/gtsai/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("gtsai001@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		
		String msg = "Test Failure!";
		if (driver.getTitle() != null && driver.getTitle().equalsIgnoreCase("gmail"))
			msg = "Test Successful";
		
		driver.close();
		
		System.out.println(msg);


	}

}