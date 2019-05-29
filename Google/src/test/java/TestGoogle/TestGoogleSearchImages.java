package TestGoogle;

import googlePage.GoogleSearchImages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestGoogleSearchImages extends GoogleSearchImages {

    @Test
    public void testSearchTmage1 () throws InterruptedException {
        driver.findElement(By.linkText("Images")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("selenium book", Keys.ENTER);
        sleepFor(1);
        driver.findElement(By.xpath("//input[@name='q']")).clear();
    }

    @Test
    public void testSearchImage2() throws InterruptedException {
        driver.findElement(By.linkText("Images")).click();
        Thread.sleep(2000);
        GoogleSearchImages gsi = PageFactory.initElements(driver, GoogleSearchImages.class);
        gsi.searchImageList();
    }
}
