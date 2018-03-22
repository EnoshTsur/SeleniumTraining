package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import lombok.Getter;
/***
 * Widget that adding new done tasks & removing tasks
 * @author Administrator
 *
 */
public class AllTasksWidget extends AbstractPage {
	
	// Widget attributes
	@Getter
	private final static By DONE_INPUT = By.id("done-input");
	private final static By DONE_BUTTON = By.xpath("/html/body/div[2]/div[1]/button");
	
	private final static By REMOVE_INPUT = By.id("remove-input");
	private final static By REMOVE_BUTTON =  By.xpath("/html/body/div[2]/div[2]/button");
	
	private final static By SWAL_BUTTON = By.xpath("/html/body/div[4]/div/div[4]/div/button");

	/***
	 * CTR contains Driver
	 * @param driver
	 */
	public AllTasksWidget(WebDriver driver) {
		super(driver);
	}

	// !!!!---- DONE ----!!!!
	
	/***
	 * Setting done input
	 * @param number
	 * @return AllTasksWidget for - flow
	 */
	public AllTasksWidget clearDoneNumber() {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(DONE_INPUT)));
		bot.clearInput(DONE_INPUT);
		return this;
	}
	/***
	 * Setting done input
	 * @param number
	 * @return AllTasksWidget for - flow
	 */
	public AllTasksWidget setDoneNumber(String number) {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(DONE_INPUT)));
		bot.sendKeys(DONE_INPUT , number);
		return this;
	}
	/***
	 * Clicking on done button
	 * @return AllTasksWidget for - flow
	 */
	public AllTasksWidget clickOnDoneButton() {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(DONE_BUTTON)));
		bot.clickOn(DONE_BUTTON);
		return this;
	}
	
	
	
	
	//!!!!---- REMOVE ----!!!!
	
	/***
	 * Setting remove input
	 * @param number
	 * @return AllTasksWidget for - flow
	 */
	public AllTasksWidget setRemoveNumber(String number) {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(REMOVE_INPUT)));
		bot.sendKeys(REMOVE_INPUT, number);
		return this;
	}
	
	/***
	 * Clicking on done button
	 * @return AllTasksWidget for - flow
	 */
	public AllTasksWidget clickOnRemoveButton() {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(REMOVE_BUTTON)));
		bot.clickOn(REMOVE_BUTTON);
		return this;
	}
	
	//!!!!---- SWAL ---!!!!
	public AllTasksWidget clickOnSwalButton() {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(SWAL_BUTTON)));
		bot.clickOn(SWAL_BUTTON);
		return this;
	}
}
