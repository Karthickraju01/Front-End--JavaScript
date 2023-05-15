package org.stepdefinition;

import org.pojo.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	@Before(order = 1)
	//precondition
	private void precondition2() {

		lanuchBrowser();
		System.out.println("Launch The Browser");
		

	}
	@Before(order = 2)
	private void precondition1() {
		
		
		windowMaximize();

		System.out.println("Max the windows");
	}
	@Before(order = 3,value = "@Smoke")
	private void precondition3() {
	
		System.out.println("pre");

	}
	
	@After(order = 10,value = "@Smoke")
	//postcondition
	private void postcondition2() {
		System.out.println("Take screenshot of scenarious");

	}
	@After(order = 4)
	private void postcondition1() {
		
		closeEntireBrowser();
		System.out.println("close entire browser");

	}
	

}
