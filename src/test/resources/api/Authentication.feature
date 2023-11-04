Feature: User
  As a user
  I want to see list of products
  So that I can buy product

  Scenario: POST - As admin I have login with valid acount
    Given I set POST api endpoints Login
    When I send POST HTTP request Login
    Then I receive valid HTTP response code 200 Login