@android @test
Feature: Menu Pendakian
 #Scenario Outline: see the article from a mountain in indonesia
    #Given user already on Pendaki page
    #When user tap on "<province>" menu
    #And user tap on "<mountain title>"
    #Then user direct to "<mountain article>"
  #Examples:
    #|province| mountain title | mountain article |
    #|JAWA TIMUR| Gunung Arjuno  |Gunung Arjuno     |
    #|JAWA TENGAH| Gunung Lawu   |Gunung Lawu       |
    #|JAWA BARAT | Gunung Ciremai|Gunung Ciremai    |
    #|LUAR JAWA  | Gunung Jaya Wijaya|Gunung Jaya Wijaya|

  Scenario: see article mountain in jawa Barat
    Given user already on Pendaki page
    When user tap on province Jawa Barat
    And user tap on mountain Gunung Ciremai
    Then user direct to "Gunung Ciremai"

  Scenario: see article mountain in jawa Timur
    Given user already on Pendaki page
    When user tap on province Jawa Timur
    And user tap on mountain Gunung Arjuno
    Then user direct to "Gunung Arjuno"

  Scenario: see article mountain in jawa Tengah
    Given user already on Pendaki page
    When user tap on province Jawa Tengah
    And user tap on mountain Gunung Lawu
    Then user direct to "Gunung Lawu"

  Scenario: see article mountain in luar Jawa
    Given user already on Pendaki page
    When user tap on province Luar Jawa
    And user tap on mountain Gunung Jaya Wijaya
    Then user direct to "Gunung Jaya Wijaya"