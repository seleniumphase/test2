package browserstacktest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Cloud {
	
	@Test
	public void testsite() throws MalformedURLException
	{
		MutableCapabilities cap = new MutableCapabilities();
		WebDriver driver = new RemoteWebDriver(new URL("https:hub.browserstack.com/wd/hub"),cap);
		driver.get("https://rahulshettyacademy.com/");
		driver.get("https://flipkart.com/");
		
	}

}
