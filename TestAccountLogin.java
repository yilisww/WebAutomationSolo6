package menu;

import base.CommonAPI;
import home.AccountLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class TestAccountLogin extends CommonAPI {

    @Test
    public void testAccountLogin() throws InterruptedException {
        AccountLogin accountLogin = PageFactory.initElements(driver, AccountLogin.class);
        accountLogin.Accountlogin();
        /*
        accountLogin.setClicksignin();
        accountLogin.setSignin();
        accountLogin.setPassWord();
        accountLogin.setSignInButton();
         */
    }
}
