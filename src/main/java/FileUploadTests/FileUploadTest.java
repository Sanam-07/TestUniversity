package FileUploadTests;

import static org.testng.Assert.assertEquals;

import Base.BaseTest;
import PageObject.FileUploadPage;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

  @Test
  public void testFileUpload() {
    FileUploadPage uploadPage = homepage.uploadFile();
    uploadPage.uploadFle("C:/Users/mahar/Downloads/Screenshot (6).png");
    assertEquals(uploadPage.getUploadedFiles(), "Screenshot (6).png", "Uploaded");
  }
}
