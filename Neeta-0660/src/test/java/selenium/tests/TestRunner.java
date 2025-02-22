package selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import selenium.configuration.BaseConfig;

public class TestRunner extends BaseConfig {

	public static void main(String[] args) throws InterruptedException {
		// TestRunner tr = new TestRunner();
		config();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);

		// Static Drop down WebElement s =
		WebElement s = driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']"));
		baseMethod(s, "AED", "INR", "P");

		// auto suggestive dropdown:

		autoSujestiveDropDown(
				driver.findElement(By.xpath("//*[text() = 'Country']/parent::legend/following-sibling::input")),
				"INDIA");

		// checkBox

		driver.findElement(By.cssSelector("input[id = 'ctl00_mainContent_chk_friendsandfamily']")).click();

		// fromCity
		selectFrom_ToCity(driver.findElement(By.xpath("//*[@id = 'ctl00_mainContent_ddl_originStation1_CTXT']")),
				"Pune", "Goa");

		// date picker (Try and catch method)

		try {
			departDatePicker("12 April 2024");
		} catch (StaleElementReferenceException e) {
			departDatePicker("12 April 2024");
		}

		try {
			returnDatePicker("12 May 2024");
		} catch (StaleElementReferenceException e) {
			returnDatePicker("12 May 2024");
		}

		// driver.close();
	}

}
