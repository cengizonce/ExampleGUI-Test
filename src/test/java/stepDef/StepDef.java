package stepDef;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class StepDef extends MethodDef {

    public void sendKeyToTextBox(WebElement element, String key, long timeInSecond) throws InterruptedException {
        waitForClickablility(element, timeInSecond);
        sendKeysToElement(element, key);
    }

    public void click(WebElement element, long timeInsecond) {
        waitForClickablility(element, timeInsecond);
        clickToElement(element);
    }

    public void clickWithJs(WebElement element, long timeInsecond) {
        scrollToElement(element);
        waitForClickablility(element, timeInsecond);
        clickToElement(element);
    }


    public void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
        }

    }

    public void selectElement(WebElement selectListElement, WebElement selectOption, long timeout) {
        waitForVisibility(selectListElement, timeout);
        Select select = new Select(selectListElement);
        select.selectByValue(getAttributeSelectValue(selectOption, "Value"));
    }

    public void controlCheapTicket(List<WebElement> elements, WebElement element) {
        String minvalue = findMinValueInList(elements);
        String valueselected = getTextElement(element);
        Assert.assertEquals(minvalue, valueselected);
    }

    public void assertContainControl(WebElement element, String Key) {
        String valuee = getText(element);
        Assert.assertTrue(Key.contains(valuee));
    }
}
