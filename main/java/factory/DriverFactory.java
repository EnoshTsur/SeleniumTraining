package factory;
/***
 * Factory that returns Driver by Browser
 * @author Administrator
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import enums.Browser;
/***
 * Factory for different types of drivers
 * @author Administrator
 *
 */
public class DriverFactory {

	
	/***
	 * Method that returns that right driver by browser
	 * @param browser
	 * @return WebDriver
	 */
	public static WebDriver getDriver(Browser browser) {
		switch(browser) {
		case CHROME:
			return new ChromeDriver();
		case EDGE:
			return new EdgeDriver();
		case FIREFOX:
			return new FirefoxDriver();
			default:
				return null;
		}
	}
}
