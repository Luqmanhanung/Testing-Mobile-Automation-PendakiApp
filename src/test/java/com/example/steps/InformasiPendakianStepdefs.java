package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class InformasiPendakianStepdefs extends BaseTest {
    @And("user tap on Pendakian Gunung Arjuno")
    public void userTapOnPendakianGunungArjuno() {
        informasiPendakianPage.clickPendakianGunungArjuno();
    }

    @Then("user direct to {string} page")
    public void userDirectToPage(String gunung) {
        assertEquals(gunung, informasiPendakianPage.getArticleTitleGunungArjuno());
    }

    @And("user tap on Pendakian Gunung Lawu")
    public void userTapOnPendakianGunungLawu() {
        informasiPendakianPage.clickPendakianGunungLawu();
    }

    @Then("user direct to Jalur Cemoro Sewu page")
    public void userDirectToJalurCemoroSewuPage() {
        assertEquals("Jalur Cemoro Sewu", informasiPendakianPage.getArticleTitleGunungLawu());
    }

    @And("user tap on Pendakian Gunung Guntur")
    public void userTapOnPendakianGunungGuntur() {
        informasiPendakianPage.clickPendakianGunungGuntur();
    }

    @Then("user direct to Jalur Cititis page")
    public void userDirectToJalurCititisPage() {
        assertEquals("Jalur Cititis", informasiPendakianPage.getArticleTitleGunungGuntur());

    }

    @And("user tap on Pendakian Gunung Agung")
    public void userTapOnPendakianGunungAgung() {
        informasiPendakianPage.clickPendakianGunungAgung();
    }

    @Then("user direct to Jalur Pura Besakih page")
    public void userDirectToJalurPuraBesakihPage() {
        assertEquals("Jalur Pura Besakih", informasiPendakianPage.getArticleTitleGunungAgung());
    }
}
