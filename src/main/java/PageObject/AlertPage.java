package PageObject;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage extends BaseTest {
  private WebDriver driver;
  private By jsAlert = By.xpath("//button[text()='Click for JS Alert']");
  private By jsConfirmAlert = By.xpath("//button[text()='Click for JS Confirm']");
  private By result = By.id("result");

  public AlertPage(WebDriver driver) {
    this.driver = driver;
  }

  public void clickJsAlert() {
    driver.findElement(jsAlert).click();
  }

  public void clickjsConfirmAlert() {
    driver.findElement(jsConfirmAlert).click();
  }

  public String getMessageConfirmAlert() {
    return driver.switchTo().alert().getText();
  }

  public void dismissAlertButton() {
    driver.switchTo().alert().dismiss();
  }

  public void acceptAlert() {
    driver.switchTo().alert().accept();
  }

  public String getResult() {
    return driver.findElement(result).getText();
  }
}
