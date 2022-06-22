package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TradylinnPage {
    public TradylinnPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@id='menu-item-1074']")
    public WebElement hesabimButon;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement eMailBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement sifreBox;

    @FindBy(xpath = "//button[text()='Giriş Yap']")
    public WebElement girisYapButon;

}
