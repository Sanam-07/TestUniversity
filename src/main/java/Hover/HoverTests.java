package Hover;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import Base.BaseTest;
import PageObject.HoverPage;
import PageObject.HoverPage.FigureCaption;
import org.testng.annotations.Test;

public class HoverTests extends BaseTest {

  @Test
  public void testHoverUser1() {
    HoverPage hoverpage = homepage.clickHover();
    FigureCaption caption = hoverpage.hoverOverFigure(1);
    assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
    assertEquals(caption.getTitle(), "name: user1", "The tile is wrong");
    assertEquals(caption.getLinkText(), "View profile", "The link text is wrong!");
    assertTrue(caption.getLink().endsWith("/users/1"), "Invalid Link");
  }
}
