package scenerio;

import base.BaseTest;
import base.ConfigReader;
import org.junit.Test;
import page.HomePageObj;
import page.InfoPageObj;
import page.TicketPageObj;
import stepDef.StepDef;

public class Scenerio extends BaseTest {
    StepDef stepDef = new StepDef();

    @Test()
    public void test() throws InterruptedException {

        stepDef.waitForPageToLoad(20);
        stepDef.sendKeyToTextBox(HomePageObj.fromAirportTextBox, ConfigReader.firstCity, 5);
        stepDef.click(HomePageObj.selectAirPort, 5);
        stepDef.sendKeyToTextBox(HomePageObj.destinationAirportTextBox, ConfigReader.secondCity, 5);
        stepDef.click(HomePageObj.selectAirPort, 5);
        stepDef.click(HomePageObj.findticket, 5);
        stepDef.selectElement(TicketPageObj.selectList, TicketPageObj.selectOption, 10);
        stepDef.controlCheapTicket(TicketPageObj.ticketPrice, TicketPageObj.cheapTicketPrice);
        stepDef.click(TicketPageObj.selectButton, 5);
        stepDef.sendKeyToTextBox(InfoPageObj.emailTextBox, ConfigReader.email, 5);
        stepDef.sendKeyToTextBox(InfoPageObj.phoneNumber, ConfigReader.phoneNumber, 5);
        stepDef.sendKeyToTextBox(InfoPageObj.nameTextBox, ConfigReader.name, 5);
        stepDef.sendKeyToTextBox(InfoPageObj.lastName, ConfigReader.surname, 5);
        stepDef.selectElement(InfoPageObj.daySelectList, InfoPageObj.selectedDay, 5);
        stepDef.selectElement(InfoPageObj.monthSelect, InfoPageObj.selectedMonth, 5);
        stepDef.selectElement(InfoPageObj.yearSelectList, InfoPageObj.selectedYear, 5);
        stepDef.sendKeyToTextBox(InfoPageObj.idNumberTextBox, ConfigReader.idNumber, 5);
        stepDef.sendKeyToTextBox(InfoPageObj.healthCodeTextBox, ConfigReader.hesCode, 5);
        stepDef.clickWithJs(InfoPageObj.nextForPaymentButton, 5);
        stepDef.wait(10);

    }
}
