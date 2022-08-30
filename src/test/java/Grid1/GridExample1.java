package Grid1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		URL url = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities ();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");
		
		WebDriver driver = new RemoteWebDriver (url, cap);
		 driver.get("https://www.saucedemo.com/");
		 
		driver.quit();

	}

}
