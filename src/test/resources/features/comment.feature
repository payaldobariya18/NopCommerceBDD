Feature: Comment
   @comment
  Scenario: As a user, I should able to add comment successfully

    Given I am on nopCommerce Homepage
    When I click on second Details button
    And I enter Title
    And I enter comment
    And I click on NEW COMMENT button
    Then I can see news comment is successfully added
     And I can see the comment is added at last