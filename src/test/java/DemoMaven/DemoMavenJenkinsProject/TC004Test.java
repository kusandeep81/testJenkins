package DemoMaven.DemoMavenJenkinsProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC004Test {
	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver(); 
		driver.get("https://facebook.com");
		driver.findElementById("email").sendKeys("Hello4");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
}
}
