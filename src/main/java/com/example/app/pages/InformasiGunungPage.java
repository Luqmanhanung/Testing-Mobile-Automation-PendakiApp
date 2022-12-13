package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class InformasiGunungPage extends BasePageObject {
    public void clickMenuProvince(String province){
        if (province=="JAWA TENGAH"){
            click(MobileBy.xpath("//android.widget.TextView[@text=\"JAWA TENGAH\"]"));
        }else if (province=="JAWA TIMUR") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"JAWA TIMUR\"]"));
        }else if (province=="JAWA BARAT") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"JAWA BARAT\"]"));
        }else if(province=="LUAR JAWA"){
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Luar JAWA\"]"));
        }
    }
    public void clickMountainTitle(String mountainTitle){
        if (mountainTitle=="Gunung Argopuro"){
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Argopuro\"]"));
        } else if (mountainTitle=="Gunung Arjuno") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Arjuno\"]"));
        } else if (mountainTitle=="Gunung Baluran") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Baluran\"]"));
        } else if (mountainTitle=="Gunung Bromo") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Bromo\"]"));
        } else if (mountainTitle=="Gunung Butak") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Butak\"]"));
        } else if (mountainTitle=="Gunung Ijen") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Ijen\"]"));
        } else if (mountainTitle=="Gunung Andong"){
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Andong\"]"));
        }else if (mountainTitle=="Gunung Lawu"){
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Lawu\"]"));
        } else if (mountainTitle=="Gunung Merapi") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Merapi\"]"));
        } else if (mountainTitle=="Gunung Merbabu") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Merbabu\"]"));
        }else if (mountainTitle=="Gunung Prau") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Prau\"]"));
        }else if (mountainTitle=="Gunung Rogojembangan") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Rogojembangan\"]"));
        }else if (mountainTitle=="Gunung Cikuray") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Cikuray\"]"));
        }else if (mountainTitle=="Gunung Ciremai") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Ciremai\"]"));
        }else if (mountainTitle=="Gunung Gede") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Gede\"]"));
        }else if (mountainTitle=="Gunung Guntur") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Guntur\"]"));
        }else if (mountainTitle=="Gunung Agung") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Agung\"]"));
        }else if (mountainTitle=="Gunung Jaya Wijaya") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Jaya Wijaya\"]"));
        }else if (mountainTitle=="Gunung Kerinci") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Kerinci\"]"));
        }else if (mountainTitle=="Gunung Latimojong") {
            click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Latimojong\"]"));
        }
    }

    public void clickprovinceJawaBarat(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"JAWA BARAT\"]"));
    }
    public void clickMountainGunungCiremai(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Ciremai\"]"));
    }
    public void clickprovinceJawaTimur(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"JAWA TIMUR\"]"));
    }
    public void clickMountainGunungArjuno(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Arjuno\"]"));
    }
    public void clickprovinceJawaTengah(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"JAWA TENGAH\"]"));
    }
    public void clickMountainGunungLawu(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Lawu\"]"));
    }
    public void clickprovinceLuarJawa(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"LUAR JAWA\"]"));
    }
    public void clickMountainGunungJayaWijaya(){
        click(MobileBy.xpath("//android.widget.TextView[@text=\"Gunung Jaya Wijaya\"]"));
    }
    public boolean checkTitleArticle(){
        By locator = MobileBy.id("nama_gunung");
        WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
        AndroidElement titleArticle = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return titleArticle.isDisplayed();
    }
    public String getArticleTitle(){
        return getText(MobileBy.id("nama_gunung"));
    }

}
