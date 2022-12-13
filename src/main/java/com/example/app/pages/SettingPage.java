package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class SettingPage extends BasePageObject {
    public String getTitleSetting(){
        return getText(MobileBy.xpath("//android.widget.TextView[@text=\"About\"]"));
    }
}
