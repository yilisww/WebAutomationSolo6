package googlePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class GoogleSearch extends CommonAPI {

    @FindBy(name = "q")
    public WebElement searchInputField;

    //clear searchInputField
    public void clearInputField(){
        searchInputField.clear();
    }
    //****search by input an item name
    public void searchItem(String itemName){   //search in the search box
        searchInputField.sendKeys(itemName, Keys.ENTER);
    }

    //*******search with a prepared item list
    public void searchItemList(){
        List<String> itemList = setItemlist();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

    public List<String> setItemlist(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("fishing lure");
        itemsList.add("fishing jig");
        itemsList.add("spoon lure");
        itemsList.add("selenium");
        return itemsList;
    }

    public WebElement getSearchInputField() {
        return searchInputField;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputField = searchInputField;
    }



}
