@AddToChart
Feature: Add To Chart Item
  As a user i want to Check out item from website sauce demo

  Scenario: Normal Add To Chart Item
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    And User click login button
    And User sort filter "Name (Z to A)'"
    And User pick item 1 "Sauce Labs Onesie"
    And User pick item 2 "Test.allTheThings() T-Shirt (Red)"
    And User click the cart icon
    And User input "Rico" on First Name field
    And User input "Rinaldi" on Last Name field
    And User input "17421" on ZIP or Postal Code field
    And User click continue button
    Then User directed to check out overview page
    And User click finish button
    Then User completed checkout proses

