package Frame;

import static org.testng.Assert.assertEquals;

import Base.BaseTest;
import PageObject.WYSIWYGEditorPage;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {

  @Test
  public void testEditor() {
    WYSIWYGEditorPage editorPage = homepage.clickEditor();
    editorPage.clearTextArea();
    String text1 = "hello";
    String text2 = "world";

    editorPage.setTextArea(text1);
    editorPage.indentButton();
    editorPage.setTextArea(text2);

    assertEquals(editorPage.getTextArea(), text1 + "" + text2);
  }
}
