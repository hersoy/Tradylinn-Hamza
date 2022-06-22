package tests;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.ShopDemoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_Test {
    /*
    SCENARIO 3:
    -Navigate to "https://shopdemo.e-junkie.com/" website
    -Click on 'Add to Cart' for 'Demo eBook'
    -Click on 'Pay using Debit Card'
    -Enter Card number as "1111 1111 1111 1111"
    -Validate "Invalid Card Number" message
     */

    ShopDemoPage sdp=new ShopDemoPage();
    @Test
    public void test01(){
        Driver.getDriver().get("https://shopdemo.e-junkie.com/");
        sdp.addToCardButton.click();

        sdp.payDebitButton3.click();

    }
}
