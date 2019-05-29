package alitests;

import alipages.HomeSignUp;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSignUp extends CommonAPI {
    //use Page Obeject Model

    @Test
    public void testSignUp() throws IOException, InterruptedException {
        HomeSignUp sign = PageFactory.initElements(driver, HomeSignUp.class);
        sign.signUp(driver);

    }
}
