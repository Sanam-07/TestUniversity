package ContextMenu;

import Base.BaseTest;
import PageObject.ContextMenuPage;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

  @Test
  public void contextMenu() {
    ContextMenuPage menu = homepage.clickContext();
    menu.rightClick();
  }
}
