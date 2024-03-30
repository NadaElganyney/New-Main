package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    //elements
    By loginEmailAddressField = By.xpath("//input[@data-qa=login-email]");
    By passwordField = By.name("password");
    By loginButton= By.xpath("//button[@data-qa=login-button]");
    By nameField = By.name("name");
    By signUpEmailAddressField = By.xpath("//input[@data-qa=signup-email] ");
    By signUpButton =By.xpath("//button[@data-qa=signup-button]");
    By subscribeEmailAddressField = By.id("susbscribe_email");
    By subscribeButton = By.id("subscribe");


    //actions
    public void login(String loginEmail, String password){
        driver.findElement(loginEmailAddressField).sendKeys(loginEmail);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void signUp(String name, String signUpEmail){
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(signUpEmailAddressField).sendKeys(signUpEmail);
        driver.findElement(signUpButton).click();
    }

    public void subscribe(String subscribeEmailAddress){
        driver.findElement(subscribeEmailAddressField).sendKeys(subscribeEmailAddress);
        driver.findElement(subscribeButton).click();
    }
}
