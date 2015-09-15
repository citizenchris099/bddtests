package com.balfour.publishing.qa;

import java.net.MalformedURLException;
import java.net.URL;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * <p>
 * Example of a WebDriver implementation that has delegates all methods to a
 * static instance (REAL_DRIVER) that is only created once for the duration of
 * the JVM. The REAL_DRIVER is automatically closed when the JVM exits. This
 * makes scenarios a lot faster since opening and closing a browser for each
 * scenario is pretty slow. To prevent browser state from leaking between
 * scenarios, cookies are automatically deleted before every scenario.
 * </p>
 * <p>
 * A new instance of SharedDriver is created for each Scenario and passed to yor
 * Stepdef classes via Dependency Injection
 * </p>
 * <p>
 * As a bonus, screenshots are embedded into the report for each scenario. (This
 * only works if you're also using the HTML formatter).
 * </p>
 * <p>
 * A new instance of the SharedDriver is created for each Scenario and then
 * passed to the Step Definition classes' constructor. They all receive a
 * reference to the same instance. However, the REAL_DRIVER is the same instance
 * throughout the life of the JVM.
 * </p>
 */
@SuppressWarnings("unused")
public class SharedDriver extends EventFiringWebDriver {

	static String win10 = "Windows 10";
	static String win8 = "Windows 8.1";
	static String win7 = "Windows 7";
	static String osx9 = "OS X 10.9";
	static String linux = "Linux";

//	 private static final WebDriver REAL_DRIVER = initLocal();
//	private static final WebDriver REAL_DRIVER = initRemoteFF(win8, "37.0");
	private static final WebDriver REAL_DRIVER = initRemoteCh(win10, "44.0");

	private static final Thread CLOSE_THREAD = new Thread() {
		@Override
		public void run() {
			REAL_DRIVER.quit();
		}
	};

	static {
		Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
	}

	public SharedDriver() {
		super(REAL_DRIVER);
		//
	}

	@Override
	public void close() {
		if (Thread.currentThread() != CLOSE_THREAD) {
			throw new UnsupportedOperationException(
					"You shouldn't close this WebDriver. It's shared and will close when the JVM exits.");
		}
		
		//
		
		super.close();
	}

	@Before
	public void deleteAllCookies() {
		manage().deleteAllCookies();
	}

	@After
	public void embedScreenshot(Scenario scenario) {
		try {
			byte[] screenshot = getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		} catch (WebDriverException somePlatformsDontSupportScreenshots) {
			System.err
					.println(somePlatformsDontSupportScreenshots.getMessage());
		}
	}

	
//	public static DesiredCapabilities initBuild(String OS, String Vers, String Brows){
//		DesiredCapabilities caps = null;
//		
//		if("FF".equals(Brows)){
//			caps = DesiredCapabilities.firefox();
//			caps.setCapability("browserName", "Firefox");
//			caps.setCapability("tags", new String[] { "Firefox", Vers, OS });
//		}
//		else if("Chr".equals(Brows)){
//			caps = DesiredCapabilities.chrome();
//			caps.setCapability("browserName", "Chrome");
//			caps.setCapability("tags", new String[] { "Chrome", Vers, OS });
//		}
//		else {
//			
//		}
//		
//		caps.setCapability("platform", OS);
//		caps.setCapability("version", Vers);
//		caps.setCapability("name", "BDD Test Suite");
//		return caps;
//		
//	}
	
	
	// method for testing FireFox browsers using SauceLabs
	public static WebDriver initRemoteFF(String OS, String Vers) {

		WebDriver rd = null;
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setCapability("platform", OS);
		caps.setCapability("version", Vers);
		caps.setCapability("browserName", "Firefox");
		caps.setCapability("tags", new String[] { "Firefox", Vers, OS });
		caps.setCapability("name", "BDD Test Suite");

		try {
			rd = new RemoteWebDriver(
					new URL(
							"http://citizenchris:a8f0eeb8-bb02-4788-b6d1-3680f480930c@ondemand.saucelabs.com:80/wd/hub"),
					caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		((RemoteWebDriver) rd).setFileDetector(new LocalFileDetector());
		return rd;
	}

	// method for testing Chrome browsers using SauceLabs
	public static WebDriver initRemoteCh(String OS, String Vers) {

		WebDriver rd = null;
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", OS);
		caps.setCapability("version", Vers);
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("tags", new String[] { "Chrome", Vers, OS });
		caps.setCapability("name", "BDD Test Suite");
		caps.setCapability("maxDuration", 7600);

		try {
			rd = new RemoteWebDriver(
					new URL(
							"http://citizenchris:a8f0eeb8-bb02-4788-b6d1-3680f480930c@ondemand.saucelabs.com:80/wd/hub"),
					caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		((RemoteWebDriver) rd).setFileDetector(new LocalFileDetector());
		return rd;
	}

	// method for testing Internet Explorer browsers using SauceLabs
	public static WebDriver initRemoteIE(String OS, String Vers) {

		WebDriver rd = null;
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("platform", OS);
		caps.setCapability("version", Vers);
		caps.setCapability("tags", new String[] { "IE", Vers, OS });
		caps.setCapability("name", "BDD Test Suite");

		try {
			rd = new RemoteWebDriver(
					new URL(
							"http://citizenchris:a8f0eeb8-bb02-4788-b6d1-3680f480930c@ondemand.saucelabs.com:80/wd/hub"),
					caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		((RemoteWebDriver) rd).setFileDetector(new LocalFileDetector());
		return rd;
	}

	// method for testing IOS browsers using SauceLabs
	public static WebDriver initRemoteIoS(String OS, String Vers) {

		WebDriver rd = null;
		DesiredCapabilities caps = DesiredCapabilities.iphone();
		caps.setCapability("platform", OS);
		caps.setCapability("version", Vers);
		caps.setCapability("browserName", "iPhone");
		caps.setCapability("device-orientation", "portrait");
		caps.setCapability("tags", new String[] { "IOS", Vers });
		caps.setCapability("name", "BDD Test Suite");

		try {
			rd = new RemoteWebDriver(
					new URL(
							"http://citizenchris:a8f0eeb8-bb02-4788-b6d1-3680f480930c@ondemand.saucelabs.com:80/wd/hub"),
					caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		((RemoteWebDriver) rd).setFileDetector(new LocalFileDetector());
		return rd;
	}

	// method for testing Android browsers using SauceLabs
	public static WebDriver initRemoteAn(String Vers) {

		WebDriver rd = null;
		DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("platform", "Linux");
		caps.setCapability("version", Vers);
		caps.setCapability("device-orientation", "portrait");
		caps.setCapability("tags", new String[] { "Android", Vers });
		caps.setCapability("name", "BDD Test Suite");

		try {
			rd = new RemoteWebDriver(
					new URL(
							"http://citizenchris:a8f0eeb8-bb02-4788-b6d1-3680f480930c@ondemand.saucelabs.com:80/wd/hub"),
					caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		((RemoteWebDriver) rd).setFileDetector(new LocalFileDetector());
		return rd;
	}

	// method used for testing locally w/firefox
	public static WebDriver initLocal() {
		WebDriver wd = new FirefoxDriver();
		;
		return wd;
	}
}
