package home;

import base.CommonAPI;

import java.util.List;

public class MenuPage extends CommonAPI {

    public void readMenuText(){
        List<String> menu =  getTextLists(driver,".nav-search-dropdown.searchSelect option");
        for(String text:menu) {
            System.out.println(text);
        }
    }


}