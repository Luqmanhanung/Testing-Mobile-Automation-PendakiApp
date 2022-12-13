package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class NavigationMenu extends BasePageObject {

  public void clickHamburgerBtn(){
    click(MobileBy.AccessibilityId("Drawer dibuka"));
  }

  public void clickKebabBtn(){
    click(MobileBy.AccessibilityId("More options"));
  }

  public void clickInformasiGunungMenu(){
    click(MobileBy.xpath("//android.widget.CheckedTextView[@text=\"Informasi Gunung\"]"));
  }
  public void clickInformasiPendakianMenu(){
    click(MobileBy.xpath("//android.widget.CheckedTextView[@text=\"Informasi Pendakian\"]"));
  }
  public void clickPeralatanMenu(){
    click(MobileBy.xpath("//android.widget.CheckedTextView[@text=\"Peralatan\"]"));
  }
  public void clickLokasiGunungMenu(){
    click(MobileBy.xpath("//android.widget.CheckedTextView[@text=\"Lokasi Gunung\"]"));
  }
  public void clickLokasiTokoOutdoorMenu(){
    click(MobileBy.xpath("//android.widget.CheckedTextView[@text=\"Lokasi Toko Outdoor\"]"));
  }
  public void clickSettingsMenu(){
    click(MobileBy.xpath("//android.widget.CheckedTextView[@text=\"Settings\"]"));
  }


}
