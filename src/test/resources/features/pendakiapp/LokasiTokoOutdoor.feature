@android @test
  Feature: Lokasi Toko Outdoor Menu
    Scenario: System Behavior when user tap one of the Toko Outdoor location pins on the map
      Given user already on Lokasi Toko Outdoor page
      When user tap on one of location Toko Outdoor pin at map
      Then Toko Outdoor location information will appear above pin
