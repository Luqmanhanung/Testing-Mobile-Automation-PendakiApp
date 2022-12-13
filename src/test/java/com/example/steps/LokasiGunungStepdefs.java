package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LokasiGunungStepdefs extends BaseTest {
    @Given("user already on Lokasi Gunung page")
    public void userAlreadyOnLokasiGunungPage() {
        navigationMenu.clickHamburgerBtn();
        navigationMenu.clickLokasiGunungMenu();
    }

    @When("user tap on one of location moutain pin at map")
    public void userTapOnOneOfLocationMoutainPinAtMap() {
        lokasiGunungPage.clickOnePinMountainLocation();
    }

    @Then("Mountain location information will appear above pin")
    public void mountainLocationInformationWillAppearAbovePin() {

    }
}
