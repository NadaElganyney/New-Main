package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    //Elements
    By ViewProduct = By.className("fa fa-plus-square");
    By addToCar= By.className("btn btn-default add-to-cart");
    By poloBrand = By.linkText("brand_products/Polo");
    By hmBrand = By.linkText("brand_products/H&M");
    By MadameBrand = By.linkText("brand_products/Madame");
    By mastHarbourBrand = By.linkText("brand_products/Mast & Harbour");
    By BabyHugBrand = By.linkText("brand_products/Babyhug");
    By allenSollyJuniorBrand = By.linkText("brand_products/Allen Solly Junior");
    By kookieKidsBrand = By.linkText("brand_products/Kookie Kids");
    By BibaBrand = By.linkText("brand_products/Biba");
    //Actions
    public void openProduct(){
        driver.findElement(ViewProduct).click();

    }


}
