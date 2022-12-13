package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class LokasiGunungPage extends BasePageObject {
    public void clickOnePinMountainLocation(){
        click(MobileBy.AccessibilityId("Gunung Jaya Wijaya. 4884 Mdpl."));
    }
}
