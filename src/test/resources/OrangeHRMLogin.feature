Feature: OrangeHRM login feature

  Scenario Outline: Login with multiple credentials
    Given the user is on the OrangeHRM login page
    When the user enters username "<username>" and password "<password>"
    And clicks the OrangeHRM login button
    Then the login status is "<status>"


    Examples:

    | username  | password  | status  |
    | Admin     | admin123  | pass    |
    | Admin     | password  | fail    |
    | john      | admin123  | fail    |

