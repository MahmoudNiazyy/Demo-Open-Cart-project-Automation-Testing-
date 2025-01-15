package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPass {


    public ForgetPass(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=account/forgotten']")
    WebElement forgetten;
    @FindBy(id = "input-email")
    WebElement emailelement;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitbtn;


    public void ForgePassClick(String e1) {
        forgetten.click();
        emailelement.sendKeys(e1);
        submitbtn.click();


    }
}
