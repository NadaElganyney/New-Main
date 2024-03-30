package checklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartTest extends BaseTest{

WebDriver driver;

    By CheckOutButton = By.className("btn_action checkout_button");
    By continueButton = By.className("btn_secondary");
    By removeButton = By.className("btn_secondary cart_button");

    public void removeButton() {
        driver.findElement(removeButton).click();
    }
}
