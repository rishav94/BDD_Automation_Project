Feature: Check Application Homepage 
@Smoke @Regression
Scenario: validat Navigation menu 
	Given Initilize the broswer 
	And Open "http://www.qaclickacademy.com/" 
	When User opens landing page 
	Then navigation menu is visible 
	And close browser