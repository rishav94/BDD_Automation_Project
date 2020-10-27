Feature: Check Application Homepage

Scenario: validat Navigation menu
Given Initilize the broswer
And Open "http://www.qaclickacademy.com/"
When User opens landing page 
Then navigation menu is visible
And close browser