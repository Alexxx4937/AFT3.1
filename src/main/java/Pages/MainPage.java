package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="aa-search-input")
    WebElement fieldSearch;

    public void setFieldSearch(String name){

        fieldSearch.clear();
        fieldSearch.sendKeys(name+"\n");

    }

}
