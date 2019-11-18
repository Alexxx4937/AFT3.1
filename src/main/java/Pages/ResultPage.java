package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage extends BasePage {
   public ResultPage(WebDriver driver) {
        super(driver);}

    Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);


        @FindBy(xpath = "//*[contains(@href, 'muhn2da')]/mark[text()='MacBook']")
        WebElement product;
@FindBy(xpath = " //div[@class='product-price price-value-741451 at__productpricevalue']")
WebElement price;


   @FindBy(xpath = "//input[@value='В корзину']")
   WebElement toCart;
   @FindBy(xpath = "//input[@value='К корзине']")
   WebElement cart;
    /*@FindBy(xpath = "//span[@class='cart-label']")
    WebElement cart;*/
   @FindBy(xpath = "//span[@id='WA_check_mark']")
   WebElement checkCart;


    public void clickProd(){

product.click();

    }
    public void addToCart(){
        toCart.click();

    }
    public void cart(){
        wait.until(ExpectedConditions.visibilityOf(checkCart));
        cart.click();
    }

public double getPrice(){
        return parsePrice(price);
}

}
