Feature: User
  As a user
  I want to view the shopping list
  So that I can make a purchase

  Scenario: GET - As admin I have to get all order
    Given I set GET api endpoints get all order
    When I send GET HTTP request get all order
    Then I receive valid HTTP response code 200 get all order

  Scenario: GET - As admin I have to get order by ID
    Given I set GET api endpoints to get order by ID
    When I send GET HTTP request to get order by ID
    And I receive valid data order