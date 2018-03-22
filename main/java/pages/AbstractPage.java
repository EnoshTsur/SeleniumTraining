package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import bot.ActionBot;
import lombok.ToString;
/***
 * A definition of a simple page
 * @author Administrator
 *
 */
@ToString
public abstract class AbstractPage {

	// Page attributes
	protected WebDriver driver;
	protected ActionBot bot;
	protected WebDriverWait wait;

	/***
	 * CTR contains WebDriver , ActionBot & WebDriverWait
	 * @param driver
	 */
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
		this.bot = new ActionBot(driver);
		this.wait = new WebDriverWait(driver, 30);
	}
	
}
