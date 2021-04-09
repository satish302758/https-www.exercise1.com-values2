Feature: Borrower portal my loan

	Background:
	Given i load testdata from sample data properties files
	Given load chrome browser and navigate to demo project

  
  Scenario: Verify values counts, balance and data validation 
    Then i verify the right count of values appear on the screen
    And i verify the values on the screen are greater than zero
    And i verify the values are formatted as currencies
    And i verify the total balance matches the sum of the values
