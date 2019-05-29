package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends CommonAPI {
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchInputField;

    public WebElement getSearchInputField() {
        return searchInputField;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputField = searchInputField;
    }

    public void searchItems(){
        List<String> itemList = setItemlist();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

    public List<String> setItemlist(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Java Book");
        itemsList.add("Selenium Book");
        itemsList.add("Fishing rod");
        itemsList.add("Laptop");

        return itemsList;
    }


}
