package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {
    WebDriver driver;
    public OverviewPage( WebDriver driver){
        this.driver= driver;
    }
    private By finishButton= By.xpath("//a[@class='btn_action cart_button']");

    public void ClickOnFinish(){

driver.findElement(finishButton).click();
    }
}

