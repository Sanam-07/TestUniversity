package Keys;

import static org.testng.Assert.assertEquals;

import Base.BaseTest;
import PageObject.KeyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class KeysTests extends BaseTest {

  @Test
  public void testBaskspace() {
    KeyPressesPage keyPage = homepage.clickKeyPresses();
    keyPage.enterText("A" + Keys.BACK_SPACE);
    assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
  }
}
