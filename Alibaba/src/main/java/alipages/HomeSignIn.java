package alipages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Parameters;

public class HomeSignIn extends CommonAPI {

    @FindBy(linkText = "Sign In")
    WebElement signIn;
    public void clickOnSignIn(){
        signIn.click();
    }

    @FindBy(id = "fm-login-id")
    WebElement email;
    @FindBy(id="fm-login-password")
    WebElement pass;
    @FindBy(xpath = ".//*[@id='fm-login-submit']")
    WebElement submit;

    @Parameters({"user", "password"})
    public void signIn(String user, String password){
        clickOnSignIn();
        email.sendKeys(user);
        pass.sendKeys(password);
        submit.click();

//        driver.findElement(By.linkText("Sign In")).click();
//        driver.findElement(By.id("fm-login-id")).sendKeys(user);
//        driver.findElement(By.id("fm-login-password")).sendKeys(password);
//        driver.findElement(By.xpath(".//*[@id='fm-login-submit']")).click();

    }

}
