package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArearPage {
  private WebDriver driver;
  private By statusAleart = By.id("flash");

  public SecureArearPage(WebDriver driver) {
    this.driver = driver;
  }

  public String getAleartText() {
    return driver.findElement(statusAleart).getText();
  }
}
