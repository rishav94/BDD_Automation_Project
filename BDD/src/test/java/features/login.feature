Feature: Application login	

Scenario: Negative test validating login
Given Initilize the chrome broswer
And Navigate to link "http://www.qaclickacademy.com/"
And Click on Login link in home page to land on login page
When user loging into with "test99@gmail.com" and password "123456" and logs in
Then verify that user could not loggedin






