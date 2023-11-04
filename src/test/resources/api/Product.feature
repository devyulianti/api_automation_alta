Feature: User
  As a user
  I want to choose a product
  So that I can purchase it

  Scenario: GET - As admin I have to get all posts
    Given I set GET api endpoints
    When I send GET HTTP request Product
    Then I receive valid HTTP response code 200 Product

  Scenario: POST - As admin I have to create new product
    Given I am set POST api endpoint create product
    When I am send POST HTTP request
    Then I receive valid data post

  Scenario: DELETE - As admin I can to delete existing user
    Given I set DELETE api endpoint
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200 delete