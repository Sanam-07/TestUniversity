package Scroll;

import Base.BaseTest;
import org.testng.annotations.Test;

public class ScrollTest extends BaseTest {

  @Test
  public void testScrollToTable() {
    homepage.clickDOM().scrollToTable();
  }

  @Test
  public void testScrollToFifthParagraph() {
    homepage.clickScroll().scrollToParagraph(5);
  }
}
