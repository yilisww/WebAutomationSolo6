package alipages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class HomeSignUp extends CommonAPI {

    public HomeSignUp() {
        super();
     }
    private String filepath = "./src/test/resources/locator.properties";
    public void signUp(WebDriver driver) throws IOException, InterruptedException {
        clickJoinFree();
        Thread.sleep(1000);
        enterEmail("yilisww@163.com");
        keyDownAndSlide();
        Thread.sleep(1000);
        driver.switchTo().defaultContent(); //switch out of the frame.
    }
    @FindBy(linkText = "Join Free")
    public WebElement joinFree;
    public void clickJoinFree() {
        joinFree.click();
    }
    @FindBy(xpath = "//input[@id='J_Email']")
    public WebElement email;
    public void enterEmail(String emailAddr) throws IOException {
        driver.switchTo().frame(0); //("#alibaba-register-box");
         email.sendKeys(emailAddr);
    }
    @FindBy(xpath = "//*[@id='nc_1_n1z']")
    public WebElement s_verify;
    public void keyDownAndSlide() {
        Actions action = new Actions(driver);
        action.dragAndDropBy(s_verify, 20, 0).build().perform();
    }
    @FindBy(xpath = ".//*[@id='nc_1_captcha_input']")
    public WebElement captcha;
    public void fillInCaptcha(String str){
        captcha.sendKeys(str);
   }
}
