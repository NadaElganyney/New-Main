package checklogin;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class ProductTest extends BaseTest {



    String expectedPrice = "$15.99";

    @Test
    public void validateProductPrice() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);

        loginPage.login("standard_user","secret_sauce");
        homePage.openProduct();
        String actualValue = driver.findElement(productPage.getProductPrice()).getText();
        Assert.assertEquals(actualValue, expectedPrice);
    }
    @Test public void addProductToCart() {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        homePage.openProduct();
        productPage.addToCart();
        productPage.moveToCartPage();
    }
        @Test public void TestMainFunctionality(){
            LoginPage loginPage = new LoginPage(driver);
            HomePage homePage = new HomePage(driver);
            ProductPage productPage = new ProductPage(driver);
            CartPage cartPage = new CartPage(driver);
            CheckoutPage checkoutPage = new CheckoutPage(driver);
            OverviewPage overviewPage = new OverviewPage(driver);
            FinishPage finishPage = new FinishPage();

            loginPage.login("standard_user", "secret_sauce");
            homePage.openProduct();
            productPage.addToCart();
            productPage.moveToCartPage();
            cartPage.CheckOut();
            checkoutPage.ClickOnContinue("Nada", "Mohamed", "12345");
            overviewPage.ClickOnFinish();
            boolean AsserMain = driver.findElement(finishPage.getAsserToFinish()).isDisplayed();
            Assert.assertTrue(AsserMain);
        }

        }


