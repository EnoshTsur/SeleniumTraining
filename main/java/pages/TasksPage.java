package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import lombok.ToString;
@ToString
public class TasksPage extends AbstractPage {

	// Tasks page attributes
	private final static By TODO = By.linkText("ToDo tasks");
	
	/***
	 * CTR contains WebDriver
	 * @param driver
	 */
	public TasksPage(WebDriver driver) {
		super(driver);
	}
	
	

	/***
	 * Click on ToDoTasksWidget 
	 * @return new ToDoTasksWidget page
	 */
	public ToDoTasksWidget clickOnToDo() {
		wait.until(ExpectedConditions.elementToBeClickable(TODO));
		bot.clickOn(TODO);
		return new ToDoTasksWidget(driver);
	}

}
