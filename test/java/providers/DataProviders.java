package providers;

import org.testng.annotations.DataProvider;

/***
 * Data provider in a different class
 * 
 * @author Administrator
 *
 */
public class DataProviders {

	/***
	 * Data Provider for login
	 * 
	 * @return Object[2][3]
	 */
	@DataProvider(name = "login-providers")
	public Object[][] loginProviders() {
		Object[][] data = new Object[2][3];

		data[0][0] = "Enosh";
		data[0][1] = "Tsur";
		data[0][2] = "king1234";

		data[1][0] = "Avner";
		data[1][1] = "Kenner";
		data[1][2] = "lamer1234";

		return data;

	}

	/***
	 * Data Provider for new tasks
	 * 
	 * @return Object[2][1]
	 */
	@DataProvider(name = "todo-providers")
	public Object[][] todoProvider() {
		Object[][] data = new Object[2][3];

		data[0][0] = "Day Task";
		data[0][1] = " Walk my dog";
		data[0][2] = "";

		data[1][0] = "Night Task";
		data[1][1] = " Clean my room";
		data[1][2] = "        ";

		return data;

	}

	/***
	 * Data Provider for all tasks
	 * 
	 * @return Object[2][1]
	 */
	@DataProvider(name = "all-tasks-providers")
	public Object[][] allTasksProvider() {
		return new Object[][] { { "0" }, { "22" } };
	}
}