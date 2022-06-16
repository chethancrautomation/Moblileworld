package mobileWorld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chethan.cr\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
	}

	@Test
	public void demo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oracle.com/java/technologies/downloads/#jdk18-windows");
	}

}
