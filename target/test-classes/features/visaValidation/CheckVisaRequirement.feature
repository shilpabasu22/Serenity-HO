Feature: Check Visa Requirement

  Scenario Outline: Study Visa Requirement For Japan
    Given I provide nationality of <country>
    And I select the <reason>
    And I state <intention>
    When I submit the form
    Then I will be informed <information>

    Examples:
    |country  |reason   |intention                                            |information                     |
    |Japan    |Study    |I am intending to stay for more than 6 months        |I need a visa to study in the UK|
    |Russia   |Tourism  |I am not travelling or visiting a partner or family  |I need a visa to come to the UK|

  Scenario: Tourism Visa Requirement For Japan
    Given I provide nationality of Japan
    And I select the Tourism
    When I submit the form
    Then I will be informed I won’t need a visa to study in the UK