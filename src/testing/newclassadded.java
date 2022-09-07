package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newclassadded 
{
	
		public void main (String[] arg)
		
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
		 	WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://google.com");
		}

}

