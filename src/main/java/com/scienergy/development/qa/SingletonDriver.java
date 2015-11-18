package com.scienergy.development.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings({ "unused" })
public enum SingletonDriver {
		INSTANCE;
//		private WebDriver driver = new FirefoxDriver();
//		private WebDriver driver = chrome();
		private String url;

//		public WebDriver getDriver() {
//			return driver;
//		}
		
		public void setUrl(String url){
			this.url =  url;
			
		}
		
		public String getUrl(){
			return url;
		}
		
		public WebDriver chrome(){
			System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"/lib/chromedriver"));
			WebDriver d = new ChromeDriver();
			return d;
		}
	}