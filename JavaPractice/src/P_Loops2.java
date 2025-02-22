import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_Loops2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// div[@class = 'product']/h4

		List<WebElement> products = driver.findElements(By.cssSelector("h4[class = 'product-name']"));

		System.out.println(products.size());

		for (int i = 0; i < products.size(); i++)			
		{
			String vegName = products.get(i).getText();		
			//System.out.println(vegName);
			if (vegName.contains("Brocolli"))
			{
				driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
				Thread.sleep(2000);
			}
			
		}

		// driver.quit();

	}

}
