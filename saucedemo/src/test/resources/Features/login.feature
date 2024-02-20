Feature: feature to test login functionality

	@Smoke
  Scenario Outline: Check login is sucessfull with valid credentials
    Given WEB is open
    When user enters <username> and <password>
    Then validate user is navigated to page 


	Examples:
		| username | password |				 |		expected  |
		| standard_user | secret_sauce |    Products	|

