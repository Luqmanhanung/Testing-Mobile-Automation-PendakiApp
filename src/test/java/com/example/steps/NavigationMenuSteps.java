package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NavigationMenuSteps extends BaseTest {
  @When("user go to list menu")
  public void userGoToListMenu() {
    navigationMenu.clickHamburgerBtn();
  }

  @Given("user already on Informasi Pendakian Menu")
  public void userAlreadyOnInformasiPendakianMenu() {
    navigationMenu.clickHamburgerBtn();
    navigationMenu.clickInformasiPendakianMenu();

  }


}
