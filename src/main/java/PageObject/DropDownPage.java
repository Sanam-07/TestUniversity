package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
  private WebDriver driver;
  private By Element = By.id("dropdown");

  public DropDownPage(WebDriver driver) {
    this.driver = driver;
  }

  public void selectDropDown(String Option) {
    findDropDownElement().selectByVisibleText(Option);
  }

  public String getSelectedOption() {
    return findDropDownElement().getFirstSelectedOption().getText();
  }

  public Select findDropDownElement() {
    return new Select(driver.findElement(Element));
  }
}
