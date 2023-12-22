Feature: 
  I should be able to login to the sauce demo account

  Background: 
    Given I am in the sauce demo website

  Scenario Outline: Unsuccessful login to the page
    Given I have entered invalid <username> and <password>
    When I click on login button
    Then I should get an error message <error_message>

    Examples: 
      | username | password | error_message                                                             |
      | test     | test1    | Epic sadface: Username and password do not match any user in this service |

  Scenario: Testing with valid credentials
    Given I have entered valid username and password
    When I click on login button
    Then I successfully logged into the page
