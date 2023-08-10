package Base;

import PageObject.HomePage;
import PageObject.HoverPage;
import com.google.common.io.Files;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
  private WebDriver driver;
  protected HomePage homepage;
  protected HoverPage hoverpage;

  @BeforeClass
  public void setup() {
    System.setProperty(
      "webdriver.chrome.driver",
      "C:\\Users\\mahar\\Downloads\\chromedriver_win32\\chromedriver.exe"
    );
    driver = new ChromeDriver();
    goHome();
    driver.manage().window().maximize();
    //    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    homepage = new HomePage(driver);
  }

  @BeforeMethod
  public void goHome() {
    driver.get("https://the-internet.herokuapp.com/");
  }

  @AfterMethod
  public void recordFailure(ITestResult result) {
    if (ITestResult.FAILURE == result.getStatus()) {
      TakesScreenshot scrShot = ((TakesScreenshot) driver);
      File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
      try {
        Files.move(
          SrcFile,
          new File(
            "C:\\eclipse-workspace\\TestUniversity\\src\\main\\resources\\screenshots\\" +
            result.getName() +
            ".png"
          )
        );
      } catch (java.io.IOException e) { // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

  //  @AfterClass
  public void tearDown() {
    driver.quit();
  }
}
