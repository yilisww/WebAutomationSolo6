package googlePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;

public class GoogleSearchImages extends CommonAPI {

    public void searchImageList () throws InterruptedException {
        List<String> itemList = setImagelist();
        for(String st: itemList) {
            driver.findElement(By.name("q")).sendKeys(st, Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@name='q']")).clear();
        }
    }
    public List<String> setImagelist(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Lionel Messi");
        itemsList.add("Lebron James");
        itemsList.add("Roger Federer");
        return itemsList;
    }
}
