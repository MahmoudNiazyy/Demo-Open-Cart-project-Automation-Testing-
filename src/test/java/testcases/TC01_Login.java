package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.LoginPage;
import static drivers.DriverHolder.getDriver;

public class TC01_Login extends TestBase {

    Homepage homeobj;
    LoginPage loginobj;

    @Test
    public void LoginWithValidData_P() throws InterruptedException {

        homeobj = new Homepage(getDriver());


        homeobj.GetLoginPage();
        loginobj = new LoginPage(getDriver());

        loginobj.Loginform(TC02_Register.email, TC02_Register.password);
        Thread.sleep(2000);
        Assert.assertTrue(getDriver().getPageSource().contains("Logout"));

        homeobj.Getlogout();


    }

}
