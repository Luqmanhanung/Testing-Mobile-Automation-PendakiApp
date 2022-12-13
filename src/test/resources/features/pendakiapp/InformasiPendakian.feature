@android @test
Feature: Menu Informasi Pendakian
  Scenario: System Behavior when the user will see detailed information about the hiking trails on one of the mountains in East Java
    Given user already on Informasi Pendakian Menu
    When user tap on province Jawa Timur
    And user tap on Pendakian Gunung Arjuno
    Then user direct to "Jalur Lawang" page

  Scenario: System Behavior when the user will see detailed information about the hiking trails on one of the mountains in Center Java
    Given user already on Informasi Pendakian Menu
    When user tap on province Jawa Tengah
    And user tap on Pendakian Gunung Lawu
    Then user direct to Jalur Cemoro Sewu page

  Scenario: System Behavior when the user will see detailed information about the hiking trails on one of the mountains in West Java
    Given user already on Informasi Pendakian Menu
    When user tap on province Jawa Barat
    And user tap on Pendakian Gunung Guntur
    Then user direct to Jalur Cititis page

  Scenario: System Behavior when the user will see detailed information about the hiking trails on one of the mountains in Outside Java
    Given user already on Informasi Pendakian Menu
    When user tap on province Luar Jawa
    And user tap on Pendakian Gunung Agung
    Then user direct to Jalur Pura Besakih page