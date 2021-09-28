package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InfoPageObj extends BaseTest {

    @FindBy(id = "contact_email")
    public static WebElement emailTextBox;

    @FindBy(id = "contact_cellphone")
    public static WebElement phoneNumber;

    @FindBy(id = "firstName_0")
    public static WebElement nameTextBox;

    @FindBy(id = "lastName_0")
    public static WebElement lastName;

    @FindBy(id = "publicId_0")
    public static WebElement idNumberTextBox;

    @FindBy(id = "gender_M_0")
    public static WebElement maleButton;

    @FindBy(id = "healthCode_0")
    public static WebElement healthCodeTextBox;

    @FindBy(id = "freeSupport")
    public static WebElement freeSupportTextBox;

    @FindBy(css = "button[type='button'][class=' btn btn-success btn-lg tr  js-reservation-btn']")
    public static WebElement nextForPaymentButton;

    @FindBy(id ="birthDateDay_0")
    public static WebElement daySelectList;

    @FindBy(css ="select[name='birthDateDay_0']>option[value='25']")
    public static WebElement selectedDay;

    @FindBy(id ="birthDateMonth_0")
    public static WebElement monthSelect;

    @FindBy(css ="select[name='birthDateMonth_0']>option[value='09']")
    public static WebElement selectedMonth;

    @FindBy(id ="birthDateYear_0")
    public static WebElement yearSelectList;

    @FindBy(css ="select[name='birthDateYear_0']>option[value='1995']")
    public static WebElement selectedYear;

}
