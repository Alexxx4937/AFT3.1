import Pages.CartPage;
import Pages.MainPage;
import Pages.ResultPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class RefactoredTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"macbook pro"},
        });
    }

    @Parameterized.Parameter
    public String pcName;





    @Test
   public void test() throws InterruptedException {
       MainPage mainPage=new MainPage(driver);
        ResultPage resultPage=new ResultPage(driver);
        CartPage cartPage=new CartPage(driver);

       mainPage.setFieldSearch(pcName);
       resultPage.clickProd();

double price=resultPage.getPrice();
       resultPage.addToCart();
       resultPage.cart();
       assertThat(price,equalTo(cartPage.getPrice()));
       cartPage.setSelectQuantity(2);
       assertThat(2*price,equalTo(cartPage.getPrice()));






   }
}
