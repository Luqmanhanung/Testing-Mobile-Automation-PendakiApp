package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LokasiTokoOutdoorStepdefs extends BaseTest {
    @Given("user already on Lokasi Toko Outdoor page")
    public void userAlreadyOnLokasiTokoOutdoorPage() {
        navigationMenu.clickHamburgerBtn();
        navigationMenu.clickLokasiTokoOutdoorMenu();
    }

    @When("user tap on one of location Toko Outdoor pin at map")
    public void userTapOnOneOfLocationTokoOutdoorPinAtMap() {
        lokasiTokoOutdoorPage.clickOnePinTokoOutdoorLocation();

    }

    @Then("Toko Outdoor location information will appear above pin")
    public void tokoOutdoorLocationInformationWillAppearAbovePin() {
    }
}
