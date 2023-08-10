package PageObject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample1Page {
  private WebDriver driver;
  private By start = By.tagName("button");
  private By loading = By.id("loading");
  private By finishedText = By.id("finish");

  public DynamicLoadingExample1Page(WebDriver driver) {
    this.driver = driver;
  }

  public void clickStart() {
    driver.findElement(start).click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
  }

  public String getLoadedText() {
    String message = driver.findElement(finishedText).getText();
    return message;
  }
}
