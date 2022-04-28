package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Utility extends BaseTest {
    public void clickOnElements(By by) {
        driver.findElement(by).click();
    }

    public String getTextFromElemets(By by) {
        return driver.findElement(by).getText();
    }

    public void sendTextToElements(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void mousehover(By by) {
        Actions action = new Actions(driver);
        WebElement menu = driver.findElement(by);
        action.moveToElement(menu).build().perform();
    }

    public void sendKeyStrokeToElement(By by, Keys keys) {
        driver.findElement(by).sendKeys(keys);
    }

    public List<WebElement> listOfWebElementsList(By by) {
        return driver.findElements(by);
    }
}