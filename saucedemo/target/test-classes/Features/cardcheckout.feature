Feature: feature to test card functionality
	@Smoke
  Scenario Outline: Check card is sucessfull checkout
    Given products is selected by <username> and <password>
    When user clicks on checkout button
    And user fill form <fname> <lname> <zip>
    Then user finish shopping with sucess msg <expected>


    Examples: 
      | username      | password     |	fname  |  lname  |  zip  |	 expected  |
      | standard_user | secret_sauce |	syed	 |	ibad   |  7607 |	 Thank you for your order!  |
