package Wait;

import static org.testng.Assert.assertEquals;

import Base.BaseTest;
import PageObject.DynamicLoadingExample1Page;
import PageObject.DynamicLoadingPage;
import org.testng.annotations.Test;

public class WaituntilHidden extends BaseTest {

  @Test
  public void testHidden() {
    DynamicLoadingPage loadingPage = homepage.clickDynamicLoading();
    DynamicLoadingExample1Page page = loadingPage.clickExample();
    page.clickStart();
    assertEquals(page.getLoadedText(), "Hello World!", "something wrong");
  }
}
