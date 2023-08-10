package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  private By formAuthentication = By.linkText("Form Authentication");
  private By dropdown = By.linkText("Dropdown");
  private By Hover = By.linkText("Hovers");
  private By pressKey = By.linkText("Key Presses");
  private By slider = By.linkText("Horizontal Slider");
  private By javascriptAlert = By.linkText("JavaScript Alerts");
  private By FileUpload = By.linkText("File Upload");
  private By Context = By.linkText("Context Menu");
  private By Editor = By.linkText("WYSIWYG Editor");
  private By Frames = By.linkText("Frames");
  private By Dynamic = By.linkText("Dynamic Loading");
  private By DOM = By.linkText("Large & Deep DOM");
  private By Scroll = By.linkText("Infinite Scroll");

  private WebDriver driver;

  public HomePage(WebDriver driver) {
    this.driver = driver;
  }

  public LoginPage clickFormAuthentication() {
    driver.findElement(formAuthentication).click();
    return new LoginPage(driver);
  }

  public DropDownPage dropdown() {
    driver.findElement(dropdown).click();
    return new DropDownPage(driver);
  }

  public HoverPage clickHover() {
    driver.findElement(Hover).click();
    return new HoverPage(driver);
  }

  public KeyPressesPage clickKeyPresses() {
    driver.findElement(pressKey).click();
    return new KeyPressesPage(driver);
  }

  public Slider horizontalSlider() {
    driver.findElement(slider).click();
    return new Slider(driver);
  }

  public AlertPage clickAlertPage() {
    driver.findElement(javascriptAlert).click();
    return new AlertPage(driver);
  }

  public FileUploadPage uploadFile() {
    driver.findElement(FileUpload).click();
    return new FileUploadPage(driver);
  }

  public ContextMenuPage clickContext() {
    driver.findElement(Context).click();
    return new ContextMenuPage(driver);
  }

  public WYSIWYGEditorPage clickEditor() {
    driver.findElement(Editor).click();
    return new WYSIWYGEditorPage(driver);
  }

  public FramesPage clickFrames() {
    driver.findElement(Frames).click();
    return new FramesPage(driver);
  }

  public DynamicLoadingPage clickDynamicLoading() {
    driver.findElement(Dynamic).click();
    return new DynamicLoadingPage(driver);
  }

  public DOMPage clickDOM() {
    driver.findElement(DOM).click();
    return new DOMPage(driver);
  }

  public ScrollPage clickScroll() {
    driver.findElement(Scroll).click();
    return new ScrollPage(driver);
  }
}
