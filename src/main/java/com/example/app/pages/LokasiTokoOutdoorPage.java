package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class LokasiTokoOutdoorPage extends BasePageObject {
    public void clickOnePinTokoOutdoorLocation(){
        click(MobileBy.xpath("//android.view.View[@content-desc=\"Eiger Adventure Store Malioboro. \"]"));
    }
}
