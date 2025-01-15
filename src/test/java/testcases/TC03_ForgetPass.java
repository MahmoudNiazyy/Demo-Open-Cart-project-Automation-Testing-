package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ForgetPass;
import pages.Homepage;

import static drivers.DriverHolder.getDriver;

public class TC03_ForgetPass extends TestBase {

    Homepage homescreen;
    ForgetPass Forgetobj;

    @Test
    public void ForgetPass_P() throws InterruptedException {

        homescreen = new Homepage(getDriver());

        homescreen.GetLoginPage();

        Forgetobj = new ForgetPass(getDriver());

        Forgetobj.ForgePassClick(TC02_Register.email);

        Thread.sleep(2000);
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(getDriver().getPageSource().contains("An email with a confirmation link has been sent your email address."));
        soft.assertAll();


    }
}
