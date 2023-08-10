package PageObject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollPage {
  private WebDriver driver;
  By textBlocks = By.className("iscroll-added");

  public ScrollPage(WebDriver driver) {
    this.driver = driver;
  }

  /**
   * Scrolls until paragraph with index specified is in view
   * @param index
   */
  public void scrollToParagraph(int index) {
    String script = "window.scrollTo(0,document.body.scrollHeight)";
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    while (getNumberOfParagraphsPresent() < index) {
      jsExecutor.executeScript(script);
    }
  }

  public int getNumberOfParagraphsPresent() {
    List<WebElement> link = driver.findElements(textBlocks);
    int size = (link.size());
    return size;
  }
}
