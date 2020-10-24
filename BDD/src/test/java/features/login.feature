Feature: Application login	

Scenario: Home page default login page
Given User is on landing page
When user loging into with "vhvjvjh" and password "gfgf78678"
Then Home page is populated 
And Cards are displayed are "true"

Scenario: Home page default login page
Given User is on landing page
When user loging into with "john" and password "john678"
Then Home page is populated 
And Cards are displayed are "false"



