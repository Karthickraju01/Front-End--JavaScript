package org.stepdefinition;

import org.pojo.BaseClass;
import org.pojo.Flipkartsign;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipkartlogin extends BaseClass {
	Flipkartsign f;
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
	    lanuchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of the Flipkart application")
	public void to_launch_the_url_of_the_Flipkart_application() {
		launchUrl("https://www.flipkart.com/");
	    
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new Flipkartsign();
		clickBtn(f.getLogin());
		
	   
	}

	@When("To pass the email or phone number in field")
	public void to_pass_the_email_or_phone_number_in_field() {
	    f = new Flipkartsign();
	    passtext("karthickraj", f.getEmailormobileno());
	}

	@When("To request the otp for login")
	public void to_request_the_otp_for_login() {
	    passtext("456789", f.getRequestotp());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	   closeEntireBrowser();
	}



}
