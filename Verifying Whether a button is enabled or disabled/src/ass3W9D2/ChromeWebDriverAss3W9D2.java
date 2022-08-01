package ass3W9D2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeWebDriverAss3W9D2 {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 */

	@BeforeTest
	public void setUp() {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// Navigate to a WebSite
		driver.navigate().to("https://material.angularjs.org/latest/demo/button");

		driver.manage().window().maximize();
	}

	/**
	 * Test if the buttons are Enabled or not
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {
		
		// First Button
		WebElement button1 = driver.findElement(By.xpath("//demo-include[@class='buttondemoBasicUsage']//section[2]//button[3]"));
		boolean isEnable1 = button1.isEnabled();
		if(isEnable1) {
			System.out.println("The Button 1 is \"Enable\" and the text of it is  " + button1.getText());
		}
		else {
			System.out.println("The Button 1 is \"Disable\" and the text of it is  " + button1.getText());

		}
		
		// Second Button
		WebElement button2 = driver.findElement(By.xpath("//md-content[@class='_md']//button[@type='button'][normalize-space()='Primary']"));
		boolean isEnable2 = button2.isEnabled();
		if(isEnable2) {
			System.out.println("The Button 2 is \"Enable\" and the text of it is  " + button2.getText());
		}
		else {
			System.out.println("The Button 2 is \"Disable\" and the text of it is  " + button2.getText());

		}

	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.close();

		// Quite the selenium
		driver.quit();
	}
}
