Feature: mouseHover
  @mouseHover
  Scenario: As a user, I can see the color change
    Given I am on nopCommerce Homepage
    When I hover the mouse on computer element
    Then I can see the color of computer element changed