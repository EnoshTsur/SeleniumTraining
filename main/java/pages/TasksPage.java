package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import lombok.ToString;
@ToString
public class TasksPage extends AbstractPage {

	// Tasks page attributes
	private final static By TODO = By.linkText("ToDo tasks");
	private final static By ALL = By.id("all-tasks");
	
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
	
	/***
	 * Click on ToDoTasksWidget 
	 * @return new ToDoTasksWidget page
	 */
	public AllTasksWidget clickOnAllTasks() {
		wait.until(ExpectedConditions.elementToBeClickable(ALL));
		bot.clickOn(ALL);
		return new AllTasksWidget(driver);
	}

}
