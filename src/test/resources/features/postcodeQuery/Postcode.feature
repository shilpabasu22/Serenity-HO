Feature: Check Postcode returns code

  Scenario Outline: Check the status for Postcode
    Given User enters valid <postcode>
    Then Verify user gets valid <status_code> from the API

    Examples:
      | postcode | status_code |
      | SW1P4JA  | 200        |

