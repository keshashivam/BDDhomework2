
@java
Feature: As a user
  I am able to add new employee on orange hra website
  Scenario:I should login on orange website sucessfully
    Given I am on login panel page of orange hrm website
    When  I  cai enter Username in username field
    And   I enter password in password field
    And   I click on login button
    Then  I login successfully with message welcome admin


    Scenario: I should navigate to add employee page
      Given I am on homepage
      When  I click on pim tab
      And   I click on add employee
      Then  I should navigate to add employee page sucessfully



