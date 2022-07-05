import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWDTestClass {

    public static void main(String[] args){

        System.setProperty("webdriver.gecko.driver","C:\\Geckodriver\\geckodriver.exe");

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://demo.realworld.io/#/");

        driver.close();
    }

}
