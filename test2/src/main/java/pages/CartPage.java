package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver= driver;
    }

//elements

   private By CheckOutButton = By.xpath("//a[@class='btn_action checkout_button']");
// Actions
    public void CheckOut(){

        driver.findElement(CheckOutButton).click();

    }




}
