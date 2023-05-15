@Feature1
Feature: To validate the login functionality of facebook application

Background:
Given To launch the chrome browser and maximize window
@Regression
Scenario: To validate the valid username and invalid password
When To launch url of the facebook applicaton
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To check whether it navigate to the homepage or not
Then To close browser




@Smoke
  Scenario Outline: To validate the positive and negative  combination of login
  When User has to hit the facebook url
  And User has to pass the data "<emaildatas>" in email field
  And User has  to pass the data"<passworddatas>" in password field
  And User has to click the login button
  Then User has to close the browser
    Examples: 
      | emaildatas  | passworddatas | 
      | karthickraju@gamil.com | 85679134 | 
      | k@gamil.com | 479923214| 
      |r@gamil.com| 4752332356565|
      |u@gamil.com| 6556656655|
      
