package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TicketPageObj extends BaseTest {

    @FindBy(css = "select[class='custom-select ctx-sort']")
    public static WebElement selectList;

    @FindBy(css = "select[class='custom-select ctx-sort']>[class='ctx-sort-PRICE_ASC']")
    public static WebElement selectOption;

    @FindBy(css ="div[class='summary-average-price']>span[class='money-int']")
    public static List<WebElement> ticketPrice;

    @FindBy(css ="div[class='summary-average-price']>span[class='money-int']")
    public static WebElement cheapTicketPrice;

    @FindBy(css ="button[class='action-select-btn tr btn btn-outline-success btn-sm'")
    public static WebElement selectButton;

}
