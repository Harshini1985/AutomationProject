
Feature:  To validate the application
Background:
Given User launch the browser and navigates to the shopping app
 
 @TC01
  Scenario: To verify title of the launched URL
        
    When User captures the title 
    Then User validates the title
    And User validates logo is displayed in the screen
  
  @TC02
  Scenario: To verify links in header
    When User enters valid credentials in the shopping app
    And User clicks the SignIn button
    Then User validates that Call us now is displayed along with valid phone number
    And User validates that Contact Us, Sign Out is displayed 

@TC03
Scenario: To verify on different tabs and title
  
  When User enters valid credentials in the shopping app
  And User clicks the SignIn button
  When User clicks on Women
  Then User validates the title of Women
  When User clicks on Dresses
  Then User validates the title of Dresses
  When User clicks on T-Shirt
  Then User validates the title of T-shirt
  
  @TC04
  Scenario: To verify login functionality
  
  When User enters valid credentials in the shopping app
  And User clicks the SignIn button
  Then User validates the title of SignIn screen
  And User validates the username displayed on screen once logged in
  
@TC05
Scenario: To verify footer of the page

When User scrolls to end of the page
Then User validates Categories, Information and My Account is Displayed is displayed 
And User validates all sublinks in each category

@TC06 
Scenario: To verify product details

When User enters valid credentials in the shopping app
And User clicks the SignIn button
When User clicks on T-Shirt
When User taps on any product
Then User validates that image is loaded and displayed
And User validates the product details
And User validates links for Tweet Share Google+ and Pinterest are displayed
And User validates data sheet of the product
And User validates More Info content is displayed

@TC07
Scenario: To verify placeholder text

Then User validates placeholder text in Search textbox

    