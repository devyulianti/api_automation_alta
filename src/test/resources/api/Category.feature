Feature: User
  As a admin
  I want see categories product
  So that I can select category

  Scenario: POST - As admin I have to create new categories
    Given I set POST endpoints new categories
    When I send POST HTTP request new categories
    And I receive valid HTTP response code 200 new categories
    Then I receive valid data new categories

  Scenario: GET - As admin I have  to get all categories
    Given I set GET endpoints all categories
    When I send GET HTTP request all categories
    Then I receive valid HTTP response code 200 all categories

  Scenario: DELETE - As admin I have to delete categories
    Given I set DELETE endpoints delete categories
    When I send DELETE HTTP request delete categories
    Then I receive valid HTTP response code 200 delete categories