Feature: API Testing 

@TC01_Data 
Scenario: To update a user 
	Given sending the put request 
	When Check put request with correct validation request "<name>" and "<job>" 
	Then Update the user 
	
	Scenario Outline:
	|name|job|
	|morpheus|zion resident|
	