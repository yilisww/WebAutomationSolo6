package menu;

import home.MenuPage;
import org.testng.annotations.Test;

public class TestDropDownMenu extends MenuPage {

    @Test
    public void menu(){
      readMenuText();
    }
}
