package Alert;

import static org.testng.Assert.assertEquals;

import Base.BaseTest;
import PageObject.AlertPage;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

  @Test
  public void testAlert() {
    AlertPage alertpage = homepage.clickAlertPage();
    alertpage.clickJsAlert();
    alertpage.acceptAlert();
    assertEquals(
      alertpage.getResult(),
      "You successfully clicked an alert",
      "Incorrect message"
    );
  }

  @Test
  public void confirmJsAlert() {
    AlertPage alertpage = homepage.clickAlertPage();
    alertpage.clickjsConfirmAlert();
    String message = alertpage.getMessageConfirmAlert();
    System.out.println(message);
    alertpage.dismissAlertButton();
    assertEquals(message, "I am a JS Confirm", "Something is wrong");
  }
}
