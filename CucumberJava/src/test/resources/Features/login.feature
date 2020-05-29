@SmokeFeature
Feature: Feature to test login functionality

@smoketest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enter username and password
    And Click Login button
    Then user is navigated to the Home Page
    And close browser
