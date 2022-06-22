package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShopDemoPage {
    public ShopDemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@class='view_product'])[2]")
    public WebElement addToCardButton;

    @FindBy(xpath = "//button[@data-option='CC']")
    public WebElement payDebitButton;

    @FindBy(xpath = "//*[text()='Visa, AMEX, MasterCard, Maestro, Discover']")
    public WebElement payDebitButton2;

    @FindBy (xpath = "//button[@class='Payment-Button CC']")
    public WebElement payDebitButton3;


}
