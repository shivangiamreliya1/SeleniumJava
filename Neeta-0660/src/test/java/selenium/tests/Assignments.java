package selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.configuration.BaseConfig;

public class Assignments extends BaseConfig {

	public static void main(String[] args) throws InterruptedException {
		config();		
		driver.get("https://www.spicejet.com/");		
		Thread.sleep(2000);		
		
		
		WebElement passengers = driver.findElement(By.cssSelector("div[data-testid= 'home-page-travellers']"));
		addPassengerCount(passengers, 10, 7, 3);
		
		
		
		
		

	}

}
