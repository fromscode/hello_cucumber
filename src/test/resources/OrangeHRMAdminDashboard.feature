Feature: OrangeHRM Admin Dashboard features

  Background:
    Given the user is on the OrangeHRM login page (admin)
    And the user logs in as an admin with username "Admin" and password "admin123"

    Scenario: The admin can manage users
      When the admin clicks on the Admin option in the sidebar
      Then the admin can see the user management page


    Scenario: The admin can approve leaves
      When The admin clicks on the Leave option in the sidebar
      Then the admin can see the Leave page