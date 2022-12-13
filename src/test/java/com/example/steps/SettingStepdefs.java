package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class SettingStepdefs extends BaseTest {
    @When("user tap on hamburger button")
    public void userTapOnHamburgerButton() {
        navigationMenu.clickHamburgerBtn();
    }

    @And("user tap on Setting")
    public void userTapOn() {
        navigationMenu.clickSettingsMenu();
    }

    @Then("user redirect to Setting page")
    public void userRedirectToSettingPage() {
        assertEquals("About",settingPage.getTitleSetting());
    }
}
