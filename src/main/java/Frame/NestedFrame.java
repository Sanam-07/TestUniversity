package Frame;

import static org.testng.Assert.assertEquals;

import Base.BaseTest;
import PageObject.FramesPage;
import PageObject.NestFrame;
import org.testng.annotations.Test;

public class NestedFrame extends BaseTest {

  @Test
  public void testFrame() {
    FramesPage frames = homepage.clickFrames();
    NestFrame nestedframe = frames.clickNestedFrame();
    nestedframe.switchTOFrame1();
    System.out.println("Text is" + nestedframe.FindText());
    assertEquals(nestedframe.FindText(), "LEFT");
    nestedframe.switchTOFrame2();
    System.out.println("Text2 is" + nestedframe.FindTextBottom());
    assertEquals(nestedframe.FindTextBottom(), "BOTTOM");
  }
}
