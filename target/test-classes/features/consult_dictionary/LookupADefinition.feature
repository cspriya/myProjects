Feature: Lookup a definition 
	In order to talk better
  As an English student
  I want to look up word definitions

	#Scenario: Looking up the definition of 'apple' 
	#	Given the user is on the Wikionary home page 
	#	When the user looks up the definition of the word 'apple' 
	#	Then they should see the definition 'A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.' 
	#	
	#Scenario: Looking up the definition of 'pear' 
	#	Given the user is on the Wikionary home page 
	#	When the user looks up the definition of the word 'pear' 
	#	Then they should see the definition 'An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.' 
	#	
Scenario Outline: Looking up the definition of 'apple' & 'pear' 
	Given the user is on the Wikionary home page 
	When the user looks up the definition of the word "<fruit>" 
	Then they should see the definition "<def>" 
	
	Examples: 
		|fruit|def																							| 
		|apple|A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates. | 
		|pear |An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.|
		
#Scenario: User Login scenario 
#	Given User is at the login page of the applications 
#	When User login with the following username and password with data in excel ats "C:\Projects\FrameWorks\New folder\CucumberTutorial-master\CucumberTutorial-master\src\test\resorces\ExcelData\NavData.xlsx"