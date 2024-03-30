package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First {

@Test
    public void firstTest(){
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.google.com/");

    }
}
