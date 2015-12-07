package com.scienergy.development.qa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.scienergy.development.TestPOJO;
import com.scienergy.development.Test_Environment;
import com.scienergy.development.Test_EnvironmentPOJO;
import com.scienergy.development.qa.pages.spec.RndStringUtil;
import com.scienergy.development.qa.pages.spec.SpecLoginPage;
import com.scienergy.development.qa.pages.spec.SpecMainPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_Spec {

	WebDriver driver;
	protected RndStringUtil randomString = new RndStringUtil();
	protected String uNFerror = "User not found";
	protected String IPerror = "Incorrect password";
	protected TestPOJO tI0 = testInfo();
	protected TaskPOJO tp0 = null;
	protected TaskPOJO tp1 = null;
	protected TaskPOJO tp2 = null;
	protected SpecMainPage specMain = null;
	protected String[] labels = { randomString.Random2Word(), randomString.Random2Word() };

	protected String summary = randomString.RandomUName();
	protected String description = randomString.RandomUName();
	protected String location = randomString.RandomUName();
	protected String assignee = "Test User";
	protected String date = randomString.date(1);
	// protected String date = "12/31/2015";
	String user1 = "Test User";
	String user2 = "Test User2";

	protected String[] nLabels = { randomString.Random2Word(), randomString.Random2Word(), randomString.Random2Word(),
			randomString.Random2Word() };
	protected String nSummary = randomString.RandomUName();
	protected String nDescription = randomString.RandomUName();
	protected String nLocation = randomString.RandomUName();
	protected String nAssignee = "Test User2";
	protected String nDate = randomString.date(90);
	protected String comment = randomString.Random2Word();

	protected String[] addTask = null;
	protected String[] editTask = null;
	protected String[] filterTask = { "allFilterAssignee" };
	public HashMap<String, String> taskForm = new HashMap<String, String>();
	public HashMap<String, String> taskFind = new HashMap<String, String>();

	public Stubs_Spec(SharedDriver driver) throws InterruptedException {
		this.driver = driver;

	}

	@Before
	public void testSetup() {
		taskForm.put("sumary only", "sumaryOnly");
		taskForm.put("description", "addDescription");
		taskForm.put("location", "taskLocation");
		taskForm.put("due date", "taskDueDate");
		taskForm.put("date picker", "edidTaskDueDate");
		taskForm.put("labels", "taskLabels");
		taskForm.put("assignee", "taskAssignee");
		taskForm.put("edit sumary", "edidTaskSummary");
		taskForm.put("edit description", "edidTaskDescription");
		taskForm.put("add location", "taskLocation");
		taskForm.put("add date", "taskDueDate");
		taskForm.put("add labels", "taskLabels");
		taskForm.put("add assignee", "taskAssignee");
		taskForm.put("edit location", "existingLocation");
		taskForm.put("edit assignee", "existingAssignee");
		taskForm.put("edit date", "edidTaskDueDate");
		taskForm.put("edit labels", "existingLabels");
		taskForm.put("add comment", "editTaskCommentField");
		taskForm.put("block task", "blockTask");
		taskForm.put("cancel task", "cancelTask");
		taskForm.put("unblock", "unBlockTask");
		taskForm.put("reopen", "reopenTask");
		taskForm.put("edit status", "editStatus");
		taskForm.put("not started", "0");
		taskForm.put("in progress", "1");
		taskForm.put("on hold", "2");
		taskForm.put("complete", "3");
		taskForm.put("blocked", "4");
		taskForm.put("canceled", "5");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(tI0.getSpecHomeURL());
	}

	public void taskFind(TaskPOJO obj) {
		taskFind.put("sumary", obj.getSummary());
		taskFind.put("description", obj.getDescription());
		taskFind.put("location", obj.getLocation());
		taskFind.put("assignee", obj.getAssignee());
	}

	@After("@loggedIn")
	public void logOut() throws InterruptedException {
		new SpecMainPage(driver).selectTaskQueueGroup("Open").selectQuickFilter("All Tasks").LogOut();
	}

	/**
	 * log in stubs
	 */

	@Given("^on login page$")
	public void on_login_page() throws Throwable {
		new SpecLoginPage(driver);
	}

	@When("^enter valid credentials$")
	public void enter_valid_credentials() throws Throwable {
		new SpecLoginPage(driver).loginAs(tI0.getMiscUname001(), tI0.getMiscPword001());
	}

	@Then("^arrive at main spec page$")
	public void arrive_at_main_spec_page() throws Throwable {
		specMain = new SpecMainPage(driver);
	}

	@When("^enter invalid username$")
	public void enter_invalid_username() throws Throwable {
		new SpecLoginPage(driver).loginAs("invalid", tI0.getMiscPword001(), uNFerror);
	}

	@Then("^user receives error msg and remains on log in page$")
	public void user_receives_error_msg_and_remains_on_log_in_page() throws Throwable {
		new SpecLoginPage(driver);
	}

	@When("^enter invalid password$")
	public void enter_invalid_password() throws Throwable {
		new SpecLoginPage(driver).loginAs(tI0.getMiscUname001(), "rw", IPerror);
	}

	@Then("^log out of spec$")
	public void log_out_of_spec() throws Throwable {
		new SpecMainPage(driver).LogOut();
	}

	/**
	 * filters stubs
	 */

	@Given("^All Tasks is active$")
	public void All_Tasks_is_active() throws Throwable {
		specMain.selectQuickFilter("All Tasks");
	}

	@When("^click My Tasks$")
	public void click_My_Tasks() throws Throwable {
		specMain.selectQuickFilter("My Tasks");
	}

	@Then("^All Tasks is in active$")
	public void All_Tasks_is_in_active() throws Throwable {
		specMain.quickFilterInActive("My Tasks");
	}

	/**
	 * add task stubs
	 */

	@Given("^a task is created with \"([^\"]*)\"$")
	public void a_task_is_created_with(String arg1) throws Throwable {
		List<String> tasks = new ArrayList<String>();
		System.out.println("argument passed = " + arg1);
		String[] taskChoices = arg1.split(",");
		for (String c : taskChoices) {
			tasks.add(taskForm.get(c));
		}
		addTask = new String[tasks.size()];
		tasks.toArray(addTask);
		tp0 = createTaskInfo(addTask);
		specMain.addNewTask(tp0, addTask);
	}

	@Given("^on main spec page$")
	public void on_main_spec_page() throws Throwable {
		specMain = new SpecMainPage(driver);
	}

	@When("^task creator searches for task using \"([^\"]*)\"$")
	public void task_creator_searches_for_task_using(String arg1) throws Throwable {
		taskFind(tp0);
		specMain.LogOut().loginAs(tI0.getMiscUname001(), tI0.getMiscPword001()).findTask(taskFind.get(arg1), tp0);
	}

	@When("^task creator searches for task using lable$")
	public void task_creator_searches_for_task_using_lable() throws Throwable {
		specMain.LogOut().loginAs(tI0.getMiscUname001(), tI0.getMiscPword001()).findTask(tp0.getLabels(), tp0);
	}

	@Then("^task is displayed in task queue$")
	public void task_is_displayed_in_task_queue() throws Throwable {
		System.out.println("tp0 summary = " + tp0.getSummary());
		if (specMain.checkTaskInQueuePresent(tp0.getSummary()) < 1) {
			throw new RuntimeException("Task not present in queue");
		}
	}

	@Then("^task info appears correct in the edit task area$")
	public void task_info_appears_correct_in_the_edit_task_area() throws Throwable {
		tp1 = specMain.checkTask(tp0);

		System.out.println("tp0 labels = " + tp0.getLabelsPresent() + " tp1 labels = " + tp1.getLabelsPresent());
		System.out.println("tp0 canceled = " + tp0.getCanceled() + " tp1 canceled = " + tp1.getCanceled());
		System.out.println("tp0 blocked = " + tp0.getBlocked() + " tp1 blocked = " + tp1.getBlocked());
		System.out
				.println("tp0 location = " + tp0.getLocationPresent() + " tp1 location = " + tp1.getLocationPresent());
		System.out
				.println("tp0 assignee = " + tp0.getAssigneePresent() + " tp1 assignee = " + tp1.getAssigneePresent());
		System.out.println("tp0 date = " + tp0.getDueDate() + " tp1 date = " + tp1.getDueDate());
		System.out.println("tp0 description = " + tp0.getDescription() + " tp1 description = " + tp1.getDescription());
		System.out.println("tp0 summary = " + tp0.getSummary() + " tp1 summary = " + tp1.getSummary());

		if (tp0.hashCode() != tp1.hashCode()) {
			throw new RuntimeException("Task Info did not match");
		}
	}

	/**
	 * edit task stubs
	 */

	@Given("^task is selected$")
	public void task_is_selected() throws Throwable {
		specMain.clickTaskInQueue(tp0.getSummary());
	}

	@When("^\"([^\"]*)\" change is made to task$")
	public void change_is_made_to_task(String arg1) throws Throwable {
		List<String> tasks = new ArrayList<String>();
		System.out.println("edit argument passed = " + arg1);
		String[] taskChoices = arg1.split(",");
		for (String c : taskChoices) {
			tasks.add(taskForm.get(c));
		}
		editTask = new String[tasks.size()];
		tasks.toArray(editTask);
		tp1 = taskInfoClone(tp0);
		taskInfoEdit(tp1, editTask, 1);
		specMain.editTask(tp0, tp1, editTask);
	}

	@Then("^edited task is displayed in task queue$")
	public void edited_task_is_displayed_in_task_queue() throws Throwable {
		if (specMain.LogOut().loginAs(tI0.getMiscUname001(), tI0.getMiscPword001())
				.checkTaskInQueuePresent(tp1.getSummary()) < 1) {
			throw new RuntimeException("Edited Task not present in queue");
		}
	}

	@Then("^the change persists within the edit task area$")
	public void the_change_persists_within_the_edit_task_area() throws Throwable {
		tp2 = specMain.clickTaskInQueue(tp1.getSummary()).checkTask(tp1);

		System.out.println("tp1 labels = " + tp1.getLabelsPresent() + " tp2 labels = " + tp2.getLabelsPresent());
		System.out.println("tp1 canceled = " + tp1.getCanceled() + " tp2 canceled = " + tp2.getCanceled());
		System.out.println("tp1 blocked = " + tp1.getBlocked() + " tp2 blocked = " + tp2.getBlocked());
		System.out
				.println("tp1 location = " + tp1.getLocationPresent() + " tp2 location = " + tp2.getLocationPresent());
		System.out
				.println("tp1 assignee = " + tp1.getAssigneePresent() + " tp2 assignee = " + tp2.getAssigneePresent());
		System.out.println("tp1 date = " + tp1.getDueDate() + " tp2 date = " + tp2.getDueDate());
		System.out.println("tp1 description = " + tp1.getDescription() + " tp2 description = " + tp2.getDescription());
		System.out.println("tp1 summary = " + tp1.getSummary() + " tp2 summary = " + tp2.getSummary());
		System.out.println("tp1 comment = " + tp1.getComment001() + " tp2 comment = " + tp2.getComment001());
		System.out.println("tp1 comment author = " + tp1.getUser() + " tp2 comment author = " + tp2.getUser());
		System.out.println("tp1 comment date time = " + tp1.getComment001DateTime() + " tp2 comment date time = "
				+ tp2.getComment001DateTime());

		if (tp1.hashCode() != tp2.hashCode()) {
			throw new RuntimeException("Task Info did not match");
		}
	}

	/**
	 * status stubs
	 */

	@When("^task status changed to \"([^\"]*)\"$")
	public void task_status_changed_to(String arg1) throws Throwable {
		String[] editTaskstatus = { "editStatus" };
		int status = Integer.parseInt(taskForm.get(arg1));
		tp1 = taskInfoClone(tp0);
		taskInfoEdit(tp1, editTaskstatus, status);
		specMain.editTask(tp0, tp1, editTaskstatus);
	}

	@When("^status reverted back to not started$")
	public void status_reverted_back_to_not_started() throws Throwable {
		String[] editTaskstatus = { "editStatus" };
		taskInfoEdit(tp1, editTaskstatus, 0);
		specMain.editTask(tp0, tp1, editTaskstatus);
	}

	@When("^status reverted back to \"([^\"]*)\"$")
	public void status_reverted_back_to(String arg1) throws Throwable {
		task_status_changed_to(arg1);
	}

	@Then("^edited task is displayed in open task queue$")
	public void edited_task_is_displayed_in_open_task_queue() throws Throwable {
		specMain.selectTaskQueueGroup("Open");
		edited_task_is_displayed_in_task_queue();
	}

	@Then("^\"([^\"]*)\" displays correctly in open task queue$")
	public void displays_correctly_in_open_task_queue(String arg1) throws Throwable {
		specMain.selectTaskQueueGroup("Open");
		String status = specMain.checkTaskStatus(tp1.getSummary());
		System.out.println("status found = " + status + " and tp1 statusdisplay = " + tp1.getStatusDisplay());
		if (!status.equals(tp1.getStatusDisplay())) {
			throw new RuntimeException("status display did not match");
		}
	}

	@Then("^edited task is displayed in closed task queue$")
	public void edited_task_is_displayed_in_closed_task_queue() throws Throwable {
		specMain.selectTaskQueueGroup("Closed");
		edited_task_is_displayed_in_task_queue();
	}

	@Then("^\"([^\"]*)\" displays correctly in closed task queue$")
	public void displays_correctly_in_closed_task_queue(String arg1) throws Throwable {
		specMain.selectTaskQueueGroup("Closed");
		if (specMain.checkTaskInQueueElement(tp1.getSummary(), "taskComplete") < 1) {
			throw new RuntimeException("status was not complete");
		}
	}

	@Then("^edited task is not displayed in open task queue$")
	public void edited_task_is_not_displayed_in_open_task_queue() throws Throwable {
		specMain.selectTaskQueueGroup("Open");
		if (specMain.LogOut().loginAs(tI0.getMiscUname001(), tI0.getMiscPword001())
				.checkTaskInQueuePresent(tp1.getSummary()) > 0) {
			throw new RuntimeException("Edited Task present in queue");
		}
	}

	@Then("^edited task is not displayed in closed task queue$")
	public void edited_task_is_not_displayed_in_closed_task_queue() throws Throwable {
		specMain.selectTaskQueueGroup("Closed");
		if (specMain.LogOut().loginAs(tI0.getMiscUname001(), tI0.getMiscPword001())
				.checkTaskInQueuePresent(tp1.getSummary()) > 0) {
			throw new RuntimeException("Edited Task present in queue");
		}
	}

	/**
	 * blocked and canceled stubs
	 */

	@Then("^block flag displays for task$")
	public void block_flag_displays_for_task() throws Throwable {
		specMain.selectTaskQueueGroup("Open");
		if (specMain.checkTaskInQueueElement(tp1.getSummary(), "taskBlocked") < 1) {
			throw new RuntimeException("blocked flag was not found");
		}
	}

	@Then("^canceled flag displays for task$")
	public void canceled_flag_displays_for_task() throws Throwable {
		specMain.selectTaskQueueGroup("Closed");
		if (specMain.checkTaskInQueueElement(tp1.getSummary(), "taskCanceled") < 1) {
			throw new RuntimeException("blocked flag was not found");
		}
	}

	@When("^task is unblocked$")
	public void task_is_unblocked() throws Throwable {
		String[] editTaskstatus = { "unBlockTask" };
		taskInfoEdit(tp1, editTaskstatus, 0);
		specMain.editTask(tp0, tp1, editTaskstatus);
	}

	@When("^task is reopened$")
	public void task_is_reopened() throws Throwable {
		String[] editTaskstatus = { "reopenTask" };
		taskInfoEdit(tp1, editTaskstatus, 0);
		specMain.editTask(tp0, tp1, editTaskstatus);
	}

	@When("^task is blocked$")
	public void task_is_blocked() throws Throwable {
		String[] editTaskstatus = { "blockTask" };
		tp1.setBlocked(1);
		specMain.editTask(tp0, tp1, editTaskstatus);
	}

	/**
	 * used to create the initial TaskPOJO object which is used to create a task
	 * 
	 * @param task
	 *            : String[] that denotes what values to pass into the TaskPOJO
	 *            object
	 * @return : TaskPOJO
	 */
	private TaskPOJO createTaskInfo(String[] task) {
		TaskPOJO orig = new TaskPOJO();
		orig.setSummary(summary);
		for (String t : task) {
			if (t.equals("addDescription")) {
				orig.setDescription(description);
			} else if (t.equals("taskLocation")) {
				orig.setLocation(location);
				orig.setLocationPresent(1);
			} else if (t.equals("taskDueDate")) {
				orig.setDueDate(date);
			} else if (t.equals("edidTaskDueDate")) {
				orig.setDueDate(date);
			} else if (t.equals("taskLabels")) {
				orig.setLabels(labels);
				orig.setLabelsPresent(orig.getLabels().length);
			} else if (t.equals("taskAssignee")) {
				orig.setAssignee(assignee);
				orig.setAssigneePresent(1);
			}
		}
		return orig;
	}

	private TaskPOJO taskInfoClone(TaskPOJO orig) {
		TaskPOJO edit = new TaskPOJO();
		edit.setSummary(orig.getSummary());
		edit.setDescription(orig.getDescription());
		edit.setLocation(orig.getLocation());
		edit.setLocationPresent(orig.getLocationPresent());
		edit.setDueDate(orig.getDueDate());
		if (orig.getLabels() != null) {
			edit.setLabels(orig.getLabels());
			edit.setLabelsPresent(orig.getLabels().length);
		}
		edit.setAssignee(orig.getAssignee());
		edit.setAssigneePresent(orig.getAssigneePresent());
		return edit;
	}

	private TaskPOJO taskInfoEdit(TaskPOJO edit, String[] task, int status) {
		HashMap<Integer, String> statusDisplay = new HashMap<Integer, String>();
		statusDisplay.put(0, "not started");
		statusDisplay.put(1, "in progress");
		statusDisplay.put(2, "on hold");
		statusDisplay.put(3, "complete");
		for (String t : task) {
			if (t.equals("edidTaskSummary")) {
				edit.setSummary(nSummary);
			} else if (t.equals("edidTaskDescription")) {
				edit.setDescription(description);
			} else if (t.equals("taskLocation")) {
				edit.setLocation(location);
				edit.setLocationPresent(1);
			} else if (t.equals("taskDueDate")) {
				edit.setDueDate(date);
			} else if (t.equals("taskLabels")) {
				edit.setLabels(labels);
				edit.setLabelsPresent(edit.getLabels().length);
			} else if (t.equals("taskAssignee")) {
				edit.setAssignee(assignee);
				edit.setAssigneePresent(1);
			} else if (t.equals("existingLocation")) {
				edit.setLocation(nLocation);
			} else if (t.equals("existingAssignee")) {
				edit.setAssignee(nAssignee);
			} else if (t.equals("edidTaskDueDate")) {
				edit.setDueDate(nDate);
			} else if (t.equals("existingLabels")) {
				edit.setLabels(nLabels);
				edit.setLabelsPresent(edit.getLabels().length);
			} else if (t.equals("editTaskCommentField")) {
				edit.setComment001(comment);
				edit.setUser(user1);
			} else if (t.equals("blockTask")) {
				edit.setBlocked(1);
			} else if (t.equals("cancelTask")) {
				edit.setCanceled(1);
			} else if (t.equals("unBlockTask")) {
				edit.setBlocked(0);
			} else if (t.equals("reopenTask")) {
				edit.setCanceled(0);
			} else if (t.equals("editStatus")) {
				edit.setStatus(status);
				edit.setStatusDisplay(statusDisplay.get(edit.getStatus()));
			}
		}
		return edit;
	}

	protected TestPOJO testInfo() {
		Test_EnvironmentPOJO slugNAction = new Test_Environment().slugNAction();
		TestPOJO tp0 = new TestPOJO();
		tp0.setSpecHomeURL(new Test_Environment().envUrl(slugNAction.getHome()));
		tp0.setMiscUname001("testusername");
		tp0.setMiscPword001("testpassword");
		tp0.setMiscUname002("testusername2");
		tp0.setMiscPword002("testpassword2");
		return tp0;
	}

}