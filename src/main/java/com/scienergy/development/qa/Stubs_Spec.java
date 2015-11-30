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

	@After ("@loggedIn")
	public void logOut() throws InterruptedException {
		new SpecMainPage(driver).LogOut();
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
		if (specMain.checkTaskInQueuePresent(tp0.getSummary()) < 1) {
			throw new RuntimeException("Task not present in queue");
		}
	}

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
		edit.setLocationPresent(orig.getAssigneePresent());
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