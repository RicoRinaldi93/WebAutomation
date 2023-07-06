@Login
Feature: Login
  As a user i want to login to website sauce demo
  
  Scenario: Normal login
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    And User click login button

    Scenario Outline: Invalid login
      Given User open the website sauce demo
      When User input "<userName>" as userName and input "<password>" as password
      And User click login button
      Then User see error "<errorMassage>" on login page
      Examples:
        | userName | password | errorMassage                                                              |
        | Rico     | Rinaldi  | Epic sadface: Username and password do not match any user in this service |
        | Rico     |          | Epic sadface: Password is required                                        |
        |          | Rinaldi  | Epic sadface: Username is required                                        |
        |          |          | Epic sadface: Username and password do not match any user in this service                                                                          |
