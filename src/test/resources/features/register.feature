Feature: Register
  @register
  Scenario: As a user, I Should able to register account successfully
    Given I am on nopCommerce Homepage
    When I click on register button
    And I enter all required registration details
    Then I should able to register successfully
