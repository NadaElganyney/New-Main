package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;
public CheckoutPage(WebDriver driver){
    this.driver=driver;
}
    private By firtNameField= By.id("first-name");
    private By lastNameField= By.id("last-name");
    private By postalCodeField= By.id("postal-code");
    private By continueButton = By.xpath("//input[@class=\"btn_primary cart_button\"]");

    public void ClickOnContinue(String firstname, String Lastname, String postalCode){

        driver.findElement(firtNameField).sendKeys(firstname);
        driver.findElement(lastNameField).sendKeys(Lastname);
        driver.findElement(postalCodeField).sendKeys(postalCode);
        driver.findElement(continueButton).click();

    }

}
