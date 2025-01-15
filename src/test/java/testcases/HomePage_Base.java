package testcases;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import org.testng.Assert;

import static drivers.DriverHolder.getDriver;
import static util.UtilityCodes.generateRandomInt;
import static util.UtilityCodes.getRandomCurrencyIndex;

public class HomePage_Base extends TestBase {
    Homepage hometestobj;
    LoginPage loginpageobj;
    PageBase pageobj;
    SoftAssert soft = new SoftAssert();
    int index = generateRandomInt(8);


    @Test
    public void SearchProduct_P() throws InterruptedException {
        hometestobj = new Homepage(getDriver());

        hometestobj.GetLoginPage();
        loginpageobj = new LoginPage(getDriver());
        loginpageobj.Loginform(TC02_Register.email, TC02_Register.password);

        pageobj = new PageBase(getDriver());
        pageobj.SearchProduct();
        Thread.sleep(3000);
        soft.assertTrue(getDriver().getPageSource().contains("Add to Cart"));
        //  An email with a confirmation link has been sent your email address.
        soft.assertAll();


    }

    @Test
    public void ChangeCurrency_P() throws InterruptedException {

        hometestobj = new Homepage(getDriver());

        hometestobj.GetLoginPage();
        loginpageobj = new LoginPage(getDriver());
        loginpageobj.Loginform(TC02_Register.email, TC02_Register.password);
        pageobj = new PageBase(getDriver());
        int random = getRandomCurrencyIndex();
        pageobj.CurrencyClick(random);
        Thread.sleep(3000);


    }


    @Test
    public void verifyHoverRandomCategory_P() throws InterruptedException {

        hometestobj = new Homepage(getDriver());

        hometestobj.GetLoginPage();
        loginpageobj = new LoginPage(getDriver());

        loginpageobj.Loginform(TC02_Register.email, TC02_Register.password);
        hometestobj.hoverRandomCategoryFromHomePAge(index);
        Thread.sleep(3000);

    }


    @Test
    public void AddProductToCart_P() throws InterruptedException {

        hometestobj = new Homepage(getDriver());


        hometestobj.GetLoginPage();
        loginpageobj = new LoginPage(getDriver());

        loginpageobj.Loginform(TC02_Register.email, TC02_Register.password);

        hometestobj.GetHomepage();
        pageobj = new PageBase(getDriver());
        pageobj.SearchProduct();

        hometestobj.Getproducts_Add();

        Thread.sleep(3000);
        Assert.assertEquals(hometestobj.GetSucessMessage(), "Success: You have added iPod Touch to your shopping cart!");


    }

    @Test
    public void AddToWishlist_P() throws InterruptedException {

        hometestobj = new Homepage(getDriver());


        hometestobj.GetLoginPage();
        loginpageobj = new LoginPage(getDriver());

        loginpageobj.Loginform(TC02_Register.email, TC02_Register.password);

        hometestobj.GetHomepage();
        pageobj = new PageBase(getDriver());
        pageobj.SearchProduct();

        hometestobj.Getproducts_Wishlist();

        Thread.sleep(3000);
        soft.assertEquals(hometestobj.GetSucessMessage(), "Success: You have added iPod Touch to your wish list!");

    }

    @Test
    public void AddtiontoComparelist() throws InterruptedException {

        hometestobj = new Homepage(getDriver());


        hometestobj.GetLoginPage();
        loginpageobj = new LoginPage(getDriver());

        loginpageobj.Loginform(TC02_Register.email, TC02_Register.password);

        hometestobj.GetHomepage();
        pageobj = new PageBase(getDriver());
        pageobj.SearchProduct();

        hometestobj.Getproducts_Comparelist();
        Thread.sleep(3000);
        soft.assertEquals(hometestobj.GetSucessMessage(), " Success: You have added iPod Touch to your product comparison!");

    }

//checkout
    @Test
    public void Checkout_P() throws InterruptedException {

        hometestobj = new Homepage(getDriver());


        hometestobj.GetLoginPage();
        loginpageobj = new LoginPage(getDriver());

        loginpageobj.Loginform(TC02_Register.email, TC02_Register.password);


        pageobj = new PageBase(getDriver());
        pageobj.SearchProduct();

        hometestobj.Getproducts_Add();

        hometestobj.Checkout_Page();

        hometestobj.ClickButtonCheckout();
        hometestobj.Payment_Page("Naderolian", "Rehanlia", "XYZ Company", "123 Maplear Laneuyy, Apt 4B", "Berat", "11144", "please call me once coming", "Thanks for support customer help");
        Thread.sleep(3000);
        Assert.assertTrue(getDriver().getPageSource().contains("Your order has been placed!"));

    }


}






