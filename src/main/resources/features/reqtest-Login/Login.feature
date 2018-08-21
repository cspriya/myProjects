Feature: As a reQtest user Login to application 

Scenario Outline: Successful Login to reQtest with Valid Credentials 
	Given User is on Login Page 
	When User enters "<userName>" and "<Password>"
	Then User Navigate to app dashboard 
	
	Examples: 
		|userName					|Password  | 
		|priya.verma@globallogic.com|July@2018 | 
		|priya.verma@globallogic.com|July@2017 | 
	