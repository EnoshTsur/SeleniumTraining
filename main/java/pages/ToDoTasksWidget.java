package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import lombok.ToString;
/***
 * To do taks & send it widget
 * @author Administrator
 *
 */
@ToString
public class ToDoTasksWidget extends AbstractPage {

	// ToDo attributes
	private final static By TEXT_AREA = By.id("todo");
	private final static By BUTTON = By.id("send-task");
	
	/***
	 * CTR contains driver
	 * @param driver
	 */
	public ToDoTasksWidget(WebDriver driver) {
		super(driver);
	}

	/***
	 * Send taks to text-area
	 * @param text
	 * @return ToDoTasksWidget for - flow
	 */
	public ToDoTasksWidget setAreaText(String text) {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(TEXT_AREA)));
		bot.sendKeys(TEXT_AREA, text);
		return this;
	}

	/***
	 * Click on button send new task
	 * @return ToDoTasksWidget for -flow
	 */
	public ToDoTasksWidget clickOnButton() {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(BUTTON)));
		bot.clickOn(BUTTON);
		return this;
	}
	/***
	 * Sending a new tasks and get at the and blank text area
	 * @param text
	 * @return ToDoTasksWidget for - flow
	 */
	public ToDoTasksWidget doNewTaskSuccess(String text) {
		setAreaText(text);
		clickOnButton();
		wait.until(ExpectedConditions.textToBe(TEXT_AREA, ""));
		Assert.assertEquals(driver.findElement(TEXT_AREA).getText(), "");
		return this;
	}
	
	/***
	 * Sending a new tasks and get at the and text area with user1234 inside
	 * @param text
	 * @return ToDoTasksWidget for - flow
	 */
	public ToDoTasksWidget doNewTaskFail(String text) {
		setAreaText(text);
		clickOnButton();
		wait.until(ExpectedConditions.textToBe(TEXT_AREA, ""));
		Assert.assertEquals(driver.findElement(TEXT_AREA).getText(), "user1234");
		return this;
	}
}
