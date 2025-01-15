package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    WebDriver driver;

    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "//input[@name='search']")
    WebElement searchelement;
    @FindBy(xpath = "//div/span/button[1]")
    WebElement btn;


    public void SearchProduct() {
        searchelement.sendKeys("iPod Touch");
        btn.click();
    }


    public void CurrencyClick(int c) {
        System.out.println("Currency");
        System.out.println(c);
        driver.findElement(By.xpath("//form/div/button[@data-toggle='dropdown']")).click();

        driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li[" + c + "]/button")).click();

    }


    public static void hoveWebElement(WebDriver driver, WebElement element) {
        //Creating object of an Actions class
        Actions action = new Actions(driver);

        //Performing the mouse hover action on the target element.
        action.moveToElement(element).perform();
        element.click();
    }


}
