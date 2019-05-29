package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestHome {
    WebDriver driver1 = null;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver74.exe");
        driver1 = new ChromeDriver(); // open FireFox browser
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // after 10 sec, if the Chrome browser dose not open, then the program will quit
        driver1.get("http://www.baidu.com");
        driver1.manage().window().maximize();
    }

    @Test
    public void testBooks () {
        driver1.findElement(By.cssSelector("#kw")).sendKeys("books");
        driver1.findElement(By.cssSelector(".s_ipt")).click();
    }

    @Test
    public void testMap () throws InterruptedException {
        driver1.get("http://map.baidu.com");
        Thread.sleep(2000);
        driver1.findElement(By.id("sole-input")).sendKeys("Beijing, China");
        Thread.sleep(2000);
        driver1.findElement(By.id("search-button")).click();
    }


    @AfterMethod
    public void cleanup() throws InterruptedException {
        Thread.sleep(3000);
        driver1.close();
    }


}