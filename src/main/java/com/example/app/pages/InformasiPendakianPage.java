package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class InformasiPendakianPage extends BasePageObject {
    public void clickPendakianGunungArjuno(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"Pendakian Gunung Arjuno\"]"));
    }
    public void clickPendakianGunungLawu(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"Pendakian Gunung Lawu\"]"));
    }

    public void clickPendakianGunungGuntur(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"Pendakian Gunung Guntur\"]"));
    }
    public void clickPendakianGunungAgung(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"Pendakian Gunung Agung\"]"));
    }

    public String getArticleTitleGunungArjuno(){
        return getText(MobileBy.xpath("//android.widget.Button[@text=\"Jalur Lawang\"]"));
    }
    public String getArticleTitleGunungLawu(){
        return getText(MobileBy.xpath("//android.widget.Button[@text=\"Jalur Cemoro Sewu\"]"));
    }
    public String getArticleTitleGunungGuntur(){
        return getText(MobileBy.xpath("//android.widget.Button[@text=\"Jalur Cititis\"]"));
    }
    public String getArticleTitleGunungAgung(){
        return getText(MobileBy.xpath("//android.widget.Button[@text=\"Jalur Pura Besakih\"]"));
    }
}
