package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import enums.Browser;
import factory.DriverFactory;
import pages.TasksPage;
import pages.ToDoTasksWidget;

@Test
public class ToDoTest extends AbstractTestCase {

	// Test attributes
	private WebDriver driver;

	/***
	 * Setting up before test
	 */
	@BeforeMethod
	public void settingUp() {
		report.log("Setting properties");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		report.log("Getting the right WebDriver");
		driver = DriverFactory.getDriver(Browser.CHROME);

		report.log("Go to the website");
		driver.get("file:///C:/Enosh/WS2/SeleniumProject/src/main/resources/static/index.html");

		report.log("Maximized the window");
		driver.manage().window().maximize();
		report.log("");

	}

	/***
	 * Test for success
	 */
	@Test
	public void todoTestSuccess() {
		report.startLevel("Starting a success test!");

		TasksPage tasksPage = new TasksPage(driver);

		report.log("Getiting Todo widget");

		ToDoTasksWidget widget = tasksPage.clickOnToDo();

		report.log("Adding new task");

		widget.setAreaText("Avner").clickOnButton();

		report.log("Assert text area return blank");

		WebElement textArea = driver.findElement(ToDoTasksWidget.getTEXT_AREA());

		Assert.assertEquals(textArea.getText(), "        ");

		report.endLevel();
	}

	/***
	 * Test for failure
	 */
	@Test
	public void todoTestFail() {
		report.startLevel("Starting a failure test!");

		TasksPage tasksPage = new TasksPage(driver);

		report.log("Getiting Todo widget");

		ToDoTasksWidget widget = tasksPage.clickOnToDo();

		report.log("Adding new task");

		widget.setAreaText("Avner").clickOnButton();

		WebElement textArea = driver.findElement(ToDoTasksWidget.getTEXT_AREA());

		Assert.assertEquals(textArea.getText(), "user");

		report.endLevel();
	}

}
