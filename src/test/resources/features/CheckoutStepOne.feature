@CheckoutStepOne
Feature: Checkout item
  As a user i want to check out item from website sauce demo

  Scenario: Normal checkout step one
    Given User on the checkout information page
    When User input "Rico" on First Name field
    And User input "Rinaldi" on Last Name field
    And User input "17421" on ZIP or Postal Code field
    And User click continue button

