package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class PeralatanStepdefs extends BaseTest {
    @Given("user already on Peralatan Page")
    public void userAlreadyOnPeralatanPage() {
        navigationMenu.clickHamburgerBtn();
        navigationMenu.clickPeralatanMenu();
    }

    @When("user tap on Tenda")
    public void userTapOnTenda() {
        peralatanPage.clickTenda();
    }

    @Then("user Redirect to Tenda page")
    public void userRedirectToTendaPage() {
        assertEquals("Tenda", peralatanPage.getTitleTenda());
    }

    @When("user tap on Peralatan")
    public void userTapOnPeralatan() {
        peralatanPage.clickPeralatanMenu();

    }

    @When("user tap on Tips")
    public void userTapOnTips() {
        peralatanPage.clickTipsMenu();
    }

    @And("user tap on Tips Memilih Tenda")
    public void userTapOnTipsMemilihTenda() {
        peralatanPage.clickTipsTenda();
    }

    @Then("user Redirect to Tips Memilih Tenda")
    public void userRedirectToTipsMemilihTenda() {
        assertEquals("Tenda",peralatanPage.getTitleTipsTenda());
    }
}
