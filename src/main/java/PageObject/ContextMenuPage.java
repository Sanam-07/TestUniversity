package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
  private WebDriver driver;
  private By rightbox = By.id("hot-spot");

  public ContextMenuPage(WebDriver driver) {
    this.driver = driver;
  }

  public void rightClick() {
    Actions actions = new Actions(driver);
    WebElement elementLocator = driver.findElement(rightbox);
    actions.contextClick(elementLocator).perform();
    driver.switchTo().alert().accept();
  }
}
