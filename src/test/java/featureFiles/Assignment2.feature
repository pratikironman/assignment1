Feature: API Testing 

@TC01_GET 
Scenario: To get all the list of users 
	Given sending the url request 
	When posted with correct validation request 
	Then print all the list of users 
	
@TC02_DELETE
Scenario: To delete a user 
	Given sending the delete request 
	When Check for deleting with correct validation request 
	Then Delete the user 
	
@TC03_PUT
Scenario: To update a user 
	Given sending the put request 
	When Check put request with correct validation request 
	Then Update the user 
		
@TC04_POST
Scenario: To post a user 
	Given sending the post request 
	When Check post request with correct validation request 
	Then Post information the user 