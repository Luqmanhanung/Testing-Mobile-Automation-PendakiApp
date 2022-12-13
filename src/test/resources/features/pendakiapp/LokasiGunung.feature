@android @test
  Feature: Lokasi Gunung Menu
    Scenario: System Behavior when user tap one of the mountain location pins on the map
      Given user already on Lokasi Gunung page
      When user tap on one of location moutain pin at map
      Then Mountain location information will appear above pin
