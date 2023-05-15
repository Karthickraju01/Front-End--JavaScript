package org.stepdefinition;


import java.util.List;
import java.util.Map;

import org.pojo.BaseClass;
import org.pojo.SignINpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FbRegistraction extends BaseClass {
	SignINpojo s;
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
		lanuchBrowser();
		windowMaximize();
	    
	}

	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() {
		launchUrl("https://www.facebook.com/");
	 
	}

	@When("To click the create new account button")
public void to_click_the_create_new_account_button() {
		
		s = new SignINpojo();
		clickBtn(s.getCreateNewAcc());
	    
	}

	@When("To pass firstname in firstname textbox")
	public void to_pass_firstname_in_firstname_textbox(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		//List<String> l = d.asList();
		Map<String, String> m = d.asMap(String.class, String.class);
		s = new SignINpojo();
		passtext(m.get("firstname1"), s.getFirstNameTxtBox());
		//passtext((String) m.get("firstname2"), s.getFirstNameTxtBox());
		//passtext( m.get("firstname1"), s.getFirstNameTxtBox());
		
	}

	
	@When("To pass secondname  in secondname textbox")
	public void to_pass_secondname_in_secondname_textbox() {
		s = new SignINpojo();
		passtext("kar", s.getSecondNameTxtBox());
	   
	}

	@When("To pass mobileno or email in email text box")
	public void to_pass_mobileno_or_email_in_email_text_box(DataTable d) {
		List<Map<String, String>> m = d.asMaps();
		//List<List<String>> l = d.asLists();
		s = new SignINpojo();
		
		passtext(m.get(1).get("password1"), s.getMobileorEmailTextBox());
	  
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		s = new SignINpojo();
		passtext("karthick", s.getNewPassword());
	    
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		//closeEntireBrowser();
	   
	}

}
