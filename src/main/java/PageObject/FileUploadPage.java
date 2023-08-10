package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
  private WebDriver driver;
  private By inputField = By.id("file-upload");
  private By uploadButton = By.id("file-submit");
  private By uploadText = By.id("uploaded-files");

  public FileUploadPage(WebDriver driver) {
    this.driver = driver;
  }

  public void clickUploadButton() {
    driver.findElement(uploadButton).click();
  }

  public void uploadFle(String absolutePathOfFile) {
    driver.findElement(inputField).sendKeys(absolutePathOfFile);
    clickUploadButton();
  }

  public String getUploadedFiles() {
    return driver.findElement(uploadText).getText();
  }
}