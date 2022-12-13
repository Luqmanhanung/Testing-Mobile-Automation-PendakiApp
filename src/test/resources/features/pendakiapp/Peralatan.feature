@android @test
Feature: Peralatan Menu
  Scenario:System behavior when the user will see information about one of the climbing equipment that needs to be used
    Given user already on Peralatan Page
    When user tap on Peralatan
    And user tap on Tenda
    Then user Redirect to Tenda page

   Scenario: System behavior when the user will see information about one of the tips for choosing climbing equipment
     Given user already on Peralatan Page
     When user tap on Tips
     And user tap on Tips Memilih Tenda
     Then user Redirect to Tips Memilih Tenda


