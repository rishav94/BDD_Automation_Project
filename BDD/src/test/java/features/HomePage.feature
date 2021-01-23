@Homepage
Feature: Check Application Homepage 

@Skip @Smoke
Scenario: home page title
Given user is on home page
When user gets the title of the page
Then page title should be "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy"

@Smoke
Scenario: validat Navigation menu 
Given user is on home page
Then navigation menu should be displayed 
@Smoke
Scenario: validate that user is able to see news
Given user is on home page	
Then News is visible to user
	
@Skip
Scenario: validate the title
Given user is on home page	
Then verify that title is "Featured Courses"
	