package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class NestFrame {
  private WebDriver driver;
  private String frame1 = "frame-left";
  private String frame2 = "frame-bottom";

  public NestFrame(WebDriver driver) {
    this.driver = driver;
  }

  public void switchTOFrame1() {
    driver.switchTo().frame("frame-top");
    driver.switchTo().frame(frame1);
  }

  public void switchTOFrame2() {
    driver.switchTo().frame(frame2);
  }

  public String FindText() {
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    String text = (String) jsExecutor.executeScript(
      "return document.querySelector(\"body\").innerHTML"
    );
    driver.switchTo().parentFrame();
    return text;
  }

  public String FindTextBottom() {
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    String textBottom = (String) jsExecutor.executeScript(
      "return document.querySelector(\"body\").innerHTML"
    );
    driver.switchTo().parentFrame();
    return textBottom;
  }
}
