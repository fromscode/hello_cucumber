Feature: using hooks

  Scenario Outline: Login using different usernames and password
    When The user enters username "<username>" and password "<password>"
    And clicks on the login button (hooks)
    Then the dashboard is "<status>"


    Examples:
    | username | password | status |
    | Admin   | admin123 | displayed |
    | Admin   | admin     | not-displayed |
    | Admi    | admin123  | not-displayed |