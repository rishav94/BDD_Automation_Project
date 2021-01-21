Feature: Application login 

Background: User open login page
Given user is on home page
#Then page title should be "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy"

Scenario: Login page title
Given user is on login page
When user gets the title of the login page
#Then page title should be "WebServices Testing using SoapUI "

Scenario: Forgot Password link
Given user is on login page
Then forgot password link should be displayed


Scenario Outline: Login with incorrect credentials
Given user is on login page
When user enters invalid <username> and password <password> 
And user clicks on Login button 
Then verify that invalid email or password alert message appears
Examples: 
|username|password|
|wrongid@gmail.com| 123456|
|test99@gmail.com| wrongpassword|


Scenario: Login with correct credentials
Given user is on login page
When user enters valid mail "test99@gmail.com" and valid password "123456" 
And user clicks on Login button
Then user gets the title of the page
And verify that invalid email or password alert message does not appears
		
		
		
		
		
		
