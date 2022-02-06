Feature: API Testing 

@TC01_Negative1 
Scenario: Negative Get scenario 
	Given API for testing negative Get method 
	When retrieved incorrect informantion 
	Then Validate negative response code for negative Get method 
	
@TC02_Negative2 
Scenario: Negative Post scenario 
	Given API for testing negative Post method 
	When retrieved incorrect informantion to update 
	Then Validate negative response code for negative Post method