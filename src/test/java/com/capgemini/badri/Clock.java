package com.capgemini.badri;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Clock {

	public static AppiumDriver<MobileElement> driver;
	public static void Launch() throws Exception {
	DesiredCapabilities cap = new DesiredCapabilities();

	cap.setCapability("udid","emulator-5554");
	cap.setCapability("deviceName","Pixel 4 API 30");
	cap.setCapability("platformName","Android");
	cap.setCapability("platformVersion","11.0");
	cap.setCapability("appPackage","com.google.android.deskclock");
	cap.setCapability("appActivity","com.android.deskclock.DeskClock");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

	driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);




	}

	public static void main(String[] args) {
		
		try {
			Launch();
			System.out.println("success");
			}
			catch(Exception exp) {
			System.out.println(exp.getMessage());
			}

	}

}
