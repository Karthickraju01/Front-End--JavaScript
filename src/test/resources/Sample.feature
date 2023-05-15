@Feature2
Feature: To validate the account creation of fb application
@Sanity
Scenario: To create new account
Given To launch the browser and maximise the window
When  To launch url of fb application
And  To click the create new account button

#One dimensional map data
And To pass firstname in firstname textbox
#key      value
|firstname1|karthick|
|firstname2|eu|
|firstname3|Sangku|
|fisrtname4|KArryu|

And To pass secondname  in secondname textbox

#Two dimensional map data                                                                       
And To pass mobileno or email in email text box
|password1|password2|password3|
|986545664|djdieje|nksnkn@|
|63802102750|poiuyut|jkume2|
|uwyuhhxxjsj|iisoiaos|hnkms2|
|@rthuikl|bkiooetg|jkume2|
And To create new password using new password text box
Then To close the chrome browser
