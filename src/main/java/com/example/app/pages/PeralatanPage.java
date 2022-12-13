package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class PeralatanPage extends BasePageObject {
    public void clickTenda(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"Tenda\"]"));
    }
    public void clickPeralatanMenu(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"PERALATAN\"]"));
    }
    public void clickTipsMenu(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"TIPS\"]"));
    }
    public void clickTipsTenda(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"Tips Memilih Tenda\"]"));
    }
    public String getTitleTenda(){
        return getText(MobileBy.xpath("//android.widget.TextView[@text=\"Tenda\"]"));
    }
    public String getTitleTipsTenda(){
        return getText(MobileBy.xpath("//android.widget.TextView[@text=\"Tenda\"]"));
    }

}
