package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import static pages.PageBase.hoveWebElement;

public class Homepage {
    WebDriver driver;

    public Homepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "(//li/a/span)[1]")
    WebElement loginicon;

    @FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=account/login']")
    WebElement loginbtn;


    @FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=account/register']")
    WebElement Registerbtn;

    @FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=account/logout']")
    WebElement logout;

    @FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=account/forgotten']")
    WebElement z1;


    @FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=common/home']")
    WebElement home;

    @FindBy(xpath = "//div[@class='row'][3]/div[1]/div[@class='product-thumb']/div[2]/div[@class='button-group']/button[1]")
    WebElement btnone;
    @FindBy(xpath = "//div[@class='row'][3]/div[1]/div[@class='product-thumb']/div[2]/div[@class='button-group']/button[2]")
    WebElement btntwo;

    @FindBy(xpath = "//div[@class='row'][3]/div[1]/div[@class='product-thumb']/div[2]/div[@class='button-group']/button[3]")
    WebElement btnthree;

    @FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/cart']")
    WebElement cart;


    @FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/checkout']")
    WebElement checkoutbtn;
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement Fname;
    @FindBy(xpath = "//input[@name='lastname']")
    WebElement lnam;

    @FindBy(xpath = "//input[@name='company']")
    WebElement Cname;
    @FindBy(xpath = "//input[@name='address_1']")
    WebElement Adress1;


    @FindBy(xpath = "//input[@name='city']")
    WebElement Ci;

    @FindBy(xpath = "//input[@name='postcode']")
    WebElement P_code;


    @FindBy(xpath = "//input[@id='button-payment-address']")
    WebElement Continue;

    @FindBy(xpath = "//input[@id='button-payment-address']")
    WebElement Continue_Paymentaddress;

    @FindBy(xpath = "//input[@id='button-shipping-address']")
    WebElement Continue_ShipingAddress;

    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement co;
    @FindBy(xpath = "//input[@id='button-shipping-method']")
    WebElement Continue_Shipingmethod;

    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement countryDropdown;
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement Regiondropdown;


    @FindBy(xpath = "//input[@name='agree']")
    WebElement Agree_Check;
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement Continue_PaymentMethod;
    @FindBy(xpath = "//input[@id='button-confirm']")
    WebElement Confirm_Button;


    public void GetLoginPage() {
        loginicon.click();
        loginbtn.click();
    }

    public void GetRegisteration() {
        loginicon.click();
        Registerbtn.click();

    }

    public void Getlogout() {
        loginicon.click();
        logout.click();
    }


    public void GetHomepage() {
        home.click();
    }

    public void Getproducts_Add() {
        btnone.click();

    }

    public void Getproducts_Wishlist() {
        btntwo.click();

    }

    //
    public void Getproducts_Comparelist() {

        btnthree.click();
    }

    public void Checkout_Page() {
        cart.click();


    }

    public void ClickButtonCheckout() {
        checkoutbtn.click();

    }

    public void Payment_Page(String F, String L, String C, String A, String City, String Postcode, String Comment, String anothercomment) throws InterruptedException {
        Fname.sendKeys(F);
        lnam.sendKeys(L);
        Cname.sendKeys(C);
        Adress1.sendKeys(A);
        Ci.sendKeys(City);
        P_code.sendKeys(Postcode);
        Thread.sleep(3000);
        Select selectCountry = new Select(countryDropdown);
        selectCountry.selectByIndex(3);
        Thread.sleep(3000);
        Select selectRegion = new Select(Regiondropdown);
        selectRegion.selectByIndex(1);
        Continue.click();
        Continue_Paymentaddress.click();
        Continue_ShipingAddress.click();
        co.sendKeys(Comment);
        Continue_Shipingmethod.click();
        co.sendKeys(anothercomment);
        Agree_Check.click();
        Continue_PaymentMethod.click();
        Confirm_Button.click();


    }


    public String GetSucessMessage() {

        WebElement message = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        String message1 = message.getText();
        String filteredText = message1.split("!")[0] + "!";
        System.out.println(filteredText);
        return filteredText;
    }

    public void hoverRandomCategoryFromHomePAge(int index) throws InterruptedException {
        System.out.println("Main");
        System.out.println(index);

        WebElement category = driver.findElement(By.xpath("(//div/ul[@class='nav navbar-nav']/li)[" + index + "]"));


        hoveWebElement(driver, category);
        Thread.sleep(5000);


    }


}