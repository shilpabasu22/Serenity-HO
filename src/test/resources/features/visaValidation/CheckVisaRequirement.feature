Feature: Check Visa Requirement

  Scenario Outline: Visa Requirements
    Given I provide nationality of <country>
    And I select the <reason>
    And I state <duration>
    When I submit the form
    Then I will be informed <decision>

    Examples:
    |country|reason   |duration                                           |decision|
    |Japan  |Study    |I am intending to stay for more than 6 months      |I need a visa to study in the UK|
    |Russia | Tourism |I am not travelling or visiting a partner or family|I need a visa to come to the UK |

  Scenario: Tourism Visa Requirement For Japan
    Given I provide nationality of Japan
    And I select the Tourism
    When I submit the form
    Then I will be informed I won’t need a visa to study in the UK

#  Scenario: Tourism Visa Requirement For Russia
#    Given I provide nationality of Russia
#    And I select the Tourism
#    And I state I am not travelling or visiting a partner or family
#    When I submit the form
#    Then I will be informed I need a visa to come to the UK