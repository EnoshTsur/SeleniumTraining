package pages;

import org.openqa.selenium.WebDriver;

import lombok.Getter;
import lombok.ToString;
@ToString
public class TasksPage extends AbstractPage {

	// Page attributes
	@Getter
	private ToDoTasksWidget todo;
	
	/***
	 * CTR contains WebDriver
	 * @param driver
	 */
	public TasksPage(WebDriver driver) {
		super(driver);
		todo = new ToDoTasksWidget(driver);
	}



}
