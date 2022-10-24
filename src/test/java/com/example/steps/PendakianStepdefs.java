package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class PendakianStepdefs extends BaseTest {
    @Given("user already on Pendaki page")
    public void userAlreadyOnPendakiPage() {
        //kosong
    }

//    @When("user tap on {string} menu")
//    public void userTapOnMenu(String province) {
//        pendakianPage.clickMenuProvince(province);
//    }
//
//    @And("user tap on {string}")
//    public void userTapOn(String mountainTitle) {
//        pendakianPage.clickMountainTitle(mountainTitle);
//    }

    @Then("user direct to {string}")
    public void userDirectTo(String mountainArticle) {
        pendakianPage.checkTitleArticle();
        assertEquals(mountainArticle, pendakianPage.getArticleTitle());
    }

    @Then("user direct to article of mountain")
    public void userDirectToArticle() {
        pendakianPage.checkTitleArticle();
    }

    @When("user tap on province Jawa Barat")
    public void userTapOnProvince() {
        pendakianPage.clickprovinceJawaBarat();
    }

    @And("user tap on mountain Gunung Ciremai")
    public void userTapOnMountain() {
        pendakianPage.clickMountainGunungCiremai();
    }

    @When("user tap on province Jawa Timur")
    public void userTapOnProvinceJawaTimur() {
        pendakianPage.clickprovinceJawaTimur();
    }

    @And("user tap on mountain Gunung Arjuno")
    public void userTapOnMountainGunungArjuno() {
        pendakianPage.clickMountainGunungArjuno();
    }

    @When("user tap on province Jawa Tengah")
    public void userTapOnProvinceJawaTengah() {
        pendakianPage.clickprovinceJawaTengah();
    }

    @And("user tap on mountain Gunung Lawu")
    public void userTapOnMountainGunungLawu() {
        pendakianPage.clickMountainGunungLawu();
    }

    @When("user tap on province Luar Jawa")
    public void userTapOnProvinceLuarJawa() {
        pendakianPage.clickprovinceLuarJawa();
    }

    @And("user tap on mountain Gunung Jaya Wijaya")
    public void userTapOnMountainGunungJayaWijaya() {
        pendakianPage.clickMountainGunungJayaWijaya();
    }
}