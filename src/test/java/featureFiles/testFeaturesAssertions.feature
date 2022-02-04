Feature: API Testing 

@TC01_ASSERTION1
Scenario: To update a user for Assertion
	Given sending the put request for Assertion
	When Check put request with correct validation request for Assertion
	Then Update Assretion
	
@TC02_ASSERTION2
Scenario: To get all the list of users 
	Given sending the url request 
	When posted with correct validation request 
	Then print all the list of users