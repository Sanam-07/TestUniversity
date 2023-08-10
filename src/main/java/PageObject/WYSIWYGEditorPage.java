package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
  private WebDriver driver;
  private By textarea = By.id("tinymce");
  private String editorFrame = "mce_0_ifr";
  private By indent = By.cssSelector("button[aria-label='Increase indent']");

  public WYSIWYGEditorPage(WebDriver driver) {
    this.driver = driver;
  }

  public void clearTextArea() {
    switchToEditArea();
    driver.findElement(textarea).clear();
    switchToMainArea();
  }

  public void setTextArea(String text) {
    switchToEditArea();
    driver.findElement(textarea).sendKeys(text);
    switchToMainArea();
  }

  public void indentButton() {
    driver.findElement(indent).click();
  }

  public String getTextArea() {
    switchToEditArea();
    String text = driver.findElement(textarea).getText();
    switchToMainArea();
    return text;
  }

  public void switchToEditArea() {
    driver.switchTo().frame(editorFrame);
  }

  public void switchToMainArea() {
    driver.switchTo().parentFrame();
  }
}
