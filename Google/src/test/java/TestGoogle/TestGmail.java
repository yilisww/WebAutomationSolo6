package TestGoogle;

import googlePage.GmailPage;
import org.testng.annotations.Test;

public class TestGmail extends GmailPage {
    @Test
    public void loginWithValidPass () throws InterruptedException {
        writeUserName();
        writePass();
    }
}
