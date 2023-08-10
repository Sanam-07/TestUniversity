package login;

import static org.testng.Assert.assertTrue;

import Base.BaseTest;
import PageObject.LoginPage;
import PageObject.SecureArearPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

  @Test
  public void testSuccessfulLogin() {
    LoginPage loginPage = homepage.clickFormAuthentication();
    loginPage.setUsername("tomsmithe");
    loginPage.setPassword("SuperSecretPassword!");
    SecureArearPage secureAreaPage = loginPage.clickloginButton();
    System.out.println(secureAreaPage.getAleartText());
    assertTrue(
      secureAreaPage.getAleartText().contains("You logged into a secure area!"),
      "Aleart Text incorrect"
    );
  }
}
