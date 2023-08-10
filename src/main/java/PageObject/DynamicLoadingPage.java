package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
  private WebDriver driver;
  //  private String linkXapth_Format = "//a[contains(text(),'%s')";
  //  private By link = By.xpath(String.format(linkXapth_Format, "Example 1"));
  private By link = By.xpath(
    "//a[contains(text(),'Example 1: Element on page that is hidden')]"
  );

  public DynamicLoadingPage(WebDriver driver) {
    this.driver = driver;
  }

  public DynamicLoadingExample1Page clickExample() {
    driver.findElement(link).click();
    return new DynamicLoadingExample1Page(driver);
  }
}
