package TestGoogle;

import base.CommonAPI;
import googlePage.GoogleSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestGoogleSearch extends CommonAPI {

    @Test
    public void testGoogleSearch1() {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));

        GoogleSearch hs = PageFactory.initElements(driver, GoogleSearch.class);
        hs.searchItem("fishing boat");
        driver.findElement(By.xpath("//input[@name='q']")).clear(); // clear searchInputField
        hs.searchItem("fishing rod");
        driver.findElement(By.name("q")).clear(); // clear searchInputField
        hs.searchItem("fishing string");

    }

    @Test
    public void testGoogleSearch2() {

        GoogleSearch hs = PageFactory.initElements(driver, GoogleSearch.class);
        hs.searchItemList();
    }

}
