package PageObject;

import static org.testng.Assert.assertTrue;

import Base.BaseTest;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTest {

  @Test
  public void testSelectOption() {
    DropDownPage dropDownPage = homepage.dropdown();
    dropDownPage.selectDropDown("Option 1");
    String selectedOptions = dropDownPage.getSelectedOption();
    System.out.println(selectedOptions);
    assertTrue(selectedOptions.contains("Option 1"));
  }
}
