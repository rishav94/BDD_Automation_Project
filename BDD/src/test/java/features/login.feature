Feature: Application login 

@Smoke @Regression
Scenario Outline: Negative test validating login 
	Given Initilize the chrome broswer 
	And Navigate to link "http://www.qaclickacademy.com/" 
	And Click on Login link in home page to land on login page 
	When user loging into with <username> and password <password> and logs in
	Then verify that user could not loggedin 
	
	Examples:
    |username|password|
    |wrongid@gmail.com| 123456|
    |test99@gmail.com| wrongpassword|
@Regression	
Scenario: positive test validating login 
	Given Initilize the chrome broswer 
	And Navigate to link "http://www.qaclickacademy.com/" 
	And Click on Login link in home page to land on login page 
	When user loging into with "test99@gmail.com" and password "123456" and logs in 
	Then verify that user could loggedin
	
		
	
	
	
	
