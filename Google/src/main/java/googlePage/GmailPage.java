package googlePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GmailPage extends CommonAPI {

    @Test
    public void clickAccount (){
        //click on account
        System.out.println(driver.getCurrentUrl());
    }

    public void writeUserName () throws InterruptedException {
        //write User Name
        //parameterize
        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("yilisww5@gmail.com", Keys.ENTER);
        Thread.sleep(2000);
    }

    public void writePass() throws InterruptedException {
        //write PW
        //parameterize
        driver.findElement(By.name("password")).sendKeys("PASSWORD");
        Thread.sleep(2000);
        driver.findElement(By.className("Cwak9")).click();
    }





//        driver.findElement(By.linkText("Sign In")).click();
//        driver.findElement(By.id("fm-login-id")).sendKeys(user);
//        driver.findElement(By.id("fm-login-password")).sendKeys(password);
//        driver.findElement(By.xpath(".//*[@id='fm-login-submit']")).click();


}
