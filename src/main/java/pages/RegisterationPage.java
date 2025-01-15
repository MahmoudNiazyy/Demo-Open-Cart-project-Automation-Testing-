package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterationPage {


    public RegisterationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "input-firstname")
    WebElement FirstName;

    @FindBy(id = "input-lastname")
    WebElement LastName;

    @FindBy(xpath = "//input[@name='email']")
    WebElement Email;

    @FindBy(xpath = "//input[@name='telephone']")
    WebElement Telephone;

    @FindBy(id = "input-password")
    WebElement Password;

    @FindBy(id = "input-confirm")
    WebElement ConfirmPass;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement Check;

    @FindBy(xpath = " //input[@type='submit']")
    WebElement submitbtn;
     //Generate data
    public void Generatedata(String FN, String Telephpne, String LN, String email, String Pass, String Confirmpass) {
        this.FirstName.sendKeys(FN);
        this.LastName.sendKeys(LN);
        this.Email.sendKeys(email);
        this.Password.sendKeys(Pass);
        this.ConfirmPass.sendKeys(Confirmpass);
        this.Telephone.sendKeys(Telephpne);
        Check.click();
        submitbtn.click();

    }


}
