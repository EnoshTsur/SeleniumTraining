package bot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import lombok.NoArgsConstructor;
import lombok.ToString;

/***
 * ActionBot - used for take an action
 * @author Administrator
 *
 */
@ToString
@NoArgsConstructor
public class ActionBot {

	// ActionBot attributes
	private WebDriver driver;
	private Actions action;
	
	/***
	 * CTR contains driver & actions
	 * @param driver
	 */
	public ActionBot(WebDriver driver) {
		this.driver = driver;
		this.action = new Actions(driver);
	}
	
	// Methods
	/**
	 * Get Website's title
	 * @return
	 */
	public String getTitle() {
		return driver.getTitle();
	}
	
	/***
	 * Go to URL
	 * @param url
	 * @return ActionBot - for flow
	 */
	public ActionBot goTo(String url) {
		driver.get(url);
		return this;
	}
	
	/***
	 * Clicking on By element
	 * @param locator
	 * @return ActionBot - for flow
	 */
	public ActionBot clickOn(By locator) {
		driver.findElement(locator).click();
		return this;
	}
	/***
	 * Double Clicking on By element
	 * @param locator
	 * @return ActionBot - for flow
	 */
	public ActionBot doubleClickOn(By locator) {
		action.doubleClick(driver.findElement(locator));
		return this;
	}
	
	/***
	 * Pressing Enter
	 * @return ActionBot - for flow
	 */
	public ActionBot pressEnter() {
		action.sendKeys(Keys.ENTER).perform();
		return this;
	}
	/***
	 * Sending keys
	 * @return ActionBot - for flow
	 */
	public ActionBot sendKeys(By locator , String text) {
		driver.findElement(locator).sendKeys(text);
		return this;
	}
}
