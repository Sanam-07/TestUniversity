package Slider;

import Base.BaseTest;
import PageObject.Slider;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

  @Test
  public void Slide() {
    Slider circle = homepage.horizontalSlider();
    circle.SliderBar();
  }
}
