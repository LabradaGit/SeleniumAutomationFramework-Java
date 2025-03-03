@orderHistory
Feature: Validate Order History API

  Scenario: Verify order info
    Given GET call is made to "/pokemon?limit=100&offset=200"
    Then Validate the status code of the api response
    And Validate the schema response
    And Validate that the value of the list of objects in the 'results' property is not null or empty
