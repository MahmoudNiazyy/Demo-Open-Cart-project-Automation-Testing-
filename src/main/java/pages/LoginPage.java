package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "input-email")
    WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginbtn;


    public void Loginform(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        loginbtn.click();


    }
}
