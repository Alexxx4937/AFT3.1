package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

@FindBy(xpath = "//span[@class='value-summary at__cart-totalprice']")
    WebElement totalPrice;
    @FindBy(xpath = "//select[@class='qty-input at__quantityselect']")
    WebElement selectQuantity;


    public double getPrice(){
        return parsePrice(totalPrice);
    }

    public void setSelectQuantity(int i) throws InterruptedException {
        selectQuantity.click();
        Select select=new Select(selectQuantity);
        select.selectByValue(String.valueOf(i));
        Thread.sleep(1000);


    }


}

