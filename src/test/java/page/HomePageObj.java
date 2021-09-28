package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageObj extends BaseTest {



    @FindBy(id = "OriginInput")
    public static WebElement fromAirportTextBox;

    @FindBy(css = "div[class='city_info']")
    public static WebElement selectAirPort;

    @FindBy(id = "DestinationInput")
    public static WebElement destinationAirportTextBox;

    @FindBy(css = "button[class='primary-btn block']")
    public static WebElement findticket;








}