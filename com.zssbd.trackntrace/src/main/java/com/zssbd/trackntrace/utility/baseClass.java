package com.zssbd.trackntrace.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass {
	

		public static WebDriver  getDriver(){
			
			System.setProperty("webdriver.gecko.driver", "/home/toufiq/geckodriver");
			WebDriver driver = new FirefoxDriver();
			return driver;
		}

	}

