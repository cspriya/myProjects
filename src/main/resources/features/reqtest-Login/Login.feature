Feature: As a reQtest user Login to application 

Scenario Outline: Successful Login to reQtest with Valid Credentials 
	Given User is on Login Page 
	When User enters "<userName>" and "<Password>"
	Then User Navigate to app dashboard and get "<WelcomeMessage>" 
	
	Examples: 
		|userName					|Password  | WelcomeMessage									     	|
		|priya.verma@globallogic.com|July@2018 | Welcome Priya to your Dashboard for Requirement Testing|
		
#Scenario Outline: Successful Login to reQtest with Invalid Credentials 
#	Given User is on Login Page 
#	When User enters "<userName>" and "<Password>" 
#	Then User Navigate to app dashboard 
#	
#	Examples: 
#		|userName					|Password  | 		
#		|priya.verma@globallogic.com|July@2017 | 
#	