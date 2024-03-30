package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;

    //elements
    By addToCart = By.className("btn btn-default cart");
    By quantityField = By.name("quantity");
    By subscribeEmailAddressField = By.id("susbscribe_email");
    By subscribeButton = By.id("subscribe");
    By nameField = By.id("name");
    By emailField = By.id("email");
    By reviewField = By.id("review");

    //actions


    public void addToCart(String quantity) {
        driver.findElement(quantityField).sendKeys(quantity);
        driver.findElement(addToCart).click();
    }
}
