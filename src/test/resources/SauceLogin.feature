Feature: SauceDemo E-Commerce Login

  Scenario: User can log in with valid standard credentials
    Given the user navigates to the SauceDemo login page
    When the user enters the username "standard_user" and password "secret_sauce"
    And clicks the login button
    Then the user should be redirected to the products page