Feature: feature to test sorting and logout
	@Smoke
  Scenario Outline: Check sorting and logout
    Given sorting price with price range <username> <password>
    And  check logout button is visible
    Then logout and validate user logout


    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |	
