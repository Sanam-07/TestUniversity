package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Slider {
  private WebDriver driver;
  private By WebSlider = By.cssSelector("input[type='range']");

  public Slider(WebDriver driver) {
    this.driver = driver;
  }

  public Slider SliderBar() {
    WebElement slider = driver.findElement(WebSlider);
    Dimension sliderr = driver.findElement(WebSlider).getSize();
    Actions action = new Actions(driver);
    System.out.println(sliderr.getHeight());
    System.out.println(sliderr.getWidth());
    action.dragAndDropBy(slider, 17, 129).perform();
    return new Slider(driver);
  }
}
