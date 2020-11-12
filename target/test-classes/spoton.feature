@SmokeTest
Feature: Verifying puppies adoption process
  Background:
    Given User on Puppy List page

  @Test1
  Scenario: Adopt Brook, add a Chewy Toy and a Travel Carrier, pay with Check
    When User click on puppy Brook
    Then Should be navigate to Brook page
    When User click Adopt Me button
    Then Should be navigate to Your Litter page
    And User should see Brook in cart
    And User should see Additional Products & Services
    When User click on checkBox with Chewy Toy
    And User click on checkBox with Travel Carrier
    Then CheckBoxes should display
    And Total price should increase on product price
    When User click Complete the Adoption button
    Then Should be navigate to Order page
    When User fill valid Name, Address, Email
    And Choose Check as a Pay Type from dropdown
    And Click Place Order button
    Then Should be navigate to Puppy List page
    And User should see Thank you for adopting a puppy message

  @Test2
  Scenario: Adopt Sparky, add a Collar & Leash, pay with Credit Card
    When User click on puppy Sparky
    Then Should be navigate to Sparky page
    When User click Adopt Me button
    Then Should be navigate to Your Litter page
    And User should see Sparky in cart
    And User should see Additional Products & Services
    When User click on checkBox with Collar & Leash
    Then CheckBoxes should display Collar & Leash
    And Total price should be correct
    When User click Complete the Adoption button
    Then Should be navigate to Order page
    When User fill valid Name, Address, Email
    And Choose Credit Card as a Pay Type from dropdown
    And Click Place Order button
    Then Should be navigate to Puppy List page
    And User should see Thank you for adopting a puppy message

  @Test3
  Scenario: Adopt 2 Random Dogs add a Collar & Leash to each, pay with Credit Card
    When User choose last puppy from first page
    And User click Adopt Me button
    Then Should be navigate to Your Litter page
    When User click Adopt Another Puppy button
    And User chose first puppy from last page
    And User click Adopt Me button
    Then Should be navigate to Your Litter page
    When User choose Collar & Leash for both puppies
    Then CheckBoxes for both puppies should display
    When User click Complete the Adoption button
    Then Should be navigate to Order page
    When User fill valid Name, Address, Email
    And Choose Credit Card as a Pay Type from dropdown
    And Click Place Order button
    Then Should be navigate to Puppy List page
    And User should see Thank you for adopting a puppy message