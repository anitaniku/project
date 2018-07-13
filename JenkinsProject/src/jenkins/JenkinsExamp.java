package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsExamp
{
	@Test
	public void openapp()
	{
		WebDriver driver=new FirefoxDriver();
		 
		 driver.get("http://facebook.com");
		
	}

}
