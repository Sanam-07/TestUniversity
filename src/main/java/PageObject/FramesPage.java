package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
  private WebDriver driver;
  private By NestedFrame = By.linkText("Nested Frames");

  public FramesPage(WebDriver driver) {
    this.driver = driver;
  }

  public NestFrame clickNestedFrame() {
    driver.findElement(NestedFrame).click();
    return new NestFrame(driver);
  }
}
