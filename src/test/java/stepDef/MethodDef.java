package stepDef;

import base.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MethodDef extends Driver {

    public void clickToElement(WebElement element) {
        element.click();
    }

    public void sendKeysToElement(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public String getTextElement(WebElement element) {
        String elemaninTexti = "";
        elemaninTexti = element.getText();
        System.out.println("Elemanın Text değeri: " + elemaninTexti);
        return elemaninTexti;
    }

    public void waitForVisibility(WebElement element, long timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSec);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClickablility(WebElement element, long timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void hover(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

  public String getAttributeSelectValue(WebElement element,String key){
        String atttributetext = element.getAttribute(key);
        return atttributetext;
  }

    public String getText(WebElement element){
        String elementText = element.getText();
        return elementText;
    }



    public String findMinValueInList(List<WebElement> elements){
    int min= Integer.MAX_VALUE;

        for (WebElement element : elements) {
            String elementa = element.getText();
            int elementsayi = Integer.parseInt(elementa);

            if (elementsayi<min)
            min=elementsayi;
        }
        String minstring =String.valueOf(min);
        return minstring;
    }

    public void wait(int timeout) throws InterruptedException {
        int second=timeout*1000;
        Thread.sleep(second);
    }



}
