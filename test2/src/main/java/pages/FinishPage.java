package pages;

import org.openqa.selenium.By;

public class FinishPage {

    private By asserToFinish= By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

    public By getAsserToFinish(){
        return asserToFinish;

    }
}
